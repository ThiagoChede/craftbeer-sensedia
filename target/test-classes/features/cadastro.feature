Feature: beer resources

  Scenario: Create craft beer return success
    When I make a POST call to "/craftbeer/cerveja" endpoint with post body:
    """
    {

      "nome" : "Skol",

      "tipo" : 1,

      "descricao" : "A Cerveja que desce Redonda",

      "cervejaria" : "Berggren"

    }
    """
    Then response status code should be 201

  Scenario: change beer content
    Given I have only the following rows in the "cervejas" table:
      | id | nome                       | descricao                  | cervejaria | tipo      |
      |1   | Skol                       | A cerveja que Desce Redonda| Berggren   | 1         |
    When I make a PATCH call to "/craftbeer/1" endpoint with post body:
    """
    {

      "id" : 1,

      "nome" : "Skol",

      "descricao" : "A cerveja que Desce Redonda",

      "cervejaria" : "Berggren",

      "tipo" : 2

    }
    """
    Then response status code should be 200
    And response should be json:
    """
    {
        "id": 1,
        "nome": "Skol",
        "descricao": "A cerveja que Desce Redonda",
        "cervejaria": "Berggren",
        "tipo": "PALE_ALE"
    }
    """
  Scenario: delete a beer record
    Given I have only the following rows in the "cervejas" table:
      | id | nome                       | descricao                  | cervejaria | tipo      |
      |1   | Skol                       | A cerveja que Desce Redonda| Berggren   | 1         |
    When I make a DELETE call to "/craftbeer/1" endpoint
    Then response status code should be 204
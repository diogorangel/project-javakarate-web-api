@All_TodosTestesKarateWebAPI
Feature: Todos Testes Karate Web e API
  
  @001_WEB_LoginKarate  
  Scenario: Validar Login Web Karate
    Given driver 'https://www.saucedemo.com/'
    And input('#user-name', 'standard_user')
    And input('#password', 'secret_sauce')
    When click('#login-button')
    Then match driver.url == 'https://www.saucedemo.com/inventory.html'

  @002_API_APITestsKarate  
  Scenario: Validar API de usuários Karate esperando erro de autorização
    Given url 'https://reqres.in'
    When path 'api/users/2'
    When method get
    Then status 401
    And match response.error == 'missing_api_key'

  @003_API_APITestsKarate  
  Scenario: Validar API de usuários Karate esperando erro de autorização
    Given url 'https://reqres.in'
    When path 'api/users/2'
    When method get
    Then match responseStatus != 200
    And match response.error == 'missing_api_key'  
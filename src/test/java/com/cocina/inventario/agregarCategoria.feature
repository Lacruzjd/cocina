Feature: Agregar Categoria

Scenario: agrega Categoria nueva 
       Given definio categoria
       * valido categoria
       When guarda categoria
       Then recibe mensaje de guardado

       
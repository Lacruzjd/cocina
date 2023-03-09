Feature: Agregar nueva categoria

    Scenario: usuario crea categoria
        Given seleccionó categoría
        * valido formato 
        * comprobo existencia
        When guarda subcategoria
        Then recibe notificación de guardado


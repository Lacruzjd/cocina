Feature: Crear producto nuevo

    Scenario: usuario crea nuevo producto
        Given seleccionó categoría
        And seleccionó subcategoria
        And agregó datos del nuevo producto
        When crea el producto
        Then recibe notificación que creacción exitosa

Feature: Crear producto nuevo

    Scenario: Crear producto nuevo
        Given seleccionar categoria 
        When la categoria este seleccionada
        Then mostar subcategorias

    Scenario: no existe categoria
        Given no existe categoria
        When la categoria este definida y validada
        Then crear nueva categoria y guardar
    
    Scenario: existe categoria
        Given existe la categoria 
        When exista la categoria
        Then mostrar categoria y seleccionar
    

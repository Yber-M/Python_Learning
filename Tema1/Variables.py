y = "hOla Mundo en python"
print(y)

camelCase = "nombreMascota"
PascalCase = "NombreMascota"
snake_case = "nombre_mascota"
kebabcase = "nombre-mascota"

print(camelCase, PascalCase, snake_case, kebabcase)

# Declaramos múltiples variables en una sola línea
age, name = 22, "emanuel"

# Convertimos el valor numérico a cadena 'str(age)' y nos aseguramos
# de que el nombre inicie con mayúsculas con el método 'capitalize()'
formato = "Edad : " + str(age) + "\nNombre : " + name.capitalize()

print(formato)

# Operando con variables numérica
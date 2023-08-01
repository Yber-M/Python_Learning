# Librería que importara todas las palabras reservadas de Python
import keyword

# Guardamos en una variable la lista de las palabras reservadas
palabras_reservadas = keyword.kwlist

# Imprimir las palabras reservadas
print("\nEsta son las palabras reservadas de Python:")
print(palabras_reservadas)

# Bucle para recorrer y mostrar en formato de lista las palabras reservadas
for palabras_reservadas in palabras_reservadas:
    print(palabras_reservadas)
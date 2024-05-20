# Actividad: Estilos de código, análisis estático y comentarios
## Estilo de código
La guia seleccionada es Python Style Guide (Google) [link de la guía](https://peps.python.org/pep-0008/)  
Los 3 elementos de la guía que se seleccionó que estoy de acuerdo son:  
### Comments
Este elemento en la guía nos dice "Los comentarios que contradicen el código son peores que ningún comentario. ¡Siempre tenga como prioridad mantener los comentarios actualizados cuando cambie el código!", estoy de acuerdo con ello debido a que en los proyectos que usan la metodologia SCRUM se desarrolla por sprints, en cada sprint puede existir modidicaciones del codigo y si se maneja el estilo sugerido (mantner actualizado los comentarios cuando cambie el codigo) ayuda a una mayor comprension.
``` python
# Sprint 1
# Calcula la potenciacion usando **
def CalcularPotencia(a,b):
	producto = a ** b		
	return producto

# Sprint 2
# Calcuka la potenciacion usando un funcion de math
import math
def CalcularPotencia(a,b):
	producto = math.pow(a,b)
	return producto
``` 
### Constants:
Este elemento en la guía nos dice "Las constantes generalmente se definen a nivel de módulo y se escriben en letras mayúsculas con guiones bajos que separan las palabras. Los ejemplos incluyen MAX_OVERFLOW y TOTAL." estoy de acuerdo con ello porque esta sintaxis nos ayuda a una identificacion facil de constantes, asi reconocemos que variables no debemos modificar para evitar la mala practica

``` python
# constantes.py

PI = 3.14159

from constantes import PI

def calcular_area_circulo(radio):
    return PI * radio ** 2
```

### Naming convention - Function and variable names
Este elemento en la guía nos dice "Los nombres de las funciones deben estar en minúsculas, con las palabras separadas por guiones bajos según sea necesario para mejorar la legibilidad." estoy de acuerdo con ello porque es importante la legibilidad de codigo pues asi otros programadores podran leer facilmente el codigo y ahorrar tiempo.

``` python
def calcular_area_rectangulo(ancho, alto):
    return ancho * alto
``` 

Los 3 elementos de la guía que se seleccionó que no estoy de acuerdo son:  
### 

### 

### 

## Análisis de código estático

## Comentarios y documentación

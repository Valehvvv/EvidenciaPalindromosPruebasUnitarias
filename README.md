# EvidenciaPalindromosPruebasUnitarias
Evidencia: Caso Palíndromos - Pruebas Unitarias
Caso: Palíndromos - somordnílaP :osaC

==========================
palíndromo
Del gr. παλίνδρομος palíndromos 'que recorre a la inversa'.

1. m. Palabra o frase cuyas letras están dispuestas de tal manera que resulta la misma leída de izquierda a derecha que de derecha a izquierda; p. ej., anilina; dábale arroz a la zorra el abad.
Paso 0: Condiciones iniciales.

0.1 Se conformarán grupos de trabajo que desarrollarán el caso que se presenta a continuación.
0.2 El trabajo deberá ser desarrollado de forma individual, pero los resultados finales deben ser consensuados como grupo.
Serán tutelados durante todo el desarrollo del caso por el profesor.
0.3 Deberán compartir sus avances y el trabajo realizado.
0.4 Luego, se hará una revisión/discusión de los resultados entre todos.
0.5 Materiales y herramientas requeridas: IntelliJ IDEA+ JUnit, repositorios Github, apuntes de clases.
Paso 1: Leer y entender el contexto problema. (15 mins.)
Se necesita saber si el input entregado a un método es o no un palíndromo. Sino recuerda o no sabe que es un palíndromo, puede verlo aquí.
Claro que tenemos un pequeño problema, pues el programador a cargo olvidó dejar la versión Java de la solución y sólo tenemos el siguiente código Javascript:

function esPalindromo(cadena) {
let resultado = "";
resultado = cadena.split('').reverse().join('');
return cadena === resultado;
}

1.1 Discutir y concluir:

¿Qué hace el método?
R: Lo que realiza el método es verificar si la palabra entregada es un palíndromo. 

¿Cómo lo hace?
R: Se asigna una palabra, esta se da vuelta, quedando que el orden de las letras está invertido, paras así compararla con la palabra original.

¿Cómo lo uso?
R: Este se usó llamando a la función, donde se le entregó una palabra aleatoria, por ejemplo la palabra “oso”, que es una palabra palíndromo, por lo tanto debería retornar true.

1.2 Discutir resultados entre el grupo y con el profesor.

Paso 2: Entender el método JavaScript (15 mins.)

2.1 Tras una discusión individual, cada grupo deberá explicar que hace el método detalladamente.
R: La función espalindromo pide una cadena como entrada, luego fija la variable resultado, a la cadena se le separa en subcadenas con el comando .split, después, este se da vuelta, en si se invierte con el comando .reverse y por último  vuelve unir en una cadena con el comando .join y como resultado final retorna verdadero si la variable resultado es estrictamente igual a la cadena entregada al principio por lo tanto es palindromo 


2.2 Construya en grupo ahora una versión Java que sea 100% equivalente en funcionalidad (lo bueno y lo malo) al anterior método.
package org.example;
import java.util.Scanner;
public class Main {
    public static boolean esPalindromo(String cadena) {
        String palabraInicial = cadena;

        String[] caracteres = palabraInicial.split("");
        StringBuilder reverso = new StringBuilder();
        for (int i = caracteres.length - 1; i >= 0; i--) {
            reverso.append(caracteres[i]);
        }

        String palabraFinal = reverso.toString();

        return palabraInicial.equals(palabraFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        scanner.close();

        boolean esPalindromo = esPalindromo(cadena);

        if (esPalindromo) {
            System.out.println(" es un palíndromo.");
        } else {
            System.out.println(" no es un palíndromo.");
        }
    }
}

2.3 Discutir resultados entre el grupo y con el profesor.

Paso 3: Ok! Si el método funciona ¿Qué puede malir sal? ;-) (15 mins.)

3.1 Discutir en grupo el diseño de un plan de pruebas para este caso.

3.2 A partir de su plan de pruebas, diseñe los casos de pruebas unitarias a implementar (aún no codifique nada!!!), considere al menos 5.
R: Probariamos solo usando una letra (ejemplo:aaa), utilizariamos solo numeros enteros, utilizar solo caracteres, entregar una cadena vacia (""), mezclas minúsculas con mayúsculas y combinar letras, numeros, caracteres y "".

3.3 Estando seguros que sus casos de pruebas unitarias son amplios y relevantes, ahora impleméntelos en Java usando JUnit.

3.4 ¿Qué resultados arrojan sus Test con estas entradas: “aca”, “acas”, “h”?
R: En el caso de "aca" nos dira que es un palindromo, "acas" segun el codigo no es un palindromo y por ultimo "h" al ser solo una letra el comando de reverse no hara ningun cambio quedando la letra igual, aunque no se podria considerar palindromo debido a que este es una secuencia de letras que se lee igual de atras y adelante.

Paso 4: Mejorando el método, probando más. (15 mins.)

4.1 Considere los siguientes casos de prueba, no codifique NADA, discuta en su grupo.

- Caso de prueba 1:

Input: 200 (número entero)

Output: la cadena no es palindroma, debido a que solo se pueden anotar string no numeros enteros(int)

- Caso de prueba 2:

Input: “” (cadena vacía)

Output: la cadena es palindroma, aunque deberia entregar un no es palidroma ya que no entrega "nada" por lo que no es una frase ni una palabra

- Caso de prueba 3:

Input: “aaabccbaaa”

Output: aaabccbaaa esta secuencia de letras es un palindromo

- Caso de prueba 4:

Input: “ahabccbaaa”

Output: la cadena no es palindroma

- Caso de prueba 5:

Input: “La tele letal”

Output: la cadena no es palindroma, aunque por definicion la frase es palidroma, esto se debe a que es una oracion por lo que hay espacios en blanco y el codigo no lo toma como palindromo aunque este lo sea y ademas de que tiene una mayuscula al inicio. Por lo que hay que buscar o crear un metodo que junte los espacios en blanco para evaluar el palindromo y ademas de tranformar las letras mayusculas en minusculas.

4.2 De las pruebas analizadas, concluya y construya una versión mejorada de su método. Construya además nuevas pruebas unitarias considerando los casos anteriores y verifique sus resultados teóricos con los empíricos.

¿Qué consideraciones tomaron en cuenta?
R: 1. la primera prueba que realizamos fue probar mayúsculas y minúsculas con la palabra "Oso" la cual es un palídromo pero nuestro método nos indicaba que no lo era.
2. la segunda prueba fue solucionar el caso de las frases palidromas con la palabra "La tele letal" la cual es una frase palídroma sin embargo el método respondia lo cotrario.
3. la ultima fue probar con numeros, por ejemplo con "202" nos entrega que es un palidromo pero al se numeros enteros deberia entregarnos una excepcion ya que no es una palabra ni una frase.
¿Qué mejoró en su método?
R: 1. para el primer error encontrado en la primera prueba utilizamos el comando toLowerCase() para cambiar las mayúsculas en minusculas en la variable palabraInicial y Palabra final

 public static boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase();// la modificación (fernanda M.)
        String palabraInicial = cadena;

        String[] caracteres = palabraInicial.split("");
        StringBuilder reverso = new StringBuilder();
        for (int i = caracteres.length - 1; i >= 0; i--) {
            reverso.append(caracteres[i]);
        }

        String palabraFinal = reverso.toString();

        return palabraInicial.equals(palabraFinal);
    }
2. para el segundo error encontrado en la segunda prueba agregamos el comando replaceAll("\\s+", "") para eliminar todos los espacios en la variable palabraInicial y Palabra final

     public static boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase().replaceAll("\\s+", "");//la modificación (Valentina H.)
        String palabraInicial = cadena;

        String[] caracteres = palabraInicial.split("");
        StringBuilder reverso = new StringBuilder();
        for (int i = caracteres.length - 1; i >= 0; i--) {
            reverso.append(caracteres[i]);
        }

        String palabraFinal = reverso.toString();

        return palabraInicial.equals(palabraFinal);
    }  

3. para el ultimo error encontrado agregamos que entegue una excepción cuando el usuario entregue números ya que estos no pueden ser considerados palídromos 
 
¿Qué rol jugaron las pruebas en mejorar su código?
R: fueron un rol importante ya que gracias a las pruebas realizadas logramos evidenciar los errores que se presentaban y así lograr que sea más preciso nuestro método 

Paso 5: Discutir experiencia y resultados con TODO el curso y Concluir!!! (15 mins.)

# EvidenciaPalindromosPruebasUnitarias
Evidencia: Caso Palíndromos - Pruebas Unitarias
Caso: Palíndromos - somordnílaP :osaC

==========================

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra");
        String palabra = sc.nextLine();
        boolean esPalindromo = esPalindromo(palabra);

        if (esPalindromo) {
            System.out.println("la cadena es palindroma");
        } else {
            System.out.println("la cadena no es palindroma");
        }
        sc.close();
    }

    public static boolean esPalindromo(String palabra){
        String resultado = "";

        resultado = new StringBuilder(palabra).reverse().toString();
        return palabra.equals(resultado);
    }
}

2.3 Discutir resultados entre el grupo y con el profesor.

Paso 3: Ok! Si el método funciona ¿Qué puede malir sal? ;-) (15 mins.)

3.1 Discutir en grupo el diseño de un plan de pruebas para este caso.

3.2 A partir de su plan de pruebas, diseñe los casos de pruebas unitarias a implementar (aún no codifique nada!!!), considere al menos 5.
R: probariamos solo usando una letra (ejemplo:aaa), utilizariamos solo numeros enteros, utilizar solo caracteres, entregar una cadena vacia (""), mezclas minúsculas con mayúsculas y combinar letras, numeros, caracteres y "".

3.3 Estando seguros que sus casos de pruebas unitarias son amplios y relevantes, ahora impleméntelos en Java usando JUnit.

3.4 ¿Qué resultados arrojan sus Test con estas entradas: “aca”, “acas”, “h”?

Paso 4: Mejorando el método, probando más. (15 mins.)

4.1 Considere los siguientes casos de prueba, no codifique NADA, discuta en su grupo.

- Caso de prueba 1:

Input: 200 (número entero)

Output: la cadena no es palindroma

- Caso de prueba 2:

Input: “” (cadena vacía)

Output: la cadena es palindroma

- Caso de prueba 3:

Input: “aaabccbaaa”

Output: aaabccbaaa

- Caso de prueba 4:

Input: “ahabccbaaa”

Output: la cadena no es palindroma

- Caso de prueba 5:

Input: “La tele letal”

Output: la cadena no es palindroma

4.2 De las pruebas analizadas, concluya y construya una versión mejorada de su método. Construya además nuevas pruebas unitarias considerando los casos anteriores y verifique sus resultados teóricos con los empíricos.

¿Qué consideraciones tomaron en cuenta?

¿Qué mejoró en su método?

¿Qué rol jugaron las pruebas en mejorar su código?

Paso 5: Discutir experiencia y resultados con TODO el curso y Concluir!!! (15 mins.)

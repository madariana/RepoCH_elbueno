/*

Que encontramos en el arbol del DOM?

 - Node: Es la unidad mas basica dentro del documento. Puede ser una etiqueta, un texto dentro de una etiqueta o un comentario, etc. 

    <title> NODO
        Manipualacion DOM //Es un nodo, pero es hijo del title
    </title>


 - Document: Tambien es un nodo, del tipo documento, es el nodo raiz a partir del cual se desarrollan o generan todos los demas nodos.

 - Element: son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

 - Attributes: Nodos que dan informacion asociada al tipo de elemento

 - Comentario: Comentarios y otros elementos que estan dentro del HTML, son considerados nodos.


*/

/*Como leer nodos de mi Document Object Model (DOM)


Metodos tradicionales (que se usan en versiones antiguas de JS)

    - document.getElementById (botonSuma)
    - document.getElementsByTagName (<button>)
    - document.getElementsByClassName (botones)
*/


// var elementoID = document.getElementById("botonSuma");
// console.log(elementoID);


// var elementoEtiqueta = document.getElementsByTagName("button");
// console.log(elementoEtiqueta);
// console.log("Este es el primer elemento de mi coleccion de botones", elementoEtiqueta[0]);



// var elementoClassName = document.getElementsByClassName("botones");
// console.log(elementoClassName);


// /*
// Metodos recientes

//     - document.querySelector(#botones)
//     - document.querySelectorAll(.botones)

// */

// var unElemento = document.querySelector("#input1");
// console.log(unElemento);  


// var variosElementos = document.querySelectorAll(".botones");
// console.log(variosElementos);


/*

Creacion de Nodos


    - document.createElement(tipoNodo)

*/

//Creacion de una etiqueta del tipo imagen
var imagenPerrito = document.createElement("img");

//Creamos atributos a la etiqueta
imagenPerrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg";
imagenPerrito.alt = "Foto de perrito tierno"
imagenPerrito.style.width = "150px";
imagenPerrito.style.borderRadius = "100px";




//Poner elementos o nodos en el html
document.body.append(imagenPerrito);


//Actualizar nodos
//Identidicar el nodo con un metodo para tomarlo (getElemento o QuerySelector y modificarlo con inner.HTML)


var resultadoQueCambia = document.getElementById("resultado");
resultadoQueCambia.innerHTML = "El texto ha cambiado";




//Construir nuestra calculadora
var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");
var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMultiplicacion = document.getElementById("botonMultiplicacion");
var botonDivision = document.getElementById("botonDivision");


var resultado = document.getElementById("resultado");


//Construimos las funciones de nuestra calculadora

function suma(){
    let valor1 = parseInt(input1.value); //pido numero1
    let valor2 = parseInt(input2.value); //pido numero2
    let suma = valor1 + valor2; //calculo la suma
    resultado.innerHTML = suma; //pongo el resultado en su lugar
}

function resta(){

}


function multiplicacion(){

}


function division(){

}


/*Como se crea un evento (addEventListener)

    - node.addEventListener ("evento a escuchar", lo que quiero que haga cuando se escuche

        - node (nodo donde aterrizo el evento)
        - addEventListener (palabra reservada para usar el evento)
        - evento a escuchar (click, mouseover, etc)
        - lo que quiero que haga (la llamada de la funcion)

*/

botonSuma.addEventListener("click", suma);


/*

Manipulacion del DOM


    - Metodos para acceder a elementos 

        - document.getElementById
        - document.getElementsByTagName
        - document.getElementosByClassName


    - Metodos para crear elementos  

        - document.createElement(etiqueta)
        - document.createTextNode(texto) - Investigar


    - Metodos para insertar elementos

        - parentElement.append
        - parentElement.insertBefore
        - parentElement.insertAdjacentElement


    - Metodos para modificar elementos

        - node.outerHTML (leer o referenciar el elemento)
        - node.innerHTML (modificar el elemento)


*/

//Primer paso: Definir con que voy a interactuar (almaceno en una variable)
const textoAModificar = document.querySelector("#h1")

//Creo una funcion que cambia de color, segun el color que le paso como parametro
function cambiarColor(color){
    textoAModificar.style.color = color;
}

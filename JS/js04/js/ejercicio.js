//There are three people waiting for the bank. Their names, in order, are Sofia, David, and Juan. Create an array that has these three names in order.
let people = ["Sofia", "David", "Juan"]
console.log("Las personas esperando son " + people);

//Two more people get added to the back of the line - Sara and Augustin. The first person in line is called to the teller. What does the queue look like?
people.push("Sara","Agustin");
console.log("La fila ahora contiene a:" + people);

people.splice(0,2,"Renata");
console.log("Se agrega a Renata" + people);

people.push("Elena");
console.log("The current queue is: " + people);

//It turns out David was saving a spot for his friend Renata. She shows up and goes behind him in the line. One more person (Elena) shows up and goes to the end of the line. What does the queue look like?

//EJ 2
/*Write a JavaScript program to construct the following pattern, using a nested for loop.

*  
* *  
* * *  
* * * *  
* * * * * */
for (var i = 1; i <= 5; i++) {
    var fila = "";
    for (var j = 1; j <= i; j++) {
      fila = fila + "* ";
    }
    console.log(fila);
  }

//EJ 3
//Write while loops to do the following:

//Repeatedly print the value of the variable xValue, decreasing it by 0.5 each time, as long as xValue remains positive.
// - Print all the odd numbers between 1 - 100.
//- Write a method with a while loop to print 1 through n in square brackets. 
//For example, if n = 6 print [1] [2] [3] [4] [5] [6]
//- Write a method with a while loop that computes the sum of first n positive integers: sum = 1 + 2 + 3 + … + n Examples: n = 5 sum = 15

//EJERCICIO 3 - A

let xValue = 99;
while (xValue >= 0) {
    console.log(xValue);
    xValue = xValue - 0.5;
}

//EJERCICIO 3 - B


var yValue = 1;
while (yValue <= 100) {
    if (yValue % 2 !== 0) {
        console.log(yValue);
    }
    yValue++;
}

//EJERCICIO 3 - C

function Numerillos(n) {
    var i = 1;
    while (i <= n) {
        console.log("[" + i + "]");
        i++;
    }
}

Numerillos(6);

//EJERCICIO 3 - D

function sumas(n){
    var i = 1;
    suma=0;
    while (i <= n) {

        suma = suma + i;
        i++;
    }
    console.log("la suma es: "+suma);

}
sumas(5);
let diaNumero = parseInt(prompt("Escribe un número para saber el día de la semana"))

if (diaNumero === 0) {
    console.log("Domingo")
} else if (diaNumero === 1){
    console.log("Lunes")
} else if (diaNumero === 2){
    console.log("Martes")
} else if (diaNumero === 3){
    console.log("Miércoles")
} else if (diaNumero === 4){
    console.log("Jueves")
} else if (diaNumero === 5){
    console.log("Viernes")
} else if (diaNumero === 6){
    console.log("Sabado")
} else {
    console.log("Número inválido. Escribe uno del 0 al 6")
}
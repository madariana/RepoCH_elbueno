package tiposDeDatosYVariables;

public class tiposDeDatos {

    public static void main(String[] args) {
    

        byte centigrados = 1;
        double fahrenheit = (centigrados * 1.8) + 32;
        double kelvin = centigrados + 273.15;

        System.out.println("1 centigrado a fahrenheit es" + fahrenheit);

        System.out.println("1 centigrado a kelvin es" + kelvin);

        /*
         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
         * ºC + 273.15
         */
        
        byte horasTrabajadas = 8;
        byte pago = 10;
        int multiplicacionB = horasTrabajadas * pago;
        System.out.println(multiplicacionB);
        
        double num = 1.61;
        int numInt = (int)num;
        long numLong = (long)num;
        
        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        
        //string
        
        String cantidad = "15";
        String precio = "115.20";
        
        int cantEntero = Integer.parseInt(cantidad);  
        double precioDouble = Double.parseDouble(precio);


        System.out.println("El valor total de la compra es: " + ("cantEntero * precioDouble"));
        
        
        //Al revés
        
        int edad = 30;

        double estatura = 1.61;
        String edadString = String.valueOf (edad);

        String estaturaString = String.valueOf (estatura);

        System.out.println("Edad: " + edadString + estatura + estaturaString);
        
        
        int numero1 = 5;
        int numero2 = 7;
        int numero3 =12;
        
        int suma = numero1 + numero2 + numero3; //operador +, esperamos un 24
        int resta = numero1 - numero2 - numero3; //esperamos -14
        int multiplicación = numero1 * numero2 * numero3; //operador *, esperamos 420
        int división = numero2 / numero1; //operador /, esperamos 1,4
        int modulo = numero2 % numero1; //operador %, esperamos un 2
        int incremento = ++numero3;
        int decremento= --numero2;
        
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicación es: "+ multiplicación);
        System.out.println("La división es: "+ división);
        System.out.println("La modulo es: "+ modulo);
        System.out.println("El incremento es: "+ incremento);
        System.out.println("El decremento: "+ decremento);
        
        //Otro
        
        float num1 = 3;
        float num2 = 2;
        float num3 = 2;
        float num4 = 5;
        float sumaf = num1 + num2;
        float multiplicaciónf = num3 * num4;
        float divisiónf = sumaf / multiplicaciónf;

        System.out.println(sumaf);
        System.out.println(multiplicaciónf);
        System.out.println(divisiónf);

        //Ejercicio en clase
        //Declara 3 variables de tipo entero y utiliza el operador * y %
        byte numA = 5;
        byte numB = 55;
        byte numC= 60;
        int multiplicacionEj1 =  numA * numC;
        int ResiduoEj1 = numC * numB;
        
        System.out.println("La multiplicacion es: "+ multiplicacionEj1);
        System.out.println("La suma es: "+ ResiduoEj1);

        //Ejercicio 2 Declara dos variables de tipo boolean y utiliza el operador ==
        boolean correcto = true;
        boolean incorrecto = false;
        System.out.println("correcto==incorrecto");

        //Ejercicio 3: Declara dos variables del tipo Double y utiliza el operador <
        double variable1 = 6.6;
        double variable2 = 8.8;
        System.out.println("variable1<variable2");
        
        //MÁS EJERCICIOS
        //Convertir de Farenheit a Celsius
        byte Fa = 55;
        float Ce = (float) ((Fa-32)/1.8);
        System.out.println("En Celsius es " + Ce);
       
        //Celsius a Kelvin
        float Kelvin = (float)(Ce + 273);
        System.out.println("En Kelvin es " + Kelvin);

        //Par o impar
        System.out.println((4%2) == 0);
        if (4%2 == 0) {
        	System.out.print("Es par");
        }
        else {
        	System.out.print("Es impar");
        }
       
        
    }
    

}
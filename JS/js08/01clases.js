class persona {

    constructor(nombre, apellido) {
        this._nombre = nombre;
        this.apellido = apellido;
    }
    set nombre(nombre) {
        this._nombre = nombre;
    }

    get nombre() {
        return this._nombre;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }
    get apellido (){
        return this._apellido;
    }
    nombreCompleto(){
        return this._nombre + "" + this._apellido;
    }
    //Sobreescribiendo el método de la clase padre Object
    toString(){
        return this.nombreCompleto();
    }

}
class Empleado extends Persona {
    constructor(nombre, apellido, departamento){
        super(nombre, apellido)
        this._departamento=departamento;
    }
    set departament (departamento) {
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
}
//sobreescritura
        nombreCompleto()
            return super.nombreCompleto() + " , " + this._departamento;
        


persona3.nombre = "Juan";
console.log(persona3.nombre);

persona3.apellido = "Jimenez";
console.log(persona3.apellido);

let persona1 = new persona("Juan", "Perez");
console.log(persona1.nombre);
console.log(persona1.apellido)
let persona2 = new persona("Maria", "Jimenez");
console.log(persona2);
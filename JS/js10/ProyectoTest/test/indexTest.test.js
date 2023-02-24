//prueba efectiva
//const indexTest = require("../Calculadora")
import {indexTest} from "../Calculadora";
test("test suma",() => {
    const r = indexTest.suma(3,2);
    expect(r).toBe(5);
    
});
test.todo("test resta");
test.todo("test multiplicacion");
test.todo("test division");
const myURL =document.URL.toString();
const promesa = fetch(myURL);
promesa.then(resultado => console.log(resultado),
o => console.log(`error callback ${e}`));
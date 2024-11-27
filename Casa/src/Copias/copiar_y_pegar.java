package Copias;

public class copiar_y_pegar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// CAMILO
	}
imprime hola mundo 

Sustitución de letras minúsculas por mayúsculas. 
Puntos: 4 
Implementar un programa que cambie las letras minúsculas que ocupen una 
posición determinada dentro de una palabra por su equivalente en mayúscula. 
• Solicitar la introducción de un texto por consola. El texto deberá contener, 
al menos, 5 palabras o secuencias de caracteres separados por, al menos, 
un espacio. En caso contrario, se volverá a solicitar la introducción del texto. 
• A continuación, se pedirá también un número entero mayor a 0. Si el 
número obtenido es 0 o negativo, se volverá a solicitar. 
• Procesar el texto recibido para sustituir, en cada una de las palabras que lo 
componen, el carácter que ocupa la posición n, siendo n el número entero 
introducido por consola, el mismo carácter en mayúscula, si se trata de una 
letra minúscula. 
• Para realizar lo solicitado, crear una función llamada convierteTexto que 
recibirá dos parámetros: 
o Un array de Strings, cuyos elementos contendrán las palabras del 
texto introducido por teclado. 
o Un número entero, igual al número que el usuario ha proporcionado. 
• La función modificará cada una de las palabras del array de Strings recibido 
de la siguiente forma: 
o Sustituirá el enésimo carácter de cada palabra, siendo n el número 
entero que recibe como argumento, por su equivalente en 
mayúscula, si se trata de una letra minúscula. 
o Si una palabra tiene menos de n caracteres, se cambiará su último 
carácter por el equivalente en mayúscula, si se trata de una letra 
minúscula. 
o La función devolverá el número total de cambios realizados cuando 
la palabra tenga menos de n caracteres. 
o La conversión de un carácter a mayúscula se realizará utilizando 
una nueva función llamada cambiarAMayuscula, con las siguientes 
características: 
▪ La función recibirá un carácter como argumento y devolverá, 
también, un carácter. 
▪ Para convertir el carácter recibido a mayúscula, restar el 
número 32, directamente, al carácter si se cumple alguna de 
las siguientes condiciones: 
• El carácter recibido es mayor o igual a 'a' y menor o 
igual a 'z'. 
1 
• El carácter recibido es mayor o igual a 'á' y menor o 
igual a 'ú’. 
▪ Al restar el número 32 al carácter será necesario hacer una 
operación de casting a char del resultado obtenido. 
▪ En caso de que el carácter procesado no sea una letra 
minúscula, se devolverá el mismo carácter recibido como 
argumento. 
• Ejemplo: 
o Datos proporcionados por el usuario: 
▪ Texto: 
Muchos años después, frente al pelotón de fusilamiento 
▪ Número: 3 
o Datos devueltos por el programa, después de procesar la 
información recibida: 
▪ Texto resultante, después de procesarlo: 
MuChos añOs deSpués, frEnte aL peLotón dE fuSilamiento 
▪ Cambios realizados cuando la palabra tiene menos de n (3, 
en este ejemplo) caracteres: 2 
}



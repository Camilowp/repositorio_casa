package Copias;
//listo ratiiiiiiiii
//que
//yaaaaaaaaaaaaa
//hola sofa, me daba error
1. Sistema de gestión de préstamo en una biblioteca 
Puntos:  10 
Desarrolla un sistema de gestión de préstamo de las publicaciones que se 
encuentran disponibles en una biblioteca pública. 
Existirán diferentes tipos de publicaciones, incluyendo libros, revistas y periódicos. 
Cada tipo de publicación tiene características únicas y reglas específicas tanto 
para determinar el plazo de préstamo como para calcular las sanciones en caso de 
devolución fuera de plazo. 
El sistema que se implemente deberá tener en cuenta las siguientes condiciones: 
• Los datos de una publicación incluyen título, autor, código y año de 
publicación. Además, cada publicación puede contener información 
adicional: 
o Libro: número de páginas y género. 
o Revista: número de edición y periodicidad. 
o Periódico: sección y fecha de publicación. 
• El sistema permitirá mostrar información con el detalle de cada 
publicación. 
• Se podrán prestar las publicaciones, calculando, automáticamente, la 
fecha de devolución según su tipo. Esta fecha de devolución se visualizará 
por consola en el momento del préstamo, junto con los datos de la 
publicación. 
• Si, en el momento de la devolución de una publicación, se comprueba que 
se ha superado el plazo de préstamo, se calculará la sanción 
correspondiente, mostrando por consola el número de días excedido y la 
sanción asociada. 
• Tanto el plazo de préstamo como el cálculo de la sanción dependerán 
del tipo de publicación: 
o Plazos de préstamo: 
▪ Libro: 14 días 
▪ Revista: 7 días 
▪ Periódico: 3 días 
o Sanciones (penalización por cada día de retraso en la devolución): 
▪ Libro: 0.50 €/día 
▪ Revista: 0.30 €/día 
▪ Periódico: 0.20 €/día 
1 
Las publicaciones se encontrarán incluidas/contenidas en bibliotecas. Se 
podrán crear tantas bibliotecas como sea necesario. Cada biblioteca contendrá un 
máximo de 100 publicaciones. 
La biblioteca permitirá añadir nuevas publicaciones y dará la opción de gestionar 
los préstamos y sus correspondientes devoluciones. 
Notas 
• Formato esperado de salida de fechas e importes (sanciones): 
o Importes: con puntos de separación de miles y 2 decimales. 
o Fechas: dd/mm/aaaa. 
• Es recomendable que las fechas sean tratadas como LocalDate. 
Una publicación estará disponible para préstamo si su fecha prevista de 
devolución es igual a LocalDate.MAX (máxima fecha posible de LocalDate). 
• Utilizar la función isAfter() de LocalDate para determinar si una fecha es 
posterior a otra. 
Ejemplo: fecha1.isAfter(fecha2) 
Donde fecha1 y fecha2 son objetos de tipo LocalDate y la función isAfter() 
comprueba si fecha1 es posterior a fecha2. 
• Para calcular el número de días transcurridos entre dos fechas, utilizar la 
clase ChronoUnit de la siguiente forma: 
Ejemplo: ChronoUnit.DAYS.between(fecha1, fecha2) 
Donde fecha1 y fecha2 son las fechas que se desea comparar y están en 
formato LocalDate. 
• Las fechas de tipo LocalDate se pueden mostrar con el formato esperado 
(dd/mm/aaaa) utilizando la clase DateTimeFormatter. 
Ejemplo, para una variable denominada fecha de tipo LocalDate: 
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-M-yyyy"); 
dtf.format(fecha);
package Copias;

public class copiar_y_pegar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// CAMILO
		3. Informe riesgo rotura stock de productos. 
		Puntos: 5 
		Implementar el código necesario para controlar el stock de los productos que se 
		guardan en un almacén. 
		Cada producto estará identificado por un código único y tendrá, además, un 
		nombre para describirlo y el precio. 
		Por otra parte, el stock indicará el número de unidades disponibles en el almacén. 
		Existirá también, por cada producto, una cantidad recomendada de unidades a 
		mantener en stock. 
		2 
		El stock, en relación con la cantidad de unidades recomendadas, podrá estar en 
		alguna de estas situaciones de riesgo respecto a su rotura: - 
		"Riesgo alto", si es inferior a un 30% - - 
		"Riesgo moderado", si está entre un 30% y un 60% 
		"Sin riesgo", si es mayor al 60%  
		En el almacén habrá un máximo de 100 productos. Se podrá saber, en cualquier 
		momento, el número de productos existentes. 
		El programa ofrecerá la posibilidad de mostrar un informe de situación del stock de 
		todos los productos y el riesgo de rotura que existe: - 
		Se mostrará un listado con todos los productos, indicando id, nombre, 
		stock actual y porcentaje de stock respecto al stock recomendado. - 
		Aparecerán clasificados en orden de mayor a menor riego de rotura. Es 
		decir, en primer lugar, los productos que tienen mayor riesgo, luego los de 
		riesgo moderado y, por último, productos sin riesgo de rotura de stock. 
		Ejemplo de informe: 
		INFORME RIESGO DE STOCK DE PRODUCTOS 
		==================================== 
		>>> Riesgo ALTO 
		> P002 - Samsung Galaxy S24 
		Stock actual: 20 
		% respecto a stock recomendado: 25,00% 
		> P005 - Samsung Galaxy S23 
		Stock actual: 13 
		% respecto a stock recomendado: 13,00% 
		>>> Riesgo MODERADO 
		> P001 - Portátil HP 15A-NB0004NS 
		Stock actual: 50 
		% respecto a stock recomendado: 50,00% 
		>>> SIN riesgo 
		> P003 - Tablet Lenovo Tab M11 
		Stock actual: 30 
		% respecto a stock recomendado: 60,00% 
		> P004 - Auriculares JBL Tune Beam 
		Stock actual: 100 
		% respecto a stock recomendado: 66,67% 
		> P006 - Samsung Galaxy A11 
		Stock actual: 120 
		% respecto a stock recomendado: 120,00%

		 // quitar el arraylist y cambiarlo por uno normal en todo el ejercicio 
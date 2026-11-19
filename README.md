# Examen1Trimestre
Este programa es una calculadora de volúmenes geométricos hecha en Java. Su función es permitir al usuario elegir una figura geométrica (cubo, prisma rectangular, cilindro, esfera o cono), introducir las medidas necesarias y obtener automáticamente su volumen aplicando la fórmula matemática correspondiente.

El programa funciona mediante un menú interactivo, por lo que el usuario puede realizar tantos cálculos como quiera sin tener que ejecutar de nuevo la aplicación. Además, utiliza métodos independientes para calcular cada figura, lo que hace que el código esté más organizado y sea más fácil de entender y mantener.

Uno de los aspectos más importantes es la validación de los datos introducidos. El programa comprueba que ninguna medida sea negativa, ya que en la realidad no existen longitudes, radios o alturas menores que cero. Si el usuario introduce un valor negativo, se muestra un mensaje de error y no se realiza el cálculo. También emplea el tipo de dato double para permitir trabajar con números decimales y la clase Math para realizar operaciones matemáticas como el uso de π (Math.PI).

# fullstack1

El codigo muestra un hola mundo en localhost/8080 el cual funciona correctamente al realizar prueba en
postman. Tambien cuenta con un CRUD sencillo de productos probado en Postman.

## Subir proyecto a GitHub

Para poder subirlo a github hay que crear un repositorio el cual en este caso es llamado fullstack1, luego volver a entrar
al IJ para poder entrar a git, donde creamos el repositorio con nuestra carpeta llamada hola mundo, esperamos que inicialice
una vez ya inicializado se escribe git init, luego se continua con git add . el cual agrega todo los archivos, luego un git commit
con el que se le deja un comentario a gusto del creador que en mi caso fue "mi primer commit" esperamos que todo cargue
y luego se copia y pega el git remote add origin https://github.com/tomihm/fullstack1.git, git branch -M main, git push -u origin main
una vez hecho esto recargamos nuestro repositorio para confirmar que este todo subido correctamente.

CRUD de Productos

Se agrego un CRUD sencillo al mismo controlador, los productos se guardan en memoria y se pueden probar en Postman.

GET  Ver todos los productos
POST  `/saludos/productos/{nombre}` Agregar un producto
PUT `/saludos/productos/{id}/{nombre}` Cambiar un producto
DELETE `/saludos/productos/{id}` Borrar un producto 

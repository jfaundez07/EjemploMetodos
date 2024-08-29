#  Ayudantia POO
## Ejemplo métodos
### 28 de agosto 

**Descripcion del caso:**

Usted esta diseñando una aplicación que simula un jardín digital. Su trabajo consiste en implementar un metodo para determinar sin una planta debe ser regada, y en caso de ser asi, regarla. 
El método debe recibir el estado de la planta (si necesita agua o no) y el nombre de la planta. Luego, debe imprimir un mensaje que describa la acción de regar la planta.


**Problema:**

Crear un método llamado regarPlanta que reciba dos parámetros: un booleano "requiereAgua"  y un String nombrePlanta. Si requiereAgua es true, el método debe imprimir un mensaje que diga "Regando la planta  [tipoPlanta]". Si es false, debe imprimir "La planta [tipoPlanta] no necesita agua en este momento."
Luego, el progama debe solicitir al usuario, cuales son las plantas que hay en el jardin, y luego, llamar al metodo regarPlanta, para determinar si debe ser regada o no. Considerar que es el usuario quien debe decidir si regarla o no.

**Definicion:**

```java
public void regarPlanta() {}
```

**Links de utilidad:**

[Java Code Conventions](https://www.oracle.com/technetwork/java/codeconventions-150003.pdf)

**Tips:**
Agregar metodo para imprimir

```java
public void imprimirMensaje(String mensaje) {}
```

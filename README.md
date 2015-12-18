##JSF 2.0
###Ejemplos de JSF


En JSF 2.0, se utiliza la anotaci�n @ManagedBean para indicar que este es un managed bean, HelloBean.java


**Nota**

En 1.x JSF, hab�a que declarar los beans en el faces-config.xml, pero esto ya no es necesario en JSF 2.0. Para utilizar los componentes JSF 2.0 o caracter�sticas, se declara el espacio de nombres de JSF en la parte superior de la p�gina.

```html

     <html xmlns="http://www.w3.org/1999/xhtml"
           xmlns:f="http://java.sun.com/jsf/core"      
           xmlns:h="http://java.sun.com/jsf/html">
```

El archivo: hello.xhtml - Renderiza un cuadro de texto JSF y vincularlo con el "helloBean" (JSF managed bean), con la propiedad "name", y tambi�n un bot�n para mostrar la p�gina "welcome.xhtml" cuando se hace clic.


Nota En 1.x JSF, hab�a que declarar la "regla de navegaci�n" en "faces-config.xml", decir que p�gina mostrar cuando se hace clic en el bot�n. 

En JSF 2.0, usted puede poner el nombre de la p�gina directamente en el atributo de "acci�n" del bot�n. Para una navegaci�n sencilla, es m�s que suficiente, pero, por la navegaci�n compleja, 
todav�a aconseja el uso de la "regla de navegaci�n" en "faces-config.xml".

El # {...} indica que este es un lenguaje de expresi�n JSF, en este caso, #{helloBean.name}, cuando se present� a la p�gina, JSF se encuentra el "helloBean" y establecer el valor de texto 
presentado a trav�s del m�todo setName(). Cuando welcome.xhtml pagina esta pantalla, JSF se encuentra el mismo per�odo de sesiones "helloBean" de nuevo y mostrar el valor de la propiedad
de identificaci�n mediante el m�todo getName().

Por ultimo para definir un mapeo "javax.faces.webapp.FacesServlet", y asignar a esas extensiones de archivo JSF conocidos (/faces /*, *.jsf, *.xhtml, *.faces).

En este caso, los siguientes 4 URLs apuntan a la misma hello.xhtml.

http://localhost:8080/JavaServerFaces/hello.jsf

http://localhost:8080/JavaServerFaces/hello.faces

http://localhost:8080/JavaServerFaces/hello.xhtml

http://localhost:8080/JavaServerFaces/faces/hello.jsf


En JSF desarrollo 2.0, se recomienda establecer el "javax.faces.PROJECT_STAGE" para "el desarrollo", que proporcionar� mucha informaci�n de depuraci�n �til para que pueda realizar un seguimiento de 
los errores f�cilmente. 

Para la implementaci�n, simplemente cambiarlo a "Producci�n", que simplemente no quiere que su cliente se vea en esta informaci�n de depuraci�n molesto :).

###Soporte de AJAX

En JSF 2.0, la codificaci�n Ajax es igual que la codificaci�n de una etiqueta HTML normales, es muy f�cil. 
Reestructurar el �ltimo ejemplo hola mundo JSF 2.0, de modo que, cuando se pulsa el bot�n, se har� una petici�n Ajax en lugar de presentar todo el formulario.
1. JSF 2.0 p�gina 2.0 xhtml P�gina A JSF con soporte Ajax.

```

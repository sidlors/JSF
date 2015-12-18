##JSF 2.0
###Ejemplos de JSF


En JSF 2.0, se utiliza la anotación @ManagedBean para indicar que este es un managed bean, HelloBean.java


**Nota**

En 1.x JSF, había que declarar los beans en el faces-config.xml, pero esto ya no es necesario en JSF 2.0. Para utilizar los componentes JSF 2.0 o características, se declara el espacio de nombres de JSF en la parte superior de la página.

```html

     <html xmlns="http://www.w3.org/1999/xhtml"
           xmlns:f="http://java.sun.com/jsf/core"      
           xmlns:h="http://java.sun.com/jsf/html">
```

El archivo: hello.xhtml - Renderiza un cuadro de texto JSF y vincularlo con el "helloBean" (JSF managed bean), con la propiedad "name", y también un botón para mostrar la página "welcome.xhtml" cuando se hace clic.


Nota En 1.x JSF, había que declarar la "regla de navegación" en "faces-config.xml", decir que página mostrar cuando se hace clic en el botón. 

En JSF 2.0, usted puede poner el nombre de la página directamente en el atributo de "acción" del botón. Para una navegación sencilla, es más que suficiente, pero, por la navegación compleja, 
todavía aconseja el uso de la "regla de navegación" en "faces-config.xml".

El # {...} indica que este es un lenguaje de expresión JSF, en este caso, #{helloBean.name}, cuando se presentó a la página, JSF se encuentra el "helloBean" y establecer el valor de texto 
presentado a través del método setName(). Cuando welcome.xhtml pagina esta pantalla, JSF se encuentra el mismo período de sesiones "helloBean" de nuevo y mostrar el valor de la propiedad
de identificación mediante el método getName().

Por ultimo para definir un mapeo "javax.faces.webapp.FacesServlet", y asignar a esas extensiones de archivo JSF conocidos (/faces /*, *.jsf, *.xhtml, *.faces).

En este caso, los siguientes 4 URLs apuntan a la misma hello.xhtml.

http://localhost:8080/JavaServerFaces/hello.jsf

http://localhost:8080/JavaServerFaces/hello.faces

http://localhost:8080/JavaServerFaces/hello.xhtml

http://localhost:8080/JavaServerFaces/faces/hello.jsf


En JSF desarrollo 2.0, se recomienda establecer el "javax.faces.PROJECT_STAGE" para "el desarrollo", que proporcionará mucha información de depuración útil para que pueda realizar un seguimiento de 
los errores fácilmente. 

Para la implementación, simplemente cambiarlo a "Producción", que simplemente no quiere que su cliente se vea en esta información de depuración molesto :).

###Soporte de AJAX

En JSF 2.0, la codificación Ajax es igual que la codificación de una etiqueta HTML normales, es muy fácil. 
Reestructurar el último ejemplo hola mundo JSF 2.0, de modo que, cuando se pulsa el botón, se hará una petición Ajax en lugar de presentar todo el formulario.
1. JSF 2.0 página 2.0 xhtml Página A JSF con soporte Ajax.

```

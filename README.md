# EjercicioEvaluableDavidParejo
<p>Este repositorio contiene una aplicación con diferentes botones que realizan diferentes acciones en android.</p>
<h2>1º El diseño de la actividad principal🐱‍🏍✨</h2>
<p>El diseño de la actividad se divide en diferentes fases en la primera que es la actividad que se ejecuta </br>
<img  src="./images/diseño.PNG"/></br></br>
<img  src="./images/vista.PNG"/></br></br>
la segunda parte que es la actividad que se ejecuta cuando se pulsa el boton de abrir pagina web</br>
<img  src="./images/diseño3.PNG"/></br></br>
<img  src="./images/vista3.PNG"/></br></br>

la tercera parte que es la actividad que se ejecuta cuando se pulsa el boton de llamar por telefono</br>
<img  src="./images/diseño4.PNG"/></br></br>
<img  src="./images/vista4.PNG"/></br></br>

la cuarta parte que es la actividad que se ejecuta cuando se pulsa el boton de google maps</br>
<img  src="./images/diseño6.PNG"/></br></br>
<img  src="./images/vista6.PNG"/></br></br>

la sexta parte que es la actividad que se ejecuta cuando se pulsa el boton de mandar correo</br>
<img  src="./images/diseño5.PNG"/></br></br>
<img  src="./images/vista5.PNG"/></br></br>

El diseño y vista del webView</br>
<img  src="./images/diseño2.PNG"/></br></br>
<img  src="./images/vista2.PNG"/></br></br>
</p>


<h2>2º El codigo de la aplicación🐱‍🏍✨</h2>
<p>El codigo de la aplicación tambien se divide en diferentes fases:</p>
 <h3>1ª Fase: 🥇🥈🥉</h3> 
<p>
 En la actividad que se ejecuta lo unico que hay que hacer es crear los metodo que se pondran en los onClick de los botones cada uno de ellos ejecuta una actividad diferente.</br>
<img  src="./images/codigo01.PNG"/></br></br>

 En la clase que se abre al pulsar el botonde pagina web lo unico que hay que cojer el id de los editText para pasarselos a una nueva pagina al pulsar el boton.</br>
 <img  src="./images/codgi02.PNG"/></br></br>
 
 En la actividad que se abre lo unico que hay que hacer es poner un webView al que se le pasa una url, también e controlado la url por sin no pone https para que tambien pueda buscar.</br>
 <img  src="./images/codigo03.PNG"/></br></br>
 
  <img  src="./images/codigo04.PNG"/></br></br>
 La actividad que se abre al pulsar el botón de llamar coge el texto del editText con su correspondiente id y se lo pasa a un intent para que se le pase ese numero para poder llamar, en esta clase se tienen que tocar los permisos para poder llamar</br>
 <img  src="./images/codigo05.PNG"/></br></br>
 <img  src="./images/codigo06.PNG"/></br></br>

 Para mandar un correo utilizamos los editText y lo pasamos a una nueva actividad en la que sale una ventana para mandar un correo.</br>
 <img  src="./images/codigo07.PNG"/></br></br>

  Para las coordenadas se hace lo mismo que en el caso anterior pero con la diferencia de que el contenido de eso editText se le pasan al maps en vez del gmail.</br>
 <img  src="./images/codigo08.PNG"/></br></br>

 en cada boton y en cada textView se ha utilizado string diferentes y para los botones onClick
  <img  src="./images/recursosString.PNG"/></br></br>
  <img  src="./images/onClicString.PNG"/></br></br>

</p>
<h2>Añadido🐱‍🏍✨<h2>
<p>
Lo siguiente no influye en el funcionamiento de la calculadora pero sirve para que se vea mejor.
</p>
<h3>Icono de la aplicación 🥇🥈🥉</h3>
<p>
El icono utilizado es el siguiente</br>
<img width="100px" src="./images/icono.png"/></br></br>
<img src="./images/pantalla.PNG"/></br></br>

En la bibliografia se encuentra el enlace al video tutorial.
</p>
<h3>Boton para volver al inicio🥇🥈🥉</h3>
<p>
El boton se consigue con el siguiente codigo.</br>
<img  src="./images/manifest.PNG"/></br></br>
<img  src="./images/manifest1.PNG"/></br></br>
y el resultado es el siguiente.</br>
<img  src="./images/botonAtras.PNG"/></br></br>
</p>
<h2>Funcionamiento de la aplicación🐱‍🏍✨<h2>
<p>
<img width="500px" src="./images/videoAplicacion.gif"/></br></br>
</p>
<h2>Bibliografia🐱‍🏍✨<h2>
-Video para el icono</br>
https://www.youtube.com/watch?v=OACRVxwWYrM&ab_channel=Rackcode.info</br>
-Pagina para crear el icono</br>
https://romannurik.github.io/AndroidAssetStudio/icons-launcher.html#foreground.type=clipart&foreground.clipart=android&foreground.space.trim=1&foreground.space.pad=0.25&foreColor=rgba(96%2C%20125%2C%20139%2C%200)&backColor=rgb(68%2C%20138%2C%20255)&crop=0&backgroundShape=square&effects=none&name=ic_launcher

<h2>Autor🐱‍🏍✨<h2>
<h4>David Parejo Aliaga 1ºDAW</h4>

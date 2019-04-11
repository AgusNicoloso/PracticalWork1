<p align="center">
  <img src ="https://i.ibb.co/hMZF1bQ/tp-Interfaces.png" />
</p>

# 🍻 Torneo de frescas - Maven 🍻

## ¿Qué es Maven?

_Es una herramienta de software que sirve para la construcción y gestión de proyectos Java. Es una herramienta capaz de generar todas las estructuras de directorios para nuestro proyecto, **Maven** podrá descargar las librerías que nos hagan falta en nuestro proyecto. **Maven** simplifica y estandariza el proceso de creación de proyectos.
Gestiona la compilación, distribución, documentación colaboración en grupo y tareas
similares. **Maven** incrementa la re utilización y se encarga de la mayor parte de las tareas
relacionadas con las tareas de compilación._

## POM Que significa y para que nos sirve

_**POM** Es un archivo en fomarto "xml" cuyas siglas significan "Project Object Model". El **POM** contiene información sobre el proyecto y detalles de la configuración utilizada por Maven para construir los proyectos._

## Diferencia entre Archetype y ArtifactId

_**Archetype** es una plantilla de proyecto a partir de la cual se crean otros proyectos. Se define como un patrón o modelo original del que se hacen todas las demás cosas del mismo tipo. Ayudará a los autores a crear plantillas de proyecto Maven para los usuarios, y proporciona a los usuarios los medios para generar versiones parametrizadas de esas plantillas de proyecto. En cambio **ArtifactId** es el nombre del jar sin versión. Si nosotros somos los creadores de ese jar, entonces se puede elegir cualquier nombre con letras minúsculas y sin símbolos. Si se trata de un jar de terceros, el nombre tiene que ser igual al jar_

## Explique los siguientes goals de maven; [Clean, package, install, compile]

* **Clean**: Intenta limpiar el directorio de trabajo de un proyecto de los archivos que se generan en el momento de la construcción.
* **Package**: Código compilado de los paquetes en un archivo de almacenamiento.
* **Install**: Instala el archivo del paquete en el repositorio local de Maven.
* **Compile**: Compila el código fuente proporcionado en artefactos binarios.

## Explique los siguientes Scopes; [Compile, provided, runtime, test, system]

* **Compile**: Es el scope por defecto, se utiliza si no se especifica ninguno. Las dependencias de compilación están disponibles en todos los classpaths de un proyecto. Compile significa que necesita el JAR para compilar y ejecutar la aplicación.
* **Provided**: Provided significa que necesitas el JAR para compilar, pero en tiempo de ejecución ya hay un JAR proporcionado por el entorno, por lo que no lo necesitas empaquetado con tu aplicación. 
* **Runtime**: Runtime es útil para las dependencias necesarias para las pruebas unitarias y en tiempo de ejecución, pero no en tiempo de compilación. Normalmente se trata de código cargado dinámicamente, como los controladores JDBC, que no están directamente referenciados en el código de programa.
* **Test**: Este scope indica que la dependencia no es necesaria para el uso normal de la aplicación y sólo está disponible para las fases de compilación y ejecución de pruebas.
* **System**: Es como provided pero tienes que incluir la dependencia explicitamente. Maven no buscará este artefacto en tu repositorio local. Habrá que especificar la ruta de la dependencia mediante la etiqueta <systemPath>.

<p align="center">
  <img src ="http://www.mecanica.frba.utn.edu.ar/energiaundimotriz/wp-content/uploads/UTN-Mar-del-Plata.png" />
</p>
<p align="center">
  <img src ="https://maven.apache.org/images/maven-logo-black-on-white.png" />
</p>

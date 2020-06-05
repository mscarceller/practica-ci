#### Máster Cloud Apps Módulo IV - DevOps, integración y despliegue continuo

# Práctica: Integración y Entrega Continua 

1. [Punto de partida y planteamiento Inicial](#puntodepartida)
2. [Infraestructura](#infraestructura)
    * [Creación del proyecto y repositorio Github](#git)
    * [Jenkins en Instancia EC2 de AWS](#jenkins)
    * [Sonarqube en Instancia EC2 de AWS](#sonar)
    * [Configuración Jenkins <-> Sonarqube](#conexion)
    * [Configuración Webhook de Git](#webhook)
3. [Creación de un fichero Jenkinsfile](#3)
4. [Creación del Job para la generación una release Nightly](#4)
5. [Creación del Job para realizar un análisis estático del código con Sonarqube](#5)
6. [Ejemplo de funcionamiento completo](#funcionando)
    * [Creación de release 1.0.0](#release)
    * [Creación de release 1.1.0: añadiendo css a la web](#css)

---

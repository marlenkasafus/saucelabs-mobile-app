# saucelabs-mobile-app
Repositorio que contiene pruebas automatizadas en Appium 2.0 para la aplicación SwagLabs
Se esta usando la aplicación alojada en el siguiente repositorio https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk

## Instalación🔧
Es necesario tener instalado:
* JDK 11
* Appium@next
* Driver UIAutomator2

## Configuración requerida para ejecutar las pruebas ⚙️
* Modificar a necesidad las capabilities del archivo serenity.properties
  * appium.deviceName
  * appium.platformVersion
* Se debe tener en ejecución el servidor de appium
* Si la Url del servidor de appium es diferente a http://127.0.0.1:4723/ se debe modificar la capabilitie `appium.hub` en el archivo serenity.properties


## **Estructura del Proyecto** 📦
```
├── main
  ├── java
│ │    └── com
│ │     └── marlen
│ │                  ├── interactions 
│ │                  ├── models
│ │                  ├── questions
│ │                  ├── tasks
│ │                  ├── userinterfaces
├── test
  ├── java
│ │    └── com
│ │     └── marlen
│ │                  ├── Runners
│ │                  ├── stepdefintions
  └── resources
         └── features
```


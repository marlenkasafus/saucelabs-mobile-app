# saucelabs-mobile-app
Repositorio que contiene pruebas automatizadas en Appium 2.0 para la aplicaci贸n SwagLabs
Se esta usando la aplicaci贸n alojada en el siguiente repositorio https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk

## Instalaci贸n馃敡
Es necesario tener instalado:
* JDK 11
* Appium@next
* Driver UIAutomator2

## Configuraci贸n requerida para ejecutar las pruebas 鈿欙笍
* Modificar a necesidad las capabilities del archivo serenity.properties
  * appium.deviceName
  * appium.platformVersion
* Se debe tener en ejecuci贸n el servidor de appium
* Si la Url del servidor de appium es diferente a http://127.0.0.1:4723/ se debe modificar la capabilitie `appium.hub` en el archivo serenity.properties


## **Estructura del Proyecto** 馃摝
```
鈹溾攢鈹? main
  鈹溾攢鈹? java
鈹偮犫攤聽   鈹斺攢鈹? com
鈹偮犫攤聽    鈹斺攢鈹? marlen
鈹偮犫攤聽                 鈹溾攢鈹? interactions 
鈹偮犫攤聽                 鈹溾攢鈹? models
鈹偮犫攤聽                 鈹溾攢鈹? questions
鈹偮犫攤聽                 鈹溾攢鈹? tasks
鈹偮犫攤聽                 鈹溾攢鈹? userinterfaces
鈹溾攢鈹? test
  鈹溾攢鈹? java
鈹偮犫攤聽   鈹斺攢鈹? com
鈹偮犫攤聽    鈹斺攢鈹? marlen
鈹偮犫攤聽                 鈹溾攢鈹? Runners
鈹偮犫攤聽                 鈹溾攢鈹? stepdefintions
  鈹斺攢鈹? resources
         鈹斺攢鈹? features
```


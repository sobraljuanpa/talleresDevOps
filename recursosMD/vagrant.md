# Comandos utiles

+ Para levantar todo ```vagrant up```
+ Para acceder a la vm ```vagrant ssh```
+ Para recargar la config la config si la modifico ```vagrant reload```
+ Para apagar la vm ```vagrant halt```
+ Para destruir la vm ```vagrant destroy```


Para configurar el ambiente, vamos a ejecutar los siguientes comandos en una consola de powershell:

``` powershell
mkdir vagrant-test
cd vagrant-test
vagrant init
```

Al finalizar, deberiamos tener simplemente un archivo llamado Vagrantfile en el directorio vagrant-test. Hay que abrir ese archivo y copiar los contenidos del vagrantfile disponible en este repositorio. 

Una vez hecho, parados en el mismo directorio ejecutamos el siguiente comando:

```vagrant up```

Esto lo que va a hacer es crear la VM que necesitamos y ejecutar el playbook contenido en este mismo repositorio, dejandola configurada para poder hacer tanto de servidor jenkins como de webserver para poder deployar la aplicacion Django.
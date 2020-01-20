# Segunda parte del taller

En esta instancia la idea es hacer tareas un poco más avanzadas. Las tecnologías que vamos a usar para eso son Ansible, WebDriverIO, Taurus y Jenkins.

Vamos a necesitar tener una VM con Ubuntu instalado. Para eso recomiendo seguir la [siguiente guía](https://linuxhint.com/install_ubuntu_18-04_virtualbox/).

Una vez pronto hay que instalar [Ansible](https://www.ansible.com/) que es la herramienta que vamos a usar para aprovisionar nuestro servidor e ilustrar el concepto de configuracion como codigo. Lo podemos hacer con el siguiente comando.

```sudo apt-get install ansible```

Tambien vamos a usar git, instalamos asi:

```sudo apt-get install git```

La aplicacion que vamos a deployar y probar es un ejemplo del curso de desarrollo web de la fundacion mozilla, [aca](https://github.com/mdn/django-locallibrary-tutorial) les dejo el link al repo. Para los que saben python y para los que no tambien, [django](https://www.djangoproject.com/) (el framework en el que esta desarrollada la webapp) esta muy bueno, super facil de usar e incluye pila de funcionalidades utiles por si quieren hacerse el tutorial o investigar un poco.

Una vez deployada le tendriamos que hacer varios tipos de pruebas, en este caso la vamos a probar con [Taurus](https://gettaurus.org/) y con [WebDriverIO](https://webdriver.io/), les dejo links a cada una por si quieren investigar un poco antes del taller.

## Como va a quedar el pipe

![esquemaPipe](/recursosMD/SamplePipeline.png)
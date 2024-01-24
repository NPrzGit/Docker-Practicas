job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/su_nombre_de_usuario/nodejsapp.git', 'master') { node ->
            node / gitConfigName('su_nombre_de_usuario')
            node / gitConfigEmail('el_mail_de_su_cuenta_de_GitHub')
        }
    }
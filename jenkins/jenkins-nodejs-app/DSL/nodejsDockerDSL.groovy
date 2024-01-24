job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/su_nombre_de_usuario/nodejsapp.git', 'master') { node ->
            node / gitConfigName('su_nombre_de_usuario')
            node / gitConfigEmail('el_mail_de_su_cuenta_de_GitHub')
        }
    }
 
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        dockerBuildAndPublish {
            repositoryName('su_nombre_de_usuario/nodejsapp')
            tag('${GIT_REVISION,length=7}')
            registryCredentials('El ID con el que hayan guardado la credencial de su cuenta de docker en jenkins')
            forcePull(false)
            createFingerprints(false)
            skipDecorate()
        }
    }
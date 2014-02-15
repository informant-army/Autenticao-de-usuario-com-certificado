Autenticao-de-usuario-com-certificado
=====================================

Exemplo de implementação de autenticação de usuários através de certificados X509 em grails utilizando Spring Security Core Plugin

No diretório Tutorial seguido, está salvo uma páginda HTML de um blog de onde foi seguido o passo-a-passo para elaboração do exemplo. A página foi salva para 
evitar que o blog saia do ar e perca o tutorial.
TODO: Escrever o passo-a-passo em português para simplificar o tutorial e postar no blog da Informant.

No diretório certificados-corretos estão os certificados utilizados no exemplo, tanto o server, a JKS, e o certificado de 2 usuários que autenticam no exemplo.

No diretório certificados-incorretos, está um certificado gerado para validar que a aplicação de exemplo não autentica com qualquer certificado.

No diretório sslAPI, está o fonte de uma aplicação Grails 2.2.3 com o plugin SpringSecurityCore instalado configurado para autenticar via certificado X509

No diretório tomcat6, está versionado um tomcat versão 6 com o aplicativo de exemplo instalado e as keystores configuradas. Basta realizar o start do tomcat
e acessar o endereço http://localhost:8443/sslAPI/validate/usuario e será solicitado o certificado. As instruções para instalar o certificado de usuário no Browser
constam no tutorial de referrência.
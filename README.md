# SpringBootHTTPSMicroservice
SpringBoot - HTTPS - Microservice + Cloud Deployement


*** SSL Disabled as of now 
Uncomment ssl configurations in application context to enable SSL

create key store file
*** keystore password and key password MUST be same

keytool -genkey -alias samrat-springboot-https -storetype JKS -keyalg RSA -keysize 2048 -validity 365 -keypass samrat -keystore springboot-https.jks -storepass samrat

*** Deploy it to PWS - CLoudFoundry
Steps.
Configure CF CLI
1.
...download & extract Mac OS X binary
curl -L "https://packages.cloudfoundry.org/stable?release=macosx64-binary&source=github" | tar -zx
mv cf /usr/local/bin
cf --version {Verify}

2. 
Register for Using PWS  @- https://account.run.pivotal.io/z/uaa/sign-up for a free trial account

3.
Login and logout from PWS Console using CLI - configured at Step 1
Login to PWS – We will use cf login -a api.run.pivotal.io command to login to pivotal web service console from CLI tool 
that we have installed in our local workstation. It will logon the CLI tool to PWS platform so that we can deploy 
and manage our applications from our workstation. 
After giving command, it will ask for registered email and password and once provided successfully, it will logon to the platform.

Logout from PWS Console – We will use command cf logout to logout from the platform, once we have all the work done for that session.

4.
Push Application to Console
cf push nameofapp@cloudprovider -p target\spring-{#####}SNAPSHOT.jar

5.
Verify app deployment status @ CLI Console and also get the registered https hostname of the running app(if applicable) from PWS dashboard.


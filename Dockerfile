FROM tomcat:9.0.65-jre11
COPY target/*.war $CATALINA_HOME/webapps/
#!/bin/sh
mkdir -p $CATALINA_HOME/webapps/order/
cp -r src/main/webapp/* $CATALINA_HOME/webapps/order/
cp -r target/classes $CATALINA_HOME/webapps/order/WEB-INF/
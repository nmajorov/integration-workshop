#!/bin/sh

oc project api
WILDCARD_DOMAIN="apps-3b7a.generic.opentlc.com"
oc new-app --file apicurio-standalone-template.yml 

#--param WILDCARD_DOMAIN=$WILDCARD_DOMAIN --param ADMIN_PASSWORD=admin

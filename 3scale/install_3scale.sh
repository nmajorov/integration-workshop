#!/bin/sh

echo "install 3scale in project"
echo 
oc project

oc new-app --file amp.yml --param WILDCARD_DOMAIN=$WILDCARD_DOMAIN --param ADMIN_PASSWORD=admin

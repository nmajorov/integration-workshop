#!/bin/env bash

echo "delete apicurio form current project"

oc delete all --selector=template=apicurio-studio
oc delete is/api
oc delete is/auth
oc delete is/ui
oc delete is/ws
oc delete secrets postgresql
oc delete secrets apicurio-studio-auth
oc delete pvc/keycloak-data
oc delete pvc/postgresql-data

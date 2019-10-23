#!/bin/sh

echo "use project"
oc project

if [ -n "${WILDCARD_DOMAIN+set}" ]; then
  echo 'use $WILDCARD_DOMAIN  variable'
else
  echo "WILDCARD_DOMAIN env variable is not set"
  exit 1
fi

sed s/example.com/$WILDCARD_DOMAIN/ apicurio-standalone-template.yml | oc new-app \
--param GENERATED_KC_USER=admin \
--param GENERATED_KC_PASS=admin  -f -

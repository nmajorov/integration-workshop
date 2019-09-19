#!/bin/sh


oc project 03-3scale
oc new-app --file amp.yml --param WILDCARD_DOMAIN=apps-dc8c.generic.opentlc.com --param ADMIN_PASSWORD=admin

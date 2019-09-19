#!/bin/sh

#add secret for redhat.io container registry

DOCKER_CONF=$HOME/.docker/config.json

 oc create secret generic rhpullsecret \
                --from-file=.dockerconfigjson=$DOCKER_CONF \
                --type=kubernetes.io/dockerconfigjson

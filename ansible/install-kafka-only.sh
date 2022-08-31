#!/usr/bin/env bash

echo "install amq streams only" 
echo 



ansible-playbook integration-install.yaml  --tags integration,amq-streams


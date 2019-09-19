#!/bin/sh

asciidoctor -a stylesheet=./asciidoctor.css  -a linkcss  README.asciidoc

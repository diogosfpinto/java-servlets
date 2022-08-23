#!/usr/bin/env bash

#cleanFunction() {
#    rm -rf dpp-containers/dpp-ebx-server/EBX-Home/ebxLog/*
#    rm -rf dpp-containers/dpp-ebx-server/EBX-Home/ebxRepository/History/*
#    rm -f dpp-containers/dpp-ebx-server/EBX-Home/ebxRepository/h2/repository.lock.db
#    rm -rf dpp-containers/dpp-ebx-server/tomcat-ebx/logs/*
#}

buildImage() {
    if [ "$( docker image inspect java-servlets)" == "[]" ]
    then
	echo EBX IMAGE NOT FOUND... CREATING ONE
	docker build -t "java-servlets":1.0 .
    fi
#    if [ "$( docker image inspect zookeeper)" == "[]" ]
#    then
#	echo ZOOKEEPER IMAGE NOT FOUND... CREATING ONE
#	docker build -t zookeeper ./dpp-containers/kafka-server/zookeeper-docker
#    fi
#    if [ "$( docker image inspect kafka)" == "[]" ]
#    then
#	echo KAFKA IMAGE NOT FOUND... CREATING ONE
#	docker build -t kafka ./dpp-containers/kafka-server/kafka-docker
#    fi
}


runFunction() {
#    cleanFunction
    buildImage

#    LOCAL_USER_ID=$(id -u $USER) \
#        docker-compose -f dpp-containers/docker-compose.yml up ; \
#        docker-compose -f dpp-containers/docker-compose.yml rm -f -v -s
}

runFunction
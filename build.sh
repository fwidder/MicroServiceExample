#!/bin/bash

# Build Microservices
mvn clean install

# Build Config Server Docker Image
pushd configserver
docker build --tag=configserver:latest --rm=true .
popd

# Build Service Discovery Docker Image
pushd servicediscovery
docker build --tag=servicediscovery:latest --rm=true .
popd

# Build Boot Admin Docker Image
pushd bootadmin
docker build --tag=bootadmin:latest --rm=true .
popd

# Build Message Service Docker Image
pushd messageservice
docker build --tag=messageservice:latest --rm=true .
popd

# Build DashBoard Service Docker Image
pushd dashboardservice
docker build --tag=dashboardservice:latest --rm=true .
popd

# Build Gateway Service Docker Image
pushd gatewayservice
docker build --tag=gatewayservice:latest --rm=true .
popd

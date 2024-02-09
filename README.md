# Spring Boot Kubernetes Example

### Setup Minikube On Windows
* [Setup Minikube on Windows 11](https://minikube.sigs.k8s.io/docs/start/)


### Set the secret(This is for docker hub)
kubectl create secret docker-registry dockerhub-secret --docker-server=https://index.docker.io/v1/ --docker-username=testUser --docker-password=password --docker-email=test@gmail.com

### Apply the secret
kubectl patch serviceaccount default -p '{\"imagePullSecrets\": [{\"name\": \"dockerhub-secret\"}]}'


### Trigger to apply deployment and service
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml

### Check the deployment and service successful
kubectl get deployments
kubectl get services


### Expose the service to access from the browser
kubectl service springboot-kubernetes


### Docker Build Commands
docker build -t yourName/kubernetes-demo .
docker run -p 8080:8080 kubernetes-demo

docker image tag yourName/kubernetes-demo:latest yourDockerHubUserName/yourRepoName:latest

Login Docker Hub with your credentials
docker push yourDockerHubUserName/yourRepoName:latest



### Follow this link if you have docker error in minikube
* [Follow this for minikube docker error](https://stackoverflow.com/questions/77208746/unable-to-resolve-the-current-docker-cli-context-default-context-default-c)


### When it asks to use the default docker context run this  command
docker context use default


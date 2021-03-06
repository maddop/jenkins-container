# jenkins-container

If you want to use this container with your own jobs & projects, you'll need to fork the [https://github.com/jenkins201/jenkins-container](https://github.com/jenkins201/jenkins-container) repo on GitHub first, so that you can make changes to:
 
* `jobs/jenkins-container-seed-job/config.xml` - this seed job will need updated to point to your own fork, so that your own Job DSL defined jobs are collected, see lines 7 & 15. (this build clones [https://github.com/jenkins201/jenkins-container/](https://github.com/jenkins201/jenkins-container/) to get at the Job DSL definition in [https://github.com/jenkins201/jenkins-container/tree/master/jobs](https://github.com/jenkins201/jenkins-container/tree/master/jobs)
* `jobs/packer_terraform_cicd_aws.groovy` - line 1, update the GitHub project name if you want to use your own fork of this project. 

## Quick Start

Use `docker-compose` to build & start the jenkins & artifactory containers:

    docker-compose up

You'll then be able to open the UI's:

* Jenkins [http://localhost:8080](http://localhost:8080)
* Artifactory: [http://localhost:8081/artifactory/webapp/#/home](http://localhost:8081/artifactory/webapp/#/home)

Docker Hub autobuild images are here: [https://hub.docker.com/r/jenkins201/jenkins-container/](https://hub.docker.com/r/jenkins201/jenkins-container/)
# Reading/Future Work

* Build on git tag push: https://groups.google.com/forum/#!topic/jenkinsci-dev/0RHUNDhyhog
* https://github.com/JFrogDev/project-examples/blob/master/jenkins-examples/pipeline-examples/maven-example/Jenkinsfile
* https://www.eduonix.com/devops-ci-and-cd-with-jenkins-pipelines-maven-gradle#
* https://github.com/dxw/testing-terraform-docker/blob/master/Dockerfile
* https://github.com/autopilotpattern/jenkins (bootstrapping jenkins on triton)
* https://jenkins.io/blog/2017/07/17/speaker-blog-care/ Indispensable, Disposable Jenkins
* https://www.cloudbees.com/event/disposable-jenkins
* https://github.com/JFrogDev/project-examples/tree/master/jenkins-examples/job-dsl-examples
* https://github.com/cloudposse/jenkins/blob/master/init.groovy

# Building Disk Images

* https://www.developer.com/design/creating-a-reproducible-and-portable-development-environment.html
* https://github.com/cloudify-cosmo/cloudify-packager/tree/master/image-builder/quickstart-vagrantbox
* Convert AMI to Vagrant/VirtualBox: https://github.com/cloudify-cosmo/cloudify-image-bakery/blob/master/quickstart/nightly-builder.py
* https://github.com/CircleCI-Public/circleci-packer
* https://github.com/bitflight-public/terraform-aws-ssm-ami-bakery

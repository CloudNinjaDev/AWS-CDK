# To install AWS CDK in your system:
Make sure you have latest version of node installed. 
```bash
npm install -g aws-cdk
```
Check CDK version
```
cdk --version
```

# Setup Project
We will use Java Language in this project.
```
mkdir <DIR_NAME> && cd <DIR_NAME>
cdk init app --language java
```

There is a simple way to get a starter template for your project i.e. Bootstrapping

You need your account id and your region where CloudFormation will setup it's stack
```
aws --profile <PROFILE_NAME> --region <REGION_NAME> sts get-caller-identity
cdk bootstrap aws://<ACCOUNT_ID>/<REGION_NAME>
```


# Welcome to your CDK Java project!

You should explore the contents of this project. It demonstrates a CDK app with an instance of a stack (`AwsCdkStack`)
which contains an Amazon SQS queue that is subscribed to an Amazon SNS topic.

The `cdk.json` file tells the CDK Toolkit how to execute your app.

It is a [Maven](https://maven.apache.org/) based project, so you can open this project with any Maven compatible Java IDE to build and run tests.

## Useful commands

 * `mvn package`     compile and run tests
 * `cdk ls`          list all stacks in the app
 * `cdk synth`       emits the synthesized CloudFormation template
 * `cdk deploy`      deploy this stack to your default AWS account/region
 * `cdk diff`        compare deployed stack with current state
 * `cdk docs`        open CDK documentation

Enjoy!

## About the files 
* `<DIR_NAME>App.java:` The entrypoint for the CDK application it will load the stack defined in here.
* `<DIR_NAME>Stack.java:` CDK's application main stack is defined here.
* `cdk.json:` tells the toolkit how to run your app. In our case it will be "mvn -q exec:java"
* `pom.xml:` is the Maven project file. It is an xml file and contains information on build properties, dependencies, and app information.
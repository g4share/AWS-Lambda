# AWS Lambda Learning

### Create Lambda Package

```console
user@host:~% ./gradlew shadowJar
```

### Upload Lambda Package to AWS

* Login to AWS
* Search for **AWS Lambda** Service
* Function -> Create Function

<img src="docs/Create function.png" width="500" alt="Author from scratch, 'SimpleLambda' as Function Name,'Java 21' as Runtime"/>

* Press **"Upload from"** / **".zip or .jar file"**, upload **AWS Lambda/lib/build/libs/lib-0.1-all.jar** file
* Runtime settings -> Edit
* **com.g4share.lambda.AwsSimpleHandler::handleRequest** for Handler

<img src="docs/Edit runtime settings.png" width="500" alt="'com.g4share.lambda.AwsSimpleHandler::handleRequest' for Handler"/>

### Test Lambda function from Console

<img src="docs/Test Lambda.png" width="500" alt="'Create new event', 'SimpleLambdaTestEvent' for 'Event name'; &quot;SIMPLE AWS LAMBDA TEST&quot; as data"/>

* Save / Test

* Validate Test result

<img src="docs/Test result.png" width="500" alt="Open Test result details"/>


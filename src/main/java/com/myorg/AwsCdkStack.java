package com.myorg;

import software.constructs.Construct;
import software.amazon.awscdk.Duration;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;

public class AwsCdkStack extends Stack {
  public AwsCdkStack(final Construct parent, final String id) {
    this(parent, id, null);
  }

  public AwsCdkStack(final Construct parent, final String id, final StackProps props) {
    super(parent, id, props);

    // Defines a new lambda resource
    final Function hello = Function.Builder.create(this, "HelloHandler")
        .runtime(Runtime.NODEJS_14_X)    // execution environment
        .code(Code.fromAsset("lambda"))  // code loaded from the "lambda" directory
        .handler("hello.handler")        // file is "hello", function is "handler"
        .build();
  }
}

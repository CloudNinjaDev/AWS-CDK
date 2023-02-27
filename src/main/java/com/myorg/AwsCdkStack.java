package com.myorg;

import software.constructs.Construct;
import software.amazon.awscdk.Duration;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.sns.Topic;
import software.amazon.awscdk.services.sns.subscriptions.SqsSubscription;
import software.amazon.awscdk.services.sqs.Queue;

public class AwsCdkStack extends Stack {
    public AwsCdkStack(final Construct parent, final String id) {
        this(parent, id, null);
    }

    public AwsCdkStack(final Construct parent, final String id, final StackProps props) {
        super(parent, id, props);

    }
}

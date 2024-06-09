package com.studies.rabbit_mq.application.dataprovider.config.rabbitmq;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016JJ\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n28\u0010\u0011\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001a"}, d2 = {"Lcom/studies/rabbit_mq/application/dataprovider/config/rabbitmq/MessageBroker;", "", "()V", "queueName", "", "getQueueName", "()Ljava/lang/String;", "setQueueName", "(Ljava/lang/String;)V", "createChannel", "Lcom/rabbitmq/client/Channel;", "connection", "Lcom/rabbitmq/client/Connection;", "createConnection", "listen", "", "channel", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "consumerTag", "Lcom/rabbitmq/client/Delivery;", "delivery", "sendMessage", "message", "rabbit-mq"})
public class MessageBroker {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String queueName = "test";
    
    public MessageBroker() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getQueueName() {
        return null;
    }
    
    public void setQueueName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.rabbitmq.client.Connection createConnection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.rabbitmq.client.Channel createChannel(@org.jetbrains.annotations.NotNull()
    com.rabbitmq.client.Connection connection) {
        return null;
    }
    
    public void sendMessage(@org.jetbrains.annotations.NotNull()
    com.rabbitmq.client.Channel channel, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public void listen(@org.jetbrains.annotations.NotNull()
    com.rabbitmq.client.Channel channel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.rabbitmq.client.Delivery, ? extends java.lang.Object> callback) {
    }
}
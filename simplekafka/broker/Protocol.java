// this file contains all the constants used for communication between client and broker.
// these are the request and response types that are used to identify the type of message being sent or received.
// this helps in routing the messages to the correct handlers on both client and broker sides.
// the byte values are chosen to be unique and not conflict with each other.
// the constants are defined as public static final so that they can be accessed from anywhere in the code.
// the naming convention is to use uppercase letters for constants and to prefix them with the type of message they represent.
// for example, PRODUCE is a request type and PRODUCE_RESPONSE is a response type.
// this helps in maintaining consistency and readability of the code.
// the byte values are chosen to be small integers so that they can be easily transmitted over the network.
// the constants are defined in a way that they can be easily extended in the future if needed.
// for example, if we need to add more request types, we can simply add new constants with new byte values.
// this makes the code extensible and maintainable.
// the constants are also used in the serialization and deserialization of messages.
// this ensures that the messages are correctly interpreted by both client and broker.
// overall, this file plays a crucial role in the communication between client and broker

//client request types

public static final byte PRODUCE = 0x01;
public static final byte FETCH = 0x02;
public static final byte METADATA = 0x03;
public static final byte CREATE_TOPIC = 0x04

//Broker response types
public static final byte PRODUCE_RESPONSE = 0x11;
public static final byte FETCH_RESPONSE = 0x12;
public static final byte METADATA_RESPONSE = 0x13;
public static final byte CREATE_TOPIC_RESPONSE = 0x14;

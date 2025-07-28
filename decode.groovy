def decoded = message.getBody(String).decodeBase64().toString("UTF-8")
message.setBody(decoded)
return message

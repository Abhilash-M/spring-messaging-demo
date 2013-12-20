package com.digiburo.spring.demo.demo1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gsc on 12/13/13.
 */
public class MessagePayload {

  public MessagePayload() {
    //empty
  }

  public MessagePayload(String arg) {
    _messageText = arg;
  }

  public String getMessageText() {
    return(_messageText);
  }

  public void setMessageText(String arg) {
    _messageText = arg;
  }

  public String getCreationTime() {
    return(_simpleDateFormat.format(_creationTime));
  }

  public String toString() {
    return(getCreationTime() + ":" + _messageText);
  }

  private Date _creationTime = new Date();
  private String _messageText = "defaultMessage";
  private SimpleDateFormat _simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
}

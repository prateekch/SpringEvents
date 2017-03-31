package com.event;

public class Email {
    private String toMail;
    private String fromMAil ="prateek.chaudhary@tothenew.com";

    public String getToMail() {
        return toMail;
    }

    public Email setToMail(String toMail) {
        this.toMail = toMail;
        return this;
    }

    public String getFromMAil() {
        return fromMAil;
    }

    public Email setFromMAil(String fromMAil) {
        this.fromMAil = fromMAil;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public Email setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getBody() {
        return body;
    }

    public Email setBody(String body) {
        this.body = body;
        return this;
    }

    private String  subject;
    private String body;

}

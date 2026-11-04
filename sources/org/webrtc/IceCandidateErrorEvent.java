package org.webrtc;
public final class IceCandidateErrorEvent {
    public final String address;
    public final int errorCode;
    public final String errorText;
    public final int port;
    public final String url;

    public IceCandidateErrorEvent(String str, int i3, String str2, int i10, String str3) {
        this.address = str;
        this.port = i3;
        this.url = str2;
        this.errorCode = i10;
        this.errorText = str3;
    }
}

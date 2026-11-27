package org.webrtc;
public class DtlsFingerprint {
    public final String algorithm;
    public final String value;

    public DtlsFingerprint(String str, String str2) {
        this.algorithm = str;
        this.value = str2;
    }
}

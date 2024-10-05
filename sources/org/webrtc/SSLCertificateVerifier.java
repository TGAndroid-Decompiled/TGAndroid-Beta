package org.webrtc;

public interface SSLCertificateVerifier {
    boolean verify(byte[] bArr);
}

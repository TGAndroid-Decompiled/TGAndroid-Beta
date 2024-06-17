package org.webrtc;

import org.webrtc.PeerConnection;

public class RtcCertificatePem {
    private static final long DEFAULT_EXPIRY = 2592000;
    public final String certificate;
    public final String privateKey;

    private static native RtcCertificatePem nativeGenerateCertificate(PeerConnection.KeyType keyType, long j);

    @CalledByNative
    public RtcCertificatePem(String str, String str2) {
        this.privateKey = str;
        this.certificate = str2;
    }

    @CalledByNative
    String getPrivateKey() {
        return this.privateKey;
    }

    @CalledByNative
    String getCertificate() {
        return this.certificate;
    }

    public static RtcCertificatePem generateCertificate() {
        return nativeGenerateCertificate(PeerConnection.KeyType.ECDSA, DEFAULT_EXPIRY);
    }

    public static RtcCertificatePem generateCertificate(PeerConnection.KeyType keyType) {
        return nativeGenerateCertificate(keyType, DEFAULT_EXPIRY);
    }

    public static RtcCertificatePem generateCertificate(long j) {
        return nativeGenerateCertificate(PeerConnection.KeyType.ECDSA, j);
    }

    public static RtcCertificatePem generateCertificate(PeerConnection.KeyType keyType, long j) {
        return nativeGenerateCertificate(keyType, j);
    }
}

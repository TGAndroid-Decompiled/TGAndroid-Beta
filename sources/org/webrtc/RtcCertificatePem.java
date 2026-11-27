package org.webrtc;

import java.util.Collections;
import java.util.List;
import org.webrtc.PeerConnection;
public class RtcCertificatePem {
    private static final long DEFAULT_EXPIRY = 2592000;
    public final String certificate;
    public final String privateKey;

    public interface Natives {
        RtcCertificatePem generateCertificate(PeerConnection.KeyType keyType, long j);

        DtlsFingerprint getFingerprint(String str, String str2);
    }

    public RtcCertificatePem(String str, String str2) {
        this.privateKey = str;
        this.certificate = str2;
    }

    public static RtcCertificatePem generateCertificate() {
        return RtcCertificatePemJni.get().generateCertificate(PeerConnection.KeyType.ECDSA, 2592000L);
    }

    public String getCertificate() {
        return this.certificate;
    }

    public List<DtlsFingerprint> getFingerprints() {
        DtlsFingerprint fingerprint = RtcCertificatePemJni.get().getFingerprint(this.privateKey, this.certificate);
        if (fingerprint == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.singletonList(fingerprint);
    }

    public String getPrivateKey() {
        return this.privateKey;
    }

    public static RtcCertificatePem generateCertificate(PeerConnection.KeyType keyType) {
        return RtcCertificatePemJni.get().generateCertificate(keyType, 2592000L);
    }

    public static RtcCertificatePem generateCertificate(long j) {
        return RtcCertificatePemJni.get().generateCertificate(PeerConnection.KeyType.ECDSA, j);
    }

    public static RtcCertificatePem generateCertificate(PeerConnection.KeyType keyType, long j) {
        return RtcCertificatePemJni.get().generateCertificate(keyType, j);
    }
}

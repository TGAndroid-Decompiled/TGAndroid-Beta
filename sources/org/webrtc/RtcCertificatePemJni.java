package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.PeerConnection;
import org.webrtc.RtcCertificatePem;
class RtcCertificatePemJni implements RtcCertificatePem.Natives {
    private static JniTestInstanceHolder sOverride;

    public static RtcCertificatePem.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (RtcCertificatePem.Natives) obj;
        }
        return new RtcCertificatePemJni();
    }

    public static void setInstanceForTesting(RtcCertificatePem.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public RtcCertificatePem generateCertificate(PeerConnection.KeyType keyType, long j) {
        return (RtcCertificatePem) GEN_JNI.org_webrtc_RtcCertificatePem_generateCertificate(keyType, j);
    }

    @Override
    public DtlsFingerprint getFingerprint(String str, String str2) {
        return (DtlsFingerprint) GEN_JNI.org_webrtc_RtcCertificatePem_getFingerprint(str, str2);
    }
}

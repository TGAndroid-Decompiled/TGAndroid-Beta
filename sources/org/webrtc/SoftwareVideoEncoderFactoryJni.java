package org.webrtc;

import java.util.List;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.SoftwareVideoEncoderFactory;
class SoftwareVideoEncoderFactoryJni implements SoftwareVideoEncoderFactory.Natives {
    private static JniTestInstanceHolder sOverride;

    public static SoftwareVideoEncoderFactory.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (SoftwareVideoEncoderFactory.Natives) obj;
        }
        return new SoftwareVideoEncoderFactoryJni();
    }

    public static void setInstanceForTesting(SoftwareVideoEncoderFactory.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long create(long j, long j2, VideoCodecInfo videoCodecInfo) {
        return GEN_JNI.org_webrtc_SoftwareVideoEncoderFactory_create(j, j2, videoCodecInfo);
    }

    @Override
    public long createFactory() {
        return GEN_JNI.org_webrtc_SoftwareVideoEncoderFactory_createFactory();
    }

    @Override
    public List getSupportedCodecs(long j) {
        return (List) GEN_JNI.org_webrtc_SoftwareVideoEncoderFactory_getSupportedCodecs(j);
    }

    @Override
    public boolean isSupported(long j, VideoCodecInfo videoCodecInfo) {
        return GEN_JNI.org_webrtc_SoftwareVideoEncoderFactory_isSupported(j, videoCodecInfo);
    }
}

package org.webrtc;

import java.util.List;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.SoftwareVideoDecoderFactory;
class SoftwareVideoDecoderFactoryJni implements SoftwareVideoDecoderFactory.Natives {
    private static JniTestInstanceHolder sOverride;

    public static SoftwareVideoDecoderFactory.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (SoftwareVideoDecoderFactory.Natives) obj;
        }
        return new SoftwareVideoDecoderFactoryJni();
    }

    public static void setInstanceForTesting(SoftwareVideoDecoderFactory.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long create(long j, long j2, VideoCodecInfo videoCodecInfo) {
        return GEN_JNI.org_webrtc_SoftwareVideoDecoderFactory_create(j, j2, videoCodecInfo);
    }

    @Override
    public long createFactory() {
        return GEN_JNI.org_webrtc_SoftwareVideoDecoderFactory_createFactory();
    }

    @Override
    public List getSupportedCodecs(long j) {
        return (List) GEN_JNI.org_webrtc_SoftwareVideoDecoderFactory_getSupportedCodecs(j);
    }

    @Override
    public boolean isSupported(long j, VideoCodecInfo videoCodecInfo) {
        return GEN_JNI.org_webrtc_SoftwareVideoDecoderFactory_isSupported(j, videoCodecInfo);
    }
}

package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.BuiltinAudioEncoderFactoryFactory;
class BuiltinAudioEncoderFactoryFactoryJni implements BuiltinAudioEncoderFactoryFactory.Natives {
    private static JniTestInstanceHolder sOverride;

    public static BuiltinAudioEncoderFactoryFactory.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (BuiltinAudioEncoderFactoryFactory.Natives) obj;
        }
        return new BuiltinAudioEncoderFactoryFactoryJni();
    }

    public static void setInstanceForTesting(BuiltinAudioEncoderFactoryFactory.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long createBuiltinAudioEncoderFactory() {
        return GEN_JNI.org_webrtc_BuiltinAudioEncoderFactoryFactory_createBuiltinAudioEncoderFactory();
    }
}

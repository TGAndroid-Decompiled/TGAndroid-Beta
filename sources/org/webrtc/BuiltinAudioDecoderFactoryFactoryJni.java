package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.BuiltinAudioDecoderFactoryFactory;
class BuiltinAudioDecoderFactoryFactoryJni implements BuiltinAudioDecoderFactoryFactory.Natives {
    private static JniTestInstanceHolder sOverride;

    public static BuiltinAudioDecoderFactoryFactory.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (BuiltinAudioDecoderFactoryFactory.Natives) obj;
        }
        return new BuiltinAudioDecoderFactoryFactoryJni();
    }

    public static void setInstanceForTesting(BuiltinAudioDecoderFactoryFactory.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long createBuiltinAudioDecoderFactory() {
        return GEN_JNI.org_webrtc_BuiltinAudioDecoderFactoryFactory_createBuiltinAudioDecoderFactory();
    }
}

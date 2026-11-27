package org.webrtc;
public class BuiltinAudioEncoderFactoryFactory implements AudioEncoderFactoryFactory {

    public interface Natives {
        long createBuiltinAudioEncoderFactory();
    }

    @Override
    public long createNativeAudioEncoderFactory() {
        return BuiltinAudioEncoderFactoryFactoryJni.get().createBuiltinAudioEncoderFactory();
    }
}

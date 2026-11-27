package org.webrtc;
public class BuiltinAudioDecoderFactoryFactory implements AudioDecoderFactoryFactory {

    public interface Natives {
        long createBuiltinAudioDecoderFactory();
    }

    @Override
    public long createNativeAudioDecoderFactory() {
        return BuiltinAudioDecoderFactoryFactoryJni.get().createBuiltinAudioDecoderFactory();
    }
}

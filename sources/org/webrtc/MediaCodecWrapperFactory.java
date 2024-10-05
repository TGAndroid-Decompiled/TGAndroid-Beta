package org.webrtc;

interface MediaCodecWrapperFactory {
    MediaCodecWrapper createByCodecName(String str);
}

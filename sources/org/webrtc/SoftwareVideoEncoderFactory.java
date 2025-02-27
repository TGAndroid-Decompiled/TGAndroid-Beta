package org.webrtc;

import java.util.ArrayList;
import java.util.HashMap;
import org.webrtc.VideoEncoderFactory;

public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    static VideoCodecInfo[] supportedCodecs() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
        arrayList.add(new VideoCodecInfo("H264", new HashMap()));
        if (LibvpxVp9Encoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    @Override
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        if (videoCodecInfo.name.equalsIgnoreCase("VP8")) {
            return new LibvpxVp8Encoder();
        }
        if (videoCodecInfo.name.equalsIgnoreCase("VP9") && LibvpxVp9Encoder.nativeIsSupported()) {
            return new LibvpxVp9Encoder();
        }
        if (videoCodecInfo.name.equalsIgnoreCase("H264")) {
            return new OpenH264Encoder();
        }
        return null;
    }

    @Override
    public VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return VideoEncoderFactory.CC.$default$getEncoderSelector(this);
    }

    @Override
    public VideoCodecInfo[] getImplementations() {
        VideoCodecInfo[] supportedCodecs;
        supportedCodecs = getSupportedCodecs();
        return supportedCodecs;
    }

    @Override
    public VideoCodecInfo[] getSupportedCodecs() {
        return supportedCodecs();
    }
}

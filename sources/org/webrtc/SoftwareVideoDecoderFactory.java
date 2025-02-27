package org.webrtc;

import java.util.ArrayList;
import java.util.HashMap;

public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    static VideoCodecInfo[] supportedCodecs() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
        if (LibvpxVp9Decoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
        }
        arrayList.add(new VideoCodecInfo("H264", new HashMap()));
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    @Override
    @Deprecated
    public VideoDecoder createDecoder(String str) {
        return createDecoder(new VideoCodecInfo(str, new HashMap()));
    }

    @Override
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        if (videoCodecInfo.getName().equalsIgnoreCase("VP8")) {
            return new LibvpxVp8Decoder();
        }
        if (videoCodecInfo.getName().equalsIgnoreCase("VP9") && LibvpxVp9Decoder.nativeIsSupported()) {
            return new LibvpxVp9Decoder();
        }
        if (videoCodecInfo.getName().equalsIgnoreCase("H264")) {
            return new OpenH264Decoder();
        }
        return null;
    }

    @Override
    public VideoCodecInfo[] getSupportedCodecs() {
        return supportedCodecs();
    }
}

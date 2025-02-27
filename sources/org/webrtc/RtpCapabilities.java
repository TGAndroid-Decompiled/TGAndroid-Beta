package org.webrtc;

import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

public class RtpCapabilities {
    public List<CodecCapability> codecs;
    public List<HeaderExtensionCapability> headerExtensions;

    public static class CodecCapability {
        public Integer clockRate;
        public MediaStreamTrack.MediaType kind;
        public String mimeType;
        public String name;
        public Integer numChannels;
        public Map<String, String> parameters;
        public int preferredPayloadType;

        public CodecCapability() {
        }

        CodecCapability(int i, String str, MediaStreamTrack.MediaType mediaType, Integer num, Integer num2, String str2, Map<String, String> map) {
            this.preferredPayloadType = i;
            this.name = str;
            this.kind = mediaType;
            this.clockRate = num;
            this.numChannels = num2;
            this.parameters = map;
            this.mimeType = str2;
        }

        Integer getClockRate() {
            return this.clockRate;
        }

        MediaStreamTrack.MediaType getKind() {
            return this.kind;
        }

        String getName() {
            return this.name;
        }

        Integer getNumChannels() {
            return this.numChannels;
        }

        Map getParameters() {
            return this.parameters;
        }

        int getPreferredPayloadType() {
            return this.preferredPayloadType;
        }
    }

    public static class HeaderExtensionCapability {
        private final boolean preferredEncrypted;
        private final int preferredId;
        private final String uri;

        HeaderExtensionCapability(String str, int i, boolean z) {
            this.uri = str;
            this.preferredId = i;
            this.preferredEncrypted = z;
        }

        public boolean getPreferredEncrypted() {
            return this.preferredEncrypted;
        }

        public int getPreferredId() {
            return this.preferredId;
        }

        public String getUri() {
            return this.uri;
        }
    }

    RtpCapabilities(List<CodecCapability> list, List<HeaderExtensionCapability> list2) {
        this.headerExtensions = list2;
        this.codecs = list;
    }

    List<CodecCapability> getCodecs() {
        return this.codecs;
    }

    public List<HeaderExtensionCapability> getHeaderExtensions() {
        return this.headerExtensions;
    }
}

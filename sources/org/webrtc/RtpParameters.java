package org.webrtc;

import java.util.List;
import java.util.Map;

public class RtpParameters {
    public final List<Codec> codecs;
    public DegradationPreference degradationPreference;
    public final List<Encoding> encodings;
    private final List<HeaderExtension> headerExtensions;
    private final Rtcp rtcp;
    public final String transactionId;

    public static class Codec {
        public Integer clockRate;
        MediaStreamTrack.MediaType kind;
        public String name;
        public Integer numChannels;
        public Map<String, String> parameters;
        public int payloadType;

        public Codec(int i, String str, MediaStreamTrack.MediaType mediaType, Integer num, Integer num2, Map<String, String> map) {
            this.payloadType = i;
            this.name = str;
            this.kind = mediaType;
            this.clockRate = num;
            this.numChannels = num2;
            this.parameters = map;
        }

        public Integer getClockRate() {
            return this.clockRate;
        }

        public MediaStreamTrack.MediaType getKind() {
            return this.kind;
        }

        public String getName() {
            return this.name;
        }

        public Integer getNumChannels() {
            return this.numChannels;
        }

        public Map getParameters() {
            return this.parameters;
        }

        public int getPayloadType() {
            return this.payloadType;
        }
    }

    public enum DegradationPreference {
        DISABLED,
        MAINTAIN_FRAMERATE,
        MAINTAIN_RESOLUTION,
        BALANCED;

        public static DegradationPreference fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public static class HeaderExtension {
        private final boolean encrypted;
        private final int id;
        private final String uri;

        public HeaderExtension(String str, int i, boolean z) {
            this.uri = str;
            this.id = i;
            this.encrypted = z;
        }

        public boolean getEncrypted() {
            return this.encrypted;
        }

        public int getId() {
            return this.id;
        }

        public String getUri() {
            return this.uri;
        }
    }

    public static class Rtcp {
        private final String cname;
        private final boolean reducedSize;

        public Rtcp(String str, boolean z) {
            this.cname = str;
            this.reducedSize = z;
        }

        public String getCname() {
            return this.cname;
        }

        public boolean getReducedSize() {
            return this.reducedSize;
        }
    }

    public RtpParameters(String str, DegradationPreference degradationPreference, Rtcp rtcp, List<HeaderExtension> list, List<Encoding> list2, List<Codec> list3) {
        this.transactionId = str;
        this.degradationPreference = degradationPreference;
        this.rtcp = rtcp;
        this.headerExtensions = list;
        this.encodings = list2;
        this.codecs = list3;
    }

    public List<Codec> getCodecs() {
        return this.codecs;
    }

    public DegradationPreference getDegradationPreference() {
        return this.degradationPreference;
    }

    public List<Encoding> getEncodings() {
        return this.encodings;
    }

    public List<HeaderExtension> getHeaderExtensions() {
        return this.headerExtensions;
    }

    public Rtcp getRtcp() {
        return this.rtcp;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public static class Encoding {
        public boolean active;
        public boolean adaptiveAudioPacketTime;
        public double bitratePriority;
        public Integer maxBitrateBps;
        public Integer maxFramerate;
        public Integer minBitrateBps;
        public int networkPriority;
        public Integer numTemporalLayers;
        public String rid;
        public Double scaleResolutionDownBy;
        public Long ssrc;

        public Encoding(String str, boolean z, Double d) {
            this.bitratePriority = 1.0d;
            this.networkPriority = 0;
            this.rid = str;
            this.active = z;
            this.scaleResolutionDownBy = d;
        }

        public boolean getActive() {
            return this.active;
        }

        public boolean getAdaptivePTime() {
            return this.adaptiveAudioPacketTime;
        }

        public double getBitratePriority() {
            return this.bitratePriority;
        }

        public Integer getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        public Integer getMaxFramerate() {
            return this.maxFramerate;
        }

        public Integer getMinBitrateBps() {
            return this.minBitrateBps;
        }

        public int getNetworkPriority() {
            return this.networkPriority;
        }

        public Integer getNumTemporalLayers() {
            return this.numTemporalLayers;
        }

        public String getRid() {
            return this.rid;
        }

        public Double getScaleResolutionDownBy() {
            return this.scaleResolutionDownBy;
        }

        public Long getSsrc() {
            return this.ssrc;
        }

        public Encoding(String str, boolean z, double d, int i, Integer num, Integer num2, Integer num3, Integer num4, Double d2, Long l, boolean z2) {
            this.rid = str;
            this.active = z;
            this.bitratePriority = d;
            this.networkPriority = i;
            this.maxBitrateBps = num;
            this.minBitrateBps = num2;
            this.maxFramerate = num3;
            this.numTemporalLayers = num4;
            this.scaleResolutionDownBy = d2;
            this.ssrc = l;
            this.adaptiveAudioPacketTime = z2;
        }
    }
}

package org.webrtc;

import java.util.Arrays;
import org.telegram.messenger.BuildConfig;
import org.webrtc.PeerConnection;

public class IceCandidate {
    public final PeerConnection.AdapterType adapterType;
    public final String sdp;
    public final int sdpMLineIndex;
    public final String sdpMid;
    public final String serverUrl;

    public IceCandidate(String str, int i, String str2) {
        this.sdpMid = str;
        this.sdpMLineIndex = i;
        this.sdp = str2;
        this.serverUrl = BuildConfig.APP_CENTER_HASH;
        this.adapterType = PeerConnection.AdapterType.UNKNOWN;
    }

    @CalledByNative
    IceCandidate(String str, int i, String str2, String str3, PeerConnection.AdapterType adapterType) {
        this.sdpMid = str;
        this.sdpMLineIndex = i;
        this.sdp = str2;
        this.serverUrl = str3;
        this.adapterType = adapterType;
    }

    public String toString() {
        return this.sdpMid + ":" + this.sdpMLineIndex + ":" + this.sdp + ":" + this.serverUrl + ":" + this.adapterType.toString();
    }

    @CalledByNative
    String getSdpMid() {
        return this.sdpMid;
    }

    @CalledByNative
    String getSdp() {
        return this.sdp;
    }

    public boolean equals(Object obj) {
        if (obj instanceof IceCandidate) {
            IceCandidate iceCandidate = (IceCandidate) obj;
            return objectEquals(this.sdpMid, iceCandidate.sdpMid) && this.sdpMLineIndex == iceCandidate.sdpMLineIndex && objectEquals(this.sdp, iceCandidate.sdp);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.sdpMid, Integer.valueOf(this.sdpMLineIndex), this.sdp});
    }

    private static boolean objectEquals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}

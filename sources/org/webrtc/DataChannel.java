package org.webrtc;

import java.nio.ByteBuffer;

public class DataChannel {
    private long nativeDataChannel;
    private long nativeObserver;

    public interface Observer {
        @CalledByNative("Observer")
        void onBufferedAmountChange(long j);

        @CalledByNative("Observer")
        void onMessage(Buffer buffer);

        @CalledByNative("Observer")
        void onStateChange();
    }

    private native long nativeBufferedAmount();

    private native void nativeClose();

    private native int nativeId();

    private native String nativeLabel();

    private native long nativeRegisterObserver(Observer observer);

    private native boolean nativeSend(byte[] bArr, boolean z);

    private native State nativeState();

    private native void nativeUnregisterObserver(long j);

    public static class Init {
        public boolean negotiated;
        public boolean ordered = true;
        public int maxRetransmitTimeMs = -1;
        public int maxRetransmits = -1;
        public String protocol = "";
        public int f1168id = -1;

        @CalledByNative("Init")
        boolean getOrdered() {
            return this.ordered;
        }

        @CalledByNative("Init")
        int getMaxRetransmitTimeMs() {
            return this.maxRetransmitTimeMs;
        }

        @CalledByNative("Init")
        int getMaxRetransmits() {
            return this.maxRetransmits;
        }

        @CalledByNative("Init")
        String getProtocol() {
            return this.protocol;
        }

        @CalledByNative("Init")
        boolean getNegotiated() {
            return this.negotiated;
        }

        @CalledByNative("Init")
        int getId() {
            return this.f1168id;
        }
    }

    public static class Buffer {
        public final boolean binary;
        public final ByteBuffer data;

        @CalledByNative("Buffer")
        public Buffer(ByteBuffer byteBuffer, boolean z) {
            this.data = byteBuffer;
            this.binary = z;
        }
    }

    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        @CalledByNative("State")
        static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    @CalledByNative
    public DataChannel(long j) {
        this.nativeDataChannel = j;
    }

    public void registerObserver(Observer observer) {
        checkDataChannelExists();
        long j = this.nativeObserver;
        if (j != 0) {
            nativeUnregisterObserver(j);
        }
        this.nativeObserver = nativeRegisterObserver(observer);
    }

    public void unregisterObserver() {
        checkDataChannelExists();
        nativeUnregisterObserver(this.nativeObserver);
    }

    public String label() {
        checkDataChannelExists();
        return nativeLabel();
    }

    public int m10id() {
        checkDataChannelExists();
        return nativeId();
    }

    public State state() {
        checkDataChannelExists();
        return nativeState();
    }

    public long bufferedAmount() {
        checkDataChannelExists();
        return nativeBufferedAmount();
    }

    public void close() {
        checkDataChannelExists();
        nativeClose();
    }

    public boolean send(Buffer buffer) {
        checkDataChannelExists();
        byte[] bArr = new byte[buffer.data.remaining()];
        buffer.data.get(bArr);
        return nativeSend(bArr, buffer.binary);
    }

    public void dispose() {
        checkDataChannelExists();
        JniCommon.nativeReleaseRef(this.nativeDataChannel);
        this.nativeDataChannel = 0L;
    }

    @CalledByNative
    long getNativeDataChannel() {
        return this.nativeDataChannel;
    }

    private void checkDataChannelExists() {
        if (this.nativeDataChannel == 0) {
            throw new IllegalStateException("DataChannel has been disposed.");
        }
    }
}

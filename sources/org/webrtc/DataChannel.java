package org.webrtc;

import java.nio.ByteBuffer;
public class DataChannel {
    private final NativeLifecycleLock lifecycleLock;
    private long nativeObserver;

    public static class Buffer {
        public final boolean binary;
        public final ByteBuffer data;

        public Buffer(ByteBuffer byteBuffer, boolean z) {
            this.data = byteBuffer;
            this.binary = z;
        }
    }

    public static class Init {
        public boolean negotiated;
        public boolean ordered = true;
        public int maxRetransmitTimeMs = -1;
        public int maxRetransmits = -1;
        public String protocol = "";
        public int id = -1;

        public int getId() {
            return this.id;
        }

        public int getMaxRetransmitTimeMs() {
            return this.maxRetransmitTimeMs;
        }

        public int getMaxRetransmits() {
            return this.maxRetransmits;
        }

        public boolean getNegotiated() {
            return this.negotiated;
        }

        public boolean getOrdered() {
            return this.ordered;
        }

        public String getProtocol() {
            return this.protocol;
        }
    }

    public interface Natives {
        long bufferedAmount(DataChannel dataChannel);

        void close(DataChannel dataChannel);

        int id(DataChannel dataChannel);

        String label(DataChannel dataChannel);

        long registerObserver(DataChannel dataChannel, Observer observer);

        boolean send(DataChannel dataChannel, byte[] bArr, boolean z);

        State state(DataChannel dataChannel);

        void unregisterObserver(DataChannel dataChannel, long j);
    }

    public interface Observer {
        void onBufferedAmountChange(long j);

        void onMessage(Buffer buffer);

        void onStateChange();
    }

    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        public static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public DataChannel(long j) {
        this.lifecycleLock = new NativeLifecycleLock("DataChannel", j);
    }

    public Long lambda$bufferedAmount$5() {
        return Long.valueOf(DataChannelJni.get().bufferedAmount(this));
    }

    public void lambda$close$6() {
        DataChannelJni.get().close(this);
    }

    public Integer lambda$id$3() {
        return Integer.valueOf(DataChannelJni.get().id(this));
    }

    public String lambda$label$2() {
        return DataChannelJni.get().label(this);
    }

    public void lambda$registerObserver$0(Observer observer) {
        if (this.nativeObserver != 0) {
            DataChannelJni.get().unregisterObserver(this, this.nativeObserver);
        }
        this.nativeObserver = DataChannelJni.get().registerObserver(this, observer);
    }

    public Boolean lambda$send$7(Buffer buffer) {
        byte[] bArr = new byte[buffer.data.remaining()];
        buffer.data.get(bArr);
        return Boolean.valueOf(DataChannelJni.get().send(this, bArr, buffer.binary));
    }

    public State lambda$state$4() {
        return DataChannelJni.get().state(this);
    }

    public void lambda$unregisterObserver$1() {
        DataChannelJni.get().unregisterObserver(this, this.nativeObserver);
        this.nativeObserver = 0L;
    }

    public long bufferedAmount() {
        return ((Long) this.lifecycleLock.call(new o63(this, (byte) 5))).longValue();
    }

    public void close() {
        this.lifecycleLock.runIfAlive(new o63(this, (byte) 0));
    }

    public void dispose() {
        if (this.lifecycleLock.isDisposed()) {
            return;
        }
        if (this.nativeObserver != 0) {
            unregisterObserver();
        }
        this.lifecycleLock.dispose(new uy2((byte) 13));
    }

    public long getNativeDataChannel() {
        return this.lifecycleLock.getNativePointer();
    }

    public int id() {
        return ((Integer) this.lifecycleLock.call(new o63(this, (byte) 4))).intValue();
    }

    public String label() {
        return (String) this.lifecycleLock.call(new o63(this, (byte) 3));
    }

    public void registerObserver(Observer observer) {
        this.lifecycleLock.run(new q72(this, observer, (byte) 16));
    }

    public boolean send(Buffer buffer) {
        return ((Boolean) this.lifecycleLock.call(new q72(this, buffer, (byte) 17))).booleanValue();
    }

    public State state() {
        return (State) this.lifecycleLock.call(new o63(this, (byte) 1));
    }

    public void unregisterObserver() {
        this.lifecycleLock.runIfAlive(new o63(this, (byte) 2));
    }
}

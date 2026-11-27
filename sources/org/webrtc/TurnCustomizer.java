package org.webrtc;
public class TurnCustomizer {
    private final NativeLifecycleLock lifecycleLock;

    public interface Natives {
        void freeTurnCustomizer(long j);
    }

    public TurnCustomizer(long j) {
        this.lifecycleLock = new NativeLifecycleLock("TurnCustomizer", j);
    }

    public static void a(long j) {
        lambda$dispose$0(j);
    }

    public static void lambda$dispose$0(long j) {
        TurnCustomizerJni.get().freeTurnCustomizer(j);
    }

    public void dispose() {
        this.lifecycleLock.dispose(new grb((byte) 14));
    }

    public long getNativeTurnCustomizer() {
        return this.lifecycleLock.getNativePointer();
    }
}

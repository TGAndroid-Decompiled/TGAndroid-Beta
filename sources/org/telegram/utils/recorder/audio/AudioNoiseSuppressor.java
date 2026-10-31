package org.telegram.utils.recorder.audio;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
final class AudioNoiseSuppressor {
    public long f44265a;
    public final AtomicBoolean f44266b = new AtomicBoolean(false);

    public AudioNoiseSuppressor(long j10) {
        this.f44265a = j10;
    }

    public static AudioNoiseSuppressor a() {
        long nCreate = nCreate();
        if (nCreate == 0) {
            return null;
        }
        return new AudioNoiseSuppressor(nCreate);
    }

    private static native long nCreate();

    private static native void nDestroy(long j10);

    private static native boolean nProcess(long j10, ByteBuffer byteBuffer, int i10);

    public final boolean b(int i10, ByteBuffer byteBuffer) {
        if (!this.f44266b.get()) {
            return nProcess(this.f44265a, byteBuffer, i10);
        }
        throw new IllegalStateException("Native noise suppressor is already released");
    }

    public final void c() {
        if (this.f44266b.compareAndSet(false, true)) {
            long j10 = this.f44265a;
            this.f44265a = 0L;
            if (j10 != 0) {
                nDestroy(j10);
            }
        }
    }

    public final void finalize() {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}

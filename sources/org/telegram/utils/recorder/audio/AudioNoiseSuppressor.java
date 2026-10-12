package org.telegram.utils.recorder.audio;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
final class AudioNoiseSuppressor {
    public long f44951a;
    public final AtomicBoolean f44952b = new AtomicBoolean(false);

    public AudioNoiseSuppressor(long j3) {
        this.f44951a = j3;
    }

    public static AudioNoiseSuppressor a() {
        long nCreate = nCreate();
        if (nCreate == 0) {
            return null;
        }
        return new AudioNoiseSuppressor(nCreate);
    }

    private static native long nCreate();

    private static native void nDestroy(long j3);

    private static native boolean nProcess(long j3, ByteBuffer byteBuffer, int i10);

    public final boolean b(int i10, ByteBuffer byteBuffer) {
        if (!this.f44952b.get()) {
            return nProcess(this.f44951a, byteBuffer, i10);
        }
        throw new IllegalStateException("Native noise suppressor is already released");
    }

    public final void c() {
        if (this.f44952b.compareAndSet(false, true)) {
            long j3 = this.f44951a;
            this.f44951a = 0L;
            if (j3 != 0) {
                nDestroy(j3);
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

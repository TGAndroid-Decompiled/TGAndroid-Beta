package org.telegram.utils.recorder.audio;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
final class AudioNoiseSuppressor {
    public long f52722a;
    public final AtomicBoolean f52723b = new AtomicBoolean(false);

    public AudioNoiseSuppressor(long j3) {
        this.f52722a = j3;
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

    private static native boolean nProcess(long j3, ByteBuffer byteBuffer, int i7);

    public final boolean b(int i7, ByteBuffer byteBuffer) {
        if (!this.f52723b.get()) {
            return nProcess(this.f52722a, byteBuffer, i7);
        }
        throw new IllegalStateException("Native noise suppressor is already released");
    }

    public final void c() {
        if (this.f52723b.compareAndSet(false, true)) {
            long j3 = this.f52722a;
            this.f52722a = 0L;
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

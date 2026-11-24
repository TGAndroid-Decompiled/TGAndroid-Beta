package org.telegram.utils.recorder.audio;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
final class AudioRecorderNative {
    public long a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public AudioRecorderNative(long j) {
        this.a = j;
    }

    public static AudioRecorderNative a(long j, long j2, File file, File file2) {
        String absolutePath;
        String absolutePath2 = file.getAbsolutePath();
        if (file2 == null) {
            absolutePath = null;
        } else {
            absolutePath = file2.getAbsolutePath();
        }
        long nCreate = nCreate(absolutePath2, 48000, absolutePath, j, j2);
        if (nCreate == 0) {
            return null;
        }
        return new AudioRecorderNative(nCreate);
    }

    public static boolean b(String str, String str2, long j, long j2) {
        return nCropOpusFile(str, str2, j, j2);
    }

    public static byte[] e(String str) {
        return nGetWaveform(str);
    }

    private static native long nCreate(String str, int i, String str2, long j, long j2);

    private static native boolean nCropOpusFile(String str, String str2, long j, long j2);

    private static native void nDestroy(long j);

    private static native boolean nFinish(long j);

    private static native long nFlush(long j);

    private static native byte[] nGetWaveform(String str);

    private static native int nWriteFrame(long j, ByteBuffer byteBuffer, int i);

    public final boolean c() {
        if (!this.b.compareAndSet(false, true)) {
            return false;
        }
        long j = this.a;
        this.a = 0L;
        if (j == 0 || !nFinish(j)) {
            return false;
        }
        return true;
    }

    public final long d() {
        if (!this.b.get()) {
            return nFlush(this.a);
        }
        sc8.j("Native audio recorder is already released");
        return 0L;
    }

    public final void f() {
        if (this.b.compareAndSet(false, true)) {
            long j = this.a;
            this.a = 0L;
            if (j != 0) {
                nDestroy(j);
            }
        }
    }

    public final void finalize() {
        try {
            f();
        } finally {
            super.finalize();
        }
    }

    public final int g(ByteBuffer byteBuffer, int i) {
        if (!this.b.get()) {
            return nWriteFrame(this.a, byteBuffer, i);
        }
        sc8.j("Native audio recorder is already released");
        return 0;
    }
}

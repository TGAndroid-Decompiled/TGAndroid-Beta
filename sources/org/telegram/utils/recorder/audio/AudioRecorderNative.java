package org.telegram.utils.recorder.audio;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
final class AudioRecorderNative {
    public long f43854a;
    public final AtomicBoolean f43855b = new AtomicBoolean(false);

    public AudioRecorderNative(long j10) {
        this.f43854a = j10;
    }

    public static AudioRecorderNative a(File file, File file2) {
        String absolutePath;
        String absolutePath2 = file.getAbsolutePath();
        if (file2 == null) {
            absolutePath = null;
        } else {
            absolutePath = file2.getAbsolutePath();
        }
        long nCreate = nCreate(absolutePath2, 48000, absolutePath);
        if (nCreate == 0) {
            return null;
        }
        return new AudioRecorderNative(nCreate);
    }

    public static boolean b(String str, String str2, long j10, long j11) {
        return nCropOpusFile(str, str2, j10, j11);
    }

    public static byte[] e(String str) {
        return nGetWaveform(str);
    }

    private static native long nCreate(String str, int i10, String str2);

    private static native boolean nCropOpusFile(String str, String str2, long j10, long j11);

    private static native void nDestroy(long j10);

    private static native boolean nFinish(long j10);

    private static native long nFlush(long j10);

    private static native byte[] nGetWaveform(String str);

    private static native int nWriteFrame(long j10, ByteBuffer byteBuffer, int i10);

    public final boolean c() {
        if (!this.f43855b.compareAndSet(false, true)) {
            return false;
        }
        long j10 = this.f43854a;
        this.f43854a = 0L;
        if (j10 == 0 || !nFinish(j10)) {
            return false;
        }
        return true;
    }

    public final long d() {
        if (!this.f43855b.get()) {
            return nFlush(this.f43854a);
        }
        throw new IllegalStateException("Native audio recorder is already released");
    }

    public final void f() {
        if (this.f43855b.compareAndSet(false, true)) {
            long j10 = this.f43854a;
            this.f43854a = 0L;
            if (j10 != 0) {
                nDestroy(j10);
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

    public final int g(ByteBuffer byteBuffer, int i10) {
        if (!this.f43855b.get()) {
            return nWriteFrame(this.f43854a, byteBuffer, i10);
        }
        throw new IllegalStateException("Native audio recorder is already released");
    }
}

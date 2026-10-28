package org.telegram.utils.recorder.audio;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
final class AudioRecorderNative {
    public long f46433a;
    public final AtomicBoolean f46434b = new AtomicBoolean(false);

    public AudioRecorderNative(long j10) {
        this.f46433a = j10;
    }

    public static AudioRecorderNative a(File file, long j10, long j11, File file2) {
        String absolutePath;
        String absolutePath2 = file.getAbsolutePath();
        if (file2 == null) {
            absolutePath = null;
        } else {
            absolutePath = file2.getAbsolutePath();
        }
        long nCreate = nCreate(absolutePath2, 48000, absolutePath, j10, j11);
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

    private static native long nCreate(String str, int i10, String str2, long j10, long j11);

    private static native boolean nCropOpusFile(String str, String str2, long j10, long j11);

    private static native void nDestroy(long j10);

    private static native boolean nFinish(long j10);

    private static native long nFlush(long j10);

    private static native byte[] nGetWaveform(String str);

    private static native int nWriteFrame(long j10, ByteBuffer byteBuffer, int i10);

    public final boolean c() {
        if (!this.f46434b.compareAndSet(false, true)) {
            return false;
        }
        long j10 = this.f46433a;
        this.f46433a = 0L;
        if (j10 == 0 || !nFinish(j10)) {
            return false;
        }
        return true;
    }

    public final long d() {
        if (!this.f46434b.get()) {
            return nFlush(this.f46433a);
        }
        throw new IllegalStateException("Native audio recorder is already released");
    }

    public final void f() {
        if (this.f46434b.compareAndSet(false, true)) {
            long j10 = this.f46433a;
            this.f46433a = 0L;
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
        if (!this.f46434b.get()) {
            return nWriteFrame(this.f46433a, byteBuffer, i10);
        }
        throw new IllegalStateException("Native audio recorder is already released");
    }
}

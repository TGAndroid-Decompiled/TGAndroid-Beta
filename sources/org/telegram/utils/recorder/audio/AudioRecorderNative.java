package org.telegram.utils.recorder.audio;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
final class AudioRecorderNative {
    public long f52682a;
    public final AtomicBoolean f52683b = new AtomicBoolean(false);

    public AudioRecorderNative(long j3) {
        this.f52682a = j3;
    }

    public static AudioRecorderNative a(long j3, long j10, File file, File file2) {
        String absolutePath;
        String absolutePath2 = file.getAbsolutePath();
        if (file2 == null) {
            absolutePath = null;
        } else {
            absolutePath = file2.getAbsolutePath();
        }
        long nCreate = nCreate(absolutePath2, 48000, absolutePath, j3, j10);
        if (nCreate == 0) {
            return null;
        }
        return new AudioRecorderNative(nCreate);
    }

    public static boolean b(String str, String str2, long j3, long j10) {
        return nCropOpusFile(str, str2, j3, j10);
    }

    public static byte[] e(String str) {
        return nGetWaveform(str);
    }

    private static native long nCreate(String str, int i7, String str2, long j3, long j10);

    private static native boolean nCropOpusFile(String str, String str2, long j3, long j10);

    private static native void nDestroy(long j3);

    private static native boolean nFinish(long j3);

    private static native long nFlush(long j3);

    private static native byte[] nGetWaveform(String str);

    private static native int nWriteFrame(long j3, ByteBuffer byteBuffer, int i7);

    public final boolean c() {
        if (!this.f52683b.compareAndSet(false, true)) {
            return false;
        }
        long j3 = this.f52682a;
        this.f52682a = 0L;
        if (j3 == 0 || !nFinish(j3)) {
            return false;
        }
        return true;
    }

    public final long d() {
        if (!this.f52683b.get()) {
            return nFlush(this.f52682a);
        }
        throw new IllegalStateException("Native audio recorder is already released");
    }

    public final void f() {
        if (this.f52683b.compareAndSet(false, true)) {
            long j3 = this.f52682a;
            this.f52682a = 0L;
            if (j3 != 0) {
                nDestroy(j3);
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

    public final int g(ByteBuffer byteBuffer, int i7) {
        if (!this.f52683b.get()) {
            return nWriteFrame(this.f52682a, byteBuffer, i7);
        }
        throw new IllegalStateException("Native audio recorder is already released");
    }
}

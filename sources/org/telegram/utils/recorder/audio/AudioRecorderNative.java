package org.telegram.utils.recorder.audio;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
final class AudioRecorderNative {
    public long f44948a;
    public final AtomicBoolean f44949b = new AtomicBoolean(false);

    public AudioRecorderNative(long j3) {
        this.f44948a = j3;
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

    public static boolean b(String str, String str2, long j3, long j10) {
        return nCropOpusFile(str, str2, j3, j10);
    }

    public static byte[] e(String str) {
        return nGetWaveform(str);
    }

    private static native long nCreate(String str, int i10, String str2);

    private static native boolean nCropOpusFile(String str, String str2, long j3, long j10);

    private static native void nDestroy(long j3);

    private static native boolean nFinish(long j3);

    private static native long nFlush(long j3);

    private static native byte[] nGetWaveform(String str);

    private static native int nWriteFrame(long j3, ByteBuffer byteBuffer, int i10);

    public final boolean c() {
        if (!this.f44949b.compareAndSet(false, true)) {
            return false;
        }
        long j3 = this.f44948a;
        this.f44948a = 0L;
        if (j3 == 0 || !nFinish(j3)) {
            return false;
        }
        return true;
    }

    public final long d() {
        if (!this.f44949b.get()) {
            return nFlush(this.f44948a);
        }
        throw new IllegalStateException("Native audio recorder is already released");
    }

    public final void f() {
        if (this.f44949b.compareAndSet(false, true)) {
            long j3 = this.f44948a;
            this.f44948a = 0L;
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

    public final int g(ByteBuffer byteBuffer, int i10) {
        if (!this.f44949b.get()) {
            return nWriteFrame(this.f44948a, byteBuffer, i10);
        }
        throw new IllegalStateException("Native audio recorder is already released");
    }
}

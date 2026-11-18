package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import yi.g;
public final class d {
    public long A;
    public long B;
    public final File f54643a;
    public final File f54644b;
    public final long f54645c;
    public final long d;
    public final g f54646e;
    public final yi.b f54647f;
    public final ac.e f54648g;
    public final HandlerThread h;
    public final Handler f54649i;
    public final HandlerThread f54650j;
    public final Handler f54651k;
    public volatile boolean f54654n;
    public volatile boolean f54655o;
    public AudioRecord f54656p;
    public long f54657q;
    public long f54658r;
    public AudioRecorderNative f54660t;
    public AudioNoiseSuppressor f54661u;
    public Exception v;
    public boolean f54662w;
    public long f54663x;
    public int f54664y;
    public long f54665z;
    public final ConcurrentLinkedQueue f54652l = new ConcurrentLinkedQueue();
    public final AtomicInteger f54653m = new AtomicInteger();
    public final ByteBuffer f54659s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j3, long j10, g gVar, yi.b bVar, ac.e eVar) {
        this.f54643a = file;
        this.f54644b = file2;
        this.f54645c = j3;
        this.d = j10;
        this.f54646e = gVar;
        this.f54647f = bVar;
        this.f54648g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f54649i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f54650j = handlerThread2;
        handlerThread2.start();
        this.f54651k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i7) {
        ByteBuffer byteBuffer = this.f54659s;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        if (this.f54661u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f54661u.b(i7 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f54665z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            yi.b bVar = this.f54647f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f54661u.c();
                this.f54661u = null;
            } else if (this.f54665z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f54665z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i7);
        }
        AudioRecorderNative audioRecorderNative = this.f54660t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i7) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f54662w) {
            this.f54652l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f54654n = true;
        if (!this.f54655o) {
            this.f54649i.postAtFrontOfQueue(new yi.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f54655o) {
            return;
        }
        this.f54655o = true;
        this.f54654n = true;
        if (exc != null) {
            this.f54647f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f54656p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f54656p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f54651k.post(new b(this, this.f54657q, exc));
        this.h.quitSafely();
    }
}

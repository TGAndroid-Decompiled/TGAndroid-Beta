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
    public final File f54685a;
    public final File f54686b;
    public final long f54687c;
    public final long d;
    public final g f54688e;
    public final yi.b f54689f;
    public final ac.e f54690g;
    public final HandlerThread h;
    public final Handler f54691i;
    public final HandlerThread f54692j;
    public final Handler f54693k;
    public volatile boolean f54696n;
    public volatile boolean f54697o;
    public AudioRecord f54698p;
    public long f54699q;
    public long f54700r;
    public AudioRecorderNative f54702t;
    public AudioNoiseSuppressor f54703u;
    public Exception v;
    public boolean f54704w;
    public long f54705x;
    public int f54706y;
    public long f54707z;
    public final ConcurrentLinkedQueue f54694l = new ConcurrentLinkedQueue();
    public final AtomicInteger f54695m = new AtomicInteger();
    public final ByteBuffer f54701s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j3, long j10, g gVar, yi.b bVar, ac.e eVar) {
        this.f54685a = file;
        this.f54686b = file2;
        this.f54687c = j3;
        this.d = j10;
        this.f54688e = gVar;
        this.f54689f = bVar;
        this.f54690g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f54691i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f54692j = handlerThread2;
        handlerThread2.start();
        this.f54693k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i7) {
        ByteBuffer byteBuffer = this.f54701s;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        if (this.f54703u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f54703u.b(i7 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f54707z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            yi.b bVar = this.f54689f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f54703u.c();
                this.f54703u = null;
            } else if (this.f54707z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f54707z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i7);
        }
        AudioRecorderNative audioRecorderNative = this.f54702t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i7) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f54704w) {
            this.f54694l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f54696n = true;
        if (!this.f54697o) {
            this.f54691i.postAtFrontOfQueue(new yi.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f54697o) {
            return;
        }
        this.f54697o = true;
        this.f54696n = true;
        if (exc != null) {
            this.f54689f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f54698p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f54698p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f54693k.post(new b(this, this.f54699q, exc));
        this.h.quitSafely();
    }
}

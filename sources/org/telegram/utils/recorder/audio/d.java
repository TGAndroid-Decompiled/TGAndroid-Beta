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
    public final File f54770a;
    public final File f54771b;
    public final long f54772c;
    public final long d;
    public final g f54773e;
    public final yi.b f54774f;
    public final ac.e f54775g;
    public final HandlerThread h;
    public final Handler f54776i;
    public final HandlerThread f54777j;
    public final Handler f54778k;
    public volatile boolean f54781n;
    public volatile boolean f54782o;
    public AudioRecord f54783p;
    public long f54784q;
    public long f54785r;
    public AudioRecorderNative f54787t;
    public AudioNoiseSuppressor f54788u;
    public Exception v;
    public boolean f54789w;
    public long f54790x;
    public int f54791y;
    public long f54792z;
    public final ConcurrentLinkedQueue f54779l = new ConcurrentLinkedQueue();
    public final AtomicInteger f54780m = new AtomicInteger();
    public final ByteBuffer f54786s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j3, long j10, g gVar, yi.b bVar, ac.e eVar) {
        this.f54770a = file;
        this.f54771b = file2;
        this.f54772c = j3;
        this.d = j10;
        this.f54773e = gVar;
        this.f54774f = bVar;
        this.f54775g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f54776i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f54777j = handlerThread2;
        handlerThread2.start();
        this.f54778k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i7) {
        ByteBuffer byteBuffer = this.f54786s;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        if (this.f54788u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f54788u.b(i7 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f54792z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            yi.b bVar = this.f54774f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f54788u.c();
                this.f54788u = null;
            } else if (this.f54792z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f54792z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i7);
        }
        AudioRecorderNative audioRecorderNative = this.f54787t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i7) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f54789w) {
            this.f54779l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f54781n = true;
        if (!this.f54782o) {
            this.f54776i.postAtFrontOfQueue(new yi.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f54782o) {
            return;
        }
        this.f54782o = true;
        this.f54781n = true;
        if (exc != null) {
            this.f54774f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f54783p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f54783p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f54778k.post(new b(this, this.f54784q, exc));
        this.h.quitSafely();
    }
}

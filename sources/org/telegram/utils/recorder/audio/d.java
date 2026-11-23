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
    public final File f54689a;
    public final File f54690b;
    public final long f54691c;
    public final long d;
    public final g f54692e;
    public final yi.b f54693f;
    public final ac.e f54694g;
    public final HandlerThread h;
    public final Handler f54695i;
    public final HandlerThread f54696j;
    public final Handler f54697k;
    public volatile boolean f54700n;
    public volatile boolean f54701o;
    public AudioRecord f54702p;
    public long f54703q;
    public long f54704r;
    public AudioRecorderNative f54706t;
    public AudioNoiseSuppressor f54707u;
    public Exception v;
    public boolean f54708w;
    public long f54709x;
    public int f54710y;
    public long f54711z;
    public final ConcurrentLinkedQueue f54698l = new ConcurrentLinkedQueue();
    public final AtomicInteger f54699m = new AtomicInteger();
    public final ByteBuffer f54705s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j3, long j10, g gVar, yi.b bVar, ac.e eVar) {
        this.f54689a = file;
        this.f54690b = file2;
        this.f54691c = j3;
        this.d = j10;
        this.f54692e = gVar;
        this.f54693f = bVar;
        this.f54694g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f54695i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f54696j = handlerThread2;
        handlerThread2.start();
        this.f54697k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i7) {
        ByteBuffer byteBuffer = this.f54705s;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        if (this.f54707u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f54707u.b(i7 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f54711z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            yi.b bVar = this.f54693f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f54707u.c();
                this.f54707u = null;
            } else if (this.f54711z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f54711z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i7);
        }
        AudioRecorderNative audioRecorderNative = this.f54706t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i7) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f54708w) {
            this.f54698l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f54700n = true;
        if (!this.f54701o) {
            this.f54695i.postAtFrontOfQueue(new yi.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f54701o) {
            return;
        }
        this.f54701o = true;
        this.f54700n = true;
        if (exc != null) {
            this.f54693f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f54702p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f54702p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f54697k.post(new b(this, this.f54703q, exc));
        this.h.quitSafely();
    }
}

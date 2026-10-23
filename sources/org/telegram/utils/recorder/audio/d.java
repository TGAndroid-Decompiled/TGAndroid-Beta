package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import ri.h;
public final class d {
    public long A;
    public long B;
    public final File f43847a;
    public final File f43848b;
    public final long f43849c;
    public final long d;
    public final h e;
    public final ri.b f43850f;
    public final cc.e f43851g;
    public final HandlerThread h;
    public final Handler f43852i;
    public final HandlerThread f43853j;
    public final Handler f43854k;
    public volatile boolean f43857n;
    public volatile boolean f43858o;
    public AudioRecord f43859p;
    public long f43860q;
    public long f43861r;
    public AudioRecorderNative f43863t;
    public AudioNoiseSuppressor f43864u;
    public Exception v;
    public boolean f43865w;
    public long f43866x;
    public int f43867y;
    public long f43868z;
    public final ConcurrentLinkedQueue f43855l = new ConcurrentLinkedQueue();
    public final AtomicInteger f43856m = new AtomicInteger();
    public final ByteBuffer f43862s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j10, long j11, h hVar, ri.b bVar, cc.e eVar) {
        this.f43847a = file;
        this.f43848b = file2;
        this.f43849c = j10;
        this.d = j11;
        this.e = hVar;
        this.f43850f = bVar;
        this.f43851g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f43852i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f43853j = handlerThread2;
        handlerThread2.start();
        this.f43854k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i10) {
        ByteBuffer byteBuffer = this.f43862s;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f43864u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f43864u.b(i10 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f43868z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            ri.b bVar = this.f43850f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f43864u.c();
                this.f43864u = null;
            } else if (this.f43868z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f43868z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f43863t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f43865w) {
            this.f43855l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f43857n = true;
        if (!this.f43858o) {
            this.f43852i.postAtFrontOfQueue(new ri.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f43858o) {
            return;
        }
        this.f43858o = true;
        this.f43857n = true;
        if (exc != null) {
            this.f43850f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f43859p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f43859p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f43854k.post(new b(this, this.f43860q, exc));
        this.h.quitSafely();
    }
}

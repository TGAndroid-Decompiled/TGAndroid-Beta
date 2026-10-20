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
    public final File f43843a;
    public final File f43844b;
    public final long f43845c;
    public final long d;
    public final h e;
    public final ri.b f43846f;
    public final cc.e f43847g;
    public final HandlerThread h;
    public final Handler f43848i;
    public final HandlerThread f43849j;
    public final Handler f43850k;
    public volatile boolean f43853n;
    public volatile boolean f43854o;
    public AudioRecord f43855p;
    public long f43856q;
    public long f43857r;
    public AudioRecorderNative f43859t;
    public AudioNoiseSuppressor f43860u;
    public Exception v;
    public boolean f43861w;
    public long f43862x;
    public int f43863y;
    public long f43864z;
    public final ConcurrentLinkedQueue f43851l = new ConcurrentLinkedQueue();
    public final AtomicInteger f43852m = new AtomicInteger();
    public final ByteBuffer f43858s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j10, long j11, h hVar, ri.b bVar, cc.e eVar) {
        this.f43843a = file;
        this.f43844b = file2;
        this.f43845c = j10;
        this.d = j11;
        this.e = hVar;
        this.f43846f = bVar;
        this.f43847g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f43848i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f43849j = handlerThread2;
        handlerThread2.start();
        this.f43850k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i10) {
        ByteBuffer byteBuffer = this.f43858s;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f43860u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f43860u.b(i10 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f43864z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            ri.b bVar = this.f43846f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f43860u.c();
                this.f43860u = null;
            } else if (this.f43864z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f43864z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f43859t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f43861w) {
            this.f43851l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f43853n = true;
        if (!this.f43854o) {
            this.f43848i.postAtFrontOfQueue(new ri.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f43854o) {
            return;
        }
        this.f43854o = true;
        this.f43853n = true;
        if (exc != null) {
            this.f43846f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f43855p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f43855p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f43850k.post(new b(this, this.f43856q, exc));
        this.h.quitSafely();
    }
}

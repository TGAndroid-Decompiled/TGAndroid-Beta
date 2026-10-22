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
    public final File f43846a;
    public final File f43847b;
    public final long f43848c;
    public final long d;
    public final h e;
    public final ri.b f43849f;
    public final cc.e f43850g;
    public final HandlerThread h;
    public final Handler f43851i;
    public final HandlerThread f43852j;
    public final Handler f43853k;
    public volatile boolean f43856n;
    public volatile boolean f43857o;
    public AudioRecord f43858p;
    public long f43859q;
    public long f43860r;
    public AudioRecorderNative f43862t;
    public AudioNoiseSuppressor f43863u;
    public Exception v;
    public boolean f43864w;
    public long f43865x;
    public int f43866y;
    public long f43867z;
    public final ConcurrentLinkedQueue f43854l = new ConcurrentLinkedQueue();
    public final AtomicInteger f43855m = new AtomicInteger();
    public final ByteBuffer f43861s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j10, long j11, h hVar, ri.b bVar, cc.e eVar) {
        this.f43846a = file;
        this.f43847b = file2;
        this.f43848c = j10;
        this.d = j11;
        this.e = hVar;
        this.f43849f = bVar;
        this.f43850g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f43851i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f43852j = handlerThread2;
        handlerThread2.start();
        this.f43853k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i10) {
        ByteBuffer byteBuffer = this.f43861s;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f43863u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f43863u.b(i10 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f43867z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            ri.b bVar = this.f43849f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f43863u.c();
                this.f43863u = null;
            } else if (this.f43867z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f43867z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f43862t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f43864w) {
            this.f43854l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f43856n = true;
        if (!this.f43857o) {
            this.f43851i.postAtFrontOfQueue(new ri.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f43857o) {
            return;
        }
        this.f43857o = true;
        this.f43856n = true;
        if (exc != null) {
            this.f43849f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f43858p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f43858p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f43853k.post(new b(this, this.f43859q, exc));
        this.h.quitSafely();
    }
}

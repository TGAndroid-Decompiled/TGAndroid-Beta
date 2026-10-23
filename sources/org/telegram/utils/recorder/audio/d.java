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
    public final File f44262a;
    public final File f44263b;
    public final long f44264c;
    public final long d;
    public final h e;
    public final ri.b f44265f;
    public final cc.e f44266g;
    public final HandlerThread h;
    public final Handler f44267i;
    public final HandlerThread f44268j;
    public final Handler f44269k;
    public volatile boolean f44272n;
    public volatile boolean f44273o;
    public AudioRecord f44274p;
    public long f44275q;
    public long f44276r;
    public AudioRecorderNative f44278t;
    public AudioNoiseSuppressor f44279u;
    public Exception v;
    public boolean f44280w;
    public long f44281x;
    public int f44282y;
    public long f44283z;
    public final ConcurrentLinkedQueue f44270l = new ConcurrentLinkedQueue();
    public final AtomicInteger f44271m = new AtomicInteger();
    public final ByteBuffer f44277s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j10, long j11, h hVar, ri.b bVar, cc.e eVar) {
        this.f44262a = file;
        this.f44263b = file2;
        this.f44264c = j10;
        this.d = j11;
        this.e = hVar;
        this.f44265f = bVar;
        this.f44266g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f44267i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f44268j = handlerThread2;
        handlerThread2.start();
        this.f44269k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i10) {
        ByteBuffer byteBuffer = this.f44277s;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f44279u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f44279u.b(i10 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f44283z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            ri.b bVar = this.f44265f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f44279u.c();
                this.f44279u = null;
            } else if (this.f44283z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f44283z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f44278t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f44280w) {
            this.f44270l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f44272n = true;
        if (!this.f44273o) {
            this.f44267i.postAtFrontOfQueue(new ri.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f44273o) {
            return;
        }
        this.f44273o = true;
        this.f44272n = true;
        if (exc != null) {
            this.f44265f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f44274p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f44274p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f44269k.post(new b(this, this.f44275q, exc));
        this.h.quitSafely();
    }
}

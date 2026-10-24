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
    public final File f44261a;
    public final File f44262b;
    public final long f44263c;
    public final long d;
    public final h e;
    public final ri.b f44264f;
    public final cc.e f44265g;
    public final HandlerThread h;
    public final Handler f44266i;
    public final HandlerThread f44267j;
    public final Handler f44268k;
    public volatile boolean f44271n;
    public volatile boolean f44272o;
    public AudioRecord f44273p;
    public long f44274q;
    public long f44275r;
    public AudioRecorderNative f44277t;
    public AudioNoiseSuppressor f44278u;
    public Exception v;
    public boolean f44279w;
    public long f44280x;
    public int f44281y;
    public long f44282z;
    public final ConcurrentLinkedQueue f44269l = new ConcurrentLinkedQueue();
    public final AtomicInteger f44270m = new AtomicInteger();
    public final ByteBuffer f44276s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j10, long j11, h hVar, ri.b bVar, cc.e eVar) {
        this.f44261a = file;
        this.f44262b = file2;
        this.f44263c = j10;
        this.d = j11;
        this.e = hVar;
        this.f44264f = bVar;
        this.f44265g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f44266i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f44267j = handlerThread2;
        handlerThread2.start();
        this.f44268k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i10) {
        ByteBuffer byteBuffer = this.f44276s;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f44278u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f44278u.b(i10 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f44282z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            ri.b bVar = this.f44264f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f44278u.c();
                this.f44278u = null;
            } else if (this.f44282z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f44282z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f44277t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f44279w) {
            this.f44269l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f44271n = true;
        if (!this.f44272o) {
            this.f44266i.postAtFrontOfQueue(new ri.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f44272o) {
            return;
        }
        this.f44272o = true;
        this.f44271n = true;
        if (exc != null) {
            this.f44264f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f44273p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f44273p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f44268k.post(new b(this, this.f44274q, exc));
        this.h.quitSafely();
    }
}

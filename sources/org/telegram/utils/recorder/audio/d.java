package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import vi.f;
public final class d {
    public long A;
    public long B;
    public final File f52732a;
    public final File f52733b;
    public final long f52734c;
    public final long d;
    public final f f52735e;
    public final vi.b f52736f;
    public final ac.e f52737g;
    public final HandlerThread h;
    public final Handler f52738i;
    public final HandlerThread f52739j;
    public final Handler f52740k;
    public volatile boolean f52743n;
    public volatile boolean f52744o;
    public AudioRecord f52745p;
    public long f52746q;
    public long f52747r;
    public AudioRecorderNative f52749t;
    public AudioNoiseSuppressor f52750u;
    public Exception v;
    public boolean f52751w;
    public long f52752x;
    public int f52753y;
    public long f52754z;
    public final ConcurrentLinkedQueue f52741l = new ConcurrentLinkedQueue();
    public final AtomicInteger f52742m = new AtomicInteger();
    public final ByteBuffer f52748s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j3, long j10, f fVar, vi.b bVar, ac.e eVar) {
        this.f52732a = file;
        this.f52733b = file2;
        this.f52734c = j3;
        this.d = j10;
        this.f52735e = fVar;
        this.f52736f = bVar;
        this.f52737g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f52738i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f52739j = handlerThread2;
        handlerThread2.start();
        this.f52740k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i7) {
        ByteBuffer byteBuffer = this.f52748s;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        if (this.f52750u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f52750u.b(i7 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f52754z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            vi.b bVar = this.f52736f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f52750u.c();
                this.f52750u = null;
            } else if (this.f52754z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f52754z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i7);
        }
        AudioRecorderNative audioRecorderNative = this.f52749t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i7) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f52751w) {
            this.f52741l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f52743n = true;
        if (!this.f52744o) {
            this.f52738i.postAtFrontOfQueue(new vi.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f52744o) {
            return;
        }
        this.f52744o = true;
        this.f52743n = true;
        if (exc != null) {
            this.f52736f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f52745p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f52745p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f52740k.post(new b(this, this.f52746q, exc));
        this.h.quitSafely();
    }
}

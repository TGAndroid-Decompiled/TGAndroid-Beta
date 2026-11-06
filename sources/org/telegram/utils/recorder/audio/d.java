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
    public final File f52715a;
    public final File f52716b;
    public final long f52717c;
    public final long d;
    public final f f52718e;
    public final vi.b f52719f;
    public final ac.e f52720g;
    public final HandlerThread h;
    public final Handler f52721i;
    public final HandlerThread f52722j;
    public final Handler f52723k;
    public volatile boolean f52726n;
    public volatile boolean f52727o;
    public AudioRecord f52728p;
    public long f52729q;
    public long f52730r;
    public AudioRecorderNative f52732t;
    public AudioNoiseSuppressor f52733u;
    public Exception v;
    public boolean f52734w;
    public long f52735x;
    public int f52736y;
    public long f52737z;
    public final ConcurrentLinkedQueue f52724l = new ConcurrentLinkedQueue();
    public final AtomicInteger f52725m = new AtomicInteger();
    public final ByteBuffer f52731s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j3, long j10, f fVar, vi.b bVar, ac.e eVar) {
        this.f52715a = file;
        this.f52716b = file2;
        this.f52717c = j3;
        this.d = j10;
        this.f52718e = fVar;
        this.f52719f = bVar;
        this.f52720g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f52721i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f52722j = handlerThread2;
        handlerThread2.start();
        this.f52723k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i7) {
        ByteBuffer byteBuffer = this.f52731s;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        if (this.f52733u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f52733u.b(i7 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f52737z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            vi.b bVar = this.f52719f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f52733u.c();
                this.f52733u = null;
            } else if (this.f52737z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f52737z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i7);
        }
        AudioRecorderNative audioRecorderNative = this.f52732t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i7) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f52734w) {
            this.f52724l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f52726n = true;
        if (!this.f52727o) {
            this.f52721i.postAtFrontOfQueue(new vi.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f52727o) {
            return;
        }
        this.f52727o = true;
        this.f52726n = true;
        if (exc != null) {
            this.f52719f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f52728p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f52728p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f52723k.post(new b(this, this.f52729q, exc));
        this.h.quitSafely();
    }
}

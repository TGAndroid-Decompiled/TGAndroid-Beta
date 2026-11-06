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
    public final File f52691a;
    public final File f52692b;
    public final long f52693c;
    public final long d;
    public final f f52694e;
    public final vi.b f52695f;
    public final ac.e f52696g;
    public final HandlerThread h;
    public final Handler f52697i;
    public final HandlerThread f52698j;
    public final Handler f52699k;
    public volatile boolean f52702n;
    public volatile boolean f52703o;
    public AudioRecord f52704p;
    public long f52705q;
    public long f52706r;
    public AudioRecorderNative f52708t;
    public AudioNoiseSuppressor f52709u;
    public Exception v;
    public boolean f52710w;
    public long f52711x;
    public int f52712y;
    public long f52713z;
    public final ConcurrentLinkedQueue f52700l = new ConcurrentLinkedQueue();
    public final AtomicInteger f52701m = new AtomicInteger();
    public final ByteBuffer f52707s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j3, long j10, f fVar, vi.b bVar, ac.e eVar) {
        this.f52691a = file;
        this.f52692b = file2;
        this.f52693c = j3;
        this.d = j10;
        this.f52694e = fVar;
        this.f52695f = bVar;
        this.f52696g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f52697i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f52698j = handlerThread2;
        handlerThread2.start();
        this.f52699k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i7) {
        ByteBuffer byteBuffer = this.f52707s;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        if (this.f52709u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f52709u.b(i7 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f52713z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            vi.b bVar = this.f52695f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f52709u.c();
                this.f52709u = null;
            } else if (this.f52713z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f52713z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i7);
        }
        AudioRecorderNative audioRecorderNative = this.f52708t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i7) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f52710w) {
            this.f52700l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f52702n = true;
        if (!this.f52703o) {
            this.f52697i.postAtFrontOfQueue(new vi.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f52703o) {
            return;
        }
        this.f52703o = true;
        this.f52702n = true;
        if (exc != null) {
            this.f52695f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f52704p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f52704p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f52699k.post(new b(this, this.f52705q, exc));
        this.h.quitSafely();
    }
}

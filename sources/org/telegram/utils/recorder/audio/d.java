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
    public final File f52717a;
    public final File f52718b;
    public final long f52719c;
    public final long d;
    public final f f52720e;
    public final vi.b f52721f;
    public final ac.e f52722g;
    public final HandlerThread h;
    public final Handler f52723i;
    public final HandlerThread f52724j;
    public final Handler f52725k;
    public volatile boolean f52728n;
    public volatile boolean f52729o;
    public AudioRecord f52730p;
    public long f52731q;
    public long f52732r;
    public AudioRecorderNative f52734t;
    public AudioNoiseSuppressor f52735u;
    public Exception v;
    public boolean f52736w;
    public long f52737x;
    public int f52738y;
    public long f52739z;
    public final ConcurrentLinkedQueue f52726l = new ConcurrentLinkedQueue();
    public final AtomicInteger f52727m = new AtomicInteger();
    public final ByteBuffer f52733s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j3, long j10, f fVar, vi.b bVar, ac.e eVar) {
        this.f52717a = file;
        this.f52718b = file2;
        this.f52719c = j3;
        this.d = j10;
        this.f52720e = fVar;
        this.f52721f = bVar;
        this.f52722g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f52723i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f52724j = handlerThread2;
        handlerThread2.start();
        this.f52725k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i7) {
        ByteBuffer byteBuffer = this.f52733s;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        if (this.f52735u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f52735u.b(i7 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f52739z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            vi.b bVar = this.f52721f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f52735u.c();
                this.f52735u = null;
            } else if (this.f52739z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f52739z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i7);
        }
        AudioRecorderNative audioRecorderNative = this.f52734t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i7) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f52736w) {
            this.f52726l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f52728n = true;
        if (!this.f52729o) {
            this.f52723i.postAtFrontOfQueue(new vi.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f52729o) {
            return;
        }
        this.f52729o = true;
        this.f52728n = true;
        if (exc != null) {
            this.f52721f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f52730p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f52730p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f52725k.post(new b(this, this.f52731q, exc));
        this.h.quitSafely();
    }
}

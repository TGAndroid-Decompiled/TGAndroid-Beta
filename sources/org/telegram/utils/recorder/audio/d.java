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
import vi.h;
public final class d {
    public long A;
    public long B;
    public final File f52783a;
    public final File f52784b;
    public final long f52785c;
    public final long d;
    public final h f52786e;
    public final vi.b f52787f;
    public final f f52788g;
    public final HandlerThread h;
    public final Handler f52789i;
    public final HandlerThread f52790j;
    public final Handler f52791k;
    public volatile boolean f52794n;
    public volatile boolean f52795o;
    public AudioRecord f52796p;
    public long f52797q;
    public long f52798r;
    public AudioRecorderNative f52800t;
    public AudioNoiseSuppressor f52801u;
    public Exception v;
    public boolean f52802w;
    public long f52803x;
    public int f52804y;
    public long f52805z;
    public final ConcurrentLinkedQueue f52792l = new ConcurrentLinkedQueue();
    public final AtomicInteger f52793m = new AtomicInteger();
    public final ByteBuffer f52799s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j10, long j11, h hVar, vi.b bVar, f fVar) {
        this.f52783a = file;
        this.f52784b = file2;
        this.f52785c = j10;
        this.d = j11;
        this.f52786e = hVar;
        this.f52787f = bVar;
        this.f52788g = fVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f52789i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f52790j = handlerThread2;
        handlerThread2.start();
        this.f52791k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i3) {
        ByteBuffer byteBuffer = this.f52799s;
        byteBuffer.position(0);
        byteBuffer.limit(i3);
        if (this.f52801u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f52801u.b(i3 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f52805z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            vi.b bVar = this.f52787f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f52801u.c();
                this.f52801u = null;
            } else if (this.f52805z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f52805z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i3);
        }
        AudioRecorderNative audioRecorderNative = this.f52800t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i3) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f52802w) {
            this.f52792l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f52794n = true;
        if (!this.f52795o) {
            this.f52789i.postAtFrontOfQueue(new vi.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f52795o) {
            return;
        }
        this.f52795o = true;
        this.f52794n = true;
        if (exc != null) {
            this.f52787f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f52796p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f52796p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f52791k.post(new b(this, this.f52797q, exc));
        this.h.quitSafely();
    }
}

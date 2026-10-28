package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import ui.h;
public final class d {
    public long A;
    public long B;
    public final File f46442a;
    public final File f46443b;
    public final long f46444c;
    public final long d;
    public final h e;
    public final ui.b f46445f;
    public final dc.e f46446g;
    public final HandlerThread h;
    public final Handler f46447i;
    public final HandlerThread f46448j;
    public final Handler f46449k;
    public volatile boolean f46452n;
    public volatile boolean f46453o;
    public AudioRecord f46454p;
    public long f46455q;
    public long f46456r;
    public AudioRecorderNative f46458t;
    public AudioNoiseSuppressor f46459u;
    public Exception v;
    public boolean f46460w;
    public long f46461x;
    public int f46462y;
    public long f46463z;
    public final ConcurrentLinkedQueue f46450l = new ConcurrentLinkedQueue();
    public final AtomicInteger f46451m = new AtomicInteger();
    public final ByteBuffer f46457s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j10, long j11, h hVar, ui.b bVar, dc.e eVar) {
        this.f46442a = file;
        this.f46443b = file2;
        this.f46444c = j10;
        this.d = j11;
        this.e = hVar;
        this.f46445f = bVar;
        this.f46446g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f46447i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f46448j = handlerThread2;
        handlerThread2.start();
        this.f46449k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i10) {
        ByteBuffer byteBuffer = this.f46457s;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f46459u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f46459u.b(i10 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f46463z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            ui.b bVar = this.f46445f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f46459u.c();
                this.f46459u = null;
            } else if (this.f46463z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f46463z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f46458t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f46460w) {
            this.f46450l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f46452n = true;
        if (!this.f46453o) {
            this.f46447i.postAtFrontOfQueue(new ui.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f46453o) {
            return;
        }
        this.f46453o = true;
        this.f46452n = true;
        if (exc != null) {
            this.f46445f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f46454p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f46454p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f46449k.post(new b(this, this.f46455q, exc));
        this.h.quitSafely();
    }
}

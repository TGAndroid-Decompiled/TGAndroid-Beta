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
    public final File f46404a;
    public final File f46405b;
    public final long f46406c;
    public final long d;
    public final h e;
    public final ui.b f46407f;
    public final dc.e f46408g;
    public final HandlerThread h;
    public final Handler f46409i;
    public final HandlerThread f46410j;
    public final Handler f46411k;
    public volatile boolean f46414n;
    public volatile boolean f46415o;
    public AudioRecord f46416p;
    public long f46417q;
    public long f46418r;
    public AudioRecorderNative f46420t;
    public AudioNoiseSuppressor f46421u;
    public Exception v;
    public boolean f46422w;
    public long f46423x;
    public int f46424y;
    public long f46425z;
    public final ConcurrentLinkedQueue f46412l = new ConcurrentLinkedQueue();
    public final AtomicInteger f46413m = new AtomicInteger();
    public final ByteBuffer f46419s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j10, long j11, h hVar, ui.b bVar, dc.e eVar) {
        this.f46404a = file;
        this.f46405b = file2;
        this.f46406c = j10;
        this.d = j11;
        this.e = hVar;
        this.f46407f = bVar;
        this.f46408g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f46409i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f46410j = handlerThread2;
        handlerThread2.start();
        this.f46411k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i10) {
        ByteBuffer byteBuffer = this.f46419s;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f46421u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f46421u.b(i10 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f46425z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            ui.b bVar = this.f46407f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f46421u.c();
                this.f46421u = null;
            } else if (this.f46425z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f46425z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f46420t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f46422w) {
            this.f46412l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f46414n = true;
        if (!this.f46415o) {
            this.f46409i.postAtFrontOfQueue(new ui.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f46415o) {
            return;
        }
        this.f46415o = true;
        this.f46414n = true;
        if (exc != null) {
            this.f46407f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f46416p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f46416p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f46411k.post(new b(this, this.f46417q, exc));
        this.h.quitSafely();
    }
}

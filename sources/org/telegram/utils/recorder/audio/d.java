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
    public final File f46407a;
    public final File f46408b;
    public final long f46409c;
    public final long d;
    public final h e;
    public final ui.b f46410f;
    public final dc.e f46411g;
    public final HandlerThread h;
    public final Handler f46412i;
    public final HandlerThread f46413j;
    public final Handler f46414k;
    public volatile boolean f46417n;
    public volatile boolean f46418o;
    public AudioRecord f46419p;
    public long f46420q;
    public long f46421r;
    public AudioRecorderNative f46423t;
    public AudioNoiseSuppressor f46424u;
    public Exception v;
    public boolean f46425w;
    public long f46426x;
    public int f46427y;
    public long f46428z;
    public final ConcurrentLinkedQueue f46415l = new ConcurrentLinkedQueue();
    public final AtomicInteger f46416m = new AtomicInteger();
    public final ByteBuffer f46422s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j10, long j11, h hVar, ui.b bVar, dc.e eVar) {
        this.f46407a = file;
        this.f46408b = file2;
        this.f46409c = j10;
        this.d = j11;
        this.e = hVar;
        this.f46410f = bVar;
        this.f46411g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f46412i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f46413j = handlerThread2;
        handlerThread2.start();
        this.f46414k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i10) {
        ByteBuffer byteBuffer = this.f46422s;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f46424u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f46424u.b(i10 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f46428z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            ui.b bVar = this.f46410f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f46424u.c();
                this.f46424u = null;
            } else if (this.f46428z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f46428z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f46423t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f46425w) {
            this.f46415l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f46417n = true;
        if (!this.f46418o) {
            this.f46412i.postAtFrontOfQueue(new ui.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f46418o) {
            return;
        }
        this.f46418o = true;
        this.f46417n = true;
        if (exc != null) {
            this.f46410f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f46419p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f46419p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f46414k.post(new b(this, this.f46420q, exc));
        this.h.quitSafely();
    }
}

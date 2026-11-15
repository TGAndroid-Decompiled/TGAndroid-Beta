package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import yi.h;
public final class d {
    public long A;
    public long B;
    public final File f54125a;
    public final File f54126b;
    public final long f54127c;
    public final long d;
    public final h f54128e;
    public final yi.b f54129f;
    public final ac.e f54130g;
    public final HandlerThread h;
    public final Handler f54131i;
    public final HandlerThread f54132j;
    public final Handler f54133k;
    public volatile boolean f54136n;
    public volatile boolean f54137o;
    public AudioRecord f54138p;
    public long f54139q;
    public long f54140r;
    public AudioRecorderNative f54142t;
    public AudioNoiseSuppressor f54143u;
    public Exception v;
    public boolean f54144w;
    public long f54145x;
    public int f54146y;
    public long f54147z;
    public final ConcurrentLinkedQueue f54134l = new ConcurrentLinkedQueue();
    public final AtomicInteger f54135m = new AtomicInteger();
    public final ByteBuffer f54141s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j3, long j10, h hVar, yi.b bVar, ac.e eVar) {
        this.f54125a = file;
        this.f54126b = file2;
        this.f54127c = j3;
        this.d = j10;
        this.f54128e = hVar;
        this.f54129f = bVar;
        this.f54130g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f54131i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f54132j = handlerThread2;
        handlerThread2.start();
        this.f54133k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i7) {
        ByteBuffer byteBuffer = this.f54141s;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        if (this.f54143u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f54143u.b(i7 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f54147z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            yi.b bVar = this.f54129f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f54143u.c();
                this.f54143u = null;
            } else if (this.f54147z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f54147z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i7);
        }
        AudioRecorderNative audioRecorderNative = this.f54142t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i7) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f54144w) {
            this.f54134l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f54136n = true;
        if (!this.f54137o) {
            this.f54131i.postAtFrontOfQueue(new yi.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f54137o) {
            return;
        }
        this.f54137o = true;
        this.f54136n = true;
        if (exc != null) {
            this.f54129f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f54138p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f54138p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f54133k.post(new b(this, this.f54139q, exc));
        this.h.quitSafely();
    }
}

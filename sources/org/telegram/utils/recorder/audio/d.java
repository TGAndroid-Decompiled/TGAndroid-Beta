package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import yi.g;
public final class d {
    public long A;
    public long B;
    public final File f54654a;
    public final File f54655b;
    public final long f54656c;
    public final long d;
    public final g f54657e;
    public final yi.b f54658f;
    public final ac.e f54659g;
    public final HandlerThread h;
    public final Handler f54660i;
    public final HandlerThread f54661j;
    public final Handler f54662k;
    public volatile boolean f54665n;
    public volatile boolean f54666o;
    public AudioRecord f54667p;
    public long f54668q;
    public long f54669r;
    public AudioRecorderNative f54671t;
    public AudioNoiseSuppressor f54672u;
    public Exception v;
    public boolean f54673w;
    public long f54674x;
    public int f54675y;
    public long f54676z;
    public final ConcurrentLinkedQueue f54663l = new ConcurrentLinkedQueue();
    public final AtomicInteger f54664m = new AtomicInteger();
    public final ByteBuffer f54670s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j3, long j10, g gVar, yi.b bVar, ac.e eVar) {
        this.f54654a = file;
        this.f54655b = file2;
        this.f54656c = j3;
        this.d = j10;
        this.f54657e = gVar;
        this.f54658f = bVar;
        this.f54659g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f54660i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f54661j = handlerThread2;
        handlerThread2.start();
        this.f54662k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i7) {
        ByteBuffer byteBuffer = this.f54670s;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        if (this.f54672u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f54672u.b(i7 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f54676z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            yi.b bVar = this.f54658f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f54672u.c();
                this.f54672u = null;
            } else if (this.f54676z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f54676z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i7);
        }
        AudioRecorderNative audioRecorderNative = this.f54671t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i7) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f54673w) {
            this.f54663l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f54665n = true;
        if (!this.f54666o) {
            this.f54660i.postAtFrontOfQueue(new yi.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f54666o) {
            return;
        }
        this.f54666o = true;
        this.f54665n = true;
        if (exc != null) {
            this.f54658f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f54667p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f54667p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f54662k.post(new b(this, this.f54668q, exc));
        this.h.quitSafely();
    }
}

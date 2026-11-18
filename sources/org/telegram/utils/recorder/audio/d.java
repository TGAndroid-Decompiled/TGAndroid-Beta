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
    public final File f54644a;
    public final File f54645b;
    public final long f54646c;
    public final long d;
    public final g f54647e;
    public final yi.b f54648f;
    public final ac.e f54649g;
    public final HandlerThread h;
    public final Handler f54650i;
    public final HandlerThread f54651j;
    public final Handler f54652k;
    public volatile boolean f54655n;
    public volatile boolean f54656o;
    public AudioRecord f54657p;
    public long f54658q;
    public long f54659r;
    public AudioRecorderNative f54661t;
    public AudioNoiseSuppressor f54662u;
    public Exception v;
    public boolean f54663w;
    public long f54664x;
    public int f54665y;
    public long f54666z;
    public final ConcurrentLinkedQueue f54653l = new ConcurrentLinkedQueue();
    public final AtomicInteger f54654m = new AtomicInteger();
    public final ByteBuffer f54660s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j3, long j10, g gVar, yi.b bVar, ac.e eVar) {
        this.f54644a = file;
        this.f54645b = file2;
        this.f54646c = j3;
        this.d = j10;
        this.f54647e = gVar;
        this.f54648f = bVar;
        this.f54649g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f54650i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f54651j = handlerThread2;
        handlerThread2.start();
        this.f54652k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i7) {
        ByteBuffer byteBuffer = this.f54660s;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        if (this.f54662u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f54662u.b(i7 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f54666z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            yi.b bVar = this.f54648f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f54662u.c();
                this.f54662u = null;
            } else if (this.f54666z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f54666z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i7);
        }
        AudioRecorderNative audioRecorderNative = this.f54661t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i7) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f54663w) {
            this.f54653l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f54655n = true;
        if (!this.f54656o) {
            this.f54650i.postAtFrontOfQueue(new yi.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f54656o) {
            return;
        }
        this.f54656o = true;
        this.f54655n = true;
        if (exc != null) {
            this.f54648f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f54657p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f54657p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f54652k.post(new b(this, this.f54658q, exc));
        this.h.quitSafely();
    }
}

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
    public final File f52733a;
    public final File f52734b;
    public final long f52735c;
    public final long d;
    public final f f52736e;
    public final vi.b f52737f;
    public final ac.e f52738g;
    public final HandlerThread h;
    public final Handler f52739i;
    public final HandlerThread f52740j;
    public final Handler f52741k;
    public volatile boolean f52744n;
    public volatile boolean f52745o;
    public AudioRecord f52746p;
    public long f52747q;
    public long f52748r;
    public AudioRecorderNative f52750t;
    public AudioNoiseSuppressor f52751u;
    public Exception v;
    public boolean f52752w;
    public long f52753x;
    public int f52754y;
    public long f52755z;
    public final ConcurrentLinkedQueue f52742l = new ConcurrentLinkedQueue();
    public final AtomicInteger f52743m = new AtomicInteger();
    public final ByteBuffer f52749s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j3, long j10, f fVar, vi.b bVar, ac.e eVar) {
        this.f52733a = file;
        this.f52734b = file2;
        this.f52735c = j3;
        this.d = j10;
        this.f52736e = fVar;
        this.f52737f = bVar;
        this.f52738g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f52739i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f52740j = handlerThread2;
        handlerThread2.start();
        this.f52741k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i7) {
        ByteBuffer byteBuffer = this.f52749s;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        if (this.f52751u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f52751u.b(i7 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f52755z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            vi.b bVar = this.f52737f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f52751u.c();
                this.f52751u = null;
            } else if (this.f52755z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f52755z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i7);
        }
        AudioRecorderNative audioRecorderNative = this.f52750t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i7) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f52752w) {
            this.f52742l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f52744n = true;
        if (!this.f52745o) {
            this.f52739i.postAtFrontOfQueue(new vi.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f52745o) {
            return;
        }
        this.f52745o = true;
        this.f52744n = true;
        if (exc != null) {
            this.f52737f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f52746p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f52746p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f52741k.post(new b(this, this.f52747q, exc));
        this.h.quitSafely();
    }
}

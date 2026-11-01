package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import ki.g;
import ki.i;
public final class d {
    public long A;
    public long B;
    public final File f44280a;
    public final File f44281b;
    public final long f44282c;
    public final long d;
    public final i e;
    public final ki.b f44283f;
    public final g f44284g;
    public final HandlerThread h;
    public final Handler f44285i;
    public final HandlerThread f44286j;
    public final Handler f44287k;
    public volatile boolean f44290n;
    public volatile boolean f44291o;
    public AudioRecord f44292p;
    public long f44293q;
    public long f44294r;
    public AudioRecorderNative f44296t;
    public AudioNoiseSuppressor f44297u;
    public Exception v;
    public boolean f44298w;
    public long f44299x;
    public int f44300y;
    public long f44301z;
    public final ConcurrentLinkedQueue f44288l = new ConcurrentLinkedQueue();
    public final AtomicInteger f44289m = new AtomicInteger();
    public final ByteBuffer f44295s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j10, long j11, i iVar, ki.b bVar, g gVar) {
        this.f44280a = file;
        this.f44281b = file2;
        this.f44282c = j10;
        this.d = j11;
        this.e = iVar;
        this.f44283f = bVar;
        this.f44284g = gVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f44285i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f44286j = handlerThread2;
        handlerThread2.start();
        this.f44287k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i10) {
        ByteBuffer byteBuffer = this.f44295s;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f44297u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f44297u.b(i10 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f44301z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            ki.b bVar = this.f44283f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f44297u.c();
                this.f44297u = null;
            } else if (this.f44301z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f44301z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f44296t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f44298w) {
            this.f44288l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f44290n = true;
        if (!this.f44291o) {
            this.f44285i.postAtFrontOfQueue(new ki.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f44291o) {
            return;
        }
        this.f44291o = true;
        this.f44290n = true;
        if (exc != null) {
            this.f44283f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f44292p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f44292p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f44287k.post(new b(this, this.f44293q, exc));
        this.h.quitSafely();
    }
}

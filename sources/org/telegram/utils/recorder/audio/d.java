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
    public final File f44276a;
    public final File f44277b;
    public final long f44278c;
    public final long d;
    public final i e;
    public final ki.b f44279f;
    public final g f44280g;
    public final HandlerThread h;
    public final Handler f44281i;
    public final HandlerThread f44282j;
    public final Handler f44283k;
    public volatile boolean f44286n;
    public volatile boolean f44287o;
    public AudioRecord f44288p;
    public long f44289q;
    public long f44290r;
    public AudioRecorderNative f44292t;
    public AudioNoiseSuppressor f44293u;
    public Exception v;
    public boolean f44294w;
    public long f44295x;
    public int f44296y;
    public long f44297z;
    public final ConcurrentLinkedQueue f44284l = new ConcurrentLinkedQueue();
    public final AtomicInteger f44285m = new AtomicInteger();
    public final ByteBuffer f44291s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j10, long j11, i iVar, ki.b bVar, g gVar) {
        this.f44276a = file;
        this.f44277b = file2;
        this.f44278c = j10;
        this.d = j11;
        this.e = iVar;
        this.f44279f = bVar;
        this.f44280g = gVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f44281i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f44282j = handlerThread2;
        handlerThread2.start();
        this.f44283k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i10) {
        ByteBuffer byteBuffer = this.f44291s;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f44293u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f44293u.b(i10 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f44297z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            ki.b bVar = this.f44279f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f44293u.c();
                this.f44293u = null;
            } else if (this.f44297z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f44297z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f44292t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f44294w) {
            this.f44284l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f44286n = true;
        if (!this.f44287o) {
            this.f44281i.postAtFrontOfQueue(new ki.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f44287o) {
            return;
        }
        this.f44287o = true;
        this.f44286n = true;
        if (exc != null) {
            this.f44279f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f44288p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f44288p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f44283k.post(new b(this, this.f44289q, exc));
        this.h.quitSafely();
    }
}

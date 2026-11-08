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
    public final File f52719a;
    public final File f52720b;
    public final long f52721c;
    public final long d;
    public final f f52722e;
    public final vi.b f52723f;
    public final ac.e f52724g;
    public final HandlerThread h;
    public final Handler f52725i;
    public final HandlerThread f52726j;
    public final Handler f52727k;
    public volatile boolean f52730n;
    public volatile boolean f52731o;
    public AudioRecord f52732p;
    public long f52733q;
    public long f52734r;
    public AudioRecorderNative f52736t;
    public AudioNoiseSuppressor f52737u;
    public Exception v;
    public boolean f52738w;
    public long f52739x;
    public int f52740y;
    public long f52741z;
    public final ConcurrentLinkedQueue f52728l = new ConcurrentLinkedQueue();
    public final AtomicInteger f52729m = new AtomicInteger();
    public final ByteBuffer f52735s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j3, long j10, f fVar, vi.b bVar, ac.e eVar) {
        this.f52719a = file;
        this.f52720b = file2;
        this.f52721c = j3;
        this.d = j10;
        this.f52722e = fVar;
        this.f52723f = bVar;
        this.f52724g = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.f52725i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.f52726j = handlerThread2;
        handlerThread2.start();
        this.f52727k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void b(int i7) {
        ByteBuffer byteBuffer = this.f52735s;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        if (this.f52737u != null) {
            long nanoTime = System.nanoTime();
            boolean b10 = this.f52737u.b(i7 / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f52741z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            vi.b bVar = this.f52723f;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f52737u.c();
                this.f52737u = null;
            } else if (this.f52741z % 100 == 0) {
                bVar.b("RNNoise processing: averageMs=" + ((this.A / this.f52741z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i7);
        }
        AudioRecorderNative audioRecorderNative = this.f52736t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i7) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void c(ByteBuffer byteBuffer) {
        if (!this.f52738w) {
            this.f52728l.offer(byteBuffer);
        }
    }

    public final void d() {
        this.f52730n = true;
        if (!this.f52731o) {
            this.f52725i.postAtFrontOfQueue(new vi.a(this, 1));
        }
    }

    public final void e(Exception exc) {
        if (this.f52731o) {
            return;
        }
        this.f52731o = true;
        this.f52730n = true;
        if (exc != null) {
            this.f52723f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.f52732p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.f52732p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.f52727k.post(new b(this, this.f52733q, exc));
        this.h.quitSafely();
    }
}

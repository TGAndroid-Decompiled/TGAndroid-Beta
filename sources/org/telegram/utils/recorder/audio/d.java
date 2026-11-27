package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
public final class d {
    public long A;
    public long B;
    public final File a;
    public final File b;
    public final long c;
    public final long d;
    public final f30 e;
    public final r20 f;
    public final n20 g;
    public final HandlerThread h;
    public final Handler i;
    public final HandlerThread j;
    public final Handler k;
    public volatile boolean n;
    public volatile boolean o;
    public AudioRecord p;
    public long q;
    public long r;
    public AudioRecorderNative t;
    public AudioNoiseSuppressor u;
    public Exception v;
    public boolean w;
    public long x;
    public int y;
    public long z;
    public final ConcurrentLinkedQueue l = new ConcurrentLinkedQueue();
    public final AtomicInteger m = new AtomicInteger();
    public final ByteBuffer s = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());

    public d(File file, File file2, long j, long j2, f30 f30Var, r20 r20Var, n20 n20Var) {
        this.a = file;
        this.b = file2;
        this.c = j;
        this.d = j2;
        this.e = f30Var;
        this.f = r20Var;
        this.g = n20Var;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.i = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("AudioRecorderEncoder", 0);
        this.j = handlerThread2;
        handlerThread2.start();
        this.k = new Handler(handlerThread2.getLooper());
    }

    public static Exception a(Throwable th) {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        return new RuntimeException(th);
    }

    public final void b(int i) {
        ByteBuffer byteBuffer = this.s;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        if (this.u != null) {
            long nanoTime = System.nanoTime();
            boolean b = this.u.b(i / 2, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.z++;
            this.A += nanoTime2;
            this.B = Math.max(this.B, nanoTime2);
            r20 r20Var = this.f;
            if (!b) {
                r20Var.b("RNNoise processing failed; recording unprocessed PCM");
                this.u.c();
                this.u = null;
            } else if (this.z % 100 == 0) {
                r20Var.b("RNNoise processing: averageMs=" + ((this.A / this.z) / 1000000.0d) + ", maxMs=" + (this.B / 1000000.0d));
            }
            byteBuffer.position(0);
            byteBuffer.limit(i);
        }
        AudioRecorderNative audioRecorderNative = this.t;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i) != 0) {
            return;
        }
        grb.i("Native Opus encoding failed");
    }

    public final void c() {
        double sqrt;
        if (this.o) {
            return;
        }
        Exception exc = null;
        if (this.n) {
            f(null);
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.l.poll();
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
        }
        byteBuffer.clear();
        boolean z = false;
        try {
            int read = this.p.read(byteBuffer, byteBuffer.capacity());
            if (read > 0) {
                byteBuffer.limit(read);
                snc sncVar = r2f.a;
                if (sncVar != null && read > 0) {
                    sncVar.o(byteBuffer, read, 48000, 2);
                }
                int i = read / 2;
                long j = 0;
                for (int i2 = 0; i2 + 1 < read; i2 += 2) {
                    long j2 = byteBuffer.getShort(i2);
                    j += j2 * j2;
                }
                this.q += i;
                this.m.incrementAndGet();
                this.k.post(new c(this, byteBuffer, (byte) 0));
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - this.r >= 32) {
                        if (i == 0) {
                            sqrt = 0.0d;
                        } else {
                            sqrt = Math.sqrt(j / i);
                        }
                        final double d = sqrt;
                        final n20 n20Var = this.g;
                        final long j3 = this.q;
                        Handler handler = ((i30) n20Var.c).i;
                        final long j4 = n20Var.a;
                        handler.post(new Runnable() {
                            @Override
                            public final void run() {
                                i30 i30Var = (i30) n20.this.c;
                                if (j4 == i30Var.o && i30Var.G == 3) {
                                    i30Var.q = j3;
                                    long j5 = i30Var.j();
                                    double d2 = d;
                                    if (d2 >= 0.0d) {
                                        MediaController mediaController = ((sn6) i30Var.f.b).a;
                                        mediaController.l1 = j5;
                                        jn7.f(mediaController.i1).k(jn7.k2, Integer.valueOf(mediaController.h1), Double.valueOf(d2 / 2.0d));
                                    }
                                }
                            }
                        });
                        this.r = elapsedRealtime;
                    }
                    this.i.post(new wz(this, (byte) 3));
                    return;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z) {
                        d(byteBuffer);
                    }
                    if (!this.n) {
                        exc = a(th);
                    }
                    f(exc);
                    return;
                }
            }
            throw new IllegalStateException("AudioRecord read failed: " + read);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void d(ByteBuffer byteBuffer) {
        if (!this.w) {
            this.l.offer(byteBuffer);
        }
    }

    public final void e() {
        this.n = true;
        if (!this.o) {
            this.i.postAtFrontOfQueue(new wz(this, (byte) 1));
        }
    }

    public final void f(Exception exc) {
        if (this.o) {
            return;
        }
        this.o = true;
        this.n = true;
        if (exc != null) {
            this.f.a("capture failed", exc);
        }
        AudioRecord audioRecord = this.p;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    this.p.stop();
                }
            } finally {
                if (exc == null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        this.k.post(new b(this, this.q, exc));
        this.h.quitSafely();
    }
}

package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.ui.uo;
import ri.j;
import ri.k;
import ri.q;
public final class b {
    public final File f42747a;
    public final File f42748b;
    public final j f42749c;
    public final ri.b d;
    public final cc.e e;
    public final HandlerThread f42750f;
    public final Handler f42751g;
    public volatile boolean f42753j;
    public AudioRecord f42754k;
    public AudioRecorderNative f42755l;
    public AudioNoiseSuppressor f42756m;
    public boolean f42757n;
    public Exception f42758o;
    public long f42759p;
    public long f42760q;
    public long f42761r;
    public long f42763t;
    public long f42764u;
    public long v;
    public final ByteBuffer h = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
    public final ByteBuffer f42752i = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
    public double f42762s = -1.0d;

    public b(File file, File file2, j jVar, ri.b bVar, cc.e eVar) {
        this.f42747a = file;
        this.f42748b = file2;
        this.f42749c = jVar;
        this.d = bVar;
        this.e = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.f42750f = handlerThread;
        handlerThread.start();
        this.f42751g = new Handler(handlerThread.getLooper());
    }

    public static void a(b bVar) {
        long j10;
        double sqrt;
        final double d;
        if (!bVar.f42757n) {
            if (bVar.f42753j) {
                bVar.e();
                return;
            }
            try {
                bVar.h.clear();
                AudioRecord audioRecord = bVar.f42754k;
                ByteBuffer byteBuffer = bVar.h;
                int read = audioRecord.read(byteBuffer, byteBuffer.capacity());
                if (read > 0) {
                    bVar.h.limit(read);
                    int i10 = read / 2;
                    long j11 = 0;
                    for (int i11 = 0; i11 + 1 < read; i11 += 2) {
                        long j12 = bVar.h.getShort(i11);
                        j11 += j12 * j12;
                    }
                    bVar.f42759p += i10;
                    bVar.f42762s = -1.0d;
                    bVar.c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - bVar.f42760q >= 100) {
                        j10 = bVar.f42755l.d();
                        bVar.f42760q = elapsedRealtime;
                    } else {
                        j10 = -1;
                    }
                    if (elapsedRealtime - bVar.f42761r >= 32) {
                        if (i10 == 0) {
                            sqrt = 0.0d;
                        } else {
                            sqrt = Math.sqrt(j11 / i10);
                        }
                        double d10 = bVar.f42762s;
                        if (d10 >= 0.0d) {
                            d = d10;
                        } else {
                            d = sqrt;
                        }
                        final cc.e eVar = bVar.e;
                        final long j13 = bVar.f42759p;
                        q qVar = (q) eVar.f4722c;
                        if (j10 >= 0) {
                            qVar.a((k) eVar.f4721b, j10);
                        }
                        Handler handler = qVar.h;
                        final long j14 = eVar.f4720a;
                        handler.post(new Runnable() {
                            @Override
                            public final void run() {
                                q qVar2 = (q) cc.e.this.f4722c;
                                if (j14 == qVar2.f44764o && qVar2.f44762m == o.f44747c) {
                                    qVar2.f44766q = j13;
                                    long j15 = qVar2.j();
                                    double d11 = d;
                                    if (d11 >= 0.0d) {
                                        qVar2.e.onRecordingProgress(j15, d11);
                                    }
                                }
                            }
                        });
                        bVar.f42761r = elapsedRealtime;
                    } else {
                        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i12 >= 0) {
                            final cc.e eVar2 = bVar.e;
                            final long j15 = bVar.f42759p;
                            q qVar2 = (q) eVar2.f4722c;
                            if (i12 >= 0) {
                                qVar2.a((k) eVar2.f4721b, j10);
                            }
                            Handler handler2 = qVar2.h;
                            final long j16 = eVar2.f4720a;
                            handler2.post(new Runnable() {
                                @Override
                                public final void run() {
                                    q qVar22 = (q) cc.e.this.f4722c;
                                    if (j16 == qVar22.f44764o && qVar22.f44762m == o.f44747c) {
                                        qVar22.f44766q = j15;
                                        long j152 = qVar22.j();
                                        double d11 = d;
                                        if (d11 >= 0.0d) {
                                            qVar22.e.onRecordingProgress(j152, d11);
                                        }
                                    }
                                }
                            });
                        }
                    }
                    bVar.f42751g.post(new ri.a(bVar, 1));
                    return;
                }
                throw new IllegalStateException("AudioRecord read failed: " + read);
            } catch (Throwable th2) {
                if (bVar.f42753j) {
                    bVar.e();
                    return;
                }
                bVar.d.a("capture failed", th2);
                bVar.f42753j = true;
                bVar.f42758o = b(th2);
                try {
                    bVar.e();
                } catch (Throwable th3) {
                    bVar.f42758o.addSuppressed(th3);
                }
            }
        }
    }

    public static Exception b(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        return new RuntimeException(th2);
    }

    public final void c() {
        ByteBuffer byteBuffer = this.h;
        byteBuffer.position(0);
        while (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.f42752i;
            int min = Math.min(remaining, byteBuffer2.remaining());
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer2.put(byteBuffer);
            byteBuffer.limit(limit);
            if (!byteBuffer2.hasRemaining()) {
                d(1920);
                byteBuffer2.clear();
            }
        }
    }

    public final void d(int i10) {
        double sqrt;
        ByteBuffer byteBuffer = this.f42752i;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f42756m != null) {
            long nanoTime = System.nanoTime();
            int i11 = i10 / 2;
            boolean b10 = this.f42756m.b(i11, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f42763t++;
            this.f42764u += nanoTime2;
            this.v = Math.max(this.v, nanoTime2);
            ri.b bVar = this.d;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f42756m.c();
                this.f42756m = null;
            } else {
                long j10 = 0;
                for (int i12 = 0; i12 + 1 < i10; i12 += 2) {
                    long j11 = byteBuffer.getShort(i12);
                    j10 += j11 * j11;
                }
                if (i11 == 0) {
                    sqrt = 0.0d;
                } else {
                    sqrt = Math.sqrt(j10 / i11);
                }
                this.f42762s = sqrt;
                if (this.f42763t % 100 == 0) {
                    bVar.b("RNNoise processing: averageMs=" + ((this.f42764u / this.f42763t) / 1000000.0d) + ", maxMs=" + (this.v / 1000000.0d));
                }
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f42755l;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void e() {
        long j10;
        AudioRecorderNative audioRecorderNative;
        ByteBuffer byteBuffer = this.f42752i;
        if (this.f42757n) {
            return;
        }
        this.f42757n = true;
        Exception exc = this.f42758o;
        try {
            AudioRecord audioRecord = this.f42754k;
            if (audioRecord != null) {
                if (audioRecord.getRecordingState() == 3) {
                    this.f42754k.stop();
                }
                this.f42754k.release();
                this.f42754k = null;
            }
            if (this.f42755l != null && byteBuffer.position() > 0) {
                d(byteBuffer.position());
                byteBuffer.clear();
            }
            AudioNoiseSuppressor audioNoiseSuppressor = this.f42756m;
            if (audioNoiseSuppressor != null) {
                audioNoiseSuppressor.c();
                this.f42756m = null;
            }
            audioRecorderNative = this.f42755l;
        } catch (Throwable th2) {
            try {
                exc = b(th2);
                AudioNoiseSuppressor audioNoiseSuppressor2 = this.f42756m;
                if (audioNoiseSuppressor2 != null) {
                    audioNoiseSuppressor2.c();
                    this.f42756m = null;
                }
                AudioRecorderNative audioRecorderNative2 = this.f42755l;
                if (audioRecorderNative2 != null) {
                    try {
                        audioRecorderNative2.c();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th3) {
                if (this.f42756m != null) {
                    this.f42756m.c();
                    this.f42756m = null;
                }
                AudioRecorderNative audioRecorderNative3 = this.f42755l;
                if (audioRecorderNative3 != null) {
                    try {
                        if (!audioRecorderNative3.c() && exc == null) {
                            new IllegalStateException("Unable to finalize native Opus recorder");
                        }
                    } catch (Throwable th4) {
                        if (exc == null) {
                            b(th4);
                        }
                    }
                    this.f42755l.f();
                    this.f42755l = null;
                }
                throw th3;
            }
        }
        if (audioRecorderNative != null) {
            try {
                if (!audioRecorderNative.c() && exc == null) {
                    exc = new IllegalStateException("Unable to finalize native Opus recorder");
                }
            } catch (Throwable th5) {
                if (exc == null) {
                    exc = b(th5);
                }
            }
            this.f42755l.f();
            this.f42755l = null;
        }
        Exception exc2 = exc;
        File file = this.f42747a;
        if (file.isFile()) {
            j10 = file.length();
        } else {
            j10 = 0;
        }
        int i10 = (this.f42763t > 0L ? 1 : (this.f42763t == 0L ? 0 : -1));
        ri.b bVar = this.d;
        if (i10 > 0) {
            bVar.b("RNNoise summary: frames=" + this.f42763t + ", averageMs=" + ((this.f42764u / this.f42763t) / 1000000.0d) + ", maxMs=" + (this.v / 1000000.0d));
        }
        bVar.b("capture stopped: samples=" + this.f42759p + ", durationMs=" + ((this.f42759p * 1000) / 48000) + ", bytes=" + j10);
        cc.e eVar = this.e;
        if (exc2 == null) {
            long j11 = this.f42759p;
            q qVar = (q) eVar.f4722c;
            qVar.a((k) eVar.f4721b, j10);
            qVar.h.post(new uo(eVar, eVar.f4720a, j11, 3));
        } else {
            ((q) eVar.f4722c).h.post(new ri.e(eVar, eVar.f4720a, exc2, 1));
        }
        this.f42750f.quitSafely();
    }

    public final void f() {
        this.f42753j = true;
        this.f42751g.postAtFrontOfQueue(new ri.a(this, 0));
    }
}

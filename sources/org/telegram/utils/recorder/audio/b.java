package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.ui.to;
import pi.l;
import pi.m;
import pi.s;
public final class b {
    public final File f44951a;
    public final File f44952b;
    public final l f44953c;
    public final pi.b d;
    public final bc.e f44954e;
    public final HandlerThread f44955f;
    public final Handler f44956g;
    public volatile boolean f44958j;
    public AudioRecord f44959k;
    public AudioRecorderNative f44960l;
    public AudioNoiseSuppressor f44961m;
    public boolean f44962n;
    public Exception f44963o;
    public long f44964p;
    public long f44965q;
    public long f44966r;
    public long f44968t;
    public long f44969u;
    public long v;
    public final ByteBuffer h = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
    public final ByteBuffer f44957i = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
    public double f44967s = -1.0d;

    public b(File file, File file2, l lVar, pi.b bVar, bc.e eVar) {
        this.f44951a = file;
        this.f44952b = file2;
        this.f44953c = lVar;
        this.d = bVar;
        this.f44954e = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.f44955f = handlerThread;
        handlerThread.start();
        this.f44956g = new Handler(handlerThread.getLooper());
    }

    public static void a(b bVar) {
        long j3;
        double sqrt;
        final double d;
        if (!bVar.f44962n) {
            if (bVar.f44958j) {
                bVar.e();
                return;
            }
            try {
                bVar.h.clear();
                AudioRecord audioRecord = bVar.f44959k;
                ByteBuffer byteBuffer = bVar.h;
                int read = audioRecord.read(byteBuffer, byteBuffer.capacity());
                if (read > 0) {
                    bVar.h.limit(read);
                    int i10 = read / 2;
                    long j10 = 0;
                    for (int i11 = 0; i11 + 1 < read; i11 += 2) {
                        long j11 = bVar.h.getShort(i11);
                        j10 += j11 * j11;
                    }
                    bVar.f44964p += i10;
                    bVar.f44967s = -1.0d;
                    bVar.c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - bVar.f44965q >= 100) {
                        j3 = bVar.f44960l.d();
                        bVar.f44965q = elapsedRealtime;
                    } else {
                        j3 = -1;
                    }
                    if (elapsedRealtime - bVar.f44966r >= 32) {
                        if (i10 == 0) {
                            sqrt = 0.0d;
                        } else {
                            sqrt = Math.sqrt(j10 / i10);
                        }
                        double d10 = bVar.f44967s;
                        if (d10 >= 0.0d) {
                            d = d10;
                        } else {
                            d = sqrt;
                        }
                        final bc.e eVar = bVar.f44954e;
                        final long j12 = bVar.f44964p;
                        s sVar = (s) eVar.f3855c;
                        if (j3 >= 0) {
                            sVar.a((m) eVar.f3854b, j3);
                        }
                        Handler handler = sVar.h;
                        final long j13 = eVar.f3853a;
                        handler.post(new Runnable() {
                            @Override
                            public final void run() {
                                s sVar2 = (s) bc.e.this.f3855c;
                                if (j13 == sVar2.f45824o && sVar2.f45822m == q.f45805c) {
                                    sVar2.f45826q = j12;
                                    long j14 = sVar2.j();
                                    double d11 = d;
                                    if (d11 >= 0.0d) {
                                        sVar2.f45815e.onRecordingProgress(j14, d11);
                                    }
                                }
                            }
                        });
                        bVar.f44966r = elapsedRealtime;
                    } else {
                        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                        if (i12 >= 0) {
                            final bc.e eVar2 = bVar.f44954e;
                            final long j14 = bVar.f44964p;
                            s sVar2 = (s) eVar2.f3855c;
                            if (i12 >= 0) {
                                sVar2.a((m) eVar2.f3854b, j3);
                            }
                            Handler handler2 = sVar2.h;
                            final long j15 = eVar2.f3853a;
                            handler2.post(new Runnable() {
                                @Override
                                public final void run() {
                                    s sVar22 = (s) bc.e.this.f3855c;
                                    if (j15 == sVar22.f45824o && sVar22.f45822m == q.f45805c) {
                                        sVar22.f45826q = j14;
                                        long j142 = sVar22.j();
                                        double d11 = d;
                                        if (d11 >= 0.0d) {
                                            sVar22.f45815e.onRecordingProgress(j142, d11);
                                        }
                                    }
                                }
                            });
                        }
                    }
                    bVar.f44956g.post(new pi.a(bVar, 1));
                    return;
                }
                throw new IllegalStateException("AudioRecord read failed: " + read);
            } catch (Throwable th2) {
                if (bVar.f44958j) {
                    bVar.e();
                    return;
                }
                bVar.d.a("capture failed", th2);
                bVar.f44958j = true;
                bVar.f44963o = b(th2);
                try {
                    bVar.e();
                } catch (Throwable th3) {
                    bVar.f44963o.addSuppressed(th3);
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
            ByteBuffer byteBuffer2 = this.f44957i;
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
        ByteBuffer byteBuffer = this.f44957i;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f44961m != null) {
            long nanoTime = System.nanoTime();
            int i11 = i10 / 2;
            boolean b10 = this.f44961m.b(i11, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f44968t++;
            this.f44969u += nanoTime2;
            this.v = Math.max(this.v, nanoTime2);
            pi.b bVar = this.d;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f44961m.c();
                this.f44961m = null;
            } else {
                long j3 = 0;
                for (int i12 = 0; i12 + 1 < i10; i12 += 2) {
                    long j10 = byteBuffer.getShort(i12);
                    j3 += j10 * j10;
                }
                if (i11 == 0) {
                    sqrt = 0.0d;
                } else {
                    sqrt = Math.sqrt(j3 / i11);
                }
                this.f44967s = sqrt;
                if (this.f44968t % 100 == 0) {
                    bVar.b("RNNoise processing: averageMs=" + ((this.f44969u / this.f44968t) / 1000000.0d) + ", maxMs=" + (this.v / 1000000.0d));
                }
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f44960l;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void e() {
        long j3;
        AudioRecorderNative audioRecorderNative;
        ByteBuffer byteBuffer = this.f44957i;
        if (this.f44962n) {
            return;
        }
        this.f44962n = true;
        Exception exc = this.f44963o;
        try {
            AudioRecord audioRecord = this.f44959k;
            if (audioRecord != null) {
                if (audioRecord.getRecordingState() == 3) {
                    this.f44959k.stop();
                }
                this.f44959k.release();
                this.f44959k = null;
            }
            if (this.f44960l != null && byteBuffer.position() > 0) {
                d(byteBuffer.position());
                byteBuffer.clear();
            }
            AudioNoiseSuppressor audioNoiseSuppressor = this.f44961m;
            if (audioNoiseSuppressor != null) {
                audioNoiseSuppressor.c();
                this.f44961m = null;
            }
            audioRecorderNative = this.f44960l;
        } catch (Throwable th2) {
            try {
                exc = b(th2);
                AudioNoiseSuppressor audioNoiseSuppressor2 = this.f44961m;
                if (audioNoiseSuppressor2 != null) {
                    audioNoiseSuppressor2.c();
                    this.f44961m = null;
                }
                AudioRecorderNative audioRecorderNative2 = this.f44960l;
                if (audioRecorderNative2 != null) {
                    try {
                        audioRecorderNative2.c();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th3) {
                if (this.f44961m != null) {
                    this.f44961m.c();
                    this.f44961m = null;
                }
                AudioRecorderNative audioRecorderNative3 = this.f44960l;
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
                    this.f44960l.f();
                    this.f44960l = null;
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
            this.f44960l.f();
            this.f44960l = null;
        }
        Exception exc2 = exc;
        File file = this.f44951a;
        if (file.isFile()) {
            j3 = file.length();
        } else {
            j3 = 0;
        }
        int i10 = (this.f44968t > 0L ? 1 : (this.f44968t == 0L ? 0 : -1));
        pi.b bVar = this.d;
        if (i10 > 0) {
            bVar.b("RNNoise summary: frames=" + this.f44968t + ", averageMs=" + ((this.f44969u / this.f44968t) / 1000000.0d) + ", maxMs=" + (this.v / 1000000.0d));
        }
        bVar.b("capture stopped: samples=" + this.f44964p + ", durationMs=" + ((this.f44964p * 1000) / 48000) + ", bytes=" + j3);
        bc.e eVar = this.f44954e;
        if (exc2 == null) {
            long j10 = this.f44964p;
            s sVar = (s) eVar.f3855c;
            sVar.a((m) eVar.f3854b, j3);
            sVar.h.post(new to(eVar, eVar.f3853a, j10, 3));
        } else {
            ((s) eVar.f3855c).h.post(new pi.f(eVar, eVar.f3853a, exc2, 1));
        }
        this.f44955f.quitSafely();
    }

    public final void f() {
        this.f44958j = true;
        this.f44956g.postAtFrontOfQueue(new pi.a(this, 0));
    }
}

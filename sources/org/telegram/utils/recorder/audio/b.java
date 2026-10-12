package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.ui.to;
import pi.m;
import pi.n;
import pi.t;
public final class b {
    public final File f44956a;
    public final File f44957b;
    public final m f44958c;
    public final pi.b d;
    public final bc.e f44959e;
    public final HandlerThread f44960f;
    public final Handler f44961g;
    public volatile boolean f44963j;
    public AudioRecord f44964k;
    public AudioRecorderNative f44965l;
    public AudioNoiseSuppressor f44966m;
    public boolean f44967n;
    public Exception f44968o;
    public long f44969p;
    public long f44970q;
    public long f44971r;
    public long f44973t;
    public long f44974u;
    public long v;
    public final ByteBuffer h = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
    public final ByteBuffer f44962i = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
    public double f44972s = -1.0d;

    public b(File file, File file2, m mVar, pi.b bVar, bc.e eVar) {
        this.f44956a = file;
        this.f44957b = file2;
        this.f44958c = mVar;
        this.d = bVar;
        this.f44959e = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.f44960f = handlerThread;
        handlerThread.start();
        this.f44961g = new Handler(handlerThread.getLooper());
    }

    public static void a(b bVar) {
        long j3;
        double sqrt;
        final double d;
        if (!bVar.f44967n) {
            if (bVar.f44963j) {
                bVar.e();
                return;
            }
            try {
                bVar.h.clear();
                AudioRecord audioRecord = bVar.f44964k;
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
                    bVar.f44969p += i10;
                    bVar.f44972s = -1.0d;
                    bVar.c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - bVar.f44970q >= 100) {
                        j3 = bVar.f44965l.d();
                        bVar.f44970q = elapsedRealtime;
                    } else {
                        j3 = -1;
                    }
                    if (elapsedRealtime - bVar.f44971r >= 32) {
                        if (i10 == 0) {
                            sqrt = 0.0d;
                        } else {
                            sqrt = Math.sqrt(j10 / i10);
                        }
                        double d10 = bVar.f44972s;
                        if (d10 >= 0.0d) {
                            d = d10;
                        } else {
                            d = sqrt;
                        }
                        final bc.e eVar = bVar.f44959e;
                        final long j12 = bVar.f44969p;
                        t tVar = (t) eVar.f3855c;
                        if (j3 >= 0) {
                            tVar.a((n) eVar.f3854b, j3);
                        }
                        Handler handler = tVar.h;
                        final long j13 = eVar.f3853a;
                        handler.post(new Runnable() {
                            @Override
                            public final void run() {
                                t tVar2 = (t) bc.e.this.f3855c;
                                if (j13 == tVar2.f45832o && tVar2.f45830m == r.f45813c) {
                                    tVar2.f45834q = j12;
                                    long l4 = tVar2.l();
                                    double d11 = d;
                                    if (d11 >= 0.0d) {
                                        tVar2.f45823e.onRecordingProgress(l4, d11);
                                    }
                                }
                            }
                        });
                        bVar.f44971r = elapsedRealtime;
                    } else {
                        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                        if (i12 >= 0) {
                            final bc.e eVar2 = bVar.f44959e;
                            final long j14 = bVar.f44969p;
                            t tVar2 = (t) eVar2.f3855c;
                            if (i12 >= 0) {
                                tVar2.a((n) eVar2.f3854b, j3);
                            }
                            Handler handler2 = tVar2.h;
                            final long j15 = eVar2.f3853a;
                            handler2.post(new Runnable() {
                                @Override
                                public final void run() {
                                    t tVar22 = (t) bc.e.this.f3855c;
                                    if (j15 == tVar22.f45832o && tVar22.f45830m == r.f45813c) {
                                        tVar22.f45834q = j14;
                                        long l4 = tVar22.l();
                                        double d11 = d;
                                        if (d11 >= 0.0d) {
                                            tVar22.f45823e.onRecordingProgress(l4, d11);
                                        }
                                    }
                                }
                            });
                        }
                    }
                    bVar.f44961g.post(new pi.a(bVar, 1));
                    return;
                }
                throw new IllegalStateException("AudioRecord read failed: " + read);
            } catch (Throwable th2) {
                if (bVar.f44963j) {
                    bVar.e();
                    return;
                }
                bVar.d.a("capture failed", th2);
                bVar.f44963j = true;
                bVar.f44968o = b(th2);
                try {
                    bVar.e();
                } catch (Throwable th3) {
                    bVar.f44968o.addSuppressed(th3);
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
            ByteBuffer byteBuffer2 = this.f44962i;
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
        ByteBuffer byteBuffer = this.f44962i;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f44966m != null) {
            long nanoTime = System.nanoTime();
            int i11 = i10 / 2;
            boolean b10 = this.f44966m.b(i11, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f44973t++;
            this.f44974u += nanoTime2;
            this.v = Math.max(this.v, nanoTime2);
            pi.b bVar = this.d;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f44966m.c();
                this.f44966m = null;
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
                this.f44972s = sqrt;
                if (this.f44973t % 100 == 0) {
                    bVar.b("RNNoise processing: averageMs=" + ((this.f44974u / this.f44973t) / 1000000.0d) + ", maxMs=" + (this.v / 1000000.0d));
                }
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f44965l;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void e() {
        long j3;
        AudioRecorderNative audioRecorderNative;
        ByteBuffer byteBuffer = this.f44962i;
        if (this.f44967n) {
            return;
        }
        this.f44967n = true;
        Exception exc = this.f44968o;
        try {
            AudioRecord audioRecord = this.f44964k;
            if (audioRecord != null) {
                if (audioRecord.getRecordingState() == 3) {
                    this.f44964k.stop();
                }
                this.f44964k.release();
                this.f44964k = null;
            }
            if (this.f44965l != null && byteBuffer.position() > 0) {
                d(byteBuffer.position());
                byteBuffer.clear();
            }
            AudioNoiseSuppressor audioNoiseSuppressor = this.f44966m;
            if (audioNoiseSuppressor != null) {
                audioNoiseSuppressor.c();
                this.f44966m = null;
            }
            audioRecorderNative = this.f44965l;
        } catch (Throwable th2) {
            try {
                exc = b(th2);
                AudioNoiseSuppressor audioNoiseSuppressor2 = this.f44966m;
                if (audioNoiseSuppressor2 != null) {
                    audioNoiseSuppressor2.c();
                    this.f44966m = null;
                }
                AudioRecorderNative audioRecorderNative2 = this.f44965l;
                if (audioRecorderNative2 != null) {
                    try {
                        audioRecorderNative2.c();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th3) {
                if (this.f44966m != null) {
                    this.f44966m.c();
                    this.f44966m = null;
                }
                AudioRecorderNative audioRecorderNative3 = this.f44965l;
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
                    this.f44965l.f();
                    this.f44965l = null;
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
            this.f44965l.f();
            this.f44965l = null;
        }
        Exception exc2 = exc;
        File file = this.f44956a;
        if (file.isFile()) {
            j3 = file.length();
        } else {
            j3 = 0;
        }
        int i10 = (this.f44973t > 0L ? 1 : (this.f44973t == 0L ? 0 : -1));
        pi.b bVar = this.d;
        if (i10 > 0) {
            bVar.b("RNNoise summary: frames=" + this.f44973t + ", averageMs=" + ((this.f44974u / this.f44973t) / 1000000.0d) + ", maxMs=" + (this.v / 1000000.0d));
        }
        bVar.b("capture stopped: samples=" + this.f44969p + ", durationMs=" + ((this.f44969p * 1000) / 48000) + ", bytes=" + j3);
        bc.e eVar = this.f44959e;
        if (exc2 == null) {
            long j10 = this.f44969p;
            t tVar = (t) eVar.f3855c;
            tVar.a((n) eVar.f3854b, j3);
            tVar.h.post(new to(eVar, eVar.f3853a, j10, 3));
        } else {
            ((t) eVar.f3855c).h.post(new pi.d(eVar, eVar.f3853a, exc2, 1));
        }
        this.f44960f.quitSafely();
    }

    public final void f() {
        this.f44963j = true;
        this.f44961g.postAtFrontOfQueue(new pi.a(this, 0));
    }
}

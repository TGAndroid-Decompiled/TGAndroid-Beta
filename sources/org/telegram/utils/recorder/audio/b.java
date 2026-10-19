package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.ui.eo;
import org.telegram.ui.yb0;
import ri.i;
import ri.j;
import ri.p;
public final class b {
    public final File f43831a;
    public final File f43832b;
    public final i f43833c;
    public final ri.b d;
    public final cc.e e;
    public final HandlerThread f43834f;
    public final Handler f43835g;
    public volatile boolean f43837j;
    public AudioRecord f43838k;
    public AudioRecorderNative f43839l;
    public AudioNoiseSuppressor f43840m;
    public boolean f43841n;
    public Exception f43842o;
    public long f43843p;
    public long f43844q;
    public long f43845r;
    public long f43847t;
    public long f43848u;
    public long v;
    public final ByteBuffer h = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
    public final ByteBuffer f43836i = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
    public double f43846s = -1.0d;

    public b(File file, File file2, i iVar, ri.b bVar, cc.e eVar) {
        this.f43831a = file;
        this.f43832b = file2;
        this.f43833c = iVar;
        this.d = bVar;
        this.e = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.f43834f = handlerThread;
        handlerThread.start();
        this.f43835g = new Handler(handlerThread.getLooper());
    }

    public static void a(b bVar) {
        long j10;
        double sqrt;
        final double d;
        if (!bVar.f43841n) {
            if (bVar.f43837j) {
                bVar.e();
                return;
            }
            try {
                bVar.h.clear();
                AudioRecord audioRecord = bVar.f43838k;
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
                    bVar.f43843p += i10;
                    bVar.f43846s = -1.0d;
                    bVar.c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - bVar.f43844q >= 100) {
                        j10 = bVar.f43839l.d();
                        bVar.f43844q = elapsedRealtime;
                    } else {
                        j10 = -1;
                    }
                    if (elapsedRealtime - bVar.f43845r >= 32) {
                        if (i10 == 0) {
                            sqrt = 0.0d;
                        } else {
                            sqrt = Math.sqrt(j11 / i10);
                        }
                        double d10 = bVar.f43846s;
                        if (d10 >= 0.0d) {
                            d = d10;
                        } else {
                            d = sqrt;
                        }
                        final cc.e eVar = bVar.e;
                        final long j13 = bVar.f43843p;
                        p pVar = (p) eVar.f5093c;
                        if (j10 >= 0) {
                            pVar.a((j) eVar.f5092b, j10);
                        }
                        Handler handler = pVar.h;
                        final long j14 = eVar.f5091a;
                        handler.post(new Runnable() {
                            @Override
                            public final void run() {
                                p pVar2 = (p) cc.e.this.f5093c;
                                if (j14 == pVar2.f45838o && pVar2.f45836m == n.f45821c) {
                                    pVar2.f45840q = j13;
                                    long j15 = pVar2.j();
                                    double d11 = d;
                                    if (d11 >= 0.0d) {
                                        pVar2.e.onRecordingProgress(j15, d11);
                                    }
                                }
                            }
                        });
                        bVar.f43845r = elapsedRealtime;
                    } else {
                        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i12 >= 0) {
                            final cc.e eVar2 = bVar.e;
                            final long j15 = bVar.f43843p;
                            p pVar2 = (p) eVar2.f5093c;
                            if (i12 >= 0) {
                                pVar2.a((j) eVar2.f5092b, j10);
                            }
                            Handler handler2 = pVar2.h;
                            final long j16 = eVar2.f5091a;
                            handler2.post(new Runnable() {
                                @Override
                                public final void run() {
                                    p pVar22 = (p) cc.e.this.f5093c;
                                    if (j16 == pVar22.f45838o && pVar22.f45836m == n.f45821c) {
                                        pVar22.f45840q = j15;
                                        long j152 = pVar22.j();
                                        double d11 = d;
                                        if (d11 >= 0.0d) {
                                            pVar22.e.onRecordingProgress(j152, d11);
                                        }
                                    }
                                }
                            });
                        }
                    }
                    bVar.f43835g.post(new ri.a(bVar, 1));
                    return;
                }
                throw new IllegalStateException("AudioRecord read failed: " + read);
            } catch (Throwable th2) {
                if (bVar.f43837j) {
                    bVar.e();
                    return;
                }
                bVar.d.a("capture failed", th2);
                bVar.f43837j = true;
                bVar.f43842o = b(th2);
                try {
                    bVar.e();
                } catch (Throwable th3) {
                    bVar.f43842o.addSuppressed(th3);
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
            ByteBuffer byteBuffer2 = this.f43836i;
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
        ByteBuffer byteBuffer = this.f43836i;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f43840m != null) {
            long nanoTime = System.nanoTime();
            int i11 = i10 / 2;
            boolean b10 = this.f43840m.b(i11, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f43847t++;
            this.f43848u += nanoTime2;
            this.v = Math.max(this.v, nanoTime2);
            ri.b bVar = this.d;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f43840m.c();
                this.f43840m = null;
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
                this.f43846s = sqrt;
                if (this.f43847t % 100 == 0) {
                    bVar.b("RNNoise processing: averageMs=" + ((this.f43848u / this.f43847t) / 1000000.0d) + ", maxMs=" + (this.v / 1000000.0d));
                }
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f43839l;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void e() {
        long j10;
        AudioRecorderNative audioRecorderNative;
        ByteBuffer byteBuffer = this.f43836i;
        if (this.f43841n) {
            return;
        }
        this.f43841n = true;
        Exception exc = this.f43842o;
        try {
            AudioRecord audioRecord = this.f43838k;
            if (audioRecord != null) {
                if (audioRecord.getRecordingState() == 3) {
                    this.f43838k.stop();
                }
                this.f43838k.release();
                this.f43838k = null;
            }
            if (this.f43839l != null && byteBuffer.position() > 0) {
                d(byteBuffer.position());
                byteBuffer.clear();
            }
            AudioNoiseSuppressor audioNoiseSuppressor = this.f43840m;
            if (audioNoiseSuppressor != null) {
                audioNoiseSuppressor.c();
                this.f43840m = null;
            }
            audioRecorderNative = this.f43839l;
        } catch (Throwable th2) {
            try {
                exc = b(th2);
                AudioNoiseSuppressor audioNoiseSuppressor2 = this.f43840m;
                if (audioNoiseSuppressor2 != null) {
                    audioNoiseSuppressor2.c();
                    this.f43840m = null;
                }
                AudioRecorderNative audioRecorderNative2 = this.f43839l;
                if (audioRecorderNative2 != null) {
                    try {
                        audioRecorderNative2.c();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th3) {
                if (this.f43840m != null) {
                    this.f43840m.c();
                    this.f43840m = null;
                }
                AudioRecorderNative audioRecorderNative3 = this.f43839l;
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
                    this.f43839l.f();
                    this.f43839l = null;
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
            this.f43839l.f();
            this.f43839l = null;
        }
        Exception exc2 = exc;
        File file = this.f43831a;
        if (file.isFile()) {
            j10 = file.length();
        } else {
            j10 = 0;
        }
        int i10 = (this.f43847t > 0L ? 1 : (this.f43847t == 0L ? 0 : -1));
        ri.b bVar = this.d;
        if (i10 > 0) {
            bVar.b("RNNoise summary: frames=" + this.f43847t + ", averageMs=" + ((this.f43848u / this.f43847t) / 1000000.0d) + ", maxMs=" + (this.v / 1000000.0d));
        }
        bVar.b("capture stopped: samples=" + this.f43843p + ", durationMs=" + ((this.f43843p * 1000) / 48000) + ", bytes=" + j10);
        cc.e eVar = this.e;
        if (exc2 == null) {
            long j11 = this.f43843p;
            p pVar = (p) eVar.f5093c;
            pVar.a((j) eVar.f5092b, j10);
            pVar.h.post(new eo(eVar, eVar.f5091a, j11, 3));
        } else {
            ((p) eVar.f5093c).h.post(new yb0(eVar, eVar.f5091a, exc2, 4));
        }
        this.f43834f.quitSafely();
    }

    public final void f() {
        this.f43837j = true;
        this.f43835g.postAtFrontOfQueue(new ri.a(this, 0));
    }
}

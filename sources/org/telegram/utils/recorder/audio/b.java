package org.telegram.utils.recorder.audio;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.ui.ac0;
import org.telegram.ui.go;
import ri.i;
import ri.j;
import ri.p;
public final class b {
    public final File f43837a;
    public final File f43838b;
    public final i f43839c;
    public final ri.b d;
    public final cc.e e;
    public final HandlerThread f43840f;
    public final Handler f43841g;
    public volatile boolean f43843j;
    public AudioRecord f43844k;
    public AudioRecorderNative f43845l;
    public AudioNoiseSuppressor f43846m;
    public boolean f43847n;
    public Exception f43848o;
    public long f43849p;
    public long f43850q;
    public long f43851r;
    public long f43853t;
    public long f43854u;
    public long v;
    public final ByteBuffer h = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
    public final ByteBuffer f43842i = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
    public double f43852s = -1.0d;

    public b(File file, File file2, i iVar, ri.b bVar, cc.e eVar) {
        this.f43837a = file;
        this.f43838b = file2;
        this.f43839c = iVar;
        this.d = bVar;
        this.e = eVar;
        HandlerThread handlerThread = new HandlerThread("AudioRecorderCapture", -16);
        this.f43840f = handlerThread;
        handlerThread.start();
        this.f43841g = new Handler(handlerThread.getLooper());
    }

    public static void a(b bVar) {
        long j10;
        double sqrt;
        final double d;
        if (!bVar.f43847n) {
            if (bVar.f43843j) {
                bVar.e();
                return;
            }
            try {
                bVar.h.clear();
                AudioRecord audioRecord = bVar.f43844k;
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
                    bVar.f43849p += i10;
                    bVar.f43852s = -1.0d;
                    bVar.c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - bVar.f43850q >= 100) {
                        j10 = bVar.f43845l.d();
                        bVar.f43850q = elapsedRealtime;
                    } else {
                        j10 = -1;
                    }
                    if (elapsedRealtime - bVar.f43851r >= 32) {
                        if (i10 == 0) {
                            sqrt = 0.0d;
                        } else {
                            sqrt = Math.sqrt(j11 / i10);
                        }
                        double d10 = bVar.f43852s;
                        if (d10 >= 0.0d) {
                            d = d10;
                        } else {
                            d = sqrt;
                        }
                        final cc.e eVar = bVar.e;
                        final long j13 = bVar.f43849p;
                        p pVar = (p) eVar.f5096c;
                        if (j10 >= 0) {
                            pVar.a((j) eVar.f5095b, j10);
                        }
                        Handler handler = pVar.h;
                        final long j14 = eVar.f5094a;
                        handler.post(new Runnable() {
                            @Override
                            public final void run() {
                                p pVar2 = (p) cc.e.this.f5096c;
                                if (j14 == pVar2.f45836o && pVar2.f45834m == n.f45819c) {
                                    pVar2.f45838q = j13;
                                    long j15 = pVar2.j();
                                    double d11 = d;
                                    if (d11 >= 0.0d) {
                                        pVar2.e.onRecordingProgress(j15, d11);
                                    }
                                }
                            }
                        });
                        bVar.f43851r = elapsedRealtime;
                    } else {
                        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i12 >= 0) {
                            final cc.e eVar2 = bVar.e;
                            final long j15 = bVar.f43849p;
                            p pVar2 = (p) eVar2.f5096c;
                            if (i12 >= 0) {
                                pVar2.a((j) eVar2.f5095b, j10);
                            }
                            Handler handler2 = pVar2.h;
                            final long j16 = eVar2.f5094a;
                            handler2.post(new Runnable() {
                                @Override
                                public final void run() {
                                    p pVar22 = (p) cc.e.this.f5096c;
                                    if (j16 == pVar22.f45836o && pVar22.f45834m == n.f45819c) {
                                        pVar22.f45838q = j15;
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
                    bVar.f43841g.post(new ri.a(bVar, 1));
                    return;
                }
                throw new IllegalStateException("AudioRecord read failed: " + read);
            } catch (Throwable th2) {
                if (bVar.f43843j) {
                    bVar.e();
                    return;
                }
                bVar.d.a("capture failed", th2);
                bVar.f43843j = true;
                bVar.f43848o = b(th2);
                try {
                    bVar.e();
                } catch (Throwable th3) {
                    bVar.f43848o.addSuppressed(th3);
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
            ByteBuffer byteBuffer2 = this.f43842i;
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
        ByteBuffer byteBuffer = this.f43842i;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        if (this.f43846m != null) {
            long nanoTime = System.nanoTime();
            int i11 = i10 / 2;
            boolean b10 = this.f43846m.b(i11, byteBuffer);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f43853t++;
            this.f43854u += nanoTime2;
            this.v = Math.max(this.v, nanoTime2);
            ri.b bVar = this.d;
            if (!b10) {
                bVar.b("RNNoise processing failed; recording unprocessed PCM");
                this.f43846m.c();
                this.f43846m = null;
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
                this.f43852s = sqrt;
                if (this.f43853t % 100 == 0) {
                    bVar.b("RNNoise processing: averageMs=" + ((this.f43854u / this.f43853t) / 1000000.0d) + ", maxMs=" + (this.v / 1000000.0d));
                }
            }
            byteBuffer.position(0);
            byteBuffer.limit(i10);
        }
        AudioRecorderNative audioRecorderNative = this.f43845l;
        if (audioRecorderNative != null && audioRecorderNative.g(byteBuffer, i10) != 0) {
            return;
        }
        throw new IllegalStateException("Native Opus encoding failed");
    }

    public final void e() {
        long j10;
        AudioRecorderNative audioRecorderNative;
        ByteBuffer byteBuffer = this.f43842i;
        if (this.f43847n) {
            return;
        }
        this.f43847n = true;
        Exception exc = this.f43848o;
        try {
            AudioRecord audioRecord = this.f43844k;
            if (audioRecord != null) {
                if (audioRecord.getRecordingState() == 3) {
                    this.f43844k.stop();
                }
                this.f43844k.release();
                this.f43844k = null;
            }
            if (this.f43845l != null && byteBuffer.position() > 0) {
                d(byteBuffer.position());
                byteBuffer.clear();
            }
            AudioNoiseSuppressor audioNoiseSuppressor = this.f43846m;
            if (audioNoiseSuppressor != null) {
                audioNoiseSuppressor.c();
                this.f43846m = null;
            }
            audioRecorderNative = this.f43845l;
        } catch (Throwable th2) {
            try {
                exc = b(th2);
                AudioNoiseSuppressor audioNoiseSuppressor2 = this.f43846m;
                if (audioNoiseSuppressor2 != null) {
                    audioNoiseSuppressor2.c();
                    this.f43846m = null;
                }
                AudioRecorderNative audioRecorderNative2 = this.f43845l;
                if (audioRecorderNative2 != null) {
                    try {
                        audioRecorderNative2.c();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th3) {
                if (this.f43846m != null) {
                    this.f43846m.c();
                    this.f43846m = null;
                }
                AudioRecorderNative audioRecorderNative3 = this.f43845l;
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
                    this.f43845l.f();
                    this.f43845l = null;
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
            this.f43845l.f();
            this.f43845l = null;
        }
        Exception exc2 = exc;
        File file = this.f43837a;
        if (file.isFile()) {
            j10 = file.length();
        } else {
            j10 = 0;
        }
        int i10 = (this.f43853t > 0L ? 1 : (this.f43853t == 0L ? 0 : -1));
        ri.b bVar = this.d;
        if (i10 > 0) {
            bVar.b("RNNoise summary: frames=" + this.f43853t + ", averageMs=" + ((this.f43854u / this.f43853t) / 1000000.0d) + ", maxMs=" + (this.v / 1000000.0d));
        }
        bVar.b("capture stopped: samples=" + this.f43849p + ", durationMs=" + ((this.f43849p * 1000) / 48000) + ", bytes=" + j10);
        cc.e eVar = this.e;
        if (exc2 == null) {
            long j11 = this.f43849p;
            p pVar = (p) eVar.f5096c;
            pVar.a((j) eVar.f5095b, j10);
            pVar.h.post(new go(eVar, eVar.f5094a, j11, 3));
        } else {
            ((p) eVar.f5096c).h.post(new ac0(eVar, eVar.f5094a, exc2, 4));
        }
        this.f43840f.quitSafely();
    }

    public final void f() {
        this.f43843j = true;
        this.f43841g.postAtFrontOfQueue(new ri.a(this, 0));
    }
}

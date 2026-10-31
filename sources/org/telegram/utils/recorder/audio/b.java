package org.telegram.utils.recorder.audio;

import a3.i0;
import ag.a3;
import java.io.File;
import java.nio.ByteBuffer;
import ki.g;
import ki.j;
import ki.k;
public final class b implements Runnable {
    public final int f44270a = 1;
    public final long f44271b;
    public final Object f44272c;
    public final Object d;

    public b(long j10, j jVar, k kVar) {
        this.f44272c = kVar;
        this.d = jVar;
        this.f44271b = j10;
    }

    @Override
    public final void run() {
        long j10;
        byte[] bArr;
        switch (this.f44270a) {
            case 0:
                d dVar = (d) this.f44272c;
                Exception exc = (Exception) this.d;
                g gVar = dVar.f44280g;
                ki.b bVar = dVar.f44279f;
                File file = dVar.f44276a;
                ByteBuffer byteBuffer = dVar.f44291s;
                if (!dVar.f44294w) {
                    dVar.f44294w = true;
                    Exception exc2 = dVar.v;
                    if (exc2 == null) {
                        exc2 = exc;
                    }
                    if (exc2 == null) {
                        try {
                            if (dVar.f44292t != null && byteBuffer.position() > 0) {
                                dVar.b(byteBuffer.position());
                                byteBuffer.clear();
                            }
                        } catch (Throwable th2) {
                            try {
                                exc2 = d.a(th2);
                                AudioNoiseSuppressor audioNoiseSuppressor = dVar.f44293u;
                                if (audioNoiseSuppressor != null) {
                                    audioNoiseSuppressor.c();
                                    dVar.f44293u = null;
                                }
                                AudioRecorderNative audioRecorderNative = dVar.f44292t;
                                if (audioRecorderNative != null) {
                                    try {
                                        audioRecorderNative.c();
                                    } catch (Throwable unused) {
                                    }
                                }
                            } catch (Throwable th3) {
                                if (dVar.f44293u != null) {
                                    dVar.f44293u.c();
                                    dVar.f44293u = null;
                                }
                                AudioRecorderNative audioRecorderNative2 = dVar.f44292t;
                                if (audioRecorderNative2 != null) {
                                    try {
                                        if (!audioRecorderNative2.c() && exc2 == null) {
                                            new IllegalStateException("Unable to finalize native Opus recorder");
                                        }
                                    } catch (Throwable th4) {
                                        if (exc2 == null) {
                                            d.a(th4);
                                        }
                                    }
                                    dVar.f44292t.f();
                                    dVar.f44292t = null;
                                }
                                throw th3;
                            }
                        }
                    }
                    AudioNoiseSuppressor audioNoiseSuppressor2 = dVar.f44293u;
                    if (audioNoiseSuppressor2 != null) {
                        audioNoiseSuppressor2.c();
                        dVar.f44293u = null;
                    }
                    AudioRecorderNative audioRecorderNative3 = dVar.f44292t;
                    if (audioRecorderNative3 != null) {
                        try {
                            if (!audioRecorderNative3.c() && exc2 == null) {
                                exc2 = new IllegalStateException("Unable to finalize native Opus recorder");
                            }
                        } catch (Throwable th5) {
                            if (exc2 == null) {
                                exc2 = d.a(th5);
                            }
                        }
                        dVar.f44292t.f();
                        dVar.f44292t = null;
                    }
                    if (file.isFile()) {
                        j10 = file.length();
                    } else {
                        j10 = 0;
                    }
                    if (dVar.f44297z > 0) {
                        bVar.b("RNNoise summary: frames=" + dVar.f44297z + ", averageMs=" + ((dVar.A / dVar.f44297z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                    }
                    Exception exc3 = exc2;
                    long j11 = this.f44271b;
                    StringBuilder s10 = a1.g.s(j11, "capture stopped: samples=", ", durationMs=");
                    s10.append((1000 * j11) / 48000);
                    s10.append(", bytes=");
                    s10.append(j10);
                    s10.append(", maxQueuedChunks=");
                    s10.append(dVar.f44296y);
                    bVar.b(s10.toString());
                    if (exc3 == null) {
                        k kVar = (k) gVar.f11405c;
                        kVar.a((j) gVar.f11404b, j10);
                        kVar.f11417i.post(new ki.d(gVar, gVar.f11403a, j11, 1));
                    } else {
                        ((k) gVar.f11405c).f11417i.post(new i0(gVar, gVar.f11403a, exc3, 2));
                    }
                    dVar.f44282j.quitSafely();
                    dVar.f44284l.clear();
                    return;
                }
                return;
            default:
                k kVar2 = (k) this.f44272c;
                j jVar = (j) this.d;
                try {
                    bArr = AudioRecorderNative.e(jVar.f11410b.getAbsolutePath());
                } catch (Throwable th6) {
                    kVar2.h.a("final waveform extraction failed", th6);
                    bArr = null;
                }
                kVar2.f11417i.post(new a3(kVar2, jVar, this.f44271b, bArr, 2));
                return;
        }
    }

    public b(d dVar, long j10, Exception exc) {
        this.f44272c = dVar;
        this.f44271b = j10;
        this.d = exc;
    }
}

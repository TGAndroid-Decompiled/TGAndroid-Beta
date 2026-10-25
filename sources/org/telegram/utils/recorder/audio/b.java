package org.telegram.utils.recorder.audio;

import a1.g;
import bi.y2;
import java.io.File;
import java.nio.ByteBuffer;
import org.telegram.ui.bc0;
import org.telegram.ui.io;
import ui.i;
import ui.o;
public final class b implements Runnable {
    public final int f46398a = 1;
    public final long f46399b;
    public final Object f46400c;
    public final Object d;

    public b(long j10, i iVar, o oVar) {
        this.f46400c = oVar;
        this.d = iVar;
        this.f46399b = j10;
    }

    @Override
    public final void run() {
        long j10;
        byte[] bArr;
        switch (this.f46398a) {
            case 0:
                d dVar = (d) this.f46400c;
                Exception exc = (Exception) this.d;
                dc.e eVar = dVar.f46408g;
                ui.b bVar = dVar.f46407f;
                File file = dVar.f46404a;
                ByteBuffer byteBuffer = dVar.f46419s;
                if (!dVar.f46422w) {
                    dVar.f46422w = true;
                    Exception exc2 = dVar.v;
                    if (exc2 == null) {
                        exc2 = exc;
                    }
                    if (exc2 == null) {
                        try {
                            if (dVar.f46420t != null && byteBuffer.position() > 0) {
                                dVar.b(byteBuffer.position());
                                byteBuffer.clear();
                            }
                        } catch (Throwable th2) {
                            try {
                                exc2 = d.a(th2);
                                AudioNoiseSuppressor audioNoiseSuppressor = dVar.f46421u;
                                if (audioNoiseSuppressor != null) {
                                    audioNoiseSuppressor.c();
                                    dVar.f46421u = null;
                                }
                                AudioRecorderNative audioRecorderNative = dVar.f46420t;
                                if (audioRecorderNative != null) {
                                    try {
                                        audioRecorderNative.c();
                                    } catch (Throwable unused) {
                                    }
                                }
                            } catch (Throwable th3) {
                                if (dVar.f46421u != null) {
                                    dVar.f46421u.c();
                                    dVar.f46421u = null;
                                }
                                AudioRecorderNative audioRecorderNative2 = dVar.f46420t;
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
                                    dVar.f46420t.f();
                                    dVar.f46420t = null;
                                }
                                throw th3;
                            }
                        }
                    }
                    AudioNoiseSuppressor audioNoiseSuppressor2 = dVar.f46421u;
                    if (audioNoiseSuppressor2 != null) {
                        audioNoiseSuppressor2.c();
                        dVar.f46421u = null;
                    }
                    AudioRecorderNative audioRecorderNative3 = dVar.f46420t;
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
                        dVar.f46420t.f();
                        dVar.f46420t = null;
                    }
                    if (file.isFile()) {
                        j10 = file.length();
                    } else {
                        j10 = 0;
                    }
                    if (dVar.f46425z > 0) {
                        bVar.b("RNNoise summary: frames=" + dVar.f46425z + ", averageMs=" + ((dVar.A / dVar.f46425z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                    }
                    Exception exc3 = exc2;
                    long j11 = this.f46399b;
                    StringBuilder t10 = g.t(j11, "capture stopped: samples=", ", durationMs=");
                    t10.append((1000 * j11) / 48000);
                    t10.append(", bytes=");
                    t10.append(j10);
                    t10.append(", maxQueuedChunks=");
                    t10.append(dVar.f46424y);
                    bVar.b(t10.toString());
                    if (exc3 == null) {
                        o oVar = (o) eVar.f8321c;
                        oVar.a((i) eVar.f8320b, j10);
                        oVar.f49951i.post(new io(eVar, eVar.f8319a, j11, 3));
                    } else {
                        ((o) eVar.f8321c).f49951i.post(new bc0(eVar, eVar.f8319a, exc3, 3));
                    }
                    dVar.f46410j.quitSafely();
                    dVar.f46412l.clear();
                    return;
                }
                return;
            default:
                o oVar2 = (o) this.f46400c;
                i iVar = (i) this.d;
                try {
                    bArr = AudioRecorderNative.e(iVar.f49930b.getAbsolutePath());
                } catch (Throwable th6) {
                    oVar2.h.a("final waveform extraction failed", th6);
                    bArr = null;
                }
                oVar2.f49951i.post(new y2(oVar2, iVar, this.f46399b, bArr, 27));
                return;
        }
    }

    public b(d dVar, long j10, Exception exc) {
        this.f46400c = dVar;
        this.f46399b = j10;
        this.d = exc;
    }
}

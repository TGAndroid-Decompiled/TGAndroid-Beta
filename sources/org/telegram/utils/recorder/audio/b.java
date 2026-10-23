package org.telegram.utils.recorder.audio;

import a1.g;
import ai.c3;
import java.io.File;
import java.nio.ByteBuffer;
import org.telegram.ui.eo;
import org.telegram.ui.yb0;
import ri.i;
import ri.o;
public final class b implements Runnable {
    public final int f43841a = 1;
    public final long f43842b;
    public final Object f43843c;
    public final Object d;

    public b(long j10, i iVar, o oVar) {
        this.f43843c = oVar;
        this.d = iVar;
        this.f43842b = j10;
    }

    @Override
    public final void run() {
        long j10;
        byte[] bArr;
        switch (this.f43841a) {
            case 0:
                d dVar = (d) this.f43843c;
                Exception exc = (Exception) this.d;
                cc.e eVar = dVar.f43851g;
                ri.b bVar = dVar.f43850f;
                File file = dVar.f43847a;
                ByteBuffer byteBuffer = dVar.f43862s;
                if (!dVar.f43865w) {
                    dVar.f43865w = true;
                    Exception exc2 = dVar.v;
                    if (exc2 == null) {
                        exc2 = exc;
                    }
                    if (exc2 == null) {
                        try {
                            if (dVar.f43863t != null && byteBuffer.position() > 0) {
                                dVar.b(byteBuffer.position());
                                byteBuffer.clear();
                            }
                        } catch (Throwable th2) {
                            try {
                                exc2 = d.a(th2);
                                AudioNoiseSuppressor audioNoiseSuppressor = dVar.f43864u;
                                if (audioNoiseSuppressor != null) {
                                    audioNoiseSuppressor.c();
                                    dVar.f43864u = null;
                                }
                                AudioRecorderNative audioRecorderNative = dVar.f43863t;
                                if (audioRecorderNative != null) {
                                    try {
                                        audioRecorderNative.c();
                                    } catch (Throwable unused) {
                                    }
                                }
                            } catch (Throwable th3) {
                                if (dVar.f43864u != null) {
                                    dVar.f43864u.c();
                                    dVar.f43864u = null;
                                }
                                AudioRecorderNative audioRecorderNative2 = dVar.f43863t;
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
                                    dVar.f43863t.f();
                                    dVar.f43863t = null;
                                }
                                throw th3;
                            }
                        }
                    }
                    AudioNoiseSuppressor audioNoiseSuppressor2 = dVar.f43864u;
                    if (audioNoiseSuppressor2 != null) {
                        audioNoiseSuppressor2.c();
                        dVar.f43864u = null;
                    }
                    AudioRecorderNative audioRecorderNative3 = dVar.f43863t;
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
                        dVar.f43863t.f();
                        dVar.f43863t = null;
                    }
                    if (file.isFile()) {
                        j10 = file.length();
                    } else {
                        j10 = 0;
                    }
                    if (dVar.f43868z > 0) {
                        bVar.b("RNNoise summary: frames=" + dVar.f43868z + ", averageMs=" + ((dVar.A / dVar.f43868z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                    }
                    Exception exc3 = exc2;
                    long j11 = this.f43842b;
                    StringBuilder t10 = g.t(j11, "capture stopped: samples=", ", durationMs=");
                    t10.append((1000 * j11) / 48000);
                    t10.append(", bytes=");
                    t10.append(j10);
                    t10.append(", maxQueuedChunks=");
                    t10.append(dVar.f43867y);
                    bVar.b(t10.toString());
                    if (exc3 == null) {
                        o oVar = (o) eVar.f5093c;
                        oVar.a((i) eVar.f5092b, j10);
                        oVar.f45841i.post(new eo(eVar, eVar.f5091a, j11, 3));
                    } else {
                        ((o) eVar.f5093c).f45841i.post(new yb0(eVar, eVar.f5091a, exc3, 3));
                    }
                    dVar.f43853j.quitSafely();
                    dVar.f43855l.clear();
                    return;
                }
                return;
            default:
                o oVar2 = (o) this.f43843c;
                i iVar = (i) this.d;
                try {
                    bArr = AudioRecorderNative.e(iVar.f45820b.getAbsolutePath());
                } catch (Throwable th6) {
                    oVar2.h.a("final waveform extraction failed", th6);
                    bArr = null;
                }
                oVar2.f45841i.post(new c3(oVar2, iVar, this.f43842b, bArr, 27));
                return;
        }
    }

    public b(d dVar, long j10, Exception exc) {
        this.f43843c = dVar;
        this.f43842b = j10;
        this.d = exc;
    }
}

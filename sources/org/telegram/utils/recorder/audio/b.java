package org.telegram.utils.recorder.audio;

import a1.g;
import ai.c3;
import java.io.File;
import java.nio.ByteBuffer;
import org.telegram.ui.ec0;
import org.telegram.ui.go;
import ri.i;
import ri.o;
public final class b implements Runnable {
    public final int f44256a = 1;
    public final long f44257b;
    public final Object f44258c;
    public final Object d;

    public b(long j10, i iVar, o oVar) {
        this.f44258c = oVar;
        this.d = iVar;
        this.f44257b = j10;
    }

    @Override
    public final void run() {
        long j10;
        byte[] bArr;
        switch (this.f44256a) {
            case 0:
                d dVar = (d) this.f44258c;
                Exception exc = (Exception) this.d;
                cc.e eVar = dVar.f44266g;
                ri.b bVar = dVar.f44265f;
                File file = dVar.f44262a;
                ByteBuffer byteBuffer = dVar.f44277s;
                if (!dVar.f44280w) {
                    dVar.f44280w = true;
                    Exception exc2 = dVar.v;
                    if (exc2 == null) {
                        exc2 = exc;
                    }
                    if (exc2 == null) {
                        try {
                            if (dVar.f44278t != null && byteBuffer.position() > 0) {
                                dVar.b(byteBuffer.position());
                                byteBuffer.clear();
                            }
                        } catch (Throwable th2) {
                            try {
                                exc2 = d.a(th2);
                                AudioNoiseSuppressor audioNoiseSuppressor = dVar.f44279u;
                                if (audioNoiseSuppressor != null) {
                                    audioNoiseSuppressor.c();
                                    dVar.f44279u = null;
                                }
                                AudioRecorderNative audioRecorderNative = dVar.f44278t;
                                if (audioRecorderNative != null) {
                                    try {
                                        audioRecorderNative.c();
                                    } catch (Throwable unused) {
                                    }
                                }
                            } catch (Throwable th3) {
                                if (dVar.f44279u != null) {
                                    dVar.f44279u.c();
                                    dVar.f44279u = null;
                                }
                                AudioRecorderNative audioRecorderNative2 = dVar.f44278t;
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
                                    dVar.f44278t.f();
                                    dVar.f44278t = null;
                                }
                                throw th3;
                            }
                        }
                    }
                    AudioNoiseSuppressor audioNoiseSuppressor2 = dVar.f44279u;
                    if (audioNoiseSuppressor2 != null) {
                        audioNoiseSuppressor2.c();
                        dVar.f44279u = null;
                    }
                    AudioRecorderNative audioRecorderNative3 = dVar.f44278t;
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
                        dVar.f44278t.f();
                        dVar.f44278t = null;
                    }
                    if (file.isFile()) {
                        j10 = file.length();
                    } else {
                        j10 = 0;
                    }
                    if (dVar.f44283z > 0) {
                        bVar.b("RNNoise summary: frames=" + dVar.f44283z + ", averageMs=" + ((dVar.A / dVar.f44283z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                    }
                    Exception exc3 = exc2;
                    long j11 = this.f44257b;
                    StringBuilder t10 = g.t(j11, "capture stopped: samples=", ", durationMs=");
                    t10.append((1000 * j11) / 48000);
                    t10.append(", bytes=");
                    t10.append(j10);
                    t10.append(", maxQueuedChunks=");
                    t10.append(dVar.f44282y);
                    bVar.b(t10.toString());
                    if (exc3 == null) {
                        o oVar = (o) eVar.f5098c;
                        oVar.a((i) eVar.f5097b, j10);
                        oVar.f46262i.post(new go(eVar, eVar.f5096a, j11, 3));
                    } else {
                        ((o) eVar.f5098c).f46262i.post(new ec0(eVar, eVar.f5096a, exc3, 3));
                    }
                    dVar.f44268j.quitSafely();
                    dVar.f44270l.clear();
                    return;
                }
                return;
            default:
                o oVar2 = (o) this.f44258c;
                i iVar = (i) this.d;
                try {
                    bArr = AudioRecorderNative.e(iVar.f46241b.getAbsolutePath());
                } catch (Throwable th6) {
                    oVar2.h.a("final waveform extraction failed", th6);
                    bArr = null;
                }
                oVar2.f46262i.post(new c3(oVar2, iVar, this.f44257b, bArr, 27));
                return;
        }
    }

    public b(d dVar, long j10, Exception exc) {
        this.f44258c = dVar;
        this.f44257b = j10;
        this.d = exc;
    }
}

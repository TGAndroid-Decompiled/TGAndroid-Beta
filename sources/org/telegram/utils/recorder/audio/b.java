package org.telegram.utils.recorder.audio;

import a8.p0;
import bi.w2;
import java.io.File;
import java.nio.ByteBuffer;
import org.telegram.messenger.yk;
import org.telegram.ui.ea0;
import vi.g;
import vi.h;
public final class b implements Runnable {
    public final int f52685a = 1;
    public final long f52686b;
    public final Object f52687c;
    public final Object d;

    public b(long j3, g gVar, h hVar) {
        this.f52687c = hVar;
        this.d = gVar;
        this.f52686b = j3;
    }

    @Override
    public final void run() {
        long j3;
        byte[] bArr;
        switch (this.f52685a) {
            case 0:
                d dVar = (d) this.f52687c;
                Exception exc = (Exception) this.d;
                ac.e eVar = dVar.f52696g;
                vi.b bVar = dVar.f52695f;
                File file = dVar.f52691a;
                ByteBuffer byteBuffer = dVar.f52707s;
                if (!dVar.f52710w) {
                    dVar.f52710w = true;
                    Exception exc2 = dVar.v;
                    if (exc2 == null) {
                        exc2 = exc;
                    }
                    if (exc2 == null) {
                        try {
                            if (dVar.f52708t != null && byteBuffer.position() > 0) {
                                dVar.b(byteBuffer.position());
                                byteBuffer.clear();
                            }
                        } catch (Throwable th2) {
                            try {
                                exc2 = d.a(th2);
                                AudioNoiseSuppressor audioNoiseSuppressor = dVar.f52709u;
                                if (audioNoiseSuppressor != null) {
                                    audioNoiseSuppressor.c();
                                    dVar.f52709u = null;
                                }
                                AudioRecorderNative audioRecorderNative = dVar.f52708t;
                                if (audioRecorderNative != null) {
                                    try {
                                        audioRecorderNative.c();
                                    } catch (Throwable unused) {
                                    }
                                }
                            } catch (Throwable th3) {
                                if (dVar.f52709u != null) {
                                    dVar.f52709u.c();
                                    dVar.f52709u = null;
                                }
                                AudioRecorderNative audioRecorderNative2 = dVar.f52708t;
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
                                    dVar.f52708t.f();
                                    dVar.f52708t = null;
                                }
                                throw th3;
                            }
                        }
                    }
                    AudioNoiseSuppressor audioNoiseSuppressor2 = dVar.f52709u;
                    if (audioNoiseSuppressor2 != null) {
                        audioNoiseSuppressor2.c();
                        dVar.f52709u = null;
                    }
                    AudioRecorderNative audioRecorderNative3 = dVar.f52708t;
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
                        dVar.f52708t.f();
                        dVar.f52708t = null;
                    }
                    if (file.isFile()) {
                        j3 = file.length();
                    } else {
                        j3 = 0;
                    }
                    if (dVar.f52713z > 0) {
                        bVar.b("RNNoise summary: frames=" + dVar.f52713z + ", averageMs=" + ((dVar.A / dVar.f52713z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                    }
                    Exception exc3 = exc2;
                    long j10 = this.f52686b;
                    StringBuilder t6 = p0.t(j10, "capture stopped: samples=", ", durationMs=");
                    t6.append((1000 * j10) / 48000);
                    t6.append(", bytes=");
                    t6.append(j3);
                    t6.append(", maxQueuedChunks=");
                    t6.append(dVar.f52712y);
                    bVar.b(t6.toString());
                    if (exc3 == null) {
                        h hVar = (h) eVar.f1025c;
                        hVar.a((g) eVar.f1024b, j3);
                        hVar.f57430i.post(new yk(eVar, eVar.f1023a, j10, 4));
                    } else {
                        ((h) eVar.f1025c).f57430i.post(new ea0(eVar, eVar.f1023a, exc3, 3));
                    }
                    dVar.f52698j.quitSafely();
                    dVar.f52700l.clear();
                    return;
                }
                return;
            default:
                h hVar2 = (h) this.f52687c;
                g gVar = (g) this.d;
                try {
                    bArr = AudioRecorderNative.e(gVar.f57421b.getAbsolutePath());
                } catch (Throwable th6) {
                    hVar2.h.a("final waveform extraction failed", th6);
                    bArr = null;
                }
                hVar2.f57430i.post(new w2(hVar2, gVar, this.f52686b, bArr, 27));
                return;
        }
    }

    public b(d dVar, long j3, Exception exc) {
        this.f52687c = dVar;
        this.f52686b = j3;
        this.d = exc;
    }
}

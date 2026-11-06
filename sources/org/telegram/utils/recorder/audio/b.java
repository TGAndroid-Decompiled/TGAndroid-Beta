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
    public final int f52709a = 1;
    public final long f52710b;
    public final Object f52711c;
    public final Object d;

    public b(long j3, g gVar, h hVar) {
        this.f52711c = hVar;
        this.d = gVar;
        this.f52710b = j3;
    }

    @Override
    public final void run() {
        long j3;
        byte[] bArr;
        switch (this.f52709a) {
            case 0:
                d dVar = (d) this.f52711c;
                Exception exc = (Exception) this.d;
                ac.e eVar = dVar.f52720g;
                vi.b bVar = dVar.f52719f;
                File file = dVar.f52715a;
                ByteBuffer byteBuffer = dVar.f52731s;
                if (!dVar.f52734w) {
                    dVar.f52734w = true;
                    Exception exc2 = dVar.v;
                    if (exc2 == null) {
                        exc2 = exc;
                    }
                    if (exc2 == null) {
                        try {
                            if (dVar.f52732t != null && byteBuffer.position() > 0) {
                                dVar.b(byteBuffer.position());
                                byteBuffer.clear();
                            }
                        } catch (Throwable th2) {
                            try {
                                exc2 = d.a(th2);
                                AudioNoiseSuppressor audioNoiseSuppressor = dVar.f52733u;
                                if (audioNoiseSuppressor != null) {
                                    audioNoiseSuppressor.c();
                                    dVar.f52733u = null;
                                }
                                AudioRecorderNative audioRecorderNative = dVar.f52732t;
                                if (audioRecorderNative != null) {
                                    try {
                                        audioRecorderNative.c();
                                    } catch (Throwable unused) {
                                    }
                                }
                            } catch (Throwable th3) {
                                if (dVar.f52733u != null) {
                                    dVar.f52733u.c();
                                    dVar.f52733u = null;
                                }
                                AudioRecorderNative audioRecorderNative2 = dVar.f52732t;
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
                                    dVar.f52732t.f();
                                    dVar.f52732t = null;
                                }
                                throw th3;
                            }
                        }
                    }
                    AudioNoiseSuppressor audioNoiseSuppressor2 = dVar.f52733u;
                    if (audioNoiseSuppressor2 != null) {
                        audioNoiseSuppressor2.c();
                        dVar.f52733u = null;
                    }
                    AudioRecorderNative audioRecorderNative3 = dVar.f52732t;
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
                        dVar.f52732t.f();
                        dVar.f52732t = null;
                    }
                    if (file.isFile()) {
                        j3 = file.length();
                    } else {
                        j3 = 0;
                    }
                    if (dVar.f52737z > 0) {
                        bVar.b("RNNoise summary: frames=" + dVar.f52737z + ", averageMs=" + ((dVar.A / dVar.f52737z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                    }
                    Exception exc3 = exc2;
                    long j10 = this.f52710b;
                    StringBuilder t6 = p0.t(j10, "capture stopped: samples=", ", durationMs=");
                    t6.append((1000 * j10) / 48000);
                    t6.append(", bytes=");
                    t6.append(j3);
                    t6.append(", maxQueuedChunks=");
                    t6.append(dVar.f52736y);
                    bVar.b(t6.toString());
                    if (exc3 == null) {
                        h hVar = (h) eVar.f1025c;
                        hVar.a((g) eVar.f1024b, j3);
                        hVar.f57454i.post(new yk(eVar, eVar.f1023a, j10, 4));
                    } else {
                        ((h) eVar.f1025c).f57454i.post(new ea0(eVar, eVar.f1023a, exc3, 3));
                    }
                    dVar.f52722j.quitSafely();
                    dVar.f52724l.clear();
                    return;
                }
                return;
            default:
                h hVar2 = (h) this.f52711c;
                g gVar = (g) this.d;
                try {
                    bArr = AudioRecorderNative.e(gVar.f57445b.getAbsolutePath());
                } catch (Throwable th6) {
                    hVar2.h.a("final waveform extraction failed", th6);
                    bArr = null;
                }
                hVar2.f57454i.post(new w2(hVar2, gVar, this.f52710b, bArr, 27));
                return;
        }
    }

    public b(d dVar, long j3, Exception exc) {
        this.f52711c = dVar;
        this.f52710b = j3;
        this.d = exc;
    }
}

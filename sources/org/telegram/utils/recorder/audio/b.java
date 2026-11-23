package org.telegram.utils.recorder.audio;

import a8.p0;
import ai.c0;
import di.j2;
import java.io.File;
import java.nio.ByteBuffer;
import org.telegram.ui.f80;
import yi.h;
import yi.j;
public final class b implements Runnable {
    public final int f54764a = 1;
    public final long f54765b;
    public final Object f54766c;
    public final Object d;

    public b(long j3, h hVar, j jVar) {
        this.f54766c = jVar;
        this.d = hVar;
        this.f54765b = j3;
    }

    @Override
    public final void run() {
        long j3;
        byte[] bArr;
        switch (this.f54764a) {
            case 0:
                d dVar = (d) this.f54766c;
                Exception exc = (Exception) this.d;
                ac.e eVar = dVar.f54775g;
                yi.b bVar = dVar.f54774f;
                File file = dVar.f54770a;
                ByteBuffer byteBuffer = dVar.f54786s;
                if (!dVar.f54789w) {
                    dVar.f54789w = true;
                    Exception exc2 = dVar.v;
                    if (exc2 == null) {
                        exc2 = exc;
                    }
                    if (exc2 == null) {
                        try {
                            if (dVar.f54787t != null && byteBuffer.position() > 0) {
                                dVar.b(byteBuffer.position());
                                byteBuffer.clear();
                            }
                        } catch (Throwable th2) {
                            try {
                                exc2 = d.a(th2);
                                AudioNoiseSuppressor audioNoiseSuppressor = dVar.f54788u;
                                if (audioNoiseSuppressor != null) {
                                    audioNoiseSuppressor.c();
                                    dVar.f54788u = null;
                                }
                                AudioRecorderNative audioRecorderNative = dVar.f54787t;
                                if (audioRecorderNative != null) {
                                    try {
                                        audioRecorderNative.c();
                                    } catch (Throwable unused) {
                                    }
                                }
                            } catch (Throwable th3) {
                                if (dVar.f54788u != null) {
                                    dVar.f54788u.c();
                                    dVar.f54788u = null;
                                }
                                AudioRecorderNative audioRecorderNative2 = dVar.f54787t;
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
                                    dVar.f54787t.f();
                                    dVar.f54787t = null;
                                }
                                throw th3;
                            }
                        }
                    }
                    AudioNoiseSuppressor audioNoiseSuppressor2 = dVar.f54788u;
                    if (audioNoiseSuppressor2 != null) {
                        audioNoiseSuppressor2.c();
                        dVar.f54788u = null;
                    }
                    AudioRecorderNative audioRecorderNative3 = dVar.f54787t;
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
                        dVar.f54787t.f();
                        dVar.f54787t = null;
                    }
                    if (file.isFile()) {
                        j3 = file.length();
                    } else {
                        j3 = 0;
                    }
                    if (dVar.f54792z > 0) {
                        bVar.b("RNNoise summary: frames=" + dVar.f54792z + ", averageMs=" + ((dVar.A / dVar.f54792z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                    }
                    Exception exc3 = exc2;
                    long j10 = this.f54765b;
                    StringBuilder t6 = p0.t(j10, "capture stopped: samples=", ", durationMs=");
                    t6.append((1000 * j10) / 48000);
                    t6.append(", bytes=");
                    t6.append(j3);
                    t6.append(", maxQueuedChunks=");
                    t6.append(dVar.f54791y);
                    bVar.b(t6.toString());
                    if (exc3 == null) {
                        j jVar = (j) eVar.f1022c;
                        jVar.a((h) eVar.f1021b, j3);
                        jVar.f61452i.post(new c0(eVar, eVar.f1020a, j10, 5));
                    } else {
                        ((j) eVar.f1022c).f61452i.post(new f80(eVar, eVar.f1020a, exc3, 4));
                    }
                    dVar.f54777j.quitSafely();
                    dVar.f54779l.clear();
                    return;
                }
                return;
            default:
                j jVar2 = (j) this.f54766c;
                h hVar = (h) this.d;
                try {
                    bArr = AudioRecorderNative.e(hVar.f61443b.getAbsolutePath());
                } catch (Throwable th6) {
                    jVar2.h.a("final waveform extraction failed", th6);
                    bArr = null;
                }
                jVar2.f61452i.post(new j2(jVar2, hVar, this.f54765b, bArr, 26));
                return;
        }
    }

    public b(d dVar, long j3, Exception exc) {
        this.f54766c = dVar;
        this.f54765b = j3;
        this.d = exc;
    }
}

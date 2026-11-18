package org.telegram.utils.recorder.audio;

import a8.p0;
import ai.f0;
import di.i2;
import java.io.File;
import java.nio.ByteBuffer;
import org.telegram.ui.g80;
import yi.h;
import yi.j;
public final class b implements Runnable {
    public final int f54638a = 1;
    public final long f54639b;
    public final Object f54640c;
    public final Object d;

    public b(long j3, h hVar, j jVar) {
        this.f54640c = jVar;
        this.d = hVar;
        this.f54639b = j3;
    }

    @Override
    public final void run() {
        long j3;
        byte[] bArr;
        switch (this.f54638a) {
            case 0:
                d dVar = (d) this.f54640c;
                Exception exc = (Exception) this.d;
                ac.e eVar = dVar.f54649g;
                yi.b bVar = dVar.f54648f;
                File file = dVar.f54644a;
                ByteBuffer byteBuffer = dVar.f54660s;
                if (!dVar.f54663w) {
                    dVar.f54663w = true;
                    Exception exc2 = dVar.v;
                    if (exc2 == null) {
                        exc2 = exc;
                    }
                    if (exc2 == null) {
                        try {
                            if (dVar.f54661t != null && byteBuffer.position() > 0) {
                                dVar.b(byteBuffer.position());
                                byteBuffer.clear();
                            }
                        } catch (Throwable th2) {
                            try {
                                exc2 = d.a(th2);
                                AudioNoiseSuppressor audioNoiseSuppressor = dVar.f54662u;
                                if (audioNoiseSuppressor != null) {
                                    audioNoiseSuppressor.c();
                                    dVar.f54662u = null;
                                }
                                AudioRecorderNative audioRecorderNative = dVar.f54661t;
                                if (audioRecorderNative != null) {
                                    try {
                                        audioRecorderNative.c();
                                    } catch (Throwable unused) {
                                    }
                                }
                            } catch (Throwable th3) {
                                if (dVar.f54662u != null) {
                                    dVar.f54662u.c();
                                    dVar.f54662u = null;
                                }
                                AudioRecorderNative audioRecorderNative2 = dVar.f54661t;
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
                                    dVar.f54661t.f();
                                    dVar.f54661t = null;
                                }
                                throw th3;
                            }
                        }
                    }
                    AudioNoiseSuppressor audioNoiseSuppressor2 = dVar.f54662u;
                    if (audioNoiseSuppressor2 != null) {
                        audioNoiseSuppressor2.c();
                        dVar.f54662u = null;
                    }
                    AudioRecorderNative audioRecorderNative3 = dVar.f54661t;
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
                        dVar.f54661t.f();
                        dVar.f54661t = null;
                    }
                    if (file.isFile()) {
                        j3 = file.length();
                    } else {
                        j3 = 0;
                    }
                    if (dVar.f54666z > 0) {
                        bVar.b("RNNoise summary: frames=" + dVar.f54666z + ", averageMs=" + ((dVar.A / dVar.f54666z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                    }
                    Exception exc3 = exc2;
                    long j10 = this.f54639b;
                    StringBuilder t6 = p0.t(j10, "capture stopped: samples=", ", durationMs=");
                    t6.append((1000 * j10) / 48000);
                    t6.append(", bytes=");
                    t6.append(j3);
                    t6.append(", maxQueuedChunks=");
                    t6.append(dVar.f54665y);
                    bVar.b(t6.toString());
                    if (exc3 == null) {
                        j jVar = (j) eVar.f1022c;
                        jVar.a((h) eVar.f1021b, j3);
                        jVar.f61323i.post(new f0(eVar, eVar.f1020a, j10, 5));
                    } else {
                        ((j) eVar.f1022c).f61323i.post(new g80(eVar, eVar.f1020a, exc3, 4));
                    }
                    dVar.f54651j.quitSafely();
                    dVar.f54653l.clear();
                    return;
                }
                return;
            default:
                j jVar2 = (j) this.f54640c;
                h hVar = (h) this.d;
                try {
                    bArr = AudioRecorderNative.e(hVar.f61314b.getAbsolutePath());
                } catch (Throwable th6) {
                    jVar2.h.a("final waveform extraction failed", th6);
                    bArr = null;
                }
                jVar2.f61323i.post(new i2(jVar2, hVar, this.f54639b, bArr, 26));
                return;
        }
    }

    public b(d dVar, long j3, Exception exc) {
        this.f54640c = dVar;
        this.f54639b = j3;
        this.d = exc;
    }
}

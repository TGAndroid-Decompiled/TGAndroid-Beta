package org.telegram.utils.recorder.audio;

import a8.p0;
import ai.e0;
import di.f2;
import java.io.File;
import java.nio.ByteBuffer;
import org.telegram.ui.d80;
import yi.i;
import yi.j;
public final class b implements Runnable {
    public final int f54119a = 1;
    public final long f54120b;
    public final Object f54121c;
    public final Object d;

    public b(long j3, i iVar, j jVar) {
        this.f54121c = jVar;
        this.d = iVar;
        this.f54120b = j3;
    }

    @Override
    public final void run() {
        long j3;
        byte[] bArr;
        switch (this.f54119a) {
            case 0:
                d dVar = (d) this.f54121c;
                Exception exc = (Exception) this.d;
                ac.e eVar = dVar.f54130g;
                yi.b bVar = dVar.f54129f;
                File file = dVar.f54125a;
                ByteBuffer byteBuffer = dVar.f54141s;
                if (!dVar.f54144w) {
                    dVar.f54144w = true;
                    Exception exc2 = dVar.v;
                    if (exc2 == null) {
                        exc2 = exc;
                    }
                    if (exc2 == null) {
                        try {
                            if (dVar.f54142t != null && byteBuffer.position() > 0) {
                                dVar.b(byteBuffer.position());
                                byteBuffer.clear();
                            }
                        } catch (Throwable th2) {
                            try {
                                exc2 = d.a(th2);
                                AudioNoiseSuppressor audioNoiseSuppressor = dVar.f54143u;
                                if (audioNoiseSuppressor != null) {
                                    audioNoiseSuppressor.c();
                                    dVar.f54143u = null;
                                }
                                AudioRecorderNative audioRecorderNative = dVar.f54142t;
                                if (audioRecorderNative != null) {
                                    try {
                                        audioRecorderNative.c();
                                    } catch (Throwable unused) {
                                    }
                                }
                            } catch (Throwable th3) {
                                if (dVar.f54143u != null) {
                                    dVar.f54143u.c();
                                    dVar.f54143u = null;
                                }
                                AudioRecorderNative audioRecorderNative2 = dVar.f54142t;
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
                                    dVar.f54142t.f();
                                    dVar.f54142t = null;
                                }
                                throw th3;
                            }
                        }
                    }
                    AudioNoiseSuppressor audioNoiseSuppressor2 = dVar.f54143u;
                    if (audioNoiseSuppressor2 != null) {
                        audioNoiseSuppressor2.c();
                        dVar.f54143u = null;
                    }
                    AudioRecorderNative audioRecorderNative3 = dVar.f54142t;
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
                        dVar.f54142t.f();
                        dVar.f54142t = null;
                    }
                    if (file.isFile()) {
                        j3 = file.length();
                    } else {
                        j3 = 0;
                    }
                    if (dVar.f54147z > 0) {
                        bVar.b("RNNoise summary: frames=" + dVar.f54147z + ", averageMs=" + ((dVar.A / dVar.f54147z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                    }
                    Exception exc3 = exc2;
                    long j10 = this.f54120b;
                    StringBuilder t6 = p0.t(j10, "capture stopped: samples=", ", durationMs=");
                    t6.append((1000 * j10) / 48000);
                    t6.append(", bytes=");
                    t6.append(j3);
                    t6.append(", maxQueuedChunks=");
                    t6.append(dVar.f54146y);
                    bVar.b(t6.toString());
                    if (exc3 == null) {
                        j jVar = (j) eVar.f1023c;
                        jVar.a((i) eVar.f1022b, j3);
                        jVar.f60758i.post(new e0(eVar, eVar.f1021a, j10, 5));
                    } else {
                        ((j) eVar.f1023c).f60758i.post(new d80(eVar, eVar.f1021a, exc3, 4));
                    }
                    dVar.f54132j.quitSafely();
                    dVar.f54134l.clear();
                    return;
                }
                return;
            default:
                j jVar2 = (j) this.f54121c;
                i iVar = (i) this.d;
                try {
                    bArr = AudioRecorderNative.e(iVar.f60749b.getAbsolutePath());
                } catch (Throwable th6) {
                    jVar2.h.a("final waveform extraction failed", th6);
                    bArr = null;
                }
                jVar2.f60758i.post(new f2(jVar2, iVar, this.f54120b, bArr, 27));
                return;
        }
    }

    public b(d dVar, long j3, Exception exc) {
        this.f54121c = dVar;
        this.f54120b = j3;
        this.d = exc;
    }
}

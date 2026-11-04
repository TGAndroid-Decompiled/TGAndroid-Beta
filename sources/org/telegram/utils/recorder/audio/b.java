package org.telegram.utils.recorder.audio;

import a1.g;
import ci.l2;
import java.io.File;
import java.nio.ByteBuffer;
import org.telegram.messenger.ok;
import org.telegram.ui.z70;
import vi.f;
import vi.i;
import vi.j;
public final class b implements Runnable {
    public final int f52777a = 1;
    public final long f52778b;
    public final Object f52779c;
    public final Object d;

    public b(long j10, i iVar, j jVar) {
        this.f52779c = jVar;
        this.d = iVar;
        this.f52778b = j10;
    }

    @Override
    public final void run() {
        long j10;
        byte[] bArr;
        switch (this.f52777a) {
            case 0:
                d dVar = (d) this.f52779c;
                Exception exc = (Exception) this.d;
                f fVar = dVar.f52788g;
                vi.b bVar = dVar.f52787f;
                File file = dVar.f52783a;
                ByteBuffer byteBuffer = dVar.f52799s;
                if (!dVar.f52802w) {
                    dVar.f52802w = true;
                    Exception exc2 = dVar.v;
                    if (exc2 == null) {
                        exc2 = exc;
                    }
                    if (exc2 == null) {
                        try {
                            if (dVar.f52800t != null && byteBuffer.position() > 0) {
                                dVar.b(byteBuffer.position());
                                byteBuffer.clear();
                            }
                        } catch (Throwable th2) {
                            try {
                                exc2 = d.a(th2);
                                AudioNoiseSuppressor audioNoiseSuppressor = dVar.f52801u;
                                if (audioNoiseSuppressor != null) {
                                    audioNoiseSuppressor.c();
                                    dVar.f52801u = null;
                                }
                                AudioRecorderNative audioRecorderNative = dVar.f52800t;
                                if (audioRecorderNative != null) {
                                    try {
                                        audioRecorderNative.c();
                                    } catch (Throwable unused) {
                                    }
                                }
                            } catch (Throwable th3) {
                                if (dVar.f52801u != null) {
                                    dVar.f52801u.c();
                                    dVar.f52801u = null;
                                }
                                AudioRecorderNative audioRecorderNative2 = dVar.f52800t;
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
                                    dVar.f52800t.f();
                                    dVar.f52800t = null;
                                }
                                throw th3;
                            }
                        }
                    }
                    AudioNoiseSuppressor audioNoiseSuppressor2 = dVar.f52801u;
                    if (audioNoiseSuppressor2 != null) {
                        audioNoiseSuppressor2.c();
                        dVar.f52801u = null;
                    }
                    AudioRecorderNative audioRecorderNative3 = dVar.f52800t;
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
                        dVar.f52800t.f();
                        dVar.f52800t = null;
                    }
                    if (file.isFile()) {
                        j10 = file.length();
                    } else {
                        j10 = 0;
                    }
                    if (dVar.f52805z > 0) {
                        bVar.b("RNNoise summary: frames=" + dVar.f52805z + ", averageMs=" + ((dVar.A / dVar.f52805z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                    }
                    Exception exc3 = exc2;
                    long j11 = this.f52778b;
                    StringBuilder t10 = g.t(j11, "capture stopped: samples=", ", durationMs=");
                    t10.append((1000 * j11) / 48000);
                    t10.append(", bytes=");
                    t10.append(j10);
                    t10.append(", maxQueuedChunks=");
                    t10.append(dVar.f52804y);
                    bVar.b(t10.toString());
                    if (exc3 == null) {
                        j jVar = (j) fVar.f56973c;
                        jVar.a((i) fVar.f56972b, j10);
                        jVar.f56987i.post(new ok(fVar, fVar.f56971a, j11, 4));
                    } else {
                        ((j) fVar.f56973c).f56987i.post(new z70(fVar, fVar.f56971a, exc3, 4));
                    }
                    dVar.f52790j.quitSafely();
                    dVar.f52792l.clear();
                    return;
                }
                return;
            default:
                j jVar2 = (j) this.f52779c;
                i iVar = (i) this.d;
                try {
                    bArr = AudioRecorderNative.e(iVar.f56978b.getAbsolutePath());
                } catch (Throwable th6) {
                    jVar2.h.a("final waveform extraction failed", th6);
                    bArr = null;
                }
                jVar2.f56987i.post(new l2(jVar2, iVar, this.f52778b, bArr, 27));
                return;
        }
    }

    public b(d dVar, long j10, Exception exc) {
        this.f52779c = dVar;
        this.f52778b = j10;
        this.d = exc;
    }
}

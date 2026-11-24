package org.telegram.utils.recorder.audio;

import java.io.File;
import java.nio.ByteBuffer;
public final class b implements Runnable {
    public final byte a = 1;
    public final long b;
    public final Object c;
    public final Object d;

    public b(h40 h40Var, f40 f40Var, long j) {
        this.c = h40Var;
        this.d = f40Var;
        this.b = j;
    }

    @Override
    public final void run() {
        long j;
        Exception a;
        byte b = this.a;
        byte[] bArr = null;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                d dVar = (d) obj2;
                Exception exc = (Exception) obj;
                q30 q30Var = dVar.f;
                File file = dVar.a;
                ByteBuffer byteBuffer = dVar.s;
                if (!dVar.w) {
                    dVar.w = true;
                    Exception exc2 = dVar.v;
                    if (exc2 != null) {
                        exc = exc2;
                    }
                    if (exc == null) {
                        try {
                            if (dVar.t != null && byteBuffer.position() > 0) {
                                dVar.b(byteBuffer.position());
                                byteBuffer.clear();
                            }
                        } catch (Throwable th) {
                            try {
                                exc = d.a(th);
                                AudioNoiseSuppressor audioNoiseSuppressor = dVar.u;
                                if (audioNoiseSuppressor != null) {
                                    audioNoiseSuppressor.c();
                                    dVar.u = null;
                                }
                                AudioRecorderNative audioRecorderNative = dVar.t;
                                if (audioRecorderNative != null) {
                                    try {
                                        audioRecorderNative.c();
                                    } catch (Throwable unused) {
                                    }
                                }
                            } catch (Throwable th2) {
                                if (dVar.u != null) {
                                    dVar.u.c();
                                    dVar.u = null;
                                }
                                AudioRecorderNative audioRecorderNative2 = dVar.t;
                                if (audioRecorderNative2 != null) {
                                    try {
                                        if (!audioRecorderNative2.c() && exc == null) {
                                            new IllegalStateException("Unable to finalize native Opus recorder");
                                        }
                                    } catch (Throwable th3) {
                                        if (exc == null) {
                                            d.a(th3);
                                        }
                                    }
                                    dVar.t.f();
                                    dVar.t = null;
                                }
                                throw th2;
                            }
                        }
                    }
                    AudioNoiseSuppressor audioNoiseSuppressor2 = dVar.u;
                    if (audioNoiseSuppressor2 != null) {
                        audioNoiseSuppressor2.c();
                        dVar.u = null;
                    }
                    AudioRecorderNative audioRecorderNative3 = dVar.t;
                    if (audioRecorderNative3 != null) {
                        try {
                        } catch (Throwable th4) {
                            if (exc == null) {
                                a = d.a(th4);
                            }
                        }
                        if (!audioRecorderNative3.c() && exc == null) {
                            a = new IllegalStateException("Unable to finalize native Opus recorder");
                            exc = a;
                        }
                        dVar.t.f();
                        dVar.t = null;
                    }
                    Exception exc3 = exc;
                    if (file.isFile()) {
                        j = file.length();
                    } else {
                        j = 0;
                    }
                    if (dVar.z > 0) {
                        q30Var.b("RNNoise summary: frames=" + dVar.z + ", averageMs=" + ((dVar.A / dVar.z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                    }
                    long j2 = this.b;
                    StringBuilder o = wi8.o(j2, "capture stopped: samples=", ", durationMs=");
                    o.append((1000 * j2) / 48000);
                    o.append(", bytes=");
                    o.append(j);
                    o.append(", maxQueuedChunks=");
                    o.append(dVar.y);
                    q30Var.b(o.toString());
                    m30 m30Var = dVar.g;
                    h40 h40Var = (h40) m30Var.c;
                    if (exc3 == null) {
                        h40Var.a((f40) m30Var.b, j);
                        h40Var.i.post(new w30(m30Var, m30Var.a, j2, (byte) 1));
                    } else {
                        h40Var.i.post(new of2(m30Var, m30Var.a, exc3, (byte) 11));
                    }
                    dVar.j.quitSafely();
                    dVar.l.clear();
                    return;
                }
                return;
            default:
                h40 h40Var2 = (h40) obj2;
                f40 f40Var = (f40) obj;
                try {
                    bArr = AudioRecorderNative.e(f40Var.b.getAbsolutePath());
                } catch (Throwable th5) {
                    h40Var2.h.a("final waveform extraction failed", th5);
                }
                h40Var2.i.post(new p97(h40Var2, f40Var, this.b, bArr, (byte) 2));
                return;
        }
    }

    public b(d dVar, long j, Exception exc) {
        this.c = dVar;
        this.b = j;
        this.d = exc;
    }
}

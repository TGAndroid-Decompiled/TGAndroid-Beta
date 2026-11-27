package org.telegram.utils.recorder.audio;

import java.io.File;
import java.nio.ByteBuffer;
public final class b implements Runnable {
    public final byte a = 1;
    public final long b;
    public final Object c;
    public final Object d;

    public b(i30 i30Var, g30 g30Var, long j) {
        this.c = i30Var;
        this.d = g30Var;
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
                r20 r20Var = dVar.f;
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
                        r20Var.b("RNNoise summary: frames=" + dVar.z + ", averageMs=" + ((dVar.A / dVar.z) / 1000000.0d) + ", maxMs=" + (dVar.B / 1000000.0d));
                    }
                    long j2 = this.b;
                    StringBuilder o = ik8.o(j2, "capture stopped: samples=", ", durationMs=");
                    o.append((1000 * j2) / 48000);
                    o.append(", bytes=");
                    o.append(j);
                    o.append(", maxQueuedChunks=");
                    o.append(dVar.y);
                    r20Var.b(o.toString());
                    n20 n20Var = dVar.g;
                    i30 i30Var = (i30) n20Var.c;
                    if (exc3 == null) {
                        i30Var.a((g30) n20Var.b, j);
                        i30Var.i.post(new x20(n20Var, n20Var.a, j2, (byte) 1));
                    } else {
                        i30Var.i.post(new ue2(n20Var, n20Var.a, exc3, (byte) 11));
                    }
                    dVar.j.quitSafely();
                    dVar.l.clear();
                    return;
                }
                return;
            default:
                i30 i30Var2 = (i30) obj2;
                g30 g30Var = (g30) obj;
                try {
                    bArr = AudioRecorderNative.e(g30Var.b.getAbsolutePath());
                } catch (Throwable th5) {
                    i30Var2.h.a("final waveform extraction failed", th5);
                }
                i30Var2.i.post(new ba7(i30Var2, g30Var, this.b, bArr, (byte) 2));
                return;
        }
    }

    public b(d dVar, long j, Exception exc) {
        this.c = dVar;
        this.b = j;
        this.d = exc;
    }
}

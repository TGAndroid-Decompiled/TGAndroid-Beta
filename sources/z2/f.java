package z2;

import a3.l;
import a8.ia;
import a8.ja;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import c4.i;
import c4.j;
import e2.s0;
import e2.u;
import h2.m0;
import h9.t1;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import jg.g;
import k2.h;
import l2.c0;
import l2.i0;
import l2.y;
import l2.z;
import w7.s;
import x2.c1;
import x2.g0;
public final class f extends l2.b implements Handler.Callback {
    public final qb.a I;
    public final h J;
    public a K;
    public final e L;
    public boolean M;
    public int N;
    public c4.e O;
    public i P;
    public j Q;
    public j R;
    public int S;
    public final Handler T;
    public final c0 U;
    public final wf.b V;
    public boolean W;
    public boolean X;
    public u Y;
    public long Z;
    public long f59454a0;

    public f(c0 c0Var, Looper looper) {
        super(3);
        Handler handler;
        d dVar = e.f59453a;
        this.U = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = m0.f14112a;
            handler = new Handler(looper, this);
        }
        this.T = handler;
        this.L = dVar;
        this.I = new qb.a(5);
        this.J = new h(1, 0);
        this.V = new wf.b(27, false);
        this.f59454a0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
    }

    @Override
    public final int C(u uVar) {
        int i7;
        boolean equals = Objects.equals(uVar.f10615s, "application/x-media3-cues");
        String str = uVar.f10615s;
        if (!equals) {
            d dVar = (d) this.L;
            dVar.getClass();
            if (!((s) dVar.f59452b).w(uVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (s0.l(str)) {
                    return g.b(1, 0, 0, 0);
                }
                return g.b(0, 0, 0, 0);
            }
        }
        if (uVar.T == 0) {
            i7 = 4;
        } else {
            i7 = 2;
        }
        return g.b(i7, 0, 0, 0);
    }

    public final void F() {
        boolean z9;
        if (!Objects.equals(this.Y.f10615s, "application/cea-608") && !Objects.equals(this.Y.f10615s, "application/x-mp4-cea-608") && !Objects.equals(this.Y.f10615s, "application/cea-708")) {
            z9 = false;
        } else {
            z9 = true;
        }
        String str = this.Y.f10615s;
        if (z9) {
            return;
        }
        throw new IllegalStateException(ja.a("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final long G() {
        if (this.S == -1) {
            return Long.MAX_VALUE;
        }
        this.Q.getClass();
        if (this.S >= this.Q.y()) {
            return Long.MAX_VALUE;
        }
        return this.Q.k(this.S);
    }

    public final long H(long j3) {
        boolean z9;
        if (j3 != -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        return j3 - this.f17764w;
    }

    public final void I() {
        throw new UnsupportedOperationException("Method not decompiled: z2.f.I():void");
    }

    public final void J(g2.d dVar) {
        t1 t1Var = dVar.f13456a;
        c0 c0Var = this.U;
        c0Var.f17771a.f17870m.e(27, new z(0, t1Var));
        i0 i0Var = c0Var.f17771a;
        i0Var.f17856e0 = dVar;
        i0Var.f17870m.e(27, new y(dVar, 0));
    }

    public final void K() {
        this.P = null;
        this.S = -1;
        j jVar = this.Q;
        if (jVar != null) {
            jVar.release();
            this.Q = null;
        }
        j jVar2 = this.R;
        if (jVar2 != null) {
            jVar2.release();
            this.R = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            J((g2.d) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public final String i() {
        return "TextRenderer";
    }

    @Override
    public final boolean l() {
        return this.X;
    }

    @Override
    public final boolean m() {
        u uVar = this.Y;
        if (uVar != null) {
            if (Objects.equals(uVar.f10615s, "application/x-media3-cues")) {
                a aVar = this.K;
                aVar.getClass();
                if (aVar.a(this.Z) == Long.MIN_VALUE) {
                    try {
                        c1 c1Var = this.f17762r;
                        c1Var.getClass();
                        c1Var.a();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.X) {
                if (this.W) {
                    j jVar = this.Q;
                    long j3 = this.Z;
                    if (jVar == null || jVar.y() <= 0 || jVar.k(jVar.y() - 1) <= j3) {
                        j jVar2 = this.R;
                        long j10 = this.Z;
                        if ((jVar2 == null || jVar2.y() <= 0 || jVar2.k(jVar2.y() - 1) <= j10) && this.P != null) {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void n() {
        this.Y = null;
        this.f59454a0 = -9223372036854775807L;
        g2.d dVar = new g2.d(H(this.Z), t1.f14397e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, dVar).sendToTarget();
        } else {
            J(dVar);
        }
        this.Z = -9223372036854775807L;
        if (this.O != null) {
            K();
            c4.e eVar = this.O;
            eVar.getClass();
            eVar.release();
            this.O = null;
            this.N = 0;
        }
    }

    @Override
    public final void p(long j3, boolean z9, boolean z10) {
        this.Z = j3;
        a aVar = this.K;
        if (aVar != null) {
            aVar.clear();
        }
        g2.d dVar = new g2.d(H(this.Z), t1.f14397e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, dVar).sendToTarget();
        } else {
            J(dVar);
        }
        this.W = false;
        this.X = false;
        this.f59454a0 = -9223372036854775807L;
        u uVar = this.Y;
        if (uVar != null && !Objects.equals(uVar.f10615s, "application/x-media3-cues")) {
            if (this.N != 0) {
                K();
                c4.e eVar = this.O;
                eVar.getClass();
                eVar.release();
                this.O = null;
                this.N = 0;
                I();
                return;
            }
            K();
            c4.e eVar2 = this.O;
            eVar2.getClass();
            eVar2.flush();
            eVar2.a(this.f17765x);
        }
    }

    @Override
    public final void u(u[] uVarArr, long j3, long j10, g0 g0Var) {
        a jVar;
        u uVar = uVarArr[0];
        this.Y = uVar;
        if (!Objects.equals(uVar.f10615s, "application/x-media3-cues")) {
            F();
            if (this.O != null) {
                this.N = 1;
                return;
            } else {
                I();
                return;
            }
        }
        if (this.Y.Q == 1) {
            jVar = new c();
        } else {
            jVar = new f5.j();
        }
        this.K = jVar;
    }

    @Override
    public final void x(long j3, long j10) {
        boolean z9;
        long j11;
        if (this.D) {
            long j12 = this.f59454a0;
            if (j12 != -9223372036854775807L && j3 >= j12) {
                K();
                this.X = true;
            }
        }
        if (!this.X) {
            u uVar = this.Y;
            uVar.getClass();
            boolean equals = Objects.equals(uVar.f10615s, "application/x-media3-cues");
            Handler handler = this.T;
            wf.b bVar = this.V;
            boolean z10 = false;
            if (equals) {
                this.K.getClass();
                if (!this.W) {
                    h hVar = this.J;
                    if (w(bVar, hVar, 0) == -4) {
                        if (hVar.isEndOfStream()) {
                            this.W = true;
                        } else {
                            hVar.c();
                            ByteBuffer byteBuffer = hVar.f17172c;
                            byteBuffer.getClass();
                            long j13 = hVar.f17173e;
                            byte[] array = byteBuffer.array();
                            int arrayOffset = byteBuffer.arrayOffset();
                            int limit = byteBuffer.limit();
                            this.I.getClass();
                            Parcel obtain = Parcel.obtain();
                            obtain.unmarshall(array, arrayOffset, limit);
                            obtain.setDataPosition(0);
                            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                            obtain.recycle();
                            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                            parcelableArrayList.getClass();
                            c4.a aVar = new c4.a(j13, readBundle.getLong("d"), h2.e.b(new l(27), parcelableArrayList));
                            hVar.clear();
                            z10 = this.K.c(aVar, j3);
                        }
                    }
                }
                long a10 = this.K.a(this.Z);
                int i7 = (a10 > Long.MIN_VALUE ? 1 : (a10 == Long.MIN_VALUE ? 0 : -1));
                if (i7 == 0 && this.W && !z10) {
                    this.X = true;
                }
                if (i7 != 0 && a10 <= j3) {
                    z10 = true;
                }
                if (z10) {
                    h9.i0 b10 = this.K.b(j3);
                    long d = this.K.d(j3);
                    g2.d dVar = new g2.d(H(d), b10);
                    if (handler != null) {
                        handler.obtainMessage(1, dVar).sendToTarget();
                    } else {
                        J(dVar);
                    }
                    this.K.e(d);
                }
                this.Z = j3;
                return;
            }
            F();
            this.Z = j3;
            if (this.R == null) {
                c4.e eVar = this.O;
                eVar.getClass();
                eVar.b(j3);
                try {
                    c4.e eVar2 = this.O;
                    eVar2.getClass();
                    this.R = (j) eVar2.c();
                } catch (c4.f e10) {
                    h2.a.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e10);
                    g2.d dVar2 = new g2.d(H(this.Z), t1.f14397e);
                    if (handler != null) {
                        handler.obtainMessage(1, dVar2).sendToTarget();
                    } else {
                        J(dVar2);
                    }
                    K();
                    c4.e eVar3 = this.O;
                    eVar3.getClass();
                    eVar3.release();
                    this.O = null;
                    this.N = 0;
                    I();
                    return;
                }
            }
            if (this.f17761n == 2) {
                if (this.Q != null) {
                    long G = G();
                    z9 = false;
                    while (G <= j3) {
                        this.S++;
                        G = G();
                        z9 = true;
                    }
                } else {
                    z9 = false;
                }
                j jVar = this.R;
                if (jVar != null) {
                    if (jVar.isEndOfStream()) {
                        if (!z9 && G() == Long.MAX_VALUE) {
                            if (this.N == 2) {
                                K();
                                c4.e eVar4 = this.O;
                                eVar4.getClass();
                                eVar4.release();
                                this.O = null;
                                this.N = 0;
                                I();
                            } else {
                                K();
                                this.X = true;
                            }
                        }
                    } else if (jVar.timeUs <= j3) {
                        j jVar2 = this.Q;
                        if (jVar2 != null) {
                            jVar2.release();
                        }
                        this.S = jVar.d(j3);
                        this.Q = jVar;
                        this.R = null;
                        z9 = true;
                    }
                }
                if (z9) {
                    this.Q.getClass();
                    int d2 = this.Q.d(j3);
                    if (d2 != 0 && this.Q.y() != 0) {
                        if (d2 == -1) {
                            j jVar3 = this.Q;
                            j11 = jVar3.k(jVar3.y() - 1);
                        } else {
                            j11 = this.Q.k(d2 - 1);
                        }
                    } else {
                        j11 = this.Q.timeUs;
                    }
                    g2.d dVar3 = new g2.d(H(j11), this.Q.s(j3));
                    if (handler != null) {
                        handler.obtainMessage(1, dVar3).sendToTarget();
                    } else {
                        J(dVar3);
                    }
                }
                if (this.N != 2) {
                    while (!this.W) {
                        try {
                            i iVar = this.P;
                            if (iVar == null) {
                                c4.e eVar5 = this.O;
                                eVar5.getClass();
                                iVar = (i) eVar5.d();
                                if (iVar != null) {
                                    this.P = iVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.N == 1) {
                                iVar.setFlags(4);
                                c4.e eVar6 = this.O;
                                eVar6.getClass();
                                eVar6.e(iVar);
                                this.P = null;
                                this.N = 2;
                                return;
                            }
                            int w10 = w(bVar, iVar, 0);
                            if (w10 == -4) {
                                if (iVar.isEndOfStream()) {
                                    this.W = true;
                                    this.M = false;
                                } else {
                                    u uVar2 = (u) bVar.f57539c;
                                    if (uVar2 != null) {
                                        iVar.f5286r = uVar2.f10619x;
                                        iVar.c();
                                        this.M &= !iVar.isKeyFrame();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.M) {
                                    c4.e eVar7 = this.O;
                                    eVar7.getClass();
                                    eVar7.e(iVar);
                                    this.P = null;
                                }
                            } else if (w10 == -3) {
                                return;
                            }
                        } catch (c4.f e11) {
                            h2.a.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e11);
                            g2.d dVar4 = new g2.d(H(this.Z), t1.f14397e);
                            if (handler != null) {
                                handler.obtainMessage(1, dVar4).sendToTarget();
                            } else {
                                J(dVar4);
                            }
                            K();
                            c4.e eVar8 = this.O;
                            eVar8.getClass();
                            eVar8.release();
                            this.O = null;
                            this.N = 0;
                            I();
                            return;
                        }
                    }
                }
            }
        }
    }
}

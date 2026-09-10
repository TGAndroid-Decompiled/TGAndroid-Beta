package w2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import b2.r0;
import b2.s;
import e2.d0;
import e9.a1;
import e9.i0;
import h2.h;
import hi.y1;
import i2.b0;
import i2.e0;
import i2.f;
import i2.y;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import m.g3;
import u2.d1;
import u2.g0;
import z3.i;
import z3.j;
public final class e extends f implements Handler.Callback {
    public final ob.a I;
    public final h J;
    public a K;
    public final d L;
    public boolean M;
    public int N;
    public z3.e O;
    public i P;
    public j Q;
    public j R;
    public int S;
    public final Handler T;
    public final b0 U;
    public final of.b V;
    public boolean W;
    public boolean X;
    public s Y;
    public long Z;
    public long f43438a0;

    public e(b0 b0Var, Looper looper) {
        super(3);
        Handler handler;
        g3 g3Var = d.C;
        this.U = b0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = d0.f7188a;
            handler = new Handler(looper, this);
        }
        this.T = handler;
        this.L = g3Var;
        this.I = new ob.a(28);
        this.J = new h(1, 0);
        this.V = new of.b(17);
        this.f43438a0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
    }

    @Override
    public final int A(s sVar) {
        int i10;
        boolean equals = Objects.equals(sVar.f2002r, "application/x-media3-cues");
        String str = sVar.f2002r;
        if (!equals) {
            g3 g3Var = (g3) this.L;
            g3Var.getClass();
            if (!((rb.a) g3Var.f13018b).C(sVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (r0.l(str)) {
                    return hc.b.c(1, 0, 0, 0);
                }
                return hc.b.c(0, 0, 0, 0);
            }
        }
        if (sVar.S == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return hc.b.c(i10, 0, 0, 0);
    }

    public final void C() {
        boolean z10;
        if (!Objects.equals(this.Y.f2002r, "application/cea-608") && !Objects.equals(this.Y.f2002r, "application/x-mp4-cea-608") && !Objects.equals(this.Y.f2002r, "application/cea-708")) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.f("Legacy decoding is disabled, can't handle " + this.Y.f2002r + " samples (expected application/x-media3-cues).", z10);
    }

    public final long D() {
        if (this.S == -1) {
            return Long.MAX_VALUE;
        }
        this.Q.getClass();
        if (this.S >= this.Q.u()) {
            return Long.MAX_VALUE;
        }
        return this.Q.g(this.S);
    }

    public final long E(long j3) {
        boolean z10;
        if (j3 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return j3 - this.v;
    }

    public final void F() {
        throw new UnsupportedOperationException("Method not decompiled: w2.e.F():void");
    }

    public final void G(d2.c cVar) {
        a1 a1Var = cVar.f6225a;
        b0 b0Var = this.U;
        b0Var.f10108a.f10150m.e(27, new y(0, a1Var));
        e0 e0Var = b0Var.f10108a;
        e0Var.f10132b0 = cVar;
        e0Var.f10150m.e(27, new y1(cVar, 10));
    }

    public final void H() {
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
            G((d2.c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public final String j() {
        return "TextRenderer";
    }

    @Override
    public final boolean l() {
        return this.X;
    }

    @Override
    public final boolean m() {
        s sVar = this.Y;
        if (sVar != null) {
            if (Objects.equals(sVar.f2002r, "application/x-media3-cues")) {
                a aVar = this.K;
                aVar.getClass();
                if (aVar.b(this.Z) == Long.MIN_VALUE) {
                    try {
                        d1 d1Var = this.f10178r;
                        d1Var.getClass();
                        d1Var.a();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.X) {
                if (this.W) {
                    j jVar = this.Q;
                    long j3 = this.Z;
                    if (jVar == null || jVar.u() <= 0 || jVar.g(jVar.u() - 1) <= j3) {
                        j jVar2 = this.R;
                        long j10 = this.Z;
                        if ((jVar2 == null || jVar2.u() <= 0 || jVar2.g(jVar2.u() - 1) <= j10) && this.P != null) {
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
    public final void o() {
        this.Y = null;
        this.f43438a0 = -9223372036854775807L;
        d2.c cVar = new d2.c(E(this.Z), a1.e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            G(cVar);
        }
        this.Z = -9223372036854775807L;
        if (this.O != null) {
            H();
            z3.e eVar = this.O;
            eVar.getClass();
            eVar.release();
            this.O = null;
            this.N = 0;
        }
    }

    @Override
    public final void q(long j3, boolean z10) {
        this.Z = j3;
        a aVar = this.K;
        if (aVar != null) {
            aVar.clear();
        }
        d2.c cVar = new d2.c(E(this.Z), a1.e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            G(cVar);
        }
        this.W = false;
        this.X = false;
        this.f43438a0 = -9223372036854775807L;
        s sVar = this.Y;
        if (sVar != null && !Objects.equals(sVar.f2002r, "application/x-media3-cues")) {
            if (this.N != 0) {
                H();
                z3.e eVar = this.O;
                eVar.getClass();
                eVar.release();
                this.O = null;
                this.N = 0;
                F();
                return;
            }
            H();
            z3.e eVar2 = this.O;
            eVar2.getClass();
            eVar2.flush();
            eVar2.a(this.f10180w);
        }
    }

    @Override
    public final void v(s[] sVarArr, long j3, long j10, g0 g0Var) {
        a hVar;
        s sVar = sVarArr[0];
        this.Y = sVar;
        if (!Objects.equals(sVar.f2002r, "application/x-media3-cues")) {
            C();
            if (this.O != null) {
                this.N = 1;
                return;
            } else {
                F();
                return;
            }
        }
        if (this.Y.P == 1) {
            hVar = new c();
        } else {
            hVar = new l2.h(25);
        }
        this.K = hVar;
    }

    @Override
    public final void x(long j3, long j10) {
        boolean z10;
        long j11;
        if (this.f10182y) {
            long j12 = this.f43438a0;
            if (j12 != -9223372036854775807L && j3 >= j12) {
                H();
                this.X = true;
            }
        }
        if (!this.X) {
            s sVar = this.Y;
            sVar.getClass();
            boolean equals = Objects.equals(sVar.f2002r, "application/x-media3-cues");
            Handler handler = this.T;
            of.b bVar = this.V;
            boolean z11 = false;
            if (equals) {
                this.K.getClass();
                if (!this.W) {
                    h hVar = this.J;
                    if (w(bVar, hVar, 0) == -4) {
                        if (hVar.isEndOfStream()) {
                            this.W = true;
                        } else {
                            hVar.c();
                            ByteBuffer byteBuffer = hVar.f9210c;
                            byteBuffer.getClass();
                            long j13 = hVar.e;
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
                            z3.a aVar = new z3.a(j13, readBundle.getLong("d"), e2.d.j(new u2.c(23), parcelableArrayList));
                            hVar.clear();
                            z11 = this.K.e(aVar, j3);
                        }
                    }
                }
                long b10 = this.K.b(this.Z);
                int i10 = (b10 > Long.MIN_VALUE ? 1 : (b10 == Long.MIN_VALUE ? 0 : -1));
                if (i10 == 0 && this.W && !z11) {
                    this.X = true;
                }
                if (i10 != 0 && b10 <= j3) {
                    z11 = true;
                }
                if (z11) {
                    i0 c10 = this.K.c(j3);
                    long g10 = this.K.g(j3);
                    d2.c cVar = new d2.c(E(g10), c10);
                    if (handler != null) {
                        handler.obtainMessage(1, cVar).sendToTarget();
                    } else {
                        G(cVar);
                    }
                    this.K.i(g10);
                }
                this.Z = j3;
                return;
            }
            C();
            this.Z = j3;
            if (this.R == null) {
                z3.e eVar = this.O;
                eVar.getClass();
                eVar.b(j3);
                try {
                    z3.e eVar2 = this.O;
                    eVar2.getClass();
                    this.R = (j) eVar2.c();
                } catch (z3.f e) {
                    e2.a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e);
                    d2.c cVar2 = new d2.c(E(this.Z), a1.e);
                    if (handler != null) {
                        handler.obtainMessage(1, cVar2).sendToTarget();
                    } else {
                        G(cVar2);
                    }
                    H();
                    z3.e eVar3 = this.O;
                    eVar3.getClass();
                    eVar3.release();
                    this.O = null;
                    this.N = 0;
                    F();
                    return;
                }
            }
            if (this.f10177n == 2) {
                if (this.Q != null) {
                    long D = D();
                    z10 = false;
                    while (D <= j3) {
                        this.S++;
                        D = D();
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                j jVar = this.R;
                if (jVar != null) {
                    if (jVar.isEndOfStream()) {
                        if (!z10 && D() == Long.MAX_VALUE) {
                            if (this.N == 2) {
                                H();
                                z3.e eVar4 = this.O;
                                eVar4.getClass();
                                eVar4.release();
                                this.O = null;
                                this.N = 0;
                                F();
                            } else {
                                H();
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
                        z10 = true;
                    }
                }
                if (z10) {
                    this.Q.getClass();
                    int d = this.Q.d(j3);
                    if (d != 0 && this.Q.u() != 0) {
                        if (d == -1) {
                            j jVar3 = this.Q;
                            j11 = jVar3.g(jVar3.u() - 1);
                        } else {
                            j11 = this.Q.g(d - 1);
                        }
                    } else {
                        j11 = this.Q.timeUs;
                    }
                    d2.c cVar3 = new d2.c(E(j11), this.Q.q(j3));
                    if (handler != null) {
                        handler.obtainMessage(1, cVar3).sendToTarget();
                    } else {
                        G(cVar3);
                    }
                }
                if (this.N != 2) {
                    while (!this.W) {
                        try {
                            i iVar = this.P;
                            if (iVar == null) {
                                z3.e eVar5 = this.O;
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
                                z3.e eVar6 = this.O;
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
                                    s sVar2 = (s) bVar.f14295c;
                                    if (sVar2 != null) {
                                        iVar.f47212r = sVar2.f2006w;
                                        iVar.c();
                                        this.M &= !iVar.isKeyFrame();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.M) {
                                    z3.e eVar7 = this.O;
                                    eVar7.getClass();
                                    eVar7.e(iVar);
                                    this.P = null;
                                }
                            } else if (w10 == -3) {
                                return;
                            }
                        } catch (z3.f e7) {
                            e2.a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e7);
                            d2.c cVar4 = new d2.c(E(this.Z), a1.e);
                            if (handler != null) {
                                handler.obtainMessage(1, cVar4).sendToTarget();
                            } else {
                                G(cVar4);
                            }
                            H();
                            z3.e eVar8 = this.O;
                            eVar8.getClass();
                            eVar8.release();
                            this.O = null;
                            this.N = 0;
                            F();
                            return;
                        }
                    }
                }
            }
        }
    }
}

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
import ei.c5;
import h2.h;
import i2.c0;
import i2.f;
import i2.f0;
import i2.z;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import m.f3;
import n4.x;
import t7.t;
import w9.v;
import z3.i;
import z3.j;
public final class e extends f implements Handler.Callback {
    public final t I;
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
    public final c0 U;
    public final x V;
    public boolean W;
    public boolean X;
    public s Y;
    public long Z;
    public long f49847a0;

    public e(c0 c0Var, Looper looper) {
        super(3);
        Handler handler;
        m2.t tVar = d.C;
        this.U = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = d0.f8531a;
            handler = new Handler(looper, this);
        }
        this.T = handler;
        this.L = tVar;
        this.I = new Object();
        this.J = new h(1, 0);
        this.V = new x(19, false);
        this.f49847a0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
    }

    @Override
    public final int A(s sVar) {
        int i10;
        boolean equals = Objects.equals(sVar.f3643r, "application/x-media3-cues");
        String str = sVar.f3643r;
        if (!equals) {
            m2.t tVar = (m2.t) this.L;
            tVar.getClass();
            if (!((ob.a) tVar.f15997b).D1(sVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (r0.l(str)) {
                    return hg.c.b(1, 0, 0, 0);
                }
                return hg.c.b(0, 0, 0, 0);
            }
        }
        if (sVar.S == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return hg.c.b(i10, 0, 0, 0);
    }

    public final void C() {
        boolean z10;
        if (!Objects.equals(this.Y.f3643r, "application/cea-608") && !Objects.equals(this.Y.f3643r, "application/x-mp4-cea-608") && !Objects.equals(this.Y.f3643r, "application/cea-708")) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.f("Legacy decoding is disabled, can't handle " + this.Y.f3643r + " samples (expected application/x-media3-cues).", z10);
    }

    public final long D() {
        if (this.S == -1) {
            return Long.MAX_VALUE;
        }
        this.Q.getClass();
        if (this.S >= this.Q.w()) {
            return Long.MAX_VALUE;
        }
        return this.Q.l(this.S);
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

    public final void G(d2.d dVar) {
        a1 a1Var = dVar.f8090a;
        c0 c0Var = this.U;
        c0Var.f11619a.f11675m.e(27, new z(0, a1Var));
        f0 f0Var = c0Var.f11619a;
        f0Var.f11656b0 = dVar;
        f0Var.f11675m.e(27, new c5(dVar, 9));
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
            G((d2.d) message.obj);
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
            if (Objects.equals(sVar.f3643r, "application/x-media3-cues")) {
                a aVar = this.K;
                aVar.getClass();
                if (aVar.a(this.Z) == Long.MIN_VALUE) {
                    try {
                        u2.a1 a1Var = this.f11649r;
                        a1Var.getClass();
                        a1Var.a();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.X) {
                if (this.W) {
                    j jVar = this.Q;
                    long j3 = this.Z;
                    if (jVar == null || jVar.w() <= 0 || jVar.l(jVar.w() - 1) <= j3) {
                        j jVar2 = this.R;
                        long j10 = this.Z;
                        if ((jVar2 == null || jVar2.w() <= 0 || jVar2.l(jVar2.w() - 1) <= j10) && this.P != null) {
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
        this.f49847a0 = -9223372036854775807L;
        d2.d dVar = new d2.d(E(this.Z), a1.f8714e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, dVar).sendToTarget();
        } else {
            G(dVar);
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
        d2.d dVar = new d2.d(E(this.Z), a1.f8714e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, dVar).sendToTarget();
        } else {
            G(dVar);
        }
        this.W = false;
        this.X = false;
        this.f49847a0 = -9223372036854775807L;
        s sVar = this.Y;
        if (sVar != null && !Objects.equals(sVar.f3643r, "application/x-media3-cues")) {
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
            eVar2.a(this.f11651w);
        }
    }

    @Override
    public final void v(s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
        a f3Var;
        s sVar = sVarArr[0];
        this.Y = sVar;
        if (!Objects.equals(sVar.f3643r, "application/x-media3-cues")) {
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
            f3Var = new c();
        } else {
            f3Var = new f3(23);
        }
        this.K = f3Var;
    }

    @Override
    public final void x(long j3, long j10) {
        boolean z10;
        long j11;
        if (this.f11653y) {
            long j12 = this.f49847a0;
            if (j12 != -9223372036854775807L && j3 >= j12) {
                H();
                this.X = true;
            }
        }
        if (!this.X) {
            s sVar = this.Y;
            sVar.getClass();
            boolean equals = Objects.equals(sVar.f3643r, "application/x-media3-cues");
            Handler handler = this.T;
            x xVar = this.V;
            boolean z11 = false;
            if (equals) {
                this.K.getClass();
                if (!this.W) {
                    h hVar = this.J;
                    if (w(xVar, hVar, 0) == -4) {
                        if (hVar.isEndOfStream()) {
                            this.W = true;
                        } else {
                            hVar.c();
                            ByteBuffer byteBuffer = hVar.f10984c;
                            byteBuffer.getClass();
                            long j13 = hVar.f10985e;
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
                            z3.a aVar = new z3.a(j13, readBundle.getLong("d"), e2.d.j(new v(10), parcelableArrayList));
                            hVar.clear();
                            z11 = this.K.c(aVar, j3);
                        }
                    }
                }
                long a2 = this.K.a(this.Z);
                int i10 = (a2 > Long.MIN_VALUE ? 1 : (a2 == Long.MIN_VALUE ? 0 : -1));
                if (i10 == 0 && this.W && !z11) {
                    this.X = true;
                }
                if (i10 != 0 && a2 <= j3) {
                    z11 = true;
                }
                if (z11) {
                    i0 b10 = this.K.b(j3);
                    long d = this.K.d(j3);
                    d2.d dVar = new d2.d(E(d), b10);
                    if (handler != null) {
                        handler.obtainMessage(1, dVar).sendToTarget();
                    } else {
                        G(dVar);
                    }
                    this.K.e(d);
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
                } catch (z3.f e7) {
                    e2.a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e7);
                    d2.d dVar2 = new d2.d(E(this.Z), a1.f8714e);
                    if (handler != null) {
                        handler.obtainMessage(1, dVar2).sendToTarget();
                    } else {
                        G(dVar2);
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
            if (this.f11648n == 2) {
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
                        this.S = jVar.e(j3);
                        this.Q = jVar;
                        this.R = null;
                        z10 = true;
                    }
                }
                if (z10) {
                    this.Q.getClass();
                    int e10 = this.Q.e(j3);
                    if (e10 != 0 && this.Q.w() != 0) {
                        if (e10 == -1) {
                            j jVar3 = this.Q;
                            j11 = jVar3.l(jVar3.w() - 1);
                        } else {
                            j11 = this.Q.l(e10 - 1);
                        }
                    } else {
                        j11 = this.Q.timeUs;
                    }
                    d2.d dVar3 = new d2.d(E(j11), this.Q.p(j3));
                    if (handler != null) {
                        handler.obtainMessage(1, dVar3).sendToTarget();
                    } else {
                        G(dVar3);
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
                            int w10 = w(xVar, iVar, 0);
                            if (w10 == -4) {
                                if (iVar.isEndOfStream()) {
                                    this.W = true;
                                    this.M = false;
                                } else {
                                    s sVar2 = (s) xVar.f16659c;
                                    if (sVar2 != null) {
                                        iVar.f53592r = sVar2.f3647w;
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
                        } catch (z3.f e11) {
                            e2.a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e11);
                            d2.d dVar4 = new d2.d(E(this.Z), a1.f8714e);
                            if (handler != null) {
                                handler.obtainMessage(1, dVar4).sendToTarget();
                            } else {
                                G(dVar4);
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

package w2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import b2.r0;
import b2.s;
import c5.m;
import e2.d0;
import e9.a1;
import e9.i0;
import h2.h;
import hg.k0;
import i2.c0;
import i2.f;
import i2.f0;
import i2.z;
import ii.n4;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import n4.y;
import u2.c1;
import u2.l0;
import z3.j;
import z3.k;
public final class e extends f implements Handler.Callback {
    public final na.d I;
    public final h J;
    public a K;
    public final d L;
    public boolean M;
    public int N;
    public z3.e O;
    public j P;
    public k Q;
    public k R;
    public int S;
    public final Handler T;
    public final c0 U;
    public final y V;
    public boolean W;
    public boolean X;
    public s Y;
    public long Z;
    public long f48462a0;

    public e(c0 c0Var, Looper looper) {
        super(3);
        Handler handler;
        n4 n4Var = d.C;
        this.U = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = d0.f8537a;
            handler = new Handler(looper, this);
        }
        this.T = handler;
        this.L = n4Var;
        this.I = new na.d(28);
        this.J = new h(1, 0);
        this.V = new y(17);
        this.f48462a0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
    }

    @Override
    public final int A(s sVar) {
        int i10;
        boolean equals = Objects.equals(sVar.f3564r, "application/x-media3-cues");
        String str = sVar.f3564r;
        if (!equals) {
            n4 n4Var = (n4) this.L;
            n4Var.getClass();
            if (!((qb.b) n4Var.f12543b).V(sVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (r0.l(str)) {
                    return k0.b(1, 0, 0, 0);
                }
                return k0.b(0, 0, 0, 0);
            }
        }
        if (sVar.S == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return k0.b(i10, 0, 0, 0);
    }

    public final void C() {
        boolean z10;
        if (!Objects.equals(this.Y.f3564r, "application/cea-608") && !Objects.equals(this.Y.f3564r, "application/x-mp4-cea-608") && !Objects.equals(this.Y.f3564r, "application/cea-708")) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.f("Legacy decoding is disabled, can't handle " + this.Y.f3564r + " samples (expected application/x-media3-cues).", z10);
    }

    public final long D() {
        if (this.S == -1) {
            return Long.MAX_VALUE;
        }
        this.Q.getClass();
        if (this.S >= this.Q.G()) {
            return Long.MAX_VALUE;
        }
        return this.Q.m(this.S);
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
        a1 a1Var = dVar.f8041a;
        c0 c0Var = this.U;
        c0Var.f11569a.f11625m.e(27, new z(0, a1Var));
        f0 f0Var = c0Var.f11569a;
        f0Var.f11606b0 = dVar;
        f0Var.f11625m.e(27, new ei.f(dVar, 10));
    }

    public final void H() {
        this.P = null;
        this.S = -1;
        k kVar = this.Q;
        if (kVar != null) {
            kVar.release();
            this.Q = null;
        }
        k kVar2 = this.R;
        if (kVar2 != null) {
            kVar2.release();
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
            if (Objects.equals(sVar.f3564r, "application/x-media3-cues")) {
                a aVar = this.K;
                aVar.getClass();
                if (aVar.a(this.Z) == Long.MIN_VALUE) {
                    try {
                        c1 c1Var = this.f11599r;
                        c1Var.getClass();
                        c1Var.a();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.X) {
                if (this.W) {
                    k kVar = this.Q;
                    long j3 = this.Z;
                    if (kVar == null || kVar.G() <= 0 || kVar.m(kVar.G() - 1) <= j3) {
                        k kVar2 = this.R;
                        long j10 = this.Z;
                        if ((kVar2 == null || kVar2.G() <= 0 || kVar2.m(kVar2.G() - 1) <= j10) && this.P != null) {
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
        this.f48462a0 = -9223372036854775807L;
        d2.d dVar = new d2.d(E(this.Z), a1.f8720e);
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
        d2.d dVar = new d2.d(E(this.Z), a1.f8720e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, dVar).sendToTarget();
        } else {
            G(dVar);
        }
        this.W = false;
        this.X = false;
        this.f48462a0 = -9223372036854775807L;
        s sVar = this.Y;
        if (sVar != null && !Objects.equals(sVar.f3564r, "application/x-media3-cues")) {
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
            eVar2.a(this.f11601w);
        }
    }

    @Override
    public final void v(s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
        a mVar;
        s sVar = sVarArr[0];
        this.Y = sVar;
        if (!Objects.equals(sVar.f3564r, "application/x-media3-cues")) {
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
            mVar = new c();
        } else {
            mVar = new m(3);
        }
        this.K = mVar;
    }

    @Override
    public final void x(long j3, long j10) {
        boolean z10;
        long j11;
        if (this.f11603y) {
            long j12 = this.f48462a0;
            if (j12 != -9223372036854775807L && j3 >= j12) {
                H();
                this.X = true;
            }
        }
        if (!this.X) {
            s sVar = this.Y;
            sVar.getClass();
            boolean equals = Objects.equals(sVar.f3564r, "application/x-media3-cues");
            Handler handler = this.T;
            y yVar = this.V;
            boolean z11 = false;
            if (equals) {
                this.K.getClass();
                if (!this.W) {
                    h hVar = this.J;
                    if (w(yVar, hVar, 0) == -4) {
                        if (hVar.isEndOfStream()) {
                            this.W = true;
                        } else {
                            hVar.d();
                            ByteBuffer byteBuffer = hVar.f10979c;
                            byteBuffer.getClass();
                            long j13 = hVar.f10980e;
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
                            z3.a aVar = new z3.a(j13, readBundle.getLong("d"), e2.d.j(new l0(25), parcelableArrayList));
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
                    this.R = (k) eVar2.c();
                } catch (z3.f e7) {
                    e2.a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e7);
                    d2.d dVar2 = new d2.d(E(this.Z), a1.f8720e);
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
            if (this.f11598n == 2) {
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
                k kVar = this.R;
                if (kVar != null) {
                    if (kVar.isEndOfStream()) {
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
                    } else if (kVar.timeUs <= j3) {
                        k kVar2 = this.Q;
                        if (kVar2 != null) {
                            kVar2.release();
                        }
                        this.S = kVar.c(j3);
                        this.Q = kVar;
                        this.R = null;
                        z10 = true;
                    }
                }
                if (z10) {
                    this.Q.getClass();
                    int c10 = this.Q.c(j3);
                    if (c10 != 0 && this.Q.G() != 0) {
                        if (c10 == -1) {
                            k kVar3 = this.Q;
                            j11 = kVar3.m(kVar3.G() - 1);
                        } else {
                            j11 = this.Q.m(c10 - 1);
                        }
                    } else {
                        j11 = this.Q.timeUs;
                    }
                    d2.d dVar3 = new d2.d(E(j11), this.Q.z(j3));
                    if (handler != null) {
                        handler.obtainMessage(1, dVar3).sendToTarget();
                    } else {
                        G(dVar3);
                    }
                }
                if (this.N != 2) {
                    while (!this.W) {
                        try {
                            j jVar = this.P;
                            if (jVar == null) {
                                z3.e eVar5 = this.O;
                                eVar5.getClass();
                                jVar = (j) eVar5.d();
                                if (jVar != null) {
                                    this.P = jVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.N == 1) {
                                jVar.setFlags(4);
                                z3.e eVar6 = this.O;
                                eVar6.getClass();
                                eVar6.e(jVar);
                                this.P = null;
                                this.N = 2;
                                return;
                            }
                            int w10 = w(yVar, jVar, 0);
                            if (w10 == -4) {
                                if (jVar.isEndOfStream()) {
                                    this.W = true;
                                    this.M = false;
                                } else {
                                    s sVar2 = (s) yVar.f16641c;
                                    if (sVar2 != null) {
                                        jVar.f52373r = sVar2.f3568w;
                                        jVar.d();
                                        this.M &= !jVar.isKeyFrame();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.M) {
                                    z3.e eVar7 = this.O;
                                    eVar7.getClass();
                                    eVar7.e(jVar);
                                    this.P = null;
                                }
                            } else if (w10 == -3) {
                                return;
                            }
                        } catch (z3.f e10) {
                            e2.a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e10);
                            d2.d dVar4 = new d2.d(E(this.Z), a1.f8720e);
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

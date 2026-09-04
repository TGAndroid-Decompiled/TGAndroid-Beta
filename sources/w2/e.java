package w2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b2.r0;
import b2.s;
import c5.m;
import e2.d0;
import e9.a1;
import h2.g;
import i2.c0;
import i2.f;
import i2.f0;
import i2.z;
import j$.util.Objects;
import java.io.IOException;
import n4.y;
import u2.b1;
import z3.i;
import z3.j;
public final class e extends f implements Handler.Callback {
    public final ob.a I;
    public final g J;
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
    public final y V;
    public boolean W;
    public boolean X;
    public s Y;
    public long Z;
    public long f47915a0;

    public e(c0 c0Var, Looper looper) {
        super(3);
        Handler handler;
        v8.s sVar = d.C;
        this.U = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = d0.f8737a;
            handler = new Handler(looper, this);
        }
        this.T = handler;
        this.L = sVar;
        this.I = new ob.a(28);
        this.J = new g(1, 0);
        this.V = new y(17, false);
        this.f47915a0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
    }

    public final void B() {
        boolean z10;
        if (!Objects.equals(this.Y.f2370r, "application/cea-608") && !Objects.equals(this.Y.f2370r, "application/x-mp4-cea-608") && !Objects.equals(this.Y.f2370r, "application/cea-708")) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.f("Legacy decoding is disabled, can't handle " + this.Y.f2370r + " samples (expected application/x-media3-cues).", z10);
    }

    public final long C() {
        if (this.S == -1) {
            return Long.MAX_VALUE;
        }
        this.Q.getClass();
        if (this.S >= this.Q.k()) {
            return Long.MAX_VALUE;
        }
        return this.Q.e(this.S);
    }

    public final long D(long j3) {
        boolean z10;
        if (j3 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return j3 - this.v;
    }

    public final void E() {
        throw new UnsupportedOperationException("Method not decompiled: w2.e.E():void");
    }

    public final void F(d2.c cVar) {
        a1 a1Var = cVar.f6511a;
        c0 c0Var = this.U;
        c0Var.f11471a.f11526m.e(27, new z(0, a1Var));
        f0 f0Var = c0Var.f11471a;
        f0Var.f11507b0 = cVar;
        f0Var.f11526m.e(27, new fi.f(cVar, 7));
    }

    public final void G() {
        this.P = null;
        this.S = -1;
        j jVar = this.Q;
        if (jVar != null) {
            jVar.j();
            this.Q = null;
        }
        j jVar2 = this.R;
        if (jVar2 != null) {
            jVar2.j();
            this.R = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            F((d2.c) message.obj);
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
            if (Objects.equals(sVar.f2370r, "application/x-media3-cues")) {
                a aVar = this.K;
                aVar.getClass();
                if (aVar.a(this.Z) == Long.MIN_VALUE) {
                    try {
                        b1 b1Var = this.f11500r;
                        b1Var.getClass();
                        b1Var.b();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.X) {
                if (this.W) {
                    j jVar = this.Q;
                    long j3 = this.Z;
                    if (jVar == null || jVar.k() <= 0 || jVar.e(jVar.k() - 1) <= j3) {
                        j jVar2 = this.R;
                        long j10 = this.Z;
                        if ((jVar2 == null || jVar2.k() <= 0 || jVar2.e(jVar2.k() - 1) <= j10) && this.P != null) {
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
        this.f47915a0 = -9223372036854775807L;
        d2.c cVar = new d2.c(D(this.Z), a1.f8920e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            F(cVar);
        }
        this.Z = -9223372036854775807L;
        if (this.O != null) {
            G();
            z3.e eVar = this.O;
            eVar.getClass();
            eVar.release();
            this.O = null;
            this.N = 0;
        }
    }

    @Override
    public final void p(long j3, boolean z10) {
        this.Z = j3;
        a aVar = this.K;
        if (aVar != null) {
            aVar.clear();
        }
        d2.c cVar = new d2.c(D(this.Z), a1.f8920e);
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            F(cVar);
        }
        this.W = false;
        this.X = false;
        this.f47915a0 = -9223372036854775807L;
        s sVar = this.Y;
        if (sVar != null && !Objects.equals(sVar.f2370r, "application/x-media3-cues")) {
            if (this.N != 0) {
                G();
                z3.e eVar = this.O;
                eVar.getClass();
                eVar.release();
                this.O = null;
                this.N = 0;
                E();
                return;
            }
            G();
            z3.e eVar2 = this.O;
            eVar2.getClass();
            eVar2.flush();
            eVar2.a(this.f11502w);
        }
    }

    @Override
    public final void u(s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
        a mVar;
        s sVar = sVarArr[0];
        this.Y = sVar;
        if (!Objects.equals(sVar.f2370r, "application/x-media3-cues")) {
            B();
            if (this.O != null) {
                this.N = 1;
                return;
            } else {
                E();
                return;
            }
        }
        if (this.Y.P == 1) {
            mVar = new c();
        } else {
            mVar = new m(2);
        }
        this.K = mVar;
    }

    @Override
    public final void w(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: w2.e.w(long, long):void");
    }

    @Override
    public final int z(s sVar) {
        int i10;
        boolean equals = Objects.equals(sVar.f2370r, "application/x-media3-cues");
        String str = sVar.f2370r;
        if (!equals) {
            v8.s sVar2 = (v8.s) this.L;
            sVar2.getClass();
            if (!((rb.a) sVar2.f47750a).i0(sVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (r0.l(str)) {
                    return i2.g.b(1, 0, 0, 0);
                }
                return i2.g.b(0, 0, 0, 0);
            }
        }
        if (sVar.S == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return i2.g.b(i10, 0, 0, 0);
    }
}

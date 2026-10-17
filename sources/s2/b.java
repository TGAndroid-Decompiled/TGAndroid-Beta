package s2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b2.q0;
import b2.r0;
import b2.s0;
import b2.t0;
import b2.w;
import e1.c;
import e2.m0;
import e2.r;
import i2.a0;
import i2.g0;
import java.util.ArrayList;
import v7.u6;
import w7.m;
public final class b extends i2.b implements Handler.Callback {
    public final a I;
    public final a0 J;
    public final Handler K;
    public final l3.a L;
    public m M;
    public boolean N;
    public boolean O;
    public long P;
    public t0 Q;
    public long R;

    public b(a0 a0Var, Looper looper) {
        super(5);
        Handler handler;
        this.J = a0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = m0.f8254a;
            handler = new Handler(looper, this);
        }
        this.K = handler;
        this.I = a.f45899a;
        this.L = new l3.a();
        this.R = -9223372036854775807L;
    }

    @Override
    public final int C(w wVar) {
        int i10;
        if (this.I.b(wVar)) {
            if (wVar.T == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return i0.a.c(i10, 0, 0, 0);
        }
        return i0.a.c(0, 0, 0, 0);
    }

    public final void F(t0 t0Var, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            s0[] s0VarArr = t0Var.f4010a;
            if (i10 < s0VarArr.length) {
                w a2 = s0VarArr[i10].a();
                if (a2 != null) {
                    a aVar = this.I;
                    if (aVar.b(a2)) {
                        m a10 = aVar.a(a2);
                        byte[] c10 = s0VarArr[i10].c();
                        c10.getClass();
                        l3.a aVar2 = this.L;
                        aVar2.clear();
                        aVar2.b(c10.length);
                        aVar2.f11635c.put(c10);
                        aVar2.f();
                        t0 a11 = a10.a(aVar2);
                        if (a11 != null) {
                            F(a11, arrayList);
                        }
                        i10++;
                    }
                }
                arrayList.add(s0VarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public final long G(long j10) {
        boolean z10;
        boolean z11 = false;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        if (this.R != -9223372036854775807L) {
            z11 = true;
        }
        u6.p(z11);
        return j10 - this.R;
    }

    public final void H(t0 t0Var) {
        a0 a0Var = this.J;
        g0 g0Var = a0Var.f12309a;
        r0 r0Var = g0Var.f12401o0;
        r rVar = g0Var.f12397m;
        q0 a2 = r0Var.a();
        int i10 = 0;
        while (true) {
            s0[] s0VarArr = t0Var.f4010a;
            if (i10 >= s0VarArr.length) {
                break;
            }
            s0VarArr[i10].b(a2);
            i10++;
        }
        g0Var.f12401o0 = new r0(a2);
        r0 f12 = g0Var.f1();
        if (!f12.equals(g0Var.Q)) {
            g0Var.Q = f12;
            rVar.c(14, new c(a0Var, 17));
        }
        rVar.c(28, new c(t0Var, 18));
        rVar.b();
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            H((t0) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public final String j() {
        return "MetadataRenderer";
    }

    @Override
    public final boolean l() {
        return this.O;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void n() {
        this.Q = null;
        this.M = null;
        this.R = -9223372036854775807L;
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        this.Q = null;
        this.N = false;
        this.O = false;
    }

    @Override
    public final void u(w[] wVarArr, long j10, long j11, u2.g0 g0Var) {
        this.M = this.I.a(wVarArr[0]);
        t0 t0Var = this.Q;
        if (t0Var != null) {
            long j12 = t0Var.f4011b;
            long j13 = (this.R + j12) - j11;
            if (j12 != j13) {
                t0Var = new t0(j13, t0Var.f4010a);
            }
            this.Q = t0Var;
        }
        this.R = j11;
    }

    @Override
    public final void x(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.N && this.Q == null) {
                l3.a aVar = this.L;
                aVar.clear();
                qf.b bVar = this.f12315c;
                bVar.z();
                int w9 = w(bVar, aVar, 0);
                if (w9 == -4) {
                    if (aVar.isEndOfStream()) {
                        this.N = true;
                    } else if (aVar.e >= this.f12320w) {
                        aVar.f15887r = this.P;
                        aVar.f();
                        m mVar = this.M;
                        String str = m0.f8254a;
                        t0 a2 = mVar.a(aVar);
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList(a2.f4010a.length);
                            F(a2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.Q = new t0(G(aVar.e), (s0[]) arrayList.toArray(new s0[0]));
                            }
                        }
                    }
                } else if (w9 == -5) {
                    w wVar = (w) bVar.f44466c;
                    wVar.getClass();
                    this.P = wVar.f4135x;
                }
            }
            t0 t0Var = this.Q;
            if (t0Var != null && t0Var.f4011b <= G(j10)) {
                t0 t0Var2 = this.Q;
                Handler handler = this.K;
                if (handler != null) {
                    handler.obtainMessage(1, t0Var2).sendToTarget();
                } else {
                    H(t0Var2);
                }
                this.Q = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.N && this.Q == null) {
                this.O = true;
            }
        }
    }
}

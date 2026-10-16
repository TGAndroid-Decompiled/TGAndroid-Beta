package s2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b2.r0;
import b2.s0;
import b2.t0;
import b2.u0;
import b2.x;
import e2.m0;
import e2.r;
import i2.b0;
import i2.d;
import i2.h0;
import java.util.ArrayList;
import u2.g0;
import v7.u6;
import w7.m;
public final class b extends i2.b implements Handler.Callback {
    public final a I;
    public final b0 J;
    public final Handler K;
    public final l3.a L;
    public m M;
    public boolean N;
    public boolean O;
    public long P;
    public u0 Q;
    public long R;

    public b(b0 b0Var, Looper looper) {
        super(5);
        Handler handler;
        this.J = b0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = m0.f8375a;
            handler = new Handler(looper, this);
        }
        this.K = handler;
        this.I = a.f44799a;
        this.L = new l3.a();
        this.R = -9223372036854775807L;
    }

    @Override
    public final int C(x xVar) {
        int i10;
        if (this.I.b(xVar)) {
            if (xVar.T == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return d.c(i10, 0, 0, 0);
        }
        return d.c(0, 0, 0, 0);
    }

    public final void F(u0 u0Var, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            t0[] t0VarArr = u0Var.f2402a;
            if (i10 < t0VarArr.length) {
                x a2 = t0VarArr[i10].a();
                if (a2 != null) {
                    a aVar = this.I;
                    if (aVar.b(a2)) {
                        m a10 = aVar.a(a2);
                        byte[] c10 = t0VarArr[i10].c();
                        c10.getClass();
                        l3.a aVar2 = this.L;
                        aVar2.clear();
                        aVar2.b(c10.length);
                        aVar2.f10330c.put(c10);
                        aVar2.d();
                        u0 a11 = a10.a(aVar2);
                        if (a11 != null) {
                            F(a11, arrayList);
                        }
                        i10++;
                    }
                }
                arrayList.add(t0VarArr[i10]);
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

    public final void H(u0 u0Var) {
        b0 b0Var = this.J;
        h0 h0Var = b0Var.f10929a;
        s0 s0Var = h0Var.f11009o0;
        r rVar = h0Var.f11005m;
        r0 a2 = s0Var.a();
        int i10 = 0;
        while (true) {
            t0[] t0VarArr = u0Var.f2402a;
            if (i10 >= t0VarArr.length) {
                break;
            }
            t0VarArr[i10].b(a2);
            i10++;
        }
        h0Var.f11009o0 = new s0(a2);
        s0 f12 = h0Var.f1();
        if (!f12.equals(h0Var.Q)) {
            h0Var.Q = f12;
            rVar.c(14, new f1.a(b0Var, 8));
        }
        rVar.c(28, new f1.a(u0Var, 9));
        rVar.b();
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            H((u0) message.obj);
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
    public final void u(x[] xVarArr, long j10, long j11, g0 g0Var) {
        this.M = this.I.a(xVarArr[0]);
        u0 u0Var = this.Q;
        if (u0Var != null) {
            long j12 = u0Var.f2403b;
            long j13 = (this.R + j12) - j11;
            if (j12 != j13) {
                u0Var = new u0(j13, u0Var.f2402a);
            }
            this.Q = u0Var;
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
                qf.b bVar = this.f10921c;
                bVar.x();
                int w9 = w(bVar, aVar, 0);
                if (w9 == -4) {
                    if (aVar.isEndOfStream()) {
                        this.N = true;
                    } else if (aVar.e >= this.f10926w) {
                        aVar.f14553r = this.P;
                        aVar.d();
                        m mVar = this.M;
                        String str = m0.f8375a;
                        u0 a2 = mVar.a(aVar);
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList(a2.f2402a.length);
                            F(a2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.Q = new u0(G(aVar.e), (t0[]) arrayList.toArray(new t0[0]));
                            }
                        }
                    }
                } else if (w9 == -5) {
                    x xVar = (x) bVar.f43098c;
                    xVar.getClass();
                    this.P = xVar.f2527x;
                }
            }
            u0 u0Var = this.Q;
            if (u0Var != null && u0Var.f2403b <= G(j10)) {
                u0 u0Var2 = this.Q;
                Handler handler = this.K;
                if (handler != null) {
                    handler.obtainMessage(1, u0Var2).sendToTarget();
                } else {
                    H(u0Var2);
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

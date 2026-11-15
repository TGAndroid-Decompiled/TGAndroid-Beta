package v2;

import a8.ja;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c8.ba;
import e2.n0;
import e2.o0;
import e2.p0;
import e2.q0;
import e2.u;
import h2.l0;
import h2.r;
import i5.c;
import java.util.ArrayList;
import ki.e;
import l2.f0;
import l2.z;
public final class b extends l2.b implements Handler.Callback {
    public final a J;
    public final z K;
    public final Handler L;
    public final o3.a M;
    public ba N;
    public boolean O;
    public boolean P;
    public long Q;
    public q0 R;
    public long S;

    public b(z zVar, Looper looper) {
        super(5);
        Handler handler;
        this.K = zVar;
        if (looper == null) {
            handler = null;
        } else {
            String str = l0.f13471a;
            handler = new Handler(looper, this);
        }
        this.L = handler;
        this.J = a.f58463a;
        this.M = new o3.a();
        this.S = -9223372036854775807L;
    }

    @Override
    public final int C(u uVar) {
        int i7;
        if (this.J.b(uVar)) {
            if (uVar.T == 0) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            return c.a(i7, 0, 0, 0);
        }
        return c.a(0, 0, 0, 0);
    }

    public final void F(q0 q0Var, ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            p0[] p0VarArr = q0Var.f10320a;
            if (i7 < p0VarArr.length) {
                u a10 = p0VarArr[i7].a();
                if (a10 != null) {
                    a aVar = this.J;
                    if (aVar.b(a10)) {
                        ba a11 = aVar.a(a10);
                        byte[] c10 = p0VarArr[i7].c();
                        c10.getClass();
                        o3.a aVar2 = this.M;
                        aVar2.clear();
                        aVar2.b(c10.length);
                        aVar2.f17732c.put(c10);
                        aVar2.c();
                        q0 a12 = a11.a(aVar2);
                        if (a12 != null) {
                            F(a12, arrayList);
                        }
                        i7++;
                    }
                }
                arrayList.add(p0VarArr[i7]);
                i7++;
            } else {
                return;
            }
        }
    }

    public final long G(long j3) {
        boolean z10;
        boolean z11 = false;
        if (j3 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.p(z10);
        if (this.S != -9223372036854775807L) {
            z11 = true;
        }
        ja.p(z11);
        return j3 - this.S;
    }

    public final void H(q0 q0Var) {
        z zVar = this.K;
        f0 f0Var = zVar.f19233a;
        o0 o0Var = f0Var.f18973o0;
        r rVar = f0Var.f18969m;
        n0 a10 = o0Var.a();
        int i7 = 0;
        while (true) {
            p0[] p0VarArr = q0Var.f10320a;
            if (i7 >= p0VarArr.length) {
                break;
            }
            p0VarArr[i7].b(a10);
            i7++;
        }
        f0Var.f18973o0 = new o0(a10);
        o0 f12 = f0Var.f1();
        if (!f12.equals(f0Var.Q)) {
            f0Var.Q = f12;
            rVar.c(14, new e(zVar, 6));
        }
        rVar.c(28, new e(q0Var, 7));
        rVar.b();
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            H((q0) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public final String i() {
        return "MetadataRenderer";
    }

    @Override
    public final boolean l() {
        return this.P;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void n() {
        this.R = null;
        this.N = null;
        this.S = -9223372036854775807L;
    }

    @Override
    public final void p(long j3, boolean z10, boolean z11) {
        this.R = null;
        this.O = false;
        this.P = false;
    }

    @Override
    public final void u(u[] uVarArr, long j3, long j10, x2.f0 f0Var) {
        this.N = this.J.a(uVarArr[0]);
        q0 q0Var = this.R;
        if (q0Var != null) {
            long j11 = q0Var.f10321b;
            long j12 = (this.S + j11) - j10;
            if (j11 != j12) {
                q0Var = new q0(j12, q0Var.f10320a);
            }
            this.R = q0Var;
        }
        this.S = j10;
    }

    @Override
    public final void x(long j3, long j10) {
        boolean z10 = true;
        while (z10) {
            if (!this.O && this.R == null) {
                o3.a aVar = this.M;
                aVar.clear();
                k8.a aVar2 = this.f18890c;
                aVar2.x0();
                int w10 = w(aVar2, aVar, 0);
                if (w10 == -4) {
                    if (aVar.isEndOfStream()) {
                        this.O = true;
                    } else if (aVar.f17733e >= this.f18897x) {
                        aVar.f21314r = this.Q;
                        aVar.c();
                        ba baVar = this.N;
                        String str = l0.f13471a;
                        q0 a10 = baVar.a(aVar);
                        if (a10 != null) {
                            ArrayList arrayList = new ArrayList(a10.f10320a.length);
                            F(a10, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.R = new q0(G(aVar.f17733e), (p0[]) arrayList.toArray(new p0[0]));
                            }
                        }
                    }
                } else if (w10 == -5) {
                    u uVar = (u) aVar2.f17789c;
                    uVar.getClass();
                    this.Q = uVar.f10455x;
                }
            }
            q0 q0Var = this.R;
            if (q0Var != null && q0Var.f10321b <= G(j3)) {
                q0 q0Var2 = this.R;
                Handler handler = this.L;
                if (handler != null) {
                    handler.obtainMessage(1, q0Var2).sendToTarget();
                } else {
                    H(q0Var2);
                }
                this.R = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.O && this.R == null) {
                this.P = true;
            }
        }
    }
}

package s2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b2.m0;
import b2.n0;
import b2.o0;
import b2.p0;
import b2.s;
import e2.d;
import e2.d0;
import e2.p;
import i2.c0;
import i2.f;
import i2.f0;
import i2.g;
import java.util.ArrayList;
import n4.y;
import w7.l;
public final class b extends f implements Handler.Callback {
    public final a I;
    public final c0 J;
    public final Handler K;
    public final l3.a L;
    public l M;
    public boolean N;
    public boolean O;
    public long P;
    public p0 Q;
    public long R;

    public b(c0 c0Var, Looper looper) {
        super(5);
        Handler handler;
        this.J = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = d0.f8765a;
            handler = new Handler(looper, this);
        }
        this.K = handler;
        this.I = a.f45717a;
        this.L = new l3.a();
        this.R = -9223372036854775807L;
    }

    @Override
    public final int A(s sVar) {
        int i10;
        if (this.I.b(sVar)) {
            if (sVar.S == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return g.b(i10, 0, 0, 0);
        }
        return g.b(0, 0, 0, 0);
    }

    public final void C(p0 p0Var, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = p0Var.f2261a;
            if (i10 < o0VarArr.length) {
                s a2 = o0VarArr[i10].a();
                if (a2 != null) {
                    a aVar = this.I;
                    if (aVar.b(a2)) {
                        l a10 = aVar.a(a2);
                        byte[] c10 = o0VarArr[i10].c();
                        c10.getClass();
                        l3.a aVar2 = this.L;
                        aVar2.clear();
                        aVar2.b(c10.length);
                        aVar2.f10876c.put(c10);
                        aVar2.c();
                        p0 a11 = a10.a(aVar2);
                        if (a11 != null) {
                            C(a11, arrayList);
                        }
                        i10++;
                    }
                }
                arrayList.add(o0VarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public final long D(long j3) {
        boolean z10;
        boolean z11 = false;
        if (j3 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.g(z10);
        if (this.R != -9223372036854775807L) {
            z11 = true;
        }
        d.g(z11);
        return j3 - this.R;
    }

    public final void E(p0 p0Var) {
        c0 c0Var = this.J;
        f0 f0Var = c0Var.f11497a;
        n0 n0Var = f0Var.f11545i0;
        p pVar = f0Var.f11552m;
        m0 a2 = n0Var.a();
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = p0Var.f2261a;
            if (i10 >= o0VarArr.length) {
                break;
            }
            o0VarArr[i10].b(a2);
            i10++;
        }
        f0Var.f11545i0 = new n0(a2);
        n0 b12 = f0Var.b1();
        if (!b12.equals(f0Var.O)) {
            f0Var.O = b12;
            pVar.c(14, new fi.f(c0Var, 8));
        }
        pVar.c(28, new fi.f(p0Var, 9));
        pVar.b();
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            E((p0) message.obj);
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
    public final void o() {
        this.Q = null;
        this.M = null;
        this.R = -9223372036854775807L;
    }

    @Override
    public final void q(long j3, boolean z10) {
        this.Q = null;
        this.N = false;
        this.O = false;
    }

    @Override
    public final void v(s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
        this.M = this.I.a(sVarArr[0]);
        p0 p0Var = this.Q;
        if (p0Var != null) {
            long j11 = p0Var.f2262b;
            long j12 = (this.R + j11) - j10;
            if (j11 != j12) {
                p0Var = new p0(j12, p0Var.f2261a);
            }
            this.Q = p0Var;
        }
        this.R = j10;
    }

    @Override
    public final void x(long j3, long j10) {
        boolean z10 = true;
        while (z10) {
            if (!this.N && this.Q == null) {
                l3.a aVar = this.L;
                aVar.clear();
                y yVar = this.f11522c;
                yVar.A();
                int w10 = w(yVar, aVar, 0);
                if (w10 == -4) {
                    if (aVar.isEndOfStream()) {
                        this.N = true;
                    } else if (aVar.f10877e >= this.f11528w) {
                        aVar.f15285r = this.P;
                        aVar.c();
                        l lVar = this.M;
                        String str = d0.f8765a;
                        p0 a2 = lVar.a(aVar);
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList(a2.f2261a.length);
                            C(a2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.Q = new p0(D(aVar.f10877e), (o0[]) arrayList.toArray(new o0[0]));
                            }
                        }
                    }
                } else if (w10 == -5) {
                    s sVar = (s) yVar.f16524c;
                    sVar.getClass();
                    this.P = sVar.f2401w;
                }
            }
            p0 p0Var = this.Q;
            if (p0Var != null && p0Var.f2262b <= D(j3)) {
                p0 p0Var2 = this.Q;
                Handler handler = this.K;
                if (handler != null) {
                    handler.obtainMessage(1, p0Var2).sendToTarget();
                } else {
                    E(p0Var2);
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

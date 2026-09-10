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
import hi.y1;
import i2.b0;
import i2.e0;
import i2.f;
import java.util.ArrayList;
import u2.g0;
import w7.l;
public final class b extends f implements Handler.Callback {
    public final a I;
    public final b0 J;
    public final Handler K;
    public final l3.a L;
    public l M;
    public boolean N;
    public boolean O;
    public long P;
    public p0 Q;
    public long R;

    public b(b0 b0Var, Looper looper) {
        super(5);
        Handler handler;
        this.J = b0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = d0.f7188a;
            handler = new Handler(looper, this);
        }
        this.K = handler;
        this.I = a.f41563a;
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
            return hc.b.c(i10, 0, 0, 0);
        }
        return hc.b.c(0, 0, 0, 0);
    }

    public final void C(p0 p0Var, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = p0Var.f1871a;
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
                        aVar2.f9210c.put(c10);
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
        b0 b0Var = this.J;
        e0 e0Var = b0Var.f10108a;
        n0 n0Var = e0Var.f10143i0;
        p pVar = e0Var.f10150m;
        m0 a2 = n0Var.a();
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = p0Var.f1871a;
            if (i10 >= o0VarArr.length) {
                break;
            }
            o0VarArr[i10].b(a2);
            i10++;
        }
        e0Var.f10143i0 = new n0(a2);
        n0 b12 = e0Var.b1();
        if (!b12.equals(e0Var.O)) {
            e0Var.O = b12;
            pVar.c(14, new y1(b0Var, 11));
        }
        pVar.c(28, new y1(p0Var, 12));
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
    public final void v(s[] sVarArr, long j3, long j10, g0 g0Var) {
        this.M = this.I.a(sVarArr[0]);
        p0 p0Var = this.Q;
        if (p0Var != null) {
            long j11 = p0Var.f1872b;
            long j12 = (this.R + j11) - j10;
            if (j11 != j12) {
                p0Var = new p0(j12, p0Var.f1871a);
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
                of.b bVar = this.f10175c;
                bVar.F();
                int w10 = w(bVar, aVar, 0);
                if (w10 == -4) {
                    if (aVar.isEndOfStream()) {
                        this.N = true;
                    } else if (aVar.e >= this.f10180w) {
                        aVar.f12770r = this.P;
                        aVar.c();
                        l lVar = this.M;
                        String str = d0.f7188a;
                        p0 a2 = lVar.a(aVar);
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList(a2.f1871a.length);
                            C(a2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.Q = new p0(D(aVar.e), (o0[]) arrayList.toArray(new o0[0]));
                            }
                        }
                    }
                } else if (w10 == -5) {
                    s sVar = (s) bVar.f14295c;
                    sVar.getClass();
                    this.P = sVar.f2006w;
                }
            }
            p0 p0Var = this.Q;
            if (p0Var != null && p0Var.f1872b <= D(j3)) {
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

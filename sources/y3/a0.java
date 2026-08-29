package y3;

import i7.g0;
import j3.s0;
import j3.t0;
import java.util.List;
public final class a0 {
    public final int f50213a;
    public final List f50214b;
    public final o3.w[] f50215c;

    public a0(int i10, List list) {
        this.f50213a = i10;
        switch (i10) {
            case 1:
                this.f50214b = list;
                this.f50215c = new o3.w[list.size()];
                return;
            default:
                this.f50214b = list;
                this.f50215c = new o3.w[list.size()];
                return;
        }
    }

    public void a(long j10, f5.w wVar) {
        if (wVar.a() >= 9) {
            int e10 = wVar.e();
            int e11 = wVar.e();
            int r6 = wVar.r();
            if (e10 == 434 && e11 == 1195456820 && r6 == 3) {
                g0.b(j10, wVar, this.f50215c);
            }
        }
    }

    public final void b(o3.m mVar, d0 d0Var) {
        boolean z10;
        boolean z11;
        switch (this.f50213a) {
            case 0:
                int i10 = 0;
                while (true) {
                    o3.w[] wVarArr = this.f50215c;
                    if (i10 < wVarArr.length) {
                        d0Var.a();
                        d0Var.b();
                        o3.w Z1 = mVar.Z1(d0Var.d, 3);
                        t0 t0Var = (t0) this.f50214b.get(i10);
                        String str = t0Var.B;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        f5.a.e("Invalid closed caption mime type provided: " + str, z10);
                        String str2 = t0Var.f10797a;
                        if (str2 == null) {
                            d0Var.b();
                            str2 = d0Var.f50261e;
                        }
                        s0 s0Var = new s0();
                        s0Var.f10730a = str2;
                        s0Var.f10742o = str;
                        s0Var.d = t0Var.d;
                        s0Var.f10732c = t0Var.f10799c;
                        s0Var.G = t0Var.T;
                        s0Var.f10744q = t0Var.D;
                        Z1.b(new t0(s0Var));
                        wVarArr[i10] = Z1;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    o3.w[] wVarArr2 = this.f50215c;
                    if (i11 < wVarArr2.length) {
                        d0Var.a();
                        d0Var.b();
                        o3.w Z12 = mVar.Z1(d0Var.d, 3);
                        t0 t0Var2 = (t0) this.f50214b.get(i11);
                        String str3 = t0Var2.B;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        f5.a.e("Invalid closed caption mime type provided: " + str3, z11);
                        s0 s0Var2 = new s0();
                        d0Var.b();
                        s0Var2.f10730a = d0Var.f50261e;
                        s0Var2.f10742o = str3;
                        s0Var2.d = t0Var2.d;
                        s0Var2.f10732c = t0Var2.f10799c;
                        s0Var2.G = t0Var2.T;
                        s0Var2.f10744q = t0Var2.D;
                        Z12.b(new t0(s0Var2));
                        wVarArr2[i11] = Z12;
                        i11++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}

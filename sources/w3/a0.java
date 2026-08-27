package w3;

import h3.s0;
import h3.t0;
import java.util.List;

public final class a0 {

    public final int f48983a;

    public final List f48984b;

    public final m3.w[] f48985c;

    public a0(int i10, List list) {
        this.f48983a = i10;
        switch (i10) {
            case 1:
                this.f48984b = list;
                this.f48985c = new m3.w[list.size()];
                break;
            default:
                this.f48984b = list;
                this.f48985c = new m3.w[list.size()];
                break;
        }
    }

    public void a(long j10, d5.z zVar) {
        if (zVar.a() < 9) {
            return;
        }
        int iE = zVar.e();
        int iE2 = zVar.e();
        int iR = zVar.r();
        if (iE == 434 && iE2 == 1195456820 && iR == 3) {
            h7.p.b(j10, zVar, this.f48985c);
        }
    }

    public final void b(m3.m mVar, e0 e0Var) {
        switch (this.f48983a) {
            case 0:
                int i10 = 0;
                while (true) {
                    m3.w[] wVarArr = this.f48985c;
                    if (i10 < wVarArr.length) {
                        e0Var.a();
                        e0Var.b();
                        m3.w wVarC = mVar.C(e0Var.d, 3);
                        t0 t0Var = (t0) this.f48984b.get(i10);
                        String str = t0Var.B;
                        d5.a.e("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                        String str2 = t0Var.f8184a;
                        if (str2 == null) {
                            e0Var.b();
                            str2 = e0Var.f49053e;
                        }
                        s0 s0Var = new s0();
                        s0Var.f8123a = str2;
                        s0Var.f8135o = str;
                        s0Var.d = t0Var.d;
                        s0Var.f8125c = t0Var.f8186c;
                        s0Var.G = t0Var.T;
                        s0Var.f8137q = t0Var.D;
                        wVarC.c(new t0(s0Var));
                        wVarArr[i10] = wVarC;
                        i10++;
                    }
                    break;
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    m3.w[] wVarArr2 = this.f48985c;
                    if (i11 < wVarArr2.length) {
                        e0Var.a();
                        e0Var.b();
                        m3.w wVarC2 = mVar.C(e0Var.d, 3);
                        t0 t0Var2 = (t0) this.f48984b.get(i11);
                        String str3 = t0Var2.B;
                        d5.a.e("Invalid closed caption mime type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                        s0 s0Var2 = new s0();
                        e0Var.b();
                        s0Var2.f8123a = e0Var.f49053e;
                        s0Var2.f8135o = str3;
                        s0Var2.d = t0Var2.d;
                        s0Var2.f8125c = t0Var2.f8186c;
                        s0Var2.G = t0Var2.T;
                        s0Var2.f8137q = t0Var2.D;
                        wVarC2.c(new t0(s0Var2));
                        wVarArr2[i11] = wVarC2;
                        i11++;
                    }
                    break;
                }
                break;
        }
    }
}

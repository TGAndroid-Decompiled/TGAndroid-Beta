package w3;

import h3.s0;
import h3.t0;
import java.util.List;
public final class a0 {
    public final int f48480a;
    public final List f48481b;
    public final m3.w[] f48482c;

    public a0(int i9, List list) {
        this.f48480a = i9;
        switch (i9) {
            case 1:
                this.f48481b = list;
                this.f48482c = new m3.w[list.size()];
                return;
            default:
                this.f48481b = list;
                this.f48482c = new m3.w[list.size()];
                return;
        }
    }

    public void a(long j10, d5.y yVar) {
        if (yVar.a() >= 9) {
            int e10 = yVar.e();
            int e11 = yVar.e();
            int r10 = yVar.r();
            if (e10 == 434 && e11 == 1195456820 && r10 == 3) {
                g7.p.b(j10, yVar, this.f48482c);
            }
        }
    }

    public final void b(m3.m mVar, d0 d0Var) {
        boolean z10;
        boolean z11;
        switch (this.f48480a) {
            case 0:
                int i9 = 0;
                while (true) {
                    m3.w[] wVarArr = this.f48482c;
                    if (i9 < wVarArr.length) {
                        d0Var.a();
                        d0Var.b();
                        m3.w I = mVar.I(d0Var.d, 3);
                        t0 t0Var = (t0) this.f48481b.get(i9);
                        String str = t0Var.B;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        d5.a.e("Invalid closed caption mime type provided: " + str, z10);
                        String str2 = t0Var.f9760a;
                        if (str2 == null) {
                            d0Var.b();
                            str2 = d0Var.f48528e;
                        }
                        s0 s0Var = new s0();
                        s0Var.f9693a = str2;
                        s0Var.f9705o = str;
                        s0Var.d = t0Var.d;
                        s0Var.f9695c = t0Var.f9762c;
                        s0Var.G = t0Var.T;
                        s0Var.f9707q = t0Var.D;
                        I.c(new t0(s0Var));
                        wVarArr[i9] = I;
                        i9++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    m3.w[] wVarArr2 = this.f48482c;
                    if (i10 < wVarArr2.length) {
                        d0Var.a();
                        d0Var.b();
                        m3.w I2 = mVar.I(d0Var.d, 3);
                        t0 t0Var2 = (t0) this.f48481b.get(i10);
                        String str3 = t0Var2.B;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        d5.a.e("Invalid closed caption mime type provided: " + str3, z11);
                        s0 s0Var2 = new s0();
                        d0Var.b();
                        s0Var2.f9693a = d0Var.f48528e;
                        s0Var2.f9705o = str3;
                        s0Var2.d = t0Var2.d;
                        s0Var2.f9695c = t0Var2.f9762c;
                        s0Var2.G = t0Var2.T;
                        s0Var2.f9707q = t0Var2.D;
                        I2.c(new t0(s0Var2));
                        wVarArr2[i10] = I2;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}

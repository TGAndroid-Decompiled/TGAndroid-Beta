package x2;

import b2.w1;
import i2.q1;
import j$.util.Objects;
import v7.u6;
public final class t {
    public final int f47791a;
    public final q1[] f47792b;
    public final p[] f47793c;
    public final w1 d;
    public final Object e;

    public t(q1[] q1VarArr, p[] pVarArr, w1 w1Var, Object obj) {
        boolean z10;
        if (q1VarArr.length == pVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f47792b = q1VarArr;
        this.f47793c = (p[]) pVarArr.clone();
        this.d = w1Var;
        this.e = obj;
        this.f47791a = q1VarArr.length;
    }

    public final boolean a(t tVar, int i10) {
        if (tVar == null || !Objects.equals(this.f47792b[i10], tVar.f47792b[i10]) || !Objects.equals(this.f47793c[i10], tVar.f47793c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f47792b[i10] != null) {
            return true;
        }
        return false;
    }
}

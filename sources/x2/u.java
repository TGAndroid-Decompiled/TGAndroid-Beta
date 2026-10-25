package x2;

import a8.yb;
import b2.w1;
import i2.q1;
import j$.util.Objects;
public final class u {
    public final int f51358a;
    public final q1[] f51359b;
    public final q[] f51360c;
    public final w1 d;
    public final Object e;

    public u(q1[] q1VarArr, q[] qVarArr, w1 w1Var, Object obj) {
        boolean z10;
        if (q1VarArr.length == qVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        this.f51359b = q1VarArr;
        this.f51360c = (q[]) qVarArr.clone();
        this.d = w1Var;
        this.e = obj;
        this.f51358a = q1VarArr.length;
    }

    public final boolean a(u uVar, int i10) {
        if (uVar == null || !Objects.equals(this.f51359b[i10], uVar.f51359b[i10]) || !Objects.equals(this.f51360c[i10], uVar.f51360c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f51359b[i10] != null) {
            return true;
        }
        return false;
    }
}

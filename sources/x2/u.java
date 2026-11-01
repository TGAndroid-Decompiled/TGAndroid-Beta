package x2;

import b2.w1;
import i2.s1;
import j$.util.Objects;
import v7.t6;
public final class u {
    public final int f52974a;
    public final s1[] f52975b;
    public final q[] f52976c;
    public final w1 d;
    public final Object e;

    public u(s1[] s1VarArr, q[] qVarArr, w1 w1Var, Object obj) {
        boolean z10;
        if (s1VarArr.length == qVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        this.f52975b = s1VarArr;
        this.f52976c = (q[]) qVarArr.clone();
        this.d = w1Var;
        this.e = obj;
        this.f52974a = s1VarArr.length;
    }

    public final boolean a(u uVar, int i10) {
        if (uVar == null || !Objects.equals(this.f52975b[i10], uVar.f52975b[i10]) || !Objects.equals(this.f52976c[i10], uVar.f52976c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f52975b[i10] != null) {
            return true;
        }
        return false;
    }
}

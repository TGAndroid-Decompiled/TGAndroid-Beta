package x2;

import b2.v1;
import i2.p1;
import j$.util.Objects;
import v7.u6;
public final class t {
    public final int f49630a;
    public final p1[] f49631b;
    public final p[] f49632c;
    public final v1 d;
    public final Object e;

    public t(p1[] p1VarArr, p[] pVarArr, v1 v1Var, Object obj) {
        boolean z10;
        if (p1VarArr.length == pVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f49631b = p1VarArr;
        this.f49632c = (p[]) pVarArr.clone();
        this.d = v1Var;
        this.e = obj;
        this.f49630a = p1VarArr.length;
    }

    public final boolean a(t tVar, int i10) {
        if (tVar == null || !Objects.equals(this.f49631b[i10], tVar.f49631b[i10]) || !Objects.equals(this.f49632c[i10], tVar.f49632c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f49631b[i10] != null) {
            return true;
        }
        return false;
    }
}

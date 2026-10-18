package x2;

import b2.v1;
import i2.o1;
import j$.util.Objects;
import v7.u6;
public final class t {
    public final int f49178a;
    public final o1[] f49179b;
    public final p[] f49180c;
    public final v1 d;
    public final Object e;

    public t(o1[] o1VarArr, p[] pVarArr, v1 v1Var, Object obj) {
        boolean z10;
        if (o1VarArr.length == pVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f49179b = o1VarArr;
        this.f49180c = (p[]) pVarArr.clone();
        this.d = v1Var;
        this.e = obj;
        this.f49178a = o1VarArr.length;
    }

    public final boolean a(t tVar, int i10) {
        if (tVar == null || !Objects.equals(this.f49179b[i10], tVar.f49179b[i10]) || !Objects.equals(this.f49180c[i10], tVar.f49180c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f49179b[i10] != null) {
            return true;
        }
        return false;
    }
}

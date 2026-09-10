package x2;

import b2.s1;
import i2.l1;
import j$.util.Objects;
public final class v {
    public final int f44558a;
    public final l1[] f44559b;
    public final r[] f44560c;
    public final s1 d;
    public final Object e;

    public v(l1[] l1VarArr, r[] rVarArr, s1 s1Var, Object obj) {
        boolean z10;
        if (l1VarArr.length == rVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f44559b = l1VarArr;
        this.f44560c = (r[]) rVarArr.clone();
        this.d = s1Var;
        this.e = obj;
        this.f44558a = l1VarArr.length;
    }

    public final boolean a(v vVar, int i10) {
        if (vVar == null || !Objects.equals(this.f44559b[i10], vVar.f44559b[i10]) || !Objects.equals(this.f44560c[i10], vVar.f44560c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f44559b[i10] != null) {
            return true;
        }
        return false;
    }
}

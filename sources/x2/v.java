package x2;

import b2.s1;
import i2.n1;
import j$.util.Objects;
public final class v {
    public final int f49250a;
    public final n1[] f49251b;
    public final r[] f49252c;
    public final s1 d;
    public final Object f49253e;

    public v(n1[] n1VarArr, r[] rVarArr, s1 s1Var, Object obj) {
        boolean z10;
        if (n1VarArr.length == rVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f49251b = n1VarArr;
        this.f49252c = (r[]) rVarArr.clone();
        this.d = s1Var;
        this.f49253e = obj;
        this.f49250a = n1VarArr.length;
    }

    public final boolean a(v vVar, int i10) {
        if (vVar == null || !Objects.equals(this.f49251b[i10], vVar.f49251b[i10]) || !Objects.equals(this.f49252c[i10], vVar.f49252c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f49251b[i10] != null) {
            return true;
        }
        return false;
    }
}

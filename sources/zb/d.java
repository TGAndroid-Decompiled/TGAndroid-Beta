package zb;

import a8.r7;
import c8.te;
import java.util.Arrays;
import q6.m;
public final class d {
    public final boolean f59930a;
    public final boolean f59931b;
    public final boolean f59932c;

    public d(ia.a aVar) {
        this.f59930a = aVar.f15407a;
        this.f59931b = aVar.f15408b;
        this.f59932c = aVar.f15409c;
    }

    public final te a() {
        r7 r7Var = new r7(4);
        Boolean bool = Boolean.FALSE;
        r7Var.d = bool;
        r7Var.f616e = Boolean.valueOf(this.f59930a);
        r7Var.f617f = Boolean.valueOf(this.f59931b);
        r7Var.f614b = bool;
        r7Var.f615c = Boolean.valueOf(this.f59932c);
        return new te(r7Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f59930a == dVar.f59930a && this.f59931b == dVar.f59931b && this.f59932c == dVar.f59932c && m.k(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f59930a);
        Boolean valueOf2 = Boolean.valueOf(this.f59931b);
        Boolean valueOf3 = Boolean.valueOf(this.f59932c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

package zb;

import a8.r7;
import c8.te;
import java.util.Arrays;
import q6.m;
public final class d {
    public final boolean f59905a;
    public final boolean f59906b;
    public final boolean f59907c;

    public d(ia.a aVar) {
        this.f59905a = aVar.f15407a;
        this.f59906b = aVar.f15408b;
        this.f59907c = aVar.f15409c;
    }

    public final te a() {
        r7 r7Var = new r7(4);
        Boolean bool = Boolean.FALSE;
        r7Var.d = bool;
        r7Var.f616e = Boolean.valueOf(this.f59905a);
        r7Var.f617f = Boolean.valueOf(this.f59906b);
        r7Var.f614b = bool;
        r7Var.f615c = Boolean.valueOf(this.f59907c);
        return new te(r7Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f59905a == dVar.f59905a && this.f59906b == dVar.f59906b && this.f59907c == dVar.f59907c && m.k(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f59905a);
        Boolean valueOf2 = Boolean.valueOf(this.f59906b);
        Boolean valueOf3 = Boolean.valueOf(this.f59907c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

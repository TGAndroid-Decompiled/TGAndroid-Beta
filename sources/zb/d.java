package zb;

import a8.r7;
import c8.te;
import java.util.Arrays;
import q6.m;
public final class d {
    public final boolean f60036a;
    public final boolean f60037b;
    public final boolean f60038c;

    public d(ia.a aVar) {
        this.f60036a = aVar.f15412a;
        this.f60037b = aVar.f15413b;
        this.f60038c = aVar.f15414c;
    }

    public final te a() {
        r7 r7Var = new r7(4, (byte) 0);
        Boolean bool = Boolean.FALSE;
        r7Var.d = bool;
        r7Var.f616e = Boolean.valueOf(this.f60036a);
        r7Var.f617f = Boolean.valueOf(this.f60037b);
        r7Var.f614b = bool;
        r7Var.f615c = Boolean.valueOf(this.f60038c);
        return new te(r7Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f60036a == dVar.f60036a && this.f60037b == dVar.f60037b && this.f60038c == dVar.f60038c && m.k(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f60036a);
        Boolean valueOf2 = Boolean.valueOf(this.f60037b);
        Boolean valueOf3 = Boolean.valueOf(this.f60038c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

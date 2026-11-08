package zb;

import a8.r7;
import c8.te;
import java.util.Arrays;
import q6.m;
public final class d {
    public final boolean f60029a;
    public final boolean f60030b;
    public final boolean f60031c;

    public d(ia.a aVar) {
        this.f60029a = aVar.f15410a;
        this.f60030b = aVar.f15411b;
        this.f60031c = aVar.f15412c;
    }

    public final te a() {
        r7 r7Var = new r7(4, (byte) 0);
        Boolean bool = Boolean.FALSE;
        r7Var.d = bool;
        r7Var.f616e = Boolean.valueOf(this.f60029a);
        r7Var.f617f = Boolean.valueOf(this.f60030b);
        r7Var.f614b = bool;
        r7Var.f615c = Boolean.valueOf(this.f60031c);
        return new te(r7Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f60029a == dVar.f60029a && this.f60030b == dVar.f60030b && this.f60031c == dVar.f60031c && m.k(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f60029a);
        Boolean valueOf2 = Boolean.valueOf(this.f60030b);
        Boolean valueOf3 = Boolean.valueOf(this.f60031c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

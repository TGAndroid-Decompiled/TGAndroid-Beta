package zb;

import a8.r7;
import c8.te;
import java.util.Arrays;
import q6.m;
public final class d {
    public final boolean f60028a;
    public final boolean f60029b;
    public final boolean f60030c;

    public d(ia.a aVar) {
        this.f60028a = aVar.f15410a;
        this.f60029b = aVar.f15411b;
        this.f60030c = aVar.f15412c;
    }

    public final te a() {
        r7 r7Var = new r7(4, (byte) 0);
        Boolean bool = Boolean.FALSE;
        r7Var.d = bool;
        r7Var.f616e = Boolean.valueOf(this.f60028a);
        r7Var.f617f = Boolean.valueOf(this.f60029b);
        r7Var.f614b = bool;
        r7Var.f615c = Boolean.valueOf(this.f60030c);
        return new te(r7Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f60028a == dVar.f60028a && this.f60029b == dVar.f60029b && this.f60030c == dVar.f60030c && m.k(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f60028a);
        Boolean valueOf2 = Boolean.valueOf(this.f60029b);
        Boolean valueOf3 = Boolean.valueOf(this.f60030c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

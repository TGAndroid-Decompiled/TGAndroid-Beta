package zb;

import a8.r7;
import c8.te;
import java.util.Arrays;
import q6.m;
public final class d {
    public final boolean f61843a;
    public final boolean f61844b;
    public final boolean f61845c;

    public d(ia.a aVar) {
        this.f61843a = aVar.f16205a;
        this.f61844b = aVar.f16206b;
        this.f61845c = aVar.f16207c;
    }

    public final te a() {
        r7 r7Var = new r7(4, (byte) 0);
        Boolean bool = Boolean.FALSE;
        r7Var.d = bool;
        r7Var.f619e = Boolean.valueOf(this.f61843a);
        r7Var.f620f = Boolean.valueOf(this.f61844b);
        r7Var.f617b = bool;
        r7Var.f618c = Boolean.valueOf(this.f61845c);
        return new te(r7Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f61843a == dVar.f61843a && this.f61844b == dVar.f61844b && this.f61845c == dVar.f61845c && m.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f61843a);
        Boolean valueOf2 = Boolean.valueOf(this.f61844b);
        Boolean valueOf3 = Boolean.valueOf(this.f61845c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

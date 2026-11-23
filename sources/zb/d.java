package zb;

import a8.r7;
import c8.te;
import java.util.Arrays;
import q6.m;
public final class d {
    public final boolean f61812a;
    public final boolean f61813b;
    public final boolean f61814c;

    public d(ia.a aVar) {
        this.f61812a = aVar.f16174a;
        this.f61813b = aVar.f16175b;
        this.f61814c = aVar.f16176c;
    }

    public final te a() {
        r7 r7Var = new r7(4, (byte) 0);
        Boolean bool = Boolean.FALSE;
        r7Var.d = bool;
        r7Var.f618e = Boolean.valueOf(this.f61812a);
        r7Var.f619f = Boolean.valueOf(this.f61813b);
        r7Var.f616b = bool;
        r7Var.f617c = Boolean.valueOf(this.f61814c);
        return new te(r7Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f61812a == dVar.f61812a && this.f61813b == dVar.f61813b && this.f61814c == dVar.f61814c && m.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f61812a);
        Boolean valueOf2 = Boolean.valueOf(this.f61813b);
        Boolean valueOf3 = Boolean.valueOf(this.f61814c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

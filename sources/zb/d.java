package zb;

import a8.r7;
import c8.te;
import java.util.Arrays;
import q6.m;
public final class d {
    public final boolean f61931a;
    public final boolean f61932b;
    public final boolean f61933c;

    public d(ia.a aVar) {
        this.f61931a = aVar.f16271a;
        this.f61932b = aVar.f16272b;
        this.f61933c = aVar.f16273c;
    }

    public final te a() {
        r7 r7Var = new r7(4, (byte) 0);
        Boolean bool = Boolean.FALSE;
        r7Var.d = bool;
        r7Var.f618e = Boolean.valueOf(this.f61931a);
        r7Var.f619f = Boolean.valueOf(this.f61932b);
        r7Var.f616b = bool;
        r7Var.f617c = Boolean.valueOf(this.f61933c);
        return new te(r7Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f61931a == dVar.f61931a && this.f61932b == dVar.f61932b && this.f61933c == dVar.f61933c && m.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f61931a);
        Boolean valueOf2 = Boolean.valueOf(this.f61932b);
        Boolean valueOf3 = Boolean.valueOf(this.f61933c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

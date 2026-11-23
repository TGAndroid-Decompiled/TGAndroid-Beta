package zb;

import a8.r7;
import c8.te;
import java.util.Arrays;
import q6.m;
public final class d {
    public final boolean f61847a;
    public final boolean f61848b;
    public final boolean f61849c;

    public d(ia.a aVar) {
        this.f61847a = aVar.f16208a;
        this.f61848b = aVar.f16209b;
        this.f61849c = aVar.f16210c;
    }

    public final te a() {
        r7 r7Var = new r7(4, (byte) 0);
        Boolean bool = Boolean.FALSE;
        r7Var.d = bool;
        r7Var.f619e = Boolean.valueOf(this.f61847a);
        r7Var.f620f = Boolean.valueOf(this.f61848b);
        r7Var.f617b = bool;
        r7Var.f618c = Boolean.valueOf(this.f61849c);
        return new te(r7Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f61847a == dVar.f61847a && this.f61848b == dVar.f61848b && this.f61849c == dVar.f61849c && m.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f61847a);
        Boolean valueOf2 = Boolean.valueOf(this.f61848b);
        Boolean valueOf3 = Boolean.valueOf(this.f61849c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

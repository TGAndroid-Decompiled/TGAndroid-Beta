package zb;

import a8.r7;
import c8.te;
import java.util.Arrays;
import q6.m;
public final class d {
    public final boolean f61802a;
    public final boolean f61803b;
    public final boolean f61804c;

    public d(ia.a aVar) {
        this.f61802a = aVar.f16180a;
        this.f61803b = aVar.f16181b;
        this.f61804c = aVar.f16182c;
    }

    public final te a() {
        r7 r7Var = new r7(4, (byte) 0);
        Boolean bool = Boolean.FALSE;
        r7Var.d = bool;
        r7Var.f619e = Boolean.valueOf(this.f61802a);
        r7Var.f620f = Boolean.valueOf(this.f61803b);
        r7Var.f617b = bool;
        r7Var.f618c = Boolean.valueOf(this.f61804c);
        return new te(r7Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f61802a == dVar.f61802a && this.f61803b == dVar.f61803b && this.f61804c == dVar.f61804c && m.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f61802a);
        Boolean valueOf2 = Boolean.valueOf(this.f61803b);
        Boolean valueOf3 = Boolean.valueOf(this.f61804c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

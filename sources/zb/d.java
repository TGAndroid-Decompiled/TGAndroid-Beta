package zb;

import a8.r7;
import c8.te;
import java.util.Arrays;
import q6.m;
public final class d {
    public final boolean f61801a;
    public final boolean f61802b;
    public final boolean f61803c;

    public d(ia.a aVar) {
        this.f61801a = aVar.f16183a;
        this.f61802b = aVar.f16184b;
        this.f61803c = aVar.f16185c;
    }

    public final te a() {
        r7 r7Var = new r7(4, (byte) 0);
        Boolean bool = Boolean.FALSE;
        r7Var.d = bool;
        r7Var.f619e = Boolean.valueOf(this.f61801a);
        r7Var.f620f = Boolean.valueOf(this.f61802b);
        r7Var.f617b = bool;
        r7Var.f618c = Boolean.valueOf(this.f61803c);
        return new te(r7Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f61801a == dVar.f61801a && this.f61802b == dVar.f61802b && this.f61803c == dVar.f61803c && m.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f61801a);
        Boolean valueOf2 = Boolean.valueOf(this.f61802b);
        Boolean valueOf3 = Boolean.valueOf(this.f61803c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

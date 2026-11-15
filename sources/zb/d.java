package zb;

import a8.r7;
import c8.te;
import java.util.Arrays;
import q6.m;
public final class d {
    public final boolean f61237a;
    public final boolean f61238b;
    public final boolean f61239c;

    public d(ia.a aVar) {
        this.f61237a = aVar.f15865a;
        this.f61238b = aVar.f15866b;
        this.f61239c = aVar.f15867c;
    }

    public final te a() {
        r7 r7Var = new r7(4, (byte) 0);
        Boolean bool = Boolean.FALSE;
        r7Var.d = bool;
        r7Var.f619e = Boolean.valueOf(this.f61237a);
        r7Var.f620f = Boolean.valueOf(this.f61238b);
        r7Var.f617b = bool;
        r7Var.f618c = Boolean.valueOf(this.f61239c);
        return new te(r7Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f61237a == dVar.f61237a && this.f61238b == dVar.f61238b && this.f61239c == dVar.f61239c && m.k(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f61237a);
        Boolean valueOf2 = Boolean.valueOf(this.f61238b);
        Boolean valueOf3 = Boolean.valueOf(this.f61239c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

package tb;

import java.util.Arrays;
import n6.l;
import z7.we;
public final class d {
    public final boolean f48600a;
    public final boolean f48601b;
    public final boolean f48602c;

    public d(ea.b bVar) {
        this.f48600a = bVar.f6459a;
        this.f48601b = bVar.f6460b;
        this.f48602c = bVar.f6461c;
    }

    public final we a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f2777a = bool;
        obj.f2778b = Boolean.valueOf(this.f48600a);
        obj.f2779c = Boolean.valueOf(this.f48601b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f48602c);
        return new we(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f48600a == dVar.f48600a && this.f48601b == dVar.f48601b && this.f48602c == dVar.f48602c && l.k(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f48600a);
        Boolean valueOf2 = Boolean.valueOf(this.f48601b);
        Boolean valueOf3 = Boolean.valueOf(this.f48602c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

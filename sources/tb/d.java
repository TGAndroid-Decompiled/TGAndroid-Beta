package tb;

import java.util.Arrays;
import n6.l;
import z7.we;
public final class d {
    public final boolean f48589a;
    public final boolean f48590b;
    public final boolean f48591c;

    public d(ea.b bVar) {
        this.f48589a = bVar.f6459a;
        this.f48590b = bVar.f6460b;
        this.f48591c = bVar.f6461c;
    }

    public final we a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f2777a = bool;
        obj.f2778b = Boolean.valueOf(this.f48589a);
        obj.f2779c = Boolean.valueOf(this.f48590b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f48591c);
        return new we(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f48589a == dVar.f48589a && this.f48590b == dVar.f48590b && this.f48591c == dVar.f48591c && l.k(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f48589a);
        Boolean valueOf2 = Boolean.valueOf(this.f48590b);
        Boolean valueOf3 = Boolean.valueOf(this.f48591c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

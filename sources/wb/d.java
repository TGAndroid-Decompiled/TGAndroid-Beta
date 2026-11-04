package wb;

import b8.cf;
import b8.ke;
import java.util.Arrays;
import p6.m;
public final class d {
    public final boolean f57448a;
    public final boolean f57449b;
    public final boolean f57450c;

    public d(ha.a aVar) {
        this.f57448a = aVar.f14364a;
        this.f57449b = aVar.f14365b;
        this.f57450c = aVar.f14366c;
    }

    public final cf a() {
        ke keVar = new ke(1);
        Boolean bool = Boolean.FALSE;
        keVar.f2716b = bool;
        keVar.f2717c = Boolean.valueOf(this.f57448a);
        keVar.d = Boolean.valueOf(this.f57449b);
        keVar.f2718e = bool;
        keVar.f2719f = Boolean.valueOf(this.f57450c);
        return new cf(keVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f57448a == dVar.f57448a && this.f57449b == dVar.f57449b && this.f57450c == dVar.f57450c && m.k(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f57448a);
        Boolean valueOf2 = Boolean.valueOf(this.f57449b);
        Boolean valueOf3 = Boolean.valueOf(this.f57450c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}

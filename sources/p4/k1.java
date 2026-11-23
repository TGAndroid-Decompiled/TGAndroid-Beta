package p4;

import j$.util.Objects;
import java.util.HashSet;
public final class k1 {
    public static final String f55449b;
    public final h9.t0 f55450a;

    static {
        new k1(new HashSet());
        String str = h2.l0.f13778a;
        f55449b = Integer.toString(0, 36);
    }

    public k1(HashSet hashSet) {
        this.f55450a = h9.t0.q(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        return this.f55450a.equals(((k1) obj).f55450a);
    }

    public final int hashCode() {
        return Objects.hash(this.f55450a);
    }
}

package p4;

import j$.util.Objects;
import java.util.HashSet;
public final class j1 {
    public static final String f53334b;
    public final h9.t0 f53335a;

    static {
        new j1(new HashSet());
        String str = h2.m0.f14112a;
        f53334b = Integer.toString(0, 36);
    }

    public j1(HashSet hashSet) {
        this.f53335a = h9.t0.q(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        return this.f53335a.equals(((j1) obj).f53335a);
    }

    public final int hashCode() {
        return Objects.hash(this.f53335a);
    }
}

package p4;

import j$.util.Objects;
import java.util.HashSet;
public final class j1 {
    public static final String f54752b;
    public final h9.t0 f54753a;

    static {
        new j1(new HashSet());
        String str = h2.l0.f13471a;
        f54752b = Integer.toString(0, 36);
    }

    public j1(HashSet hashSet) {
        this.f54753a = h9.t0.q(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        return this.f54753a.equals(((j1) obj).f54753a);
    }

    public final int hashCode() {
        return Objects.hash(this.f54753a);
    }
}

package p4;

import j$.util.Objects;
import java.util.HashSet;
public final class l1 {
    public static final String f55323b;
    public final h9.t0 f55324a;

    static {
        new l1(new HashSet());
        String str = h2.l0.f13786a;
        f55323b = Integer.toString(0, 36);
    }

    public l1(HashSet hashSet) {
        this.f55324a = h9.t0.q(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        return this.f55324a.equals(((l1) obj).f55324a);
    }

    public final int hashCode() {
        return Objects.hash(this.f55324a);
    }
}

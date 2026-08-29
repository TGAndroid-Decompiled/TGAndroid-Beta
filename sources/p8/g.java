package p8;

import java.io.Serializable;
import java.util.List;
public final class g implements f, Serializable {
    public final List f45661a;

    public g(List list) {
        this.f45661a = list;
    }

    @Override
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f45661a;
            if (i10 < list.size()) {
                if (!((f) list.get(i10)).apply(obj)) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f45661a.equals(((g) obj).f45661a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45661a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f45661a) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}

package r8;

import java.io.Serializable;
import java.util.List;
public final class g implements f, Serializable {
    public final List f46772a;

    public g(List list) {
        this.f46772a = list;
    }

    @Override
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f46772a;
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
            return this.f46772a.equals(((g) obj).f46772a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46772a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z4 = true;
        for (Object obj : this.f46772a) {
            if (!z4) {
                sb.append(',');
            }
            sb.append(obj);
            z4 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}

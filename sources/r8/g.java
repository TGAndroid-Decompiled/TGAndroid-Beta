package r8;

import java.io.Serializable;
import java.util.List;
public final class g implements f, Serializable {
    public final List f43391a;

    public g(List list) {
        this.f43391a = list;
    }

    @Override
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f43391a;
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
            return this.f43391a.equals(((g) obj).f43391a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43391a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z4 = true;
        for (Object obj : this.f43391a) {
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

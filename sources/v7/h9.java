package v7;

import java.util.Set;
public abstract class h9 extends d9 implements Set {
    public transient g9 f50466b;

    @Override
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int i10;
        int i11 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 += i10;
        }
        return i11;
    }

    public final g9 p() {
        g9 g9Var = this.f50466b;
        if (g9Var == null) {
            j9 j9Var = new j9((a) this);
            this.f50466b = j9Var;
            return j9Var;
        }
        return g9Var;
    }
}

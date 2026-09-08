package v7;

import java.util.Set;
public abstract class i9 extends e9 implements Set {
    public transient h9 f47506b;

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

    public final h9 q() {
        h9 h9Var = this.f47506b;
        if (h9Var == null) {
            k9 k9Var = new k9((a) this);
            this.f47506b = k9Var;
            return k9Var;
        }
        return h9Var;
    }
}

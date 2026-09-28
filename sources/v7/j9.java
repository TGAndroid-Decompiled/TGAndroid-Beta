package v7;

import java.util.Set;
public abstract class j9 extends f9 implements Set {
    public transient i9 f44295b;

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

    public final i9 q() {
        i9 i9Var = this.f44295b;
        if (i9Var == null) {
            l9 l9Var = new l9((a) this);
            this.f44295b = l9Var;
            return l9Var;
        }
        return i9Var;
    }
}

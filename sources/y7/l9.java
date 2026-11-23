package y7;

import java.util.Set;
public abstract class l9 extends h9 implements Set {
    public transient k9 f60899b;

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
        int i7;
        int i10 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i10 += i7;
        }
        return i10;
    }

    public final k9 l() {
        k9 k9Var = this.f60899b;
        if (k9Var == null) {
            n9 n9Var = new n9((a) this);
            this.f60899b = n9Var;
            return n9Var;
        }
        return k9Var;
    }
}

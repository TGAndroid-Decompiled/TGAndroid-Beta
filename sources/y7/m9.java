package y7;

import java.util.Set;
public abstract class m9 extends i9 implements Set {
    public transient l9 f59105b;

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

    public final l9 l() {
        l9 l9Var = this.f59105b;
        if (l9Var == null) {
            o9 o9Var = new o9((a) this);
            this.f59105b = o9Var;
            return o9Var;
        }
        return l9Var;
    }
}

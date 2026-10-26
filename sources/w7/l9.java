package w7;

import java.util.Set;
public abstract class l9 extends h9 implements Set {
    public transient k9 f50922b;

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

    public final k9 p() {
        k9 k9Var = this.f50922b;
        if (k9Var == null) {
            n9 n9Var = new n9((a) this);
            this.f50922b = n9Var;
            return n9Var;
        }
        return k9Var;
    }
}

package x7;

import java.util.Set;
public abstract class j9 extends f9 implements Set {
    public transient i9 f58341b;

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
        int i3;
        int i10 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i3 = obj.hashCode();
            } else {
                i3 = 0;
            }
            i10 += i3;
        }
        return i10;
    }

    public final i9 l() {
        i9 i9Var = this.f58341b;
        if (i9Var == null) {
            l9 l9Var = new l9((a) this);
            this.f58341b = l9Var;
            return l9Var;
        }
        return i9Var;
    }
}

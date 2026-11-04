package z7;

import java.util.Set;
public abstract class o extends j implements Set {
    public transient n f59987b;

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
}

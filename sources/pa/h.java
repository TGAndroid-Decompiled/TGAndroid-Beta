package pa;

import java.util.ArrayList;
import java.util.Iterator;
import kf.k0;
public final class h extends i implements Iterable {
    public final ArrayList f41109a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof h) || !((h) obj).f41109a.equals(this.f41109a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f41109a.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.f41109a.iterator();
    }

    @Override
    public final String n() {
        ArrayList arrayList = this.f41109a;
        int size = arrayList.size();
        if (size == 1) {
            return ((i) arrayList.get(0)).n();
        }
        throw new IllegalStateException(k0.j(size, "Array must have size 1, but has size "));
    }
}

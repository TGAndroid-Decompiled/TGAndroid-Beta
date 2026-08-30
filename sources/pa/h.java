package pa;

import java.util.ArrayList;
import java.util.Iterator;
import kh.a2;
public final class h extends i implements Iterable {
    public final ArrayList f41086a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof h) || !((h) obj).f41086a.equals(this.f41086a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f41086a.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.f41086a.iterator();
    }

    @Override
    public final String n() {
        ArrayList arrayList = this.f41086a;
        int size = arrayList.size();
        if (size == 1) {
            return ((i) arrayList.get(0)).n();
        }
        throw new IllegalStateException(a2.j(size, "Array must have size 1, but has size "));
    }
}

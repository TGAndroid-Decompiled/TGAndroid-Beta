package pa;

import java.util.ArrayList;
import java.util.Iterator;
public final class h extends i implements Iterable {
    public final ArrayList f44245a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof h) || !((h) obj).f44245a.equals(this.f44245a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f44245a.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.f44245a.iterator();
    }

    @Override
    public final String n() {
        ArrayList arrayList = this.f44245a;
        int size = arrayList.size();
        if (size == 1) {
            return ((i) arrayList.get(0)).n();
        }
        throw new IllegalStateException(l.d.j(size, "Array must have size 1, but has size "));
    }
}

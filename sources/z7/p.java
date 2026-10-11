package z7;

import java.util.Iterator;
public final class p extends j {
    public final transient r f54088c;
    public final transient q d;

    public p(r rVar, q qVar) {
        this.f54088c = rVar;
        this.d = qVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f54088c.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        return this.d.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int size() {
        this.f54088c.getClass();
        return 1;
    }
}

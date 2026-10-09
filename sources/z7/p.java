package z7;

import java.util.Iterator;
public final class p extends j {
    public final transient r f53993c;
    public final transient q d;

    public p(r rVar, q qVar) {
        this.f53993c = rVar;
        this.d = qVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f53993c.get(obj) != null) {
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
        this.f53993c.getClass();
        return 1;
    }
}

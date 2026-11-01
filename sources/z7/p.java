package z7;

import java.util.Iterator;
public final class p extends j {
    public final transient r f55061c;
    public final transient q d;

    public p(r rVar, q qVar) {
        this.f55061c = rVar;
        this.d = qVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f55061c.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int l(Object[] objArr) {
        return this.d.l(objArr);
    }

    @Override
    public final int size() {
        this.f55061c.getClass();
        return 1;
    }
}

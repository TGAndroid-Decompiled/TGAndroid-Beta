package z7;

import java.util.Iterator;
public final class p extends j {
    public final transient r f52868c;
    public final transient q d;

    public p(r rVar, q qVar) {
        this.f52868c = rVar;
        this.d = qVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f52868c.get(obj) != null) {
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
        this.f52868c.getClass();
        return 1;
    }
}

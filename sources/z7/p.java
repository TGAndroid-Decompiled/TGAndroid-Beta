package z7;

import java.util.Iterator;
public final class p extends j {
    public final transient r f51593c;
    public final transient q d;

    public p(r rVar, q qVar) {
        this.f51593c = rVar;
        this.d = qVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f51593c.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        return this.d.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int size() {
        this.f51593c.getClass();
        return 1;
    }
}

package w7;

import java.util.Iterator;
public final class xa extends ta {
    public final transient za f45149c;
    public final transient ya d;

    public xa(za zaVar, ya yaVar) {
        this.f45149c = zaVar;
        this.d = yaVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f45149c.get(obj) != null) {
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
        this.f45149c.getClass();
        return 1;
    }
}

package w7;

import java.util.Iterator;
public final class xa extends ta {
    public final transient za f50399c;
    public final transient ya d;

    public xa(za zaVar, ya yaVar) {
        this.f50399c = zaVar;
        this.d = yaVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f50399c.get(obj) != null) {
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
        this.f50399c.getClass();
        return 1;
    }
}

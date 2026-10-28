package x7;

import java.util.Iterator;
public final class ya extends ua {
    public final transient ab f51731c;
    public final transient za d;

    public ya(ab abVar, za zaVar) {
        this.f51731c = abVar;
        this.d = zaVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f51731c.get(obj) != null) {
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
        this.f51731c.getClass();
        return 1;
    }
}

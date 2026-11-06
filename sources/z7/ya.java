package z7;

import java.util.Iterator;
public final class ya extends ua {
    public final transient ab f59865c;
    public final transient za d;

    public ya(ab abVar, za zaVar) {
        this.f59865c = abVar;
        this.d = zaVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f59865c.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(Object[] objArr) {
        return this.d.f(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int size() {
        this.f59865c.getClass();
        return 1;
    }
}

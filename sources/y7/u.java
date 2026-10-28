package y7;

import java.util.Iterator;
public final class u extends o {
    public final transient w f52404c;
    public final transient v d;

    public u(w wVar, v vVar) {
        this.f52404c = wVar;
        this.d = vVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f52404c.get(obj) != null) {
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
        this.f52404c.getClass();
        return 1;
    }
}

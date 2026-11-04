package x7;

import java.util.Iterator;
public final class b extends j9 {
    public final transient d f58235c;
    public final transient c d;

    public b(d dVar, c cVar) {
        this.f58235c = dVar;
        this.d = cVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f58235c.get(obj) != null) {
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
        this.f58235c.getClass();
        return 1;
    }
}

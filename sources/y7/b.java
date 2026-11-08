package y7;

import java.util.Iterator;
public final class b extends m9 {
    public final transient d f58981c;
    public final transient c d;

    public b(d dVar, c cVar) {
        this.f58981c = dVar;
        this.d = cVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f58981c.get(obj) != null) {
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
        this.f58981c.getClass();
        return 1;
    }
}

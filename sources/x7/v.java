package x7;

import java.util.Iterator;
public final class v extends p {
    public final transient x f53399c;
    public final transient w d;

    public v(x xVar, w wVar) {
        this.f53399c = xVar;
        this.d = wVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f53399c.get(obj) != null) {
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
        this.f53399c.getClass();
        return 1;
    }
}

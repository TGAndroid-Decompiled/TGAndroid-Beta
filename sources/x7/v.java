package x7;

import java.util.Iterator;
public final class v extends p {
    public final transient x f45667c;
    public final transient w d;

    public v(x xVar, w wVar) {
        this.f45667c = xVar;
        this.d = wVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f45667c.get(obj) != null) {
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
        this.f45667c.getClass();
        return 1;
    }
}

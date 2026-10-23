package x7;

import java.util.Iterator;
public final class v extends p {
    public final transient x f49610c;
    public final transient w d;

    public v(x xVar, w wVar) {
        this.f49610c = xVar;
        this.d = wVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f49610c.get(obj) != null) {
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
        this.f49610c.getClass();
        return 1;
    }
}

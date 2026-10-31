package w7;

import java.util.Iterator;
public final class va extends ra {
    public final transient xa f52721c;
    public final transient wa d;

    public va(xa xaVar, wa waVar) {
        this.f52721c = xaVar;
        this.d = waVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f52721c.get(obj) != null) {
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
        this.f52721c.getClass();
        return 1;
    }
}

package x6;

import java.util.Iterator;
public final class b0 extends o {
    public final transient Object d;

    public b0(Object obj) {
        this.d = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final int i(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override
    public final Iterator iterator() {
        return new t(this.d);
    }

    @Override
    public final d0 p() {
        return new t(this.d);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final m t() {
        Object[] objArr = {this.d};
        for (int i9 = 0; i9 < 1; i9++) {
            i iVar = m.f49036b;
            if (objArr[i9] == null) {
                throw new NullPointerException(j3.r0.l(i9, "at index "));
            }
        }
        return m.t(1, objArr);
    }

    @Override
    public final String toString() {
        return aa.d.o("[", this.d.toString(), "]");
    }
}

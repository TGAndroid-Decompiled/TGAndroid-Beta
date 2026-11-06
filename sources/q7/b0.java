package q7;

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
    public final int f(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new t(this.d);
    }

    @Override
    public final d0 k() {
        return new t(this.d);
    }

    @Override
    public final m o() {
        Object[] objArr = {this.d};
        for (int i7 = 0; i7 < 1; i7++) {
            i iVar = m.f53883b;
            if (objArr[i7] == null) {
                throw new NullPointerException(jg.g.j(i7, "at index "));
            }
        }
        return m.o(1, objArr);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return a8.p0.p("[", this.d.toString(), "]");
    }
}

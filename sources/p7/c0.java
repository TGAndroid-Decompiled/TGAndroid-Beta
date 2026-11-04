package p7;

import java.util.Iterator;
import k2.p1;
public final class c0 extends p {
    public final transient Object d;

    public c0(Object obj) {
        this.d = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override
    public final int h(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new u(this.d);
    }

    @Override
    public final e0 k() {
        return new u(this.d);
    }

    @Override
    public final n o() {
        Object[] objArr = {this.d};
        for (int i3 = 0; i3 < 1; i3++) {
            j jVar = n.f53383b;
            if (objArr[i3] == null) {
                throw new NullPointerException(p1.i(i3, "at index "));
            }
        }
        return n.o(1, objArr);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return a1.g.q("[", this.d.toString(), "]");
    }
}

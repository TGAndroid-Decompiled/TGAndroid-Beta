package q8;

import i7.p6;
import j$.util.Objects;
import java.util.AbstractMap;
public final class m0 extends z {
    public final n0 f46465c;

    public m0(n0 n0Var) {
        this.f46465c = n0Var;
    }

    @Override
    public final Object get(int i10) {
        n0 n0Var = this.f46465c;
        p6.b(i10, n0Var.f46469f);
        Object[] objArr = n0Var.f46468e;
        int i11 = i10 * 2;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return this.f46465c.f46469f;
    }
}

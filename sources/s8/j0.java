package s8;

import j$.util.Objects;
import java.util.AbstractMap;
import k7.b7;
public final class j0 extends v {
    public final k0 f44130c;

    public j0(k0 k0Var) {
        this.f44130c = k0Var;
    }

    @Override
    public final Object get(int i10) {
        k0 k0Var = this.f44130c;
        b7.c(i10, k0Var.f44134f);
        Object[] objArr = k0Var.e;
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
        return this.f44130c.f44134f;
    }
}

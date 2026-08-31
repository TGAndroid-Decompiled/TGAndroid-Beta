package s8;

import j$.util.Objects;
import java.util.AbstractMap;
import k7.c7;
public final class j0 extends v {
    public final k0 f47110c;

    public j0(k0 k0Var) {
        this.f47110c = k0Var;
    }

    @Override
    public final Object get(int i10) {
        k0 k0Var = this.f47110c;
        c7.c(i10, k0Var.f47115f);
        Object[] objArr = k0Var.f47114e;
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
        return this.f47110c.f47115f;
    }
}

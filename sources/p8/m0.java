package p8;

import j$.util.Objects;
import java.util.AbstractMap;

public final class m0 extends z {

    public final n0 f45558c;

    public m0(n0 n0Var) {
        this.f45558c = n0Var;
    }

    @Override
    public final Object get(int i10) {
        n0 n0Var = this.f45558c;
        h7.f0.b(i10, n0Var.f45562f);
        Object[] objArr = n0Var.f45561e;
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
        return this.f45558c.f45562f;
    }
}

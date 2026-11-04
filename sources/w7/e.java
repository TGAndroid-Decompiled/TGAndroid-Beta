package w7;

import j$.util.Objects;
import x7.o5;
public final class e extends d {
    public static final e f57409e = new e(0, new Object[0]);
    public final transient Object[] f57410c;
    public final transient int d;

    public e(int i3, Object[] objArr) {
        this.f57410c = objArr;
        this.d = i3;
    }

    @Override
    public final Object get(int i3) {
        o5.a(i3, this.d);
        Object obj = this.f57410c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f57410c;
        int i3 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override
    public final int i() {
        return this.d;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final Object[] k() {
        return this.f57410c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

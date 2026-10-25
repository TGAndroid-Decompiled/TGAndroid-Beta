package u7;

import j$.util.Objects;
public final class g extends d {
    public static final g e = new g(0, new Object[0]);
    public final transient Object[] f49599c;
    public final transient int d;

    public g(int i10, Object[] objArr) {
        this.f49599c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.m.a(i10, this.d);
        Object obj = this.f49599c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f49599c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int m() {
        return this.d;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final Object[] o() {
        return this.f49599c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

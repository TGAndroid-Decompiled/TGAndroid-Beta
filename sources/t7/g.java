package t7;

import j$.util.Objects;
import w7.l7;
public final class g extends d {
    public static final g e = new g(0, new Object[0]);
    public final transient Object[] f43308c;
    public final transient int d;

    public g(int i10, Object[] objArr) {
        this.f43308c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        l7.a(i10, this.d);
        Object obj = this.f43308c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f43308c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int n() {
        return this.d;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final Object[] p() {
        return this.f43308c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

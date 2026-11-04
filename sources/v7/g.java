package v7;

import j$.util.Objects;
import x7.j5;
public final class g extends d {
    public static final g f56457e = new g(0, new Object[0]);
    public final transient Object[] f56458c;
    public final transient int d;

    public g(int i3, Object[] objArr) {
        this.f56458c = objArr;
        this.d = i3;
    }

    @Override
    public final Object get(int i3) {
        j5.a(i3, this.d);
        Object obj = this.f56458c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f56458c;
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
        return this.f56458c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

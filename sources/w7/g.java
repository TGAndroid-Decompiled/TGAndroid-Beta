package w7;

import c8.fd;
import j$.util.Objects;
public final class g extends d {
    public static final g f57593e = new g(0, new Object[0]);
    public final transient Object[] f57594c;
    public final transient int d;

    public g(int i7, Object[] objArr) {
        this.f57594c = objArr;
        this.d = i7;
    }

    @Override
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f57594c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final Object get(int i7) {
        fd.a(i7, this.d);
        Object obj = this.f57594c[i7];
        Objects.requireNonNull(obj);
        return obj;
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
        return this.f57594c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

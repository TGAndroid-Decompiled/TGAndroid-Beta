package q7;

import j$.util.Objects;
public final class x extends m {
    public static final x f54047e = new x(0, new Object[0]);
    public final transient Object[] f54048c;
    public final transient int d;

    public x(int i7, Object[] objArr) {
        this.f54048c = objArr;
        this.d = i7;
    }

    @Override
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f54048c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final Object get(int i7) {
        a.e(i7, this.d);
        Object obj = this.f54048c[i7];
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
    public final Object[] l() {
        return this.f54048c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

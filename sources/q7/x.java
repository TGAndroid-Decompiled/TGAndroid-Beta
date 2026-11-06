package q7;

import j$.util.Objects;
public final class x extends m {
    public static final x f53917e = new x(0, new Object[0]);
    public final transient Object[] f53918c;
    public final transient int d;

    public x(int i7, Object[] objArr) {
        this.f53918c = objArr;
        this.d = i7;
    }

    @Override
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f53918c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final Object get(int i7) {
        a.e(i7, this.d);
        Object obj = this.f53918c[i7];
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
        return this.f53918c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

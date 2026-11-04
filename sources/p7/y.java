package p7;

import j$.util.Objects;
public final class y extends n {
    public static final y f53417e = new y(0, new Object[0]);
    public final transient Object[] f53418c;
    public final transient int d;

    public y(int i3, Object[] objArr) {
        this.f53418c = objArr;
        this.d = i3;
    }

    @Override
    public final Object get(int i3) {
        a.e(i3, this.d);
        Object obj = this.f53418c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f53418c;
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
    public final Object[] l() {
        return this.f53418c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

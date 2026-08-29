package q8;

import i7.p6;
import j$.util.Objects;
public final class l0 extends z {
    public static final l0 f46462e = new l0(0, new Object[0]);
    public final transient Object[] f46463c;
    public final transient int d;

    public l0(int i10, Object[] objArr) {
        this.f46463c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        p6.b(i10, this.d);
        Object obj = this.f46463c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.f46463c;
        int i11 = this.d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] o() {
        return this.f46463c;
    }

    @Override
    public final int p() {
        return this.d;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

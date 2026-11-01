package r7;

import w7.b7;
public final class s extends r {
    public static final s e = new s(0, new Object[0]);
    public final transient Object[] f46375c;
    public final transient int d;

    public s(int i10, Object[] objArr) {
        this.f46375c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        b7.a(i10, this.d);
        Object obj = this.f46375c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int l(Object[] objArr) {
        Object[] objArr2 = this.f46375c;
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
    public final boolean o() {
        return false;
    }

    @Override
    public final Object[] p() {
        return this.f46375c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

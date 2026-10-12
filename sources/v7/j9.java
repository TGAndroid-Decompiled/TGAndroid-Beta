package v7;
public final class j9 extends h9 {
    public static final j9 e = new j9(0, new Object[0]);
    public final transient Object[] f46686c;
    public final transient int d;

    public j9(int i10, Object[] objArr) {
        this.f46686c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.b8.a(i10, this.d);
        Object obj = this.f46686c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f46686c;
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
        return this.f46686c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

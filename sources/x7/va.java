package x7;
public final class va extends ta {
    public static final va e = new va(0, new Object[0]);
    public final transient Object[] f51713c;
    public final transient int d;

    public va(int i10, Object[] objArr) {
        this.f51713c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.c0.a(i10, this.d);
        Object obj = this.f51713c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f51713c;
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
        return this.f51713c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

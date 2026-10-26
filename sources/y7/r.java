package y7;
public final class r extends n {
    public static final r e = new r(0, new Object[0]);
    public final transient Object[] f52276c;
    public final transient int d;

    public r(int i10, Object[] objArr) {
        this.f52276c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.h5.a(i10, this.d);
        Object obj = this.f52276c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f52276c;
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
        return this.f52276c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

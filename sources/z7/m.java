package z7;
public final class m extends i {
    public static final m f52858e = new m(0, new Object[0]);
    public final transient Object[] f52859c;
    public final transient int d;

    public m(int i10, Object[] objArr) {
        this.f52859c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.p9.a(i10, this.d);
        Object obj = this.f52859c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f52859c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int n() {
        return this.d;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final Object[] p() {
        return this.f52859c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

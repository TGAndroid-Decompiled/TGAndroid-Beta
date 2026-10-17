package z7;
public final class m extends i {
    public static final m e = new m(0, new Object[0]);
    public final transient Object[] f51113c;
    public final transient int d;

    public m(int i10, Object[] objArr) {
        this.f51113c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.i9.a(i10, this.d);
        Object obj = this.f51113c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f51113c;
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
        return this.f51113c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

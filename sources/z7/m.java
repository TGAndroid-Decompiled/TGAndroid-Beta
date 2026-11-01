package z7;
public final class m extends i {
    public static final m e = new m(0, new Object[0]);
    public final transient Object[] f55032c;
    public final transient int d;

    public m(int i10, Object[] objArr) {
        this.f55032c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.t9.a(i10, this.d);
        Object obj = this.f55032c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int l(Object[] objArr) {
        Object[] objArr2 = this.f55032c;
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
        return this.f55032c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

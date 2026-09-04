package v7;
public final class j9 extends h9 {
    public static final j9 f47497e = new j9(0, new Object[0]);
    public final transient Object[] f47498c;
    public final transient int d;

    public j9(int i10, Object[] objArr) {
        this.f47498c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.w7.a(i10, this.d);
        Object obj = this.f47498c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f47498c;
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
        return this.f47498c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

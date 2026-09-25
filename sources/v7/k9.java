package v7;
public final class k9 extends i9 {
    public static final k9 e = new k9(0, new Object[0]);
    public final transient Object[] f44312c;
    public final transient int d;

    public k9(int i10, Object[] objArr) {
        this.f44312c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.x7.a(i10, this.d);
        Object obj = this.f44312c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f44312c;
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
        return this.f44312c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

package x7;
public final class s extends o {
    public static final s f49186e = new s(0, new Object[0]);
    public final transient Object[] f49187c;
    public final transient int d;

    public s(int i10, Object[] objArr) {
        this.f49187c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.m8.a(i10, this.d);
        Object obj = this.f49187c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f49187c;
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
        return this.f49187c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

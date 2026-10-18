package x7;
public final class s extends o {
    public static final s e = new s(0, new Object[0]);
    public final transient Object[] f49577c;
    public final transient int d;

    public s(int i10, Object[] objArr) {
        this.f49577c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.o8.a(i10, this.d);
        Object obj = this.f49577c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f49577c;
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
        return this.f49577c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

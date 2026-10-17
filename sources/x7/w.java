package x7;
public final class w extends o {
    public final transient Object[] f49639c;
    public final transient int d;
    public final transient int e = 1;

    public w(int i10, Object[] objArr) {
        this.f49639c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.o8.a(i10, this.e);
        Object obj = this.f49639c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.e;
    }
}

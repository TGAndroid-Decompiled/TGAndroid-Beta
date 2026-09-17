package x7;
public final class w extends o {
    public final transient Object[] f49279c;
    public final transient int d;
    public final transient int f49280e = 1;

    public w(int i10, Object[] objArr) {
        this.f49279c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.m8.a(i10, this.f49280e);
        Object obj = this.f49279c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f49280e;
    }
}

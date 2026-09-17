package x7;
public final class w extends o {
    public final transient Object[] f49250c;
    public final transient int d;
    public final transient int f49251e = 1;

    public w(int i10, Object[] objArr) {
        this.f49250c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.m8.a(i10, this.f49251e);
        Object obj = this.f49250c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f49251e;
    }
}

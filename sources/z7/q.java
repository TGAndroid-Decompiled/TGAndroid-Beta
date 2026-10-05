package z7;
public final class q extends i {
    public final transient Object[] f52898c;
    public final transient int d;
    public final transient int f52899e = 1;

    public q(int i10, Object[] objArr) {
        this.f52898c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.p9.a(i10, this.f52899e);
        Object obj = this.f52898c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f52899e;
    }
}

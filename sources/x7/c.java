package x7;
public final class c extends i9 {
    public final transient Object[] f58253c;
    public final transient int d;
    public final transient int f58254e = 1;

    public c(int i3, Object[] objArr) {
        this.f58253c = objArr;
        this.d = i3;
    }

    @Override
    public final Object get(int i3) {
        w5.a(i3, this.f58254e);
        Object obj = this.f58253c[i3 + i3 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f58254e;
    }
}

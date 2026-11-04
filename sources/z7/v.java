package z7;
public final class v extends n {
    public final transient Object[] f60101c;
    public final transient int d;
    public final transient int f60102e = 1;

    public v(int i3, Object[] objArr) {
        this.f60101c = objArr;
        this.d = i3;
    }

    @Override
    public final Object get(int i3) {
        x7.x6.a(i3, this.f60102e);
        Object obj = this.f60101c[i3 + i3 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f60102e;
    }
}

package y7;
public final class za extends ta {
    public final transient Object[] f59322c;
    public final transient int d;
    public final transient int f59323e = 1;

    public za(int i3, Object[] objArr) {
        this.f59322c = objArr;
        this.d = i3;
    }

    @Override
    public final Object get(int i3) {
        x7.h6.a(i3, this.f59323e);
        Object obj = this.f59322c[i3 + i3 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f59323e;
    }
}

package y7;
public final class sa extends ta {
    public final transient int f59271c;
    public final transient int d;
    public final ta f59272e;

    public sa(ta taVar, int i3, int i10) {
        this.f59272e = taVar;
        this.f59271c = i3;
        this.d = i10;
    }

    @Override
    public final Object get(int i3) {
        x7.h6.a(i3, this.d);
        return this.f59272e.get(i3 + this.f59271c);
    }

    @Override
    public final int i() {
        return this.f59272e.j() + this.f59271c + this.d;
    }

    @Override
    public final int j() {
        return this.f59272e.j() + this.f59271c;
    }

    @Override
    public final Object[] k() {
        return this.f59272e.k();
    }

    @Override
    public final ta subList(int i3, int i10) {
        x7.h6.b(i3, i10, this.d);
        int i11 = this.f59271c;
        return this.f59272e.subList(i3 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}

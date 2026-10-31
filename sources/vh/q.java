package vh;
public final class q {
    public final r f51775a;
    public final int f51776b;
    public final int f51777c;

    public q(r rVar, int i10, int i11) {
        this.f51775a = rVar;
        this.f51776b = i10;
        this.f51777c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f51775a.d[this.f51777c]) * this.f51776b;
    }

    public final float b(float f7) {
        return (f7 / this.f51775a.d[this.f51777c]) * (this.f51776b + 1);
    }
}

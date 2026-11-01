package vh;
public final class q {
    public final r f51790a;
    public final int f51791b;
    public final int f51792c;

    public q(r rVar, int i10, int i11) {
        this.f51790a = rVar;
        this.f51791b = i10;
        this.f51792c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f51790a.d[this.f51792c]) * this.f51791b;
    }

    public final float b(float f7) {
        return (f7 / this.f51790a.d[this.f51792c]) * (this.f51791b + 1);
    }
}

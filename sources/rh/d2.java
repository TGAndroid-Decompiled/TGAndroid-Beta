package rh;

public final class d2 implements Runnable {

    public final int f47108a;

    public final p3 f47109b;

    public final int f47110c;

    public d2(p3 p3Var, int i10, int i11) {
        this.f47108a = i11;
        this.f47109b = p3Var;
        this.f47110c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47108a) {
            case 0:
                this.f47109b.d4(this.f47110c);
                break;
            case 1:
                this.f47109b.f4(this.f47110c);
                break;
            case 2:
                this.f47109b.scrollBy(0, this.f47110c);
                break;
            default:
                this.f47109b.e4(this.f47110c);
                break;
        }
    }
}

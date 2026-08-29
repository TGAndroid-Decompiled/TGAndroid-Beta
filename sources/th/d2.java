package th;
public final class d2 implements Runnable {
    public final int f48408a;
    public final p3 f48409b;
    public final int f48410c;

    public d2(p3 p3Var, int i10, int i11) {
        this.f48408a = i11;
        this.f48409b = p3Var;
        this.f48410c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48408a) {
            case 0:
                this.f48409b.d4(this.f48410c);
                return;
            case 1:
                this.f48409b.f4(this.f48410c);
                return;
            case 2:
                this.f48409b.scrollBy(0, this.f48410c);
                return;
            default:
                this.f48409b.e4(this.f48410c);
                return;
        }
    }
}

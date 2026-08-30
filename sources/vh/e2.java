package vh;
public final class e2 implements Runnable {
    public final int f45872a;
    public final r3 f45873b;
    public final int f45874c;

    public e2(r3 r3Var, int i10, int i11) {
        this.f45872a = i11;
        this.f45873b = r3Var;
        this.f45874c = i10;
    }

    @Override
    public final void run() {
        switch (this.f45872a) {
            case 0:
                this.f45873b.d4(this.f45874c);
                return;
            case 1:
                this.f45873b.f4(this.f45874c);
                return;
            case 2:
                this.f45873b.scrollBy(0, this.f45874c);
                return;
            default:
                this.f45873b.e4(this.f45874c);
                return;
        }
    }
}

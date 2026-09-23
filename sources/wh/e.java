package wh;
public final class e implements Runnable {
    public final int f45034a;
    public final n f45035b;

    public e(n nVar, int i10) {
        this.f45034a = i10;
        this.f45035b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45034a) {
            case 0:
                this.f45035b.e();
                return;
            case 1:
                n.k(this.f45035b.f45074q, true, true);
                return;
            default:
                this.f45035b.e();
                return;
        }
    }
}

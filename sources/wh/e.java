package wh;
public final class e implements Runnable {
    public final int f45335a;
    public final n f45336b;

    public e(n nVar, int i10) {
        this.f45335a = i10;
        this.f45336b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45335a) {
            case 0:
                this.f45336b.e();
                return;
            case 1:
                n.k(this.f45336b.f45375q, true, true);
                return;
            default:
                this.f45336b.e();
                return;
        }
    }
}

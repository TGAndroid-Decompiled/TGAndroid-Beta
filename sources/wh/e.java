package wh;
public final class e implements Runnable {
    public final int f45080a;
    public final n f45081b;

    public e(n nVar, int i10) {
        this.f45080a = i10;
        this.f45081b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45080a) {
            case 0:
                this.f45081b.e();
                return;
            case 1:
                n.k(this.f45081b.f45120q, true, true);
                return;
            default:
                this.f45081b.e();
                return;
        }
    }
}

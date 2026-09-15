package wh;
public final class e implements Runnable {
    public final int f45084a;
    public final n f45085b;

    public e(n nVar, int i10) {
        this.f45084a = i10;
        this.f45085b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45084a) {
            case 0:
                this.f45085b.e();
                return;
            case 1:
                n.k(this.f45085b.f45124q, true, true);
                return;
            default:
                this.f45085b.e();
                return;
        }
    }
}

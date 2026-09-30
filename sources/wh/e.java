package wh;
public final class e implements Runnable {
    public final int f45470a;
    public final n f45471b;

    public e(n nVar, int i10) {
        this.f45470a = i10;
        this.f45471b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45470a) {
            case 0:
                this.f45471b.e();
                return;
            case 1:
                n.k(this.f45471b.f45510q, true, true);
                return;
            default:
                this.f45471b.e();
                return;
        }
    }
}

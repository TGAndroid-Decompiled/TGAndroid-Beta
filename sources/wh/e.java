package wh;
public final class e implements Runnable {
    public final int f45107a;
    public final n f45108b;

    public e(n nVar, int i10) {
        this.f45107a = i10;
        this.f45108b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45107a) {
            case 0:
                this.f45108b.e();
                return;
            case 1:
                n.k(this.f45108b.f45147q, true, true);
                return;
            default:
                this.f45108b.e();
                return;
        }
    }
}

package wh;
public final class e implements Runnable {
    public final int f45379a;
    public final n f45380b;

    public e(n nVar, int i10) {
        this.f45379a = i10;
        this.f45380b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45379a) {
            case 0:
                this.f45380b.e();
                return;
            case 1:
                n.k(this.f45380b.f45419q, true, true);
                return;
            default:
                this.f45380b.e();
                return;
        }
    }
}

package wh;
public final class e implements Runnable {
    public final int f45400a;
    public final n f45401b;

    public e(n nVar, int i10) {
        this.f45400a = i10;
        this.f45401b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f45400a) {
            case 0:
                this.f45401b.e();
                return;
            case 1:
                n.k(this.f45401b.f45440q, true, true);
                return;
            default:
                this.f45401b.e();
                return;
        }
    }
}

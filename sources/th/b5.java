package th;
public final class b5 implements Runnable {
    public final int f48802a;
    public final d5 f48803b;

    public b5(d5 d5Var, int i10) {
        this.f48802a = i10;
        this.f48803b = d5Var;
    }

    @Override
    public final void run() {
        switch (this.f48802a) {
            case 0:
                this.f48803b.e();
                return;
            default:
                this.f48803b.b();
                return;
        }
    }
}

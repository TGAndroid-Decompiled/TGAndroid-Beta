package th;
public final class b5 implements Runnable {
    public final int f48816a;
    public final d5 f48817b;

    public b5(d5 d5Var, int i10) {
        this.f48816a = i10;
        this.f48817b = d5Var;
    }

    @Override
    public final void run() {
        switch (this.f48816a) {
            case 0:
                this.f48817b.e();
                return;
            default:
                this.f48817b.b();
                return;
        }
    }
}

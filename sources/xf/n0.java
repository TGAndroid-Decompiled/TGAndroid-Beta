package xf;
public final class n0 implements Runnable {
    public final int f49278a;
    public final q0 f49279b;
    public final a6.a f49280c;

    public n0(q0 q0Var, a6.a aVar, int i9) {
        this.f49278a = i9;
        this.f49279b = q0Var;
        this.f49280c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f49278a) {
            case 0:
                this.f49279b.p(this.f49280c, true);
                return;
            default:
                q0 q0Var = this.f49279b;
                q0Var.f49314f.f(new n0(q0Var, this.f49280c, 0));
                return;
        }
    }
}

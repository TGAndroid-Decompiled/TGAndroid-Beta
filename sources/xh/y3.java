package xh;
public final class y3 implements Runnable {
    public final int f46495a;
    public final g4 f46496b;

    public y3(g4 g4Var, int i10) {
        this.f46495a = i10;
        this.f46496b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f46495a) {
            case 0:
                v3 v3Var = this.f46496b.f46161c;
                if (!v3Var.f46458j.isEmpty()) {
                    v3Var.f46458j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f46496b.f46161c;
                if (!v3Var2.f46459k.isEmpty()) {
                    v3Var2.f46459k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f46496b.f46161c;
                if (!v3Var3.f46460l.isEmpty()) {
                    v3Var3.f46460l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46496b.f46161c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f46496b.f46161c.i(u3.BY_DATE);
                return;
            default:
                this.f46496b.f46161c.i(u3.BY_NUMBER);
                return;
        }
    }
}

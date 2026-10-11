package xh;
public final class y3 implements Runnable {
    public final int f51735a;
    public final g4 f51736b;

    public y3(g4 g4Var, int i10) {
        this.f51735a = i10;
        this.f51736b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f51735a) {
            case 0:
                v3 v3Var = this.f51736b.f51377c;
                if (!v3Var.f51680j.isEmpty()) {
                    v3Var.f51680j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f51736b.f51377c;
                if (!v3Var2.f51681k.isEmpty()) {
                    v3Var2.f51681k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f51736b.f51377c;
                if (!v3Var3.f51682l.isEmpty()) {
                    v3Var3.f51682l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f51736b.f51377c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f51736b.f51377c.i(u3.BY_DATE);
                return;
            default:
                this.f51736b.f51377c.i(u3.BY_NUMBER);
                return;
        }
    }
}

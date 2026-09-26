package xh;
public final class y3 implements Runnable {
    public final int f46492a;
    public final g4 f46493b;

    public y3(g4 g4Var, int i10) {
        this.f46492a = i10;
        this.f46493b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f46492a) {
            case 0:
                v3 v3Var = this.f46493b.f46158c;
                if (!v3Var.f46455j.isEmpty()) {
                    v3Var.f46455j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f46493b.f46158c;
                if (!v3Var2.f46456k.isEmpty()) {
                    v3Var2.f46456k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f46493b.f46158c;
                if (!v3Var3.f46457l.isEmpty()) {
                    v3Var3.f46457l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46493b.f46158c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f46493b.f46158c.i(u3.BY_DATE);
                return;
            default:
                this.f46493b.f46158c.i(u3.BY_NUMBER);
                return;
        }
    }
}

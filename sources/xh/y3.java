package xh;
public final class y3 implements Runnable {
    public final int f50325a;
    public final g4 f50326b;

    public y3(g4 g4Var, int i10) {
        this.f50325a = i10;
        this.f50326b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f50325a) {
            case 0:
                v3 v3Var = this.f50326b.f49973c;
                if (!v3Var.f50288j.isEmpty()) {
                    v3Var.f50288j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f50326b.f49973c;
                if (!v3Var2.f50289k.isEmpty()) {
                    v3Var2.f50289k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f50326b.f49973c;
                if (!v3Var3.f50290l.isEmpty()) {
                    v3Var3.f50290l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50326b.f49973c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f50326b.f49973c.i(u3.BY_DATE);
                return;
            default:
                this.f50326b.f49973c.i(u3.BY_NUMBER);
                return;
        }
    }
}

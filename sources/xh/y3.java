package xh;
public final class y3 implements Runnable {
    public final int f50316a;
    public final g4 f50317b;

    public y3(g4 g4Var, int i10) {
        this.f50316a = i10;
        this.f50317b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f50316a) {
            case 0:
                v3 v3Var = this.f50317b.f49964c;
                if (!v3Var.f50279j.isEmpty()) {
                    v3Var.f50279j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f50317b.f49964c;
                if (!v3Var2.f50280k.isEmpty()) {
                    v3Var2.f50280k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f50317b.f49964c;
                if (!v3Var3.f50281l.isEmpty()) {
                    v3Var3.f50281l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50317b.f49964c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f50317b.f49964c.i(u3.BY_DATE);
                return;
            default:
                this.f50317b.f49964c.i(u3.BY_NUMBER);
                return;
        }
    }
}

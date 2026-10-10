package xh;
public final class y3 implements Runnable {
    public final int f51658a;
    public final g4 f51659b;

    public y3(g4 g4Var, int i10) {
        this.f51658a = i10;
        this.f51659b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f51658a) {
            case 0:
                v3 v3Var = this.f51659b.f51300c;
                if (!v3Var.f51603j.isEmpty()) {
                    v3Var.f51603j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f51659b.f51300c;
                if (!v3Var2.f51604k.isEmpty()) {
                    v3Var2.f51604k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f51659b.f51300c;
                if (!v3Var3.f51605l.isEmpty()) {
                    v3Var3.f51605l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f51659b.f51300c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f51659b.f51300c.i(u3.BY_DATE);
                return;
            default:
                this.f51659b.f51300c.i(u3.BY_NUMBER);
                return;
        }
    }
}

package xh;
public final class y3 implements Runnable {
    public final int f51612a;
    public final g4 f51613b;

    public y3(g4 g4Var, int i10) {
        this.f51612a = i10;
        this.f51613b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f51612a) {
            case 0:
                v3 v3Var = this.f51613b.f51254c;
                if (!v3Var.f51557j.isEmpty()) {
                    v3Var.f51557j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f51613b.f51254c;
                if (!v3Var2.f51558k.isEmpty()) {
                    v3Var2.f51558k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f51613b.f51254c;
                if (!v3Var3.f51559l.isEmpty()) {
                    v3Var3.f51559l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f51613b.f51254c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f51613b.f51254c.i(u3.BY_DATE);
                return;
            default:
                this.f51613b.f51254c.i(u3.BY_NUMBER);
                return;
        }
    }
}

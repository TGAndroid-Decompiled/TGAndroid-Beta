package wh;
public final class v2 implements Runnable {
    public final int f44389a;
    public final h4 f44390b;

    public v2(h4 h4Var, int i10) {
        this.f44389a = i10;
        this.f44390b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f44389a) {
            case 0:
                u3 u3Var = this.f44390b.d;
                if (!u3Var.f44376l.isEmpty()) {
                    u3Var.f44376l.clear();
                    u3Var.h();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f44390b.d;
                if (!u3Var2.f44375k.isEmpty()) {
                    u3Var2.f44375k.clear();
                    u3Var2.h();
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f44390b.d;
                if (!u3Var3.f44374j.isEmpty()) {
                    u3Var3.f44374j.clear();
                    u3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f44390b.d.i(t3.BY_PRICE);
                return;
            case 4:
                this.f44390b.d.i(t3.BY_DATE);
                return;
            default:
                this.f44390b.d.i(t3.BY_NUMBER);
                return;
        }
    }
}

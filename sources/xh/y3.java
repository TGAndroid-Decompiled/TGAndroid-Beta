package xh;
public final class y3 implements Runnable {
    public final int f46494a;
    public final g4 f46495b;

    public y3(g4 g4Var, int i10) {
        this.f46494a = i10;
        this.f46495b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f46494a) {
            case 0:
                v3 v3Var = this.f46495b.f46160c;
                if (!v3Var.f46457j.isEmpty()) {
                    v3Var.f46457j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f46495b.f46160c;
                if (!v3Var2.f46458k.isEmpty()) {
                    v3Var2.f46458k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f46495b.f46160c;
                if (!v3Var3.f46459l.isEmpty()) {
                    v3Var3.f46459l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46495b.f46160c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f46495b.f46160c.i(u3.BY_DATE);
                return;
            default:
                this.f46495b.f46160c.i(u3.BY_NUMBER);
                return;
        }
    }
}

package xh;
public final class y3 implements Runnable {
    public final int f46479a;
    public final g4 f46480b;

    public y3(g4 g4Var, int i10) {
        this.f46479a = i10;
        this.f46480b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f46479a) {
            case 0:
                v3 v3Var = this.f46480b.f46145c;
                if (!v3Var.f46442j.isEmpty()) {
                    v3Var.f46442j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f46480b.f46145c;
                if (!v3Var2.f46443k.isEmpty()) {
                    v3Var2.f46443k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f46480b.f46145c;
                if (!v3Var3.f46444l.isEmpty()) {
                    v3Var3.f46444l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46480b.f46145c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f46480b.f46145c.i(u3.BY_DATE);
                return;
            default:
                this.f46480b.f46145c.i(u3.BY_NUMBER);
                return;
        }
    }
}

package xh;
public final class y3 implements Runnable {
    public final int f46493a;
    public final g4 f46494b;

    public y3(g4 g4Var, int i10) {
        this.f46493a = i10;
        this.f46494b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f46493a) {
            case 0:
                v3 v3Var = this.f46494b.f46159c;
                if (!v3Var.f46456j.isEmpty()) {
                    v3Var.f46456j.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f46494b.f46159c;
                if (!v3Var2.f46457k.isEmpty()) {
                    v3Var2.f46457k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f46494b.f46159c;
                if (!v3Var3.f46458l.isEmpty()) {
                    v3Var3.f46458l.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46494b.f46159c.i(u3.BY_PRICE);
                return;
            case 4:
                this.f46494b.f46159c.i(u3.BY_DATE);
                return;
            default:
                this.f46494b.f46159c.i(u3.BY_NUMBER);
                return;
        }
    }
}

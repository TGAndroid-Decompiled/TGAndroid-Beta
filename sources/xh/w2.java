package xh;
public final class w2 implements Runnable {
    public final int f51803a;
    public final h4 f51804b;

    public w2(h4 h4Var, int i10) {
        this.f51803a = i10;
        this.f51804b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f51803a) {
            case 0:
                u3 u3Var = this.f51804b.d;
                if (!u3Var.f51781l.isEmpty()) {
                    u3Var.f51781l.clear();
                    u3Var.h();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f51804b.d;
                if (!u3Var2.f51780k.isEmpty()) {
                    u3Var2.f51780k.clear();
                    u3Var2.h();
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f51804b.d;
                if (!u3Var3.f51779j.isEmpty()) {
                    u3Var3.f51779j.clear();
                    u3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f51804b.d.i(t3.BY_PRICE);
                return;
            case 4:
                this.f51804b.d.i(t3.BY_DATE);
                return;
            default:
                this.f51804b.d.i(t3.BY_NUMBER);
                return;
        }
    }
}

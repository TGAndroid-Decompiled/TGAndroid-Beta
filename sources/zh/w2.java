package zh;
public final class w2 implements Runnable {
    public final int f53314a;
    public final h4 f53315b;

    public w2(h4 h4Var, int i10) {
        this.f53314a = i10;
        this.f53315b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f53314a) {
            case 0:
                u3 u3Var = this.f53315b.d;
                if (!u3Var.f53273l.isEmpty()) {
                    u3Var.f53273l.clear();
                    u3Var.h();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f53315b.d;
                if (!u3Var2.f53272k.isEmpty()) {
                    u3Var2.f53272k.clear();
                    u3Var2.h();
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f53315b.d;
                if (!u3Var3.f53271j.isEmpty()) {
                    u3Var3.f53271j.clear();
                    u3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f53315b.d.i(t3.BY_PRICE);
                return;
            case 4:
                this.f53315b.d.i(t3.BY_DATE);
                return;
            default:
                this.f53315b.d.i(t3.BY_NUMBER);
                return;
        }
    }
}

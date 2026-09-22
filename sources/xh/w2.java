package xh;
public final class w2 implements Runnable {
    public final int f46185a;
    public final h4 f46186b;

    public w2(h4 h4Var, int i10) {
        this.f46185a = i10;
        this.f46186b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f46185a) {
            case 0:
                u3 u3Var = this.f46186b.d;
                if (!u3Var.f46147l.isEmpty()) {
                    u3Var.f46147l.clear();
                    u3Var.h();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f46186b.d;
                if (!u3Var2.f46146k.isEmpty()) {
                    u3Var2.f46146k.clear();
                    u3Var2.h();
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f46186b.d;
                if (!u3Var3.f46145j.isEmpty()) {
                    u3Var3.f46145j.clear();
                    u3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46186b.d.i(t3.BY_PRICE);
                return;
            case 4:
                this.f46186b.d.i(t3.BY_DATE);
                return;
            default:
                this.f46186b.d.i(t3.BY_NUMBER);
                return;
        }
    }
}

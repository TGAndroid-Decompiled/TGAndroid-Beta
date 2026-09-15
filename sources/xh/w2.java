package xh;
public final class w2 implements Runnable {
    public final int f46189a;
    public final h4 f46190b;

    public w2(h4 h4Var, int i10) {
        this.f46189a = i10;
        this.f46190b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f46189a) {
            case 0:
                u3 u3Var = this.f46190b.d;
                if (!u3Var.f46151l.isEmpty()) {
                    u3Var.f46151l.clear();
                    u3Var.h();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f46190b.d;
                if (!u3Var2.f46150k.isEmpty()) {
                    u3Var2.f46150k.clear();
                    u3Var2.h();
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f46190b.d;
                if (!u3Var3.f46149j.isEmpty()) {
                    u3Var3.f46149j.clear();
                    u3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46190b.d.i(t3.BY_PRICE);
                return;
            case 4:
                this.f46190b.d.i(t3.BY_DATE);
                return;
            default:
                this.f46190b.d.i(t3.BY_NUMBER);
                return;
        }
    }
}

package zh;
public final class x3 implements Runnable {
    public final int f53384a;
    public final f4 f53385b;

    public x3(f4 f4Var, int i10) {
        this.f53384a = i10;
        this.f53385b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f53384a) {
            case 0:
                u3 u3Var = this.f53385b.f53033c;
                if (!u3Var.f53329j.isEmpty()) {
                    u3Var.f53329j.clear();
                    u3Var.h();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f53385b.f53033c;
                if (!u3Var2.f53330k.isEmpty()) {
                    u3Var2.f53330k.clear();
                    u3Var2.h();
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f53385b.f53033c;
                if (!u3Var3.f53331l.isEmpty()) {
                    u3Var3.f53331l.clear();
                    u3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f53385b.f53033c.i(t3.BY_PRICE);
                return;
            case 4:
                this.f53385b.f53033c.i(t3.BY_DATE);
                return;
            default:
                this.f53385b.f53033c.i(t3.BY_NUMBER);
                return;
        }
    }
}

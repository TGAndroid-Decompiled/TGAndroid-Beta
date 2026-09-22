package xh;
public final class x3 implements Runnable {
    public final int f46198a;
    public final f4 f46199b;

    public x3(f4 f4Var, int i10) {
        this.f46198a = i10;
        this.f46199b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f46198a) {
            case 0:
                u3 u3Var = this.f46199b.f45865c;
                if (!u3Var.f46145j.isEmpty()) {
                    u3Var.f46145j.clear();
                    u3Var.h();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f46199b.f45865c;
                if (!u3Var2.f46146k.isEmpty()) {
                    u3Var2.f46146k.clear();
                    u3Var2.h();
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f46199b.f45865c;
                if (!u3Var3.f46147l.isEmpty()) {
                    u3Var3.f46147l.clear();
                    u3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46199b.f45865c.i(t3.BY_PRICE);
                return;
            case 4:
                this.f46199b.f45865c.i(t3.BY_DATE);
                return;
            default:
                this.f46199b.f45865c.i(t3.BY_NUMBER);
                return;
        }
    }
}

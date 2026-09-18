package xh;
public final class x3 implements Runnable {
    public final int f46230a;
    public final f4 f46231b;

    public x3(f4 f4Var, int i10) {
        this.f46230a = i10;
        this.f46231b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f46230a) {
            case 0:
                u3 u3Var = this.f46231b.f45897c;
                if (!u3Var.f46177j.isEmpty()) {
                    u3Var.f46177j.clear();
                    u3Var.h();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f46231b.f45897c;
                if (!u3Var2.f46178k.isEmpty()) {
                    u3Var2.f46178k.clear();
                    u3Var2.h();
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f46231b.f45897c;
                if (!u3Var3.f46179l.isEmpty()) {
                    u3Var3.f46179l.clear();
                    u3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46231b.f45897c.i(t3.BY_PRICE);
                return;
            case 4:
                this.f46231b.f45897c.i(t3.BY_DATE);
                return;
            default:
                this.f46231b.f45897c.i(t3.BY_NUMBER);
                return;
        }
    }
}

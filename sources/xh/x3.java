package xh;
public final class x3 implements Runnable {
    public final int f46225a;
    public final f4 f46226b;

    public x3(f4 f4Var, int i10) {
        this.f46225a = i10;
        this.f46226b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f46225a) {
            case 0:
                u3 u3Var = this.f46226b.f45892c;
                if (!u3Var.f46172j.isEmpty()) {
                    u3Var.f46172j.clear();
                    u3Var.h();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f46226b.f45892c;
                if (!u3Var2.f46173k.isEmpty()) {
                    u3Var2.f46173k.clear();
                    u3Var2.h();
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f46226b.f45892c;
                if (!u3Var3.f46174l.isEmpty()) {
                    u3Var3.f46174l.clear();
                    u3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46226b.f45892c.i(t3.BY_PRICE);
                return;
            case 4:
                this.f46226b.f45892c.i(t3.BY_DATE);
                return;
            default:
                this.f46226b.f45892c.i(t3.BY_NUMBER);
                return;
        }
    }
}

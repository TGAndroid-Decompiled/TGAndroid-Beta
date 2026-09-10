package wh;
public final class x3 implements Runnable {
    public final int f44429a;
    public final f4 f44430b;

    public x3(f4 f4Var, int i10) {
        this.f44429a = i10;
        this.f44430b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f44429a) {
            case 0:
                u3 u3Var = this.f44430b.f44094c;
                if (!u3Var.f44374j.isEmpty()) {
                    u3Var.f44374j.clear();
                    u3Var.h();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f44430b.f44094c;
                if (!u3Var2.f44375k.isEmpty()) {
                    u3Var2.f44375k.clear();
                    u3Var2.h();
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f44430b.f44094c;
                if (!u3Var3.f44376l.isEmpty()) {
                    u3Var3.f44376l.clear();
                    u3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f44430b.f44094c.i(t3.BY_PRICE);
                return;
            case 4:
                this.f44430b.f44094c.i(t3.BY_DATE);
                return;
            default:
                this.f44430b.f44094c.i(t3.BY_NUMBER);
                return;
        }
    }
}

package xh;
public final class z3 implements Runnable {
    public final int f46569a;
    public final h4 f46570b;

    public z3(h4 h4Var, int i10) {
        this.f46569a = i10;
        this.f46570b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f46569a) {
            case 0:
                w3 w3Var = this.f46570b.f46234c;
                if (!w3Var.f46531j.isEmpty()) {
                    w3Var.f46531j.clear();
                    w3Var.h();
                    return;
                }
                return;
            case 1:
                w3 w3Var2 = this.f46570b.f46234c;
                if (!w3Var2.f46532k.isEmpty()) {
                    w3Var2.f46532k.clear();
                    w3Var2.h();
                    return;
                }
                return;
            case 2:
                w3 w3Var3 = this.f46570b.f46234c;
                if (!w3Var3.f46533l.isEmpty()) {
                    w3Var3.f46533l.clear();
                    w3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46570b.f46234c.i(v3.BY_PRICE);
                return;
            case 4:
                this.f46570b.f46234c.i(v3.BY_DATE);
                return;
            default:
                this.f46570b.f46234c.i(v3.BY_NUMBER);
                return;
        }
    }
}

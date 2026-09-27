package xh;
public final class y2 implements Runnable {
    public final int f46553a;
    public final j4 f46554b;

    public y2(j4 j4Var, int i10) {
        this.f46553a = i10;
        this.f46554b = j4Var;
    }

    @Override
    public final void run() {
        switch (this.f46553a) {
            case 0:
                w3 w3Var = this.f46554b.d;
                if (!w3Var.f46533l.isEmpty()) {
                    w3Var.f46533l.clear();
                    w3Var.h();
                    return;
                }
                return;
            case 1:
                w3 w3Var2 = this.f46554b.d;
                if (!w3Var2.f46532k.isEmpty()) {
                    w3Var2.f46532k.clear();
                    w3Var2.h();
                    return;
                }
                return;
            case 2:
                w3 w3Var3 = this.f46554b.d;
                if (!w3Var3.f46531j.isEmpty()) {
                    w3Var3.f46531j.clear();
                    w3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f46554b.d.i(v3.BY_PRICE);
                return;
            case 4:
                this.f46554b.d.i(v3.BY_DATE);
                return;
            default:
                this.f46554b.d.i(v3.BY_NUMBER);
                return;
        }
    }
}

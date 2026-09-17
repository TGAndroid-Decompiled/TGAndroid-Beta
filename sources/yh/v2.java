package yh;
public final class v2 implements Runnable {
    public final int f50633a;
    public final g4 f50634b;

    public v2(g4 g4Var, int i10) {
        this.f50633a = i10;
        this.f50634b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f50633a) {
            case 0:
                t3 t3Var = this.f50634b.d;
                if (!t3Var.f50595l.isEmpty()) {
                    t3Var.f50595l.clear();
                    t3Var.h();
                    return;
                }
                return;
            case 1:
                t3 t3Var2 = this.f50634b.d;
                if (!t3Var2.f50594k.isEmpty()) {
                    t3Var2.f50594k.clear();
                    t3Var2.h();
                    return;
                }
                return;
            case 2:
                t3 t3Var3 = this.f50634b.d;
                if (!t3Var3.f50593j.isEmpty()) {
                    t3Var3.f50593j.clear();
                    t3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50634b.d.i(s3.BY_PRICE);
                return;
            case 4:
                this.f50634b.d.i(s3.BY_DATE);
                return;
            default:
                this.f50634b.d.i(s3.BY_NUMBER);
                return;
        }
    }
}

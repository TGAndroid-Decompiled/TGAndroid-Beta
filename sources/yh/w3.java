package yh;
public final class w3 implements Runnable {
    public final int f50619a;
    public final e4 f50620b;

    public w3(e4 e4Var, int i10) {
        this.f50619a = i10;
        this.f50620b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f50619a) {
            case 0:
                t3 t3Var = this.f50620b.f50266c;
                if (!t3Var.f50564j.isEmpty()) {
                    t3Var.f50564j.clear();
                    t3Var.h();
                    return;
                }
                return;
            case 1:
                t3 t3Var2 = this.f50620b.f50266c;
                if (!t3Var2.f50565k.isEmpty()) {
                    t3Var2.f50565k.clear();
                    t3Var2.h();
                    return;
                }
                return;
            case 2:
                t3 t3Var3 = this.f50620b.f50266c;
                if (!t3Var3.f50566l.isEmpty()) {
                    t3Var3.f50566l.clear();
                    t3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50620b.f50266c.i(s3.BY_PRICE);
                return;
            case 4:
                this.f50620b.f50266c.i(s3.BY_DATE);
                return;
            default:
                this.f50620b.f50266c.i(s3.BY_NUMBER);
                return;
        }
    }
}

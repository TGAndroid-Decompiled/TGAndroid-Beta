package yh;
public final class x3 implements Runnable {
    public final int f50627a;
    public final f4 f50628b;

    public x3(f4 f4Var, int i10) {
        this.f50627a = i10;
        this.f50628b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f50627a) {
            case 0:
                t3 t3Var = this.f50628b.f50287c;
                if (!t3Var.f50564j.isEmpty()) {
                    t3Var.f50564j.clear();
                    t3Var.h();
                    return;
                }
                return;
            case 1:
                t3 t3Var2 = this.f50628b.f50287c;
                if (!t3Var2.f50565k.isEmpty()) {
                    t3Var2.f50565k.clear();
                    t3Var2.h();
                    return;
                }
                return;
            case 2:
                t3 t3Var3 = this.f50628b.f50287c;
                if (!t3Var3.f50566l.isEmpty()) {
                    t3Var3.f50566l.clear();
                    t3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50628b.f50287c.i(s3.BY_PRICE);
                return;
            case 4:
                this.f50628b.f50287c.i(s3.BY_DATE);
                return;
            default:
                this.f50628b.f50287c.i(s3.BY_NUMBER);
                return;
        }
    }
}

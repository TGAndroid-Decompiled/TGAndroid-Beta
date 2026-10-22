package yh;
public final class u2 implements Runnable {
    public final int f50536a;
    public final g4 f50537b;

    public u2(g4 g4Var, int i10) {
        this.f50536a = i10;
        this.f50537b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f50536a) {
            case 0:
                s3 s3Var = this.f50537b.d;
                if (!s3Var.f50515l.isEmpty()) {
                    s3Var.f50515l.clear();
                    s3Var.h();
                    return;
                }
                return;
            case 1:
                s3 s3Var2 = this.f50537b.d;
                if (!s3Var2.f50514k.isEmpty()) {
                    s3Var2.f50514k.clear();
                    s3Var2.h();
                    return;
                }
                return;
            case 2:
                s3 s3Var3 = this.f50537b.d;
                if (!s3Var3.f50513j.isEmpty()) {
                    s3Var3.f50513j.clear();
                    s3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50537b.d.i(r3.BY_PRICE);
                return;
            case 4:
                this.f50537b.d.i(r3.BY_DATE);
                return;
            default:
                this.f50537b.d.i(r3.BY_NUMBER);
                return;
        }
    }
}

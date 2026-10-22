package yh;
public final class w3 implements Runnable {
    public final int f50576a;
    public final e4 f50577b;

    public w3(e4 e4Var, int i10) {
        this.f50576a = i10;
        this.f50577b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f50576a) {
            case 0:
                s3 s3Var = this.f50577b.f50236c;
                if (!s3Var.f50513j.isEmpty()) {
                    s3Var.f50513j.clear();
                    s3Var.h();
                    return;
                }
                return;
            case 1:
                s3 s3Var2 = this.f50577b.f50236c;
                if (!s3Var2.f50514k.isEmpty()) {
                    s3Var2.f50514k.clear();
                    s3Var2.h();
                    return;
                }
                return;
            case 2:
                s3 s3Var3 = this.f50577b.f50236c;
                if (!s3Var3.f50515l.isEmpty()) {
                    s3Var3.f50515l.clear();
                    s3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50577b.f50236c.i(r3.BY_PRICE);
                return;
            case 4:
                this.f50577b.f50236c.i(r3.BY_DATE);
                return;
            default:
                this.f50577b.f50236c.i(r3.BY_NUMBER);
                return;
        }
    }
}

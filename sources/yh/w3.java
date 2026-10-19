package yh;
public final class w3 implements Runnable {
    public final int f50568a;
    public final e4 f50569b;

    public w3(e4 e4Var, int i10) {
        this.f50568a = i10;
        this.f50569b = e4Var;
    }

    @Override
    public final void run() {
        switch (this.f50568a) {
            case 0:
                s3 s3Var = this.f50569b.f50228c;
                if (!s3Var.f50505j.isEmpty()) {
                    s3Var.f50505j.clear();
                    s3Var.h();
                    return;
                }
                return;
            case 1:
                s3 s3Var2 = this.f50569b.f50228c;
                if (!s3Var2.f50506k.isEmpty()) {
                    s3Var2.f50506k.clear();
                    s3Var2.h();
                    return;
                }
                return;
            case 2:
                s3 s3Var3 = this.f50569b.f50228c;
                if (!s3Var3.f50507l.isEmpty()) {
                    s3Var3.f50507l.clear();
                    s3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50569b.f50228c.i(r3.BY_PRICE);
                return;
            case 4:
                this.f50569b.f50228c.i(r3.BY_DATE);
                return;
            default:
                this.f50569b.f50228c.i(r3.BY_NUMBER);
                return;
        }
    }
}

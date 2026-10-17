package yh;
public final class v2 implements Runnable {
    public final int f50562a;
    public final h4 f50563b;

    public v2(h4 h4Var, int i10) {
        this.f50562a = i10;
        this.f50563b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f50562a) {
            case 0:
                t3 t3Var = this.f50563b.d;
                if (!t3Var.f50541l.isEmpty()) {
                    t3Var.f50541l.clear();
                    t3Var.h();
                    return;
                }
                return;
            case 1:
                t3 t3Var2 = this.f50563b.d;
                if (!t3Var2.f50540k.isEmpty()) {
                    t3Var2.f50540k.clear();
                    t3Var2.h();
                    return;
                }
                return;
            case 2:
                t3 t3Var3 = this.f50563b.d;
                if (!t3Var3.f50539j.isEmpty()) {
                    t3Var3.f50539j.clear();
                    t3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50563b.d.i(s3.BY_PRICE);
                return;
            case 4:
                this.f50563b.d.i(s3.BY_DATE);
                return;
            default:
                this.f50563b.d.i(s3.BY_NUMBER);
                return;
        }
    }
}

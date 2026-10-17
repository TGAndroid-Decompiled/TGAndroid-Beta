package yh;
public final class x3 implements Runnable {
    public final int f50602a;
    public final f4 f50603b;

    public x3(f4 f4Var, int i10) {
        this.f50602a = i10;
        this.f50603b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f50602a) {
            case 0:
                t3 t3Var = this.f50603b.f50262c;
                if (!t3Var.f50539j.isEmpty()) {
                    t3Var.f50539j.clear();
                    t3Var.h();
                    return;
                }
                return;
            case 1:
                t3 t3Var2 = this.f50603b.f50262c;
                if (!t3Var2.f50540k.isEmpty()) {
                    t3Var2.f50540k.clear();
                    t3Var2.h();
                    return;
                }
                return;
            case 2:
                t3 t3Var3 = this.f50603b.f50262c;
                if (!t3Var3.f50541l.isEmpty()) {
                    t3Var3.f50541l.clear();
                    t3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50603b.f50262c.i(s3.BY_PRICE);
                return;
            case 4:
                this.f50603b.f50262c.i(s3.BY_DATE);
                return;
            default:
                this.f50603b.f50262c.i(s3.BY_NUMBER);
                return;
        }
    }
}

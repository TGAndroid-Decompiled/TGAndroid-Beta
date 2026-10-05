package xh;
public final class x2 implements Runnable {
    public final int f50319a;
    public final i4 f50320b;

    public x2(i4 i4Var, int i10) {
        this.f50319a = i10;
        this.f50320b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f50319a) {
            case 0:
                v3 v3Var = this.f50320b.d;
                if (!v3Var.f50297l.isEmpty()) {
                    v3Var.f50297l.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f50320b.d;
                if (!v3Var2.f50296k.isEmpty()) {
                    v3Var2.f50296k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f50320b.d;
                if (!v3Var3.f50295j.isEmpty()) {
                    v3Var3.f50295j.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50320b.d.i(u3.BY_PRICE);
                return;
            case 4:
                this.f50320b.d.i(u3.BY_DATE);
                return;
            default:
                this.f50320b.d.i(u3.BY_NUMBER);
                return;
        }
    }
}

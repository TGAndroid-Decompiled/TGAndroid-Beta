package xh;
public final class x2 implements Runnable {
    public final int f50312a;
    public final i4 f50313b;

    public x2(i4 i4Var, int i10) {
        this.f50312a = i10;
        this.f50313b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f50312a) {
            case 0:
                v3 v3Var = this.f50313b.d;
                if (!v3Var.f50290l.isEmpty()) {
                    v3Var.f50290l.clear();
                    v3Var.h();
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f50313b.d;
                if (!v3Var2.f50289k.isEmpty()) {
                    v3Var2.f50289k.clear();
                    v3Var2.h();
                    return;
                }
                return;
            case 2:
                v3 v3Var3 = this.f50313b.d;
                if (!v3Var3.f50288j.isEmpty()) {
                    v3Var3.f50288j.clear();
                    v3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f50313b.d.i(u3.BY_PRICE);
                return;
            case 4:
                this.f50313b.d.i(u3.BY_DATE);
                return;
            default:
                this.f50313b.d.i(u3.BY_NUMBER);
                return;
        }
    }
}

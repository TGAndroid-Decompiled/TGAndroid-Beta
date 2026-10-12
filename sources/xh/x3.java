package xh;
public final class x3 implements Runnable {
    public final int f51823a;
    public final f4 f51824b;

    public x3(f4 f4Var, int i10) {
        this.f51823a = i10;
        this.f51824b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f51823a) {
            case 0:
                u3 u3Var = this.f51824b.f51469c;
                if (!u3Var.f51771j.isEmpty()) {
                    u3Var.f51771j.clear();
                    u3Var.h();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f51824b.f51469c;
                if (!u3Var2.f51772k.isEmpty()) {
                    u3Var2.f51772k.clear();
                    u3Var2.h();
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f51824b.f51469c;
                if (!u3Var3.f51773l.isEmpty()) {
                    u3Var3.f51773l.clear();
                    u3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f51824b.f51469c.i(t3.BY_PRICE);
                return;
            case 4:
                this.f51824b.f51469c.i(t3.BY_DATE);
                return;
            default:
                this.f51824b.f51469c.i(t3.BY_NUMBER);
                return;
        }
    }
}

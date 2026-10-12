package xh;
public final class x3 implements Runnable {
    public final int f51831a;
    public final f4 f51832b;

    public x3(f4 f4Var, int i10) {
        this.f51831a = i10;
        this.f51832b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f51831a) {
            case 0:
                u3 u3Var = this.f51832b.f51477c;
                if (!u3Var.f51779j.isEmpty()) {
                    u3Var.f51779j.clear();
                    u3Var.h();
                    return;
                }
                return;
            case 1:
                u3 u3Var2 = this.f51832b.f51477c;
                if (!u3Var2.f51780k.isEmpty()) {
                    u3Var2.f51780k.clear();
                    u3Var2.h();
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f51832b.f51477c;
                if (!u3Var3.f51781l.isEmpty()) {
                    u3Var3.f51781l.clear();
                    u3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f51832b.f51477c.i(t3.BY_PRICE);
                return;
            case 4:
                this.f51832b.f51477c.i(t3.BY_DATE);
                return;
            default:
                this.f51832b.f51477c.i(t3.BY_NUMBER);
                return;
        }
    }
}

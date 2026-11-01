package th;
public final class o2 implements Runnable {
    public final int f49288a;
    public final u2 f49289b;

    public o2(u2 u2Var, int i10) {
        this.f49288a = i10;
        this.f49289b = u2Var;
    }

    @Override
    public final void run() {
        switch (this.f49288a) {
            case 0:
                ((f7) this.f49289b.f49526x.f49797z1).g(false);
                return;
            case 1:
                z2 z2Var = this.f49289b.f49526x;
                v2 v2Var = z2Var.f49797z1;
                if (v2Var != null) {
                    o7 o7Var = ((f7) v2Var).d;
                    o7Var.Z0 = false;
                    o7Var.d0();
                }
                z2Var.d1(false);
                z2Var.Q2 = true;
                z2Var.f49773t0.E(true);
                return;
            case 2:
                z2 z2Var2 = this.f49289b.f49526x;
                z2Var2.D3 = true;
                z2Var2.setActive(false);
                return;
            default:
                z2 z2Var3 = this.f49289b.f49526x;
                z2Var3.D3 = true;
                z2Var3.setActive(false);
                return;
        }
    }
}

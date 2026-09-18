package pg;
public final class n0 implements Runnable {
    public final int f40946a;
    public final q0 f40947b;

    public n0(q0 q0Var, int i10) {
        this.f40946a = i10;
        this.f40947b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f40946a) {
            case 0:
                q0 q0Var = this.f40947b;
                q0Var.f40977c = null;
                k2.u uVar = q0Var.f40975a;
                if (uVar != null) {
                    uVar.W();
                    return;
                }
                return;
            default:
                this.f40947b.b();
                return;
        }
    }
}

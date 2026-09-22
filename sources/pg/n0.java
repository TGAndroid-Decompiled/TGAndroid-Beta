package pg;
public final class n0 implements Runnable {
    public final int f40915a;
    public final q0 f40916b;

    public n0(q0 q0Var, int i10) {
        this.f40915a = i10;
        this.f40916b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f40915a) {
            case 0:
                q0 q0Var = this.f40916b;
                q0Var.f40946c = null;
                k2.u uVar = q0Var.f40944a;
                if (uVar != null) {
                    uVar.W();
                    return;
                }
                return;
            default:
                this.f40916b.b();
                return;
        }
    }
}

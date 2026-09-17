package pg;
public final class n0 implements Runnable {
    public final int f40941a;
    public final q0 f40942b;

    public n0(q0 q0Var, int i10) {
        this.f40941a = i10;
        this.f40942b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f40941a) {
            case 0:
                q0 q0Var = this.f40942b;
                q0Var.f40972c = null;
                k2.u uVar = q0Var.f40970a;
                if (uVar != null) {
                    uVar.W();
                    return;
                }
                return;
            default:
                this.f40942b.b();
                return;
        }
    }
}

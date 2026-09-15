package pg;
public final class n0 implements Runnable {
    public final int f40919a;
    public final q0 f40920b;

    public n0(q0 q0Var, int i10) {
        this.f40919a = i10;
        this.f40920b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f40919a) {
            case 0:
                q0 q0Var = this.f40920b;
                q0Var.f40950c = null;
                k2.u uVar = q0Var.f40948a;
                if (uVar != null) {
                    uVar.W();
                    return;
                }
                return;
            default:
                this.f40920b.b();
                return;
        }
    }
}

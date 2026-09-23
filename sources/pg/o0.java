package pg;
public final class o0 implements Runnable {
    public final int f40875a;
    public final r0 f40876b;

    public o0(r0 r0Var, int i10) {
        this.f40875a = i10;
        this.f40876b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f40875a) {
            case 0:
                r0 r0Var = this.f40876b;
                r0Var.f40907c = null;
                k2.u uVar = r0Var.f40905a;
                if (uVar != null) {
                    uVar.W();
                    return;
                }
                return;
            default:
                this.f40876b.b();
                return;
        }
    }
}

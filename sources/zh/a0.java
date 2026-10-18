package zh;
public final class a0 implements Runnable {
    public final int f51633a;
    public final f0 f51634b;

    public a0(f0 f0Var, int i10) {
        this.f51633a = i10;
        this.f51634b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f51633a) {
            case 0:
                f0 f0Var = this.f51634b;
                if (f0Var.h == null && f0Var.d != null && !f0Var.isFinished && f0Var.getParentActivity() != null) {
                    f0Var.b0(f0Var.d.H0(), 0.0f, true);
                    f0Var.h.setVisibility(4);
                    c cVar = f0Var.f51726x;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                f0 f0Var2 = this.f51634b;
                c cVar2 = f0Var2.f51726x;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                f0Var2.h0();
                return;
            default:
                this.f51634b.f0();
                return;
        }
    }
}

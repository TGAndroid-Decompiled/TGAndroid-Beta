package vh;
public final class t2 implements Runnable {
    public final int f46180a;
    public final r3 f46181b;
    public final f2.t0 f46182c;

    public t2(r3 r3Var, f2.t0 t0Var, int i10) {
        this.f46180a = i10;
        this.f46181b = r3Var;
        this.f46182c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f46180a) {
            case 0:
                this.f46181b.setItemAnimator(this.f46182c);
                return;
            default:
                this.f46181b.setItemAnimator(this.f46182c);
                return;
        }
    }
}

package tg;
public final class d0 implements Runnable {
    public final int f48412a;
    public final f0 f48413b;

    public d0(f0 f0Var, int i10) {
        this.f48412a = i10;
        this.f48413b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f48412a) {
            case 0:
                f0.f0(this.f48413b);
                return;
            default:
                f0.e0(this.f48413b);
                return;
        }
    }
}

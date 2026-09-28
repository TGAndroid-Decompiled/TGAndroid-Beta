package xh;
public final class d2 implements Runnable {
    public final int f46113a;
    public final o2 f46114b;

    public d2(o2 o2Var, int i10) {
        this.f46113a = i10;
        this.f46114b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f46113a) {
            case 0:
                this.f46114b.setReordering(true);
                return;
            case 1:
                this.f46114b.setReordering(true);
                return;
            case 2:
                this.f46114b.f(false);
                return;
            default:
                this.f46114b.setReordering(true);
                return;
        }
    }
}

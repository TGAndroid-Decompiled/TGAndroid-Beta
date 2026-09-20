package xh;
public final class d2 implements Runnable {
    public final int f46133a;
    public final o2 f46134b;

    public d2(o2 o2Var, int i10) {
        this.f46133a = i10;
        this.f46134b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f46133a) {
            case 0:
                this.f46134b.setReordering(true);
                return;
            case 1:
                this.f46134b.setReordering(true);
                return;
            case 2:
                this.f46134b.f(false);
                return;
            default:
                this.f46134b.setReordering(true);
                return;
        }
    }
}

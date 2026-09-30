package xh;
public final class d2 implements Runnable {
    public final int f46115a;
    public final o2 f46116b;

    public d2(o2 o2Var, int i10) {
        this.f46115a = i10;
        this.f46116b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f46115a) {
            case 0:
                this.f46116b.setReordering(true);
                return;
            case 1:
                this.f46116b.setReordering(true);
                return;
            case 2:
                this.f46116b.f(false);
                return;
            default:
                this.f46116b.setReordering(true);
                return;
        }
    }
}

package xh;
public final class d2 implements Runnable {
    public final int f45785a;
    public final o2 f45786b;

    public d2(o2 o2Var, int i10) {
        this.f45785a = i10;
        this.f45786b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f45785a) {
            case 0:
                this.f45786b.setReordering(true);
                return;
            case 1:
                this.f45786b.setReordering(true);
                return;
            case 2:
                this.f45786b.f(false);
                return;
            default:
                this.f45786b.setReordering(true);
                return;
        }
    }
}

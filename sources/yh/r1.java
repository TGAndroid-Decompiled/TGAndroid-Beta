package yh;
public final class r1 implements Runnable {
    public final int f50481a;
    public final l2 f50482b;
    public final int f50483c;

    public r1(l2 l2Var, int i10, int i11) {
        this.f50481a = i11;
        this.f50482b = l2Var;
        this.f50483c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50481a) {
            case 0:
                this.f50482b.f50362f.scrollBy(0, this.f50483c);
                return;
            default:
                g2 g2Var = this.f50482b.f50362f;
                if (g2Var != null) {
                    g2Var.setSpanCount(this.f50483c);
                    return;
                }
                return;
        }
    }
}

package yh;
public final class r1 implements Runnable {
    public final int f50482a;
    public final l2 f50483b;
    public final int f50484c;

    public r1(l2 l2Var, int i10, int i11) {
        this.f50482a = i11;
        this.f50483b = l2Var;
        this.f50484c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50482a) {
            case 0:
                this.f50483b.f50363f.scrollBy(0, this.f50484c);
                return;
            default:
                g2 g2Var = this.f50483b.f50363f;
                if (g2Var != null) {
                    g2Var.setSpanCount(this.f50484c);
                    return;
                }
                return;
        }
    }
}

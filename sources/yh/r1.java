package yh;
public final class r1 implements Runnable {
    public final int f50948a;
    public final l2 f50949b;
    public final int f50950c;

    public r1(l2 l2Var, int i10, int i11) {
        this.f50948a = i11;
        this.f50949b = l2Var;
        this.f50950c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50948a) {
            case 0:
                this.f50949b.f50827f.scrollBy(0, this.f50950c);
                return;
            default:
                g2 g2Var = this.f50949b.f50827f;
                if (g2Var != null) {
                    g2Var.setSpanCount(this.f50950c);
                    return;
                }
                return;
        }
    }
}

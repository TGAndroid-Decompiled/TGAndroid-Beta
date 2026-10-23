package yh;
public final class r1 implements Runnable {
    public final int f50949a;
    public final l2 f50950b;
    public final int f50951c;

    public r1(l2 l2Var, int i10, int i11) {
        this.f50949a = i11;
        this.f50950b = l2Var;
        this.f50951c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50949a) {
            case 0:
                this.f50950b.f50828f.scrollBy(0, this.f50951c);
                return;
            default:
                g2 g2Var = this.f50950b.f50828f;
                if (g2Var != null) {
                    g2Var.setSpanCount(this.f50951c);
                    return;
                }
                return;
        }
    }
}

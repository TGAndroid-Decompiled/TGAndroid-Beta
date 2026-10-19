package yh;
public final class r1 implements Runnable {
    public final int f50480a;
    public final l2 f50481b;
    public final int f50482c;

    public r1(l2 l2Var, int i10, int i11) {
        this.f50480a = i11;
        this.f50481b = l2Var;
        this.f50482c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50480a) {
            case 0:
                this.f50481b.f50361f.scrollBy(0, this.f50482c);
                return;
            default:
                g2 g2Var = this.f50481b.f50361f;
                if (g2Var != null) {
                    g2Var.setSpanCount(this.f50482c);
                    return;
                }
                return;
        }
    }
}

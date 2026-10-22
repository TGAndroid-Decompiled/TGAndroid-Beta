package yh;
public final class r1 implements Runnable {
    public final int f50490a;
    public final l2 f50491b;
    public final int f50492c;

    public r1(l2 l2Var, int i10, int i11) {
        this.f50490a = i11;
        this.f50491b = l2Var;
        this.f50492c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50490a) {
            case 0:
                this.f50491b.f50371f.scrollBy(0, this.f50492c);
                return;
            default:
                g2 g2Var = this.f50491b.f50371f;
                if (g2Var != null) {
                    g2Var.setSpanCount(this.f50492c);
                    return;
                }
                return;
        }
    }
}

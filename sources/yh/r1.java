package yh;
public final class r1 implements Runnable {
    public final int f50487a;
    public final l2 f50488b;
    public final int f50489c;

    public r1(l2 l2Var, int i10, int i11) {
        this.f50487a = i11;
        this.f50488b = l2Var;
        this.f50489c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50487a) {
            case 0:
                this.f50488b.f50368f.scrollBy(0, this.f50489c);
                return;
            default:
                g2 g2Var = this.f50488b.f50368f;
                if (g2Var != null) {
                    g2Var.setSpanCount(this.f50489c);
                    return;
                }
                return;
        }
    }
}

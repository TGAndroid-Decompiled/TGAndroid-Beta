package yh;
public final class r1 implements Runnable {
    public final int f50491a;
    public final l2 f50492b;
    public final int f50493c;

    public r1(l2 l2Var, int i10, int i11) {
        this.f50491a = i11;
        this.f50492b = l2Var;
        this.f50493c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50491a) {
            case 0:
                this.f50492b.f50372f.scrollBy(0, this.f50493c);
                return;
            default:
                g2 g2Var = this.f50492b.f50372f;
                if (g2Var != null) {
                    g2Var.setSpanCount(this.f50493c);
                    return;
                }
                return;
        }
    }
}

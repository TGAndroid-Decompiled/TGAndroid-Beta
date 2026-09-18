package xh;
public final class u1 implements Runnable {
    public final int f46165a;
    public final n2 f46166b;
    public final int f46167c;

    public u1(n2 n2Var, int i10, int i11) {
        this.f46165a = i11;
        this.f46166b = n2Var;
        this.f46167c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46165a) {
            case 0:
                this.f46166b.f46065f.scrollBy(0, this.f46167c);
                return;
            default:
                i2 i2Var = this.f46166b.f46065f;
                if (i2Var != null) {
                    i2Var.setSpanCount(this.f46167c);
                    return;
                }
                return;
        }
    }
}

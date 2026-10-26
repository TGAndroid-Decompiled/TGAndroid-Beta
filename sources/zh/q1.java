package zh;
public final class q1 implements Runnable {
    public final int f53220a;
    public final m2 f53221b;
    public final int f53222c;

    public q1(m2 m2Var, int i10, int i11) {
        this.f53220a = i11;
        this.f53221b = m2Var;
        this.f53222c = i10;
    }

    @Override
    public final void run() {
        switch (this.f53220a) {
            case 0:
                this.f53221b.f53146f.scrollBy(0, this.f53222c);
                return;
            default:
                h2 h2Var = this.f53221b.f53146f;
                if (h2Var != null) {
                    h2Var.setSpanCount(this.f53222c);
                    return;
                }
                return;
        }
    }
}

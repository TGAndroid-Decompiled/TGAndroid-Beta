package zh;
public final class q1 implements Runnable {
    public final int f53217a;
    public final m2 f53218b;
    public final int f53219c;

    public q1(m2 m2Var, int i10, int i11) {
        this.f53217a = i11;
        this.f53218b = m2Var;
        this.f53219c = i10;
    }

    @Override
    public final void run() {
        switch (this.f53217a) {
            case 0:
                this.f53218b.f53143f.scrollBy(0, this.f53219c);
                return;
            default:
                h2 h2Var = this.f53218b.f53143f;
                if (h2Var != null) {
                    h2Var.setSpanCount(this.f53219c);
                    return;
                }
                return;
        }
    }
}

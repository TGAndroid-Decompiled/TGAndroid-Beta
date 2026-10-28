package zh;
public final class q1 implements Runnable {
    public final int f53278a;
    public final m2 f53279b;
    public final int f53280c;

    public q1(m2 m2Var, int i10, int i11) {
        this.f53278a = i11;
        this.f53279b = m2Var;
        this.f53280c = i10;
    }

    @Override
    public final void run() {
        switch (this.f53278a) {
            case 0:
                this.f53279b.f53204f.scrollBy(0, this.f53280c);
                return;
            default:
                h2 h2Var = this.f53279b.f53204f;
                if (h2Var != null) {
                    h2Var.setSpanCount(this.f53280c);
                    return;
                }
                return;
        }
    }
}

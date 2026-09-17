package yh;
public final class t1 implements Runnable {
    public final int f50580a;
    public final m2 f50581b;
    public final int f50582c;

    public t1(m2 m2Var, int i10, int i11) {
        this.f50580a = i11;
        this.f50581b = m2Var;
        this.f50582c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50580a) {
            case 0:
                this.f50581b.f50473f.scrollBy(0, this.f50582c);
                return;
            default:
                h2 h2Var = this.f50581b.f50473f;
                if (h2Var != null) {
                    h2Var.setSpanCount(this.f50582c);
                    return;
                }
                return;
        }
    }
}

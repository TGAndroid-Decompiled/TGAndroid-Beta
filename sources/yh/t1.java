package yh;
public final class t1 implements Runnable {
    public final int f50579a;
    public final m2 f50580b;
    public final int f50581c;

    public t1(m2 m2Var, int i10, int i11) {
        this.f50579a = i11;
        this.f50580b = m2Var;
        this.f50581c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50579a) {
            case 0:
                this.f50580b.f50472f.scrollBy(0, this.f50581c);
                return;
            default:
                h2 h2Var = this.f50580b.f50472f;
                if (h2Var != null) {
                    h2Var.setSpanCount(this.f50581c);
                    return;
                }
                return;
        }
    }
}

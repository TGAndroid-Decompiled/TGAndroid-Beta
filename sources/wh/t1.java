package wh;
public final class t1 implements Runnable {
    public final int f44353a;
    public final m2 f44354b;
    public final int f44355c;

    public t1(m2 m2Var, int i10, int i11) {
        this.f44353a = i11;
        this.f44354b = m2Var;
        this.f44355c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44353a) {
            case 0:
                this.f44354b.f44249f.scrollBy(0, this.f44355c);
                return;
            default:
                h2 h2Var = this.f44354b.f44249f;
                if (h2Var != null) {
                    h2Var.setSpanCount(this.f44355c);
                    return;
                }
                return;
        }
    }
}

package yh;
public final class t1 implements Runnable {
    public final int f49123a;
    public final m2 f49124b;
    public final int f49125c;

    public t1(m2 m2Var, int i10, int i11) {
        this.f49123a = i11;
        this.f49124b = m2Var;
        this.f49125c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49123a) {
            case 0:
                this.f49124b.f48997f.scrollBy(0, this.f49125c);
                return;
            default:
                h2 h2Var = this.f49124b.f48997f;
                if (h2Var != null) {
                    h2Var.setSpanCount(this.f49125c);
                    return;
                }
                return;
        }
    }
}

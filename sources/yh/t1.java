package yh;
public final class t1 implements Runnable {
    public final int f49122a;
    public final m2 f49123b;
    public final int f49124c;

    public t1(m2 m2Var, int i10, int i11) {
        this.f49122a = i11;
        this.f49123b = m2Var;
        this.f49124c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49122a) {
            case 0:
                this.f49123b.f48996f.scrollBy(0, this.f49124c);
                return;
            default:
                h2 h2Var = this.f49123b.f48996f;
                if (h2Var != null) {
                    h2Var.setSpanCount(this.f49124c);
                    return;
                }
                return;
        }
    }
}

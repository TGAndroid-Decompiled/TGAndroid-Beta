package zh;
public final class k1 implements Runnable {
    public final int f60422a;
    public final z1 f60423b;
    public final int f60424c;

    public k1(z1 z1Var, int i7, int i10) {
        this.f60422a = i10;
        this.f60423b = z1Var;
        this.f60424c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60422a) {
            case 0:
                this.f60423b.f60655f.scrollBy(0, this.f60424c);
                return;
            default:
                fi.w3 w3Var = this.f60423b.f60655f;
                if (w3Var != null) {
                    w3Var.setSpanCount(this.f60424c);
                    return;
                }
                return;
        }
    }
}

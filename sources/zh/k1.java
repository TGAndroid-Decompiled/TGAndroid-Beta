package zh;
public final class k1 implements Runnable {
    public final int f60420a;
    public final z1 f60421b;
    public final int f60422c;

    public k1(z1 z1Var, int i7, int i10) {
        this.f60420a = i10;
        this.f60421b = z1Var;
        this.f60422c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60420a) {
            case 0:
                this.f60421b.f60643f.scrollBy(0, this.f60422c);
                return;
            default:
                fi.w3 w3Var = this.f60421b.f60643f;
                if (w3Var != null) {
                    w3Var.setSpanCount(this.f60422c);
                    return;
                }
                return;
        }
    }
}

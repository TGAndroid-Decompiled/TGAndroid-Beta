package xh;
public final class u1 implements Runnable {
    public final int f46137a;
    public final n2 f46138b;
    public final int f46139c;

    public u1(n2 n2Var, int i10, int i11) {
        this.f46137a = i11;
        this.f46138b = n2Var;
        this.f46139c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46137a) {
            case 0:
                this.f46138b.f46037f.scrollBy(0, this.f46139c);
                return;
            default:
                i2 i2Var = this.f46138b.f46037f;
                if (i2Var != null) {
                    i2Var.setSpanCount(this.f46139c);
                    return;
                }
                return;
        }
    }
}

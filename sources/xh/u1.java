package xh;
public final class u1 implements Runnable {
    public final int f51758a;
    public final n2 f51759b;
    public final int f51760c;

    public u1(n2 n2Var, int i10, int i11) {
        this.f51758a = i11;
        this.f51759b = n2Var;
        this.f51760c = i10;
    }

    @Override
    public final void run() {
        switch (this.f51758a) {
            case 0:
                this.f51759b.f51626f.scrollBy(0, this.f51760c);
                return;
            default:
                i2 i2Var = this.f51759b.f51626f;
                if (i2Var != null) {
                    i2Var.setSpanCount(this.f51760c);
                    return;
                }
                return;
        }
    }
}

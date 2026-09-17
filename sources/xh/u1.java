package xh;
public final class u1 implements Runnable {
    public final int f46160a;
    public final n2 f46161b;
    public final int f46162c;

    public u1(n2 n2Var, int i10, int i11) {
        this.f46160a = i11;
        this.f46161b = n2Var;
        this.f46162c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46160a) {
            case 0:
                this.f46161b.f46060f.scrollBy(0, this.f46162c);
                return;
            default:
                i2 i2Var = this.f46161b.f46060f;
                if (i2Var != null) {
                    i2Var.setSpanCount(this.f46162c);
                    return;
                }
                return;
        }
    }
}

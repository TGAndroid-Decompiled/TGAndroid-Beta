package xh;
public final class u1 implements Runnable {
    public final int f46133a;
    public final n2 f46134b;
    public final int f46135c;

    public u1(n2 n2Var, int i10, int i11) {
        this.f46133a = i11;
        this.f46134b = n2Var;
        this.f46135c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46133a) {
            case 0:
                this.f46134b.f46033f.scrollBy(0, this.f46135c);
                return;
            default:
                i2 i2Var = this.f46134b.f46033f;
                if (i2Var != null) {
                    i2Var.setSpanCount(this.f46135c);
                    return;
                }
                return;
        }
    }
}

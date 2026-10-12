package xh;
public final class u1 implements Runnable {
    public final int f51766a;
    public final n2 f51767b;
    public final int f51768c;

    public u1(n2 n2Var, int i10, int i11) {
        this.f51766a = i11;
        this.f51767b = n2Var;
        this.f51768c = i10;
    }

    @Override
    public final void run() {
        switch (this.f51766a) {
            case 0:
                this.f51767b.f51634f.scrollBy(0, this.f51768c);
                return;
            default:
                i2 i2Var = this.f51767b.f51634f;
                if (i2Var != null) {
                    i2Var.setSpanCount(this.f51768c);
                    return;
                }
                return;
        }
    }
}

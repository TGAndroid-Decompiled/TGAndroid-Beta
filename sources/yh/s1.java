package yh;
public final class s1 implements Runnable {
    public final int f50516a;
    public final m2 f50517b;
    public final int f50518c;

    public s1(m2 m2Var, int i10, int i11) {
        this.f50516a = i11;
        this.f50517b = m2Var;
        this.f50518c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50516a) {
            case 0:
                this.f50517b.f50397f.scrollBy(0, this.f50518c);
                return;
            default:
                h2 h2Var = this.f50517b.f50397f;
                if (h2Var != null) {
                    h2Var.setSpanCount(this.f50518c);
                    return;
                }
                return;
        }
    }
}

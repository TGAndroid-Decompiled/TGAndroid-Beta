package yh;
public final class t1 implements Runnable {
    public final int f50550a;
    public final m2 f50551b;
    public final int f50552c;

    public t1(m2 m2Var, int i10, int i11) {
        this.f50550a = i11;
        this.f50551b = m2Var;
        this.f50552c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50550a) {
            case 0:
                this.f50551b.f50443f.scrollBy(0, this.f50552c);
                return;
            default:
                h2 h2Var = this.f50551b.f50443f;
                if (h2Var != null) {
                    h2Var.setSpanCount(this.f50552c);
                    return;
                }
                return;
        }
    }
}

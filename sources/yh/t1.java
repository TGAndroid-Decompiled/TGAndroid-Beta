package yh;
public final class t1 implements Runnable {
    public final int f50551a;
    public final m2 f50552b;
    public final int f50553c;

    public t1(m2 m2Var, int i10, int i11) {
        this.f50551a = i11;
        this.f50552b = m2Var;
        this.f50553c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50551a) {
            case 0:
                this.f50552b.f50444f.scrollBy(0, this.f50553c);
                return;
            default:
                h2 h2Var = this.f50552b.f50444f;
                if (h2Var != null) {
                    h2Var.setSpanCount(this.f50553c);
                    return;
                }
                return;
        }
    }
}

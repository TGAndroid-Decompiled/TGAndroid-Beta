package xh;
public final class w1 implements Runnable {
    public final int f46519a;
    public final p2 f46520b;
    public final int f46521c;

    public w1(p2 p2Var, int i10, int i11) {
        this.f46519a = i11;
        this.f46520b = p2Var;
        this.f46521c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46519a) {
            case 0:
                this.f46520b.f46408f.scrollBy(0, this.f46521c);
                return;
            default:
                k2 k2Var = this.f46520b.f46408f;
                if (k2Var != null) {
                    k2Var.setSpanCount(this.f46521c);
                    return;
                }
                return;
        }
    }
}

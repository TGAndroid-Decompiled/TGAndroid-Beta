package zh;
public final class l1 implements Runnable {
    public final int f60332a;
    public final a2 f60333b;
    public final int f60334c;

    public l1(a2 a2Var, int i7, int i10) {
        this.f60332a = i10;
        this.f60333b = a2Var;
        this.f60334c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60332a) {
            case 0:
                this.f60333b.f60109f.scrollBy(0, this.f60334c);
                return;
            default:
                fi.w3 w3Var = this.f60333b.f60109f;
                if (w3Var != null) {
                    w3Var.setSpanCount(this.f60334c);
                    return;
                }
                return;
        }
    }
}

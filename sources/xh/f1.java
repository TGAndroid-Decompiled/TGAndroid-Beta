package xh;
public final class f1 implements Runnable {
    public final int f45857a;
    public final i1 f45858b;
    public final boolean f45859c;

    public f1(i1 i1Var, boolean z10, int i10) {
        this.f45857a = i10;
        this.f45858b = i1Var;
        this.f45859c = z10;
    }

    @Override
    public final void run() {
        switch (this.f45857a) {
            case 0:
                boolean z10 = this.f45859c;
                i1 i1Var = this.f45858b;
                if (!z10) {
                    i1Var.G.setVisibility(8);
                    return;
                } else {
                    i1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f45859c;
                i1 i1Var2 = this.f45858b;
                if (!z11) {
                    i1Var2.v.setVisibility(8);
                    return;
                } else {
                    i1Var2.getClass();
                    return;
                }
        }
    }
}

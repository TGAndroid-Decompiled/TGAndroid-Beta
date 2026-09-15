package xh;
public final class f1 implements Runnable {
    public final int f45861a;
    public final i1 f45862b;
    public final boolean f45863c;

    public f1(i1 i1Var, boolean z10, int i10) {
        this.f45861a = i10;
        this.f45862b = i1Var;
        this.f45863c = z10;
    }

    @Override
    public final void run() {
        switch (this.f45861a) {
            case 0:
                boolean z10 = this.f45863c;
                i1 i1Var = this.f45862b;
                if (!z10) {
                    i1Var.G.setVisibility(8);
                    return;
                } else {
                    i1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f45863c;
                i1 i1Var2 = this.f45862b;
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

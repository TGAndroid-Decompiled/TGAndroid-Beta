package xh;
public final class g1 implements Runnable {
    public final int f45823a;
    public final j1 f45824b;
    public final boolean f45825c;

    public g1(j1 j1Var, boolean z10, int i10) {
        this.f45823a = i10;
        this.f45824b = j1Var;
        this.f45825c = z10;
    }

    @Override
    public final void run() {
        switch (this.f45823a) {
            case 0:
                boolean z10 = this.f45825c;
                j1 j1Var = this.f45824b;
                if (!z10) {
                    j1Var.G.setVisibility(8);
                    return;
                } else {
                    j1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f45825c;
                j1 j1Var2 = this.f45824b;
                if (!z11) {
                    j1Var2.v.setVisibility(8);
                    return;
                } else {
                    j1Var2.getClass();
                    return;
                }
        }
    }
}

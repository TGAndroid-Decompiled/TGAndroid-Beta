package th;
public final class g6 implements Runnable {
    public final int f49017a;
    public final h6 f49018b;

    public g6(h6 h6Var, int i10) {
        this.f49017a = i10;
        this.f49018b = h6Var;
    }

    @Override
    public final void run() {
        switch (this.f49017a) {
            case 0:
                i6 i6Var = this.f49018b.v;
                i6Var.f49088s = 0;
                i6Var.requestLayout();
                j6 j6Var = i6Var.J;
                j6Var.L(j6Var.getWidth(), j6Var.getHeight());
                j6Var.requestLayout();
                return;
            case 1:
                i6 i6Var2 = this.f49018b.v;
                i6Var2.f49088s = 0;
                i6Var2.requestLayout();
                j6 j6Var2 = i6Var2.J;
                j6Var2.L(j6Var2.getWidth(), j6Var2.getHeight());
                j6Var2.requestLayout();
                return;
            case 2:
                h6 h6Var = this.f49018b;
                h6Var.v.post(new g6(h6Var, 3));
                return;
            default:
                this.f49018b.v.f49091y = true;
                return;
        }
    }
}

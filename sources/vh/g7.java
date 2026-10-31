package vh;
public final class g7 implements Runnable {
    public final int f51212a;
    public final o8 f51213b;
    public final boolean f51214c;

    public g7(o8 o8Var, boolean z10, int i10) {
        this.f51212a = i10;
        this.f51213b = o8Var;
        this.f51214c = z10;
    }

    @Override
    public final void run() {
        switch (this.f51212a) {
            case 0:
                this.f51213b.e(this.f51214c);
                return;
            case 1:
                o8 o8Var = this.f51213b;
                if (!this.f51214c) {
                    o8Var.J0.b(false, false);
                    return;
                } else {
                    o8Var.getClass();
                    return;
                }
            default:
                o8 o8Var2 = this.f51213b;
                o8Var2.R = null;
                o8Var2.e = false;
                o8Var2.p(this.f51214c);
                return;
        }
    }
}

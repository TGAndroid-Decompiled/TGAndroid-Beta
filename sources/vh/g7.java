package vh;
public final class g7 implements Runnable {
    public final int f51227a;
    public final o8 f51228b;
    public final boolean f51229c;

    public g7(o8 o8Var, boolean z10, int i10) {
        this.f51227a = i10;
        this.f51228b = o8Var;
        this.f51229c = z10;
    }

    @Override
    public final void run() {
        switch (this.f51227a) {
            case 0:
                this.f51228b.e(this.f51229c);
                return;
            case 1:
                o8 o8Var = this.f51228b;
                if (!this.f51229c) {
                    o8Var.J0.b(false, false);
                    return;
                } else {
                    o8Var.getClass();
                    return;
                }
            default:
                o8 o8Var2 = this.f51228b;
                o8Var2.R = null;
                o8Var2.e = false;
                o8Var2.p(this.f51229c);
                return;
        }
    }
}

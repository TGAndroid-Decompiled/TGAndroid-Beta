package qh;
public final class r2 implements Runnable {
    public final int f46647a;
    public final o3 f46648b;
    public final f2.w0 f46649c;

    public r2(o3 o3Var, f2.w0 w0Var, int i9) {
        this.f46647a = i9;
        this.f46648b = o3Var;
        this.f46649c = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f46647a) {
            case 0:
                this.f46648b.setItemAnimator(this.f46649c);
                return;
            default:
                this.f46648b.setItemAnimator(this.f46649c);
                return;
        }
    }
}

package xf;
public final class m0 implements Runnable {
    public final int f49273a;
    public final q0 f49274b;

    public m0(q0 q0Var, int i9) {
        this.f49273a = i9;
        this.f49274b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f49273a) {
            case 0:
                q0 q0Var = this.f49274b;
                q0Var.f49312c = null;
                m5.c0 c0Var = q0Var.f49310a;
                if (c0Var != null) {
                    c0Var.i();
                    return;
                }
                return;
            default:
                this.f49274b.b();
                return;
        }
    }
}

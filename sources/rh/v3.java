package rh;
public final class v3 implements Runnable {
    public final int f43817a;
    public final w3 f43818b;

    public v3(w3 w3Var, int i10) {
        this.f43817a = i10;
        this.f43818b = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f43817a) {
            case 0:
                w3 w3Var = this.f43818b;
                if (w3Var.f43838w) {
                    w3Var.d();
                    return;
                }
                return;
            default:
                this.f43818b.invalidateSelf();
                return;
        }
    }
}

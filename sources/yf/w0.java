package yf;

public final class w0 implements Runnable {

    public final int f50109a;

    public final x0 f50110b;

    public w0(x0 x0Var, int i10) {
        this.f50109a = i10;
        this.f50110b = x0Var;
    }

    @Override
    public final void run() {
        switch (this.f50109a) {
            case 0:
                z0 z0Var = this.f50110b.f50119b.d;
                if (z0Var != null) {
                    z0Var.postRunnable(z0Var.f50138w);
                }
                break;
            case 1:
                z0 z0Var2 = this.f50110b.f50119b.d;
                if (z0Var2 != null) {
                    z0Var2.postRunnable(z0Var2.f50138w);
                }
                break;
            default:
                b1 b1Var = this.f50110b.f50119b;
                z0 z0Var3 = b1Var.d;
                z0Var3.getClass();
                z0Var3.postRunnable(new y0(z0Var3, 2));
                b1Var.d = null;
                break;
        }
    }
}

package org.telegram.ui;
public final class yd1 implements Runnable {
    public final int f46042a;
    public final af1 f46043b;

    public yd1(af1 af1Var, int i10) {
        this.f46042a = i10;
        this.f46043b = af1Var;
    }

    @Override
    public final void run() {
        switch (this.f46042a) {
            case 0:
                af1 af1Var = this.f46043b;
                af1Var.x0();
                af1Var.B0();
                return;
            case 1:
                this.f46043b.x0();
                return;
            case 2:
                this.f46043b.O0(true);
                return;
            case 3:
                this.f46043b.finishPreviewFragment();
                return;
            case 4:
                af1 af1Var2 = this.f46043b;
                af1Var2.A0 = null;
                af1Var2.V0(true, false);
                return;
            default:
                af1 af1Var3 = this.f46043b;
                af1Var3.N.postOnAnimation(new yd1(af1Var3, 1));
                return;
        }
    }
}

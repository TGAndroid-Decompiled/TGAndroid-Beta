package org.telegram.ui;
public final class yd1 implements Runnable {
    public final int f46045a;
    public final af1 f46046b;

    public yd1(af1 af1Var, int i10) {
        this.f46045a = i10;
        this.f46046b = af1Var;
    }

    @Override
    public final void run() {
        switch (this.f46045a) {
            case 0:
                af1 af1Var = this.f46046b;
                af1Var.x0();
                af1Var.B0();
                return;
            case 1:
                this.f46046b.x0();
                return;
            case 2:
                this.f46046b.O0(true);
                return;
            case 3:
                this.f46046b.finishPreviewFragment();
                return;
            case 4:
                af1 af1Var2 = this.f46046b;
                af1Var2.A0 = null;
                af1Var2.V0(true, false);
                return;
            default:
                af1 af1Var3 = this.f46046b;
                af1Var3.N.postOnAnimation(new yd1(af1Var3, 1));
                return;
        }
    }
}

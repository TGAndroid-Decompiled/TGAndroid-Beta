package org.telegram.ui;

public final class ud1 implements Runnable {

    public final int f43192a;

    public final we1 f43193b;

    public ud1(we1 we1Var, int i10) {
        this.f43192a = i10;
        this.f43193b = we1Var;
    }

    @Override
    public final void run() {
        switch (this.f43192a) {
            case 0:
                we1 we1Var = this.f43193b;
                we1Var.x0();
                we1Var.B0();
                break;
            case 1:
                this.f43193b.x0();
                break;
            case 2:
                this.f43193b.O0(true);
                break;
            case 3:
                this.f43193b.finishPreviewFragment();
                break;
            case 4:
                we1 we1Var2 = this.f43193b;
                we1Var2.f43758w0 = null;
                we1Var2.U0(true, false);
                break;
            default:
                we1 we1Var3 = this.f43193b;
                we1Var3.J.postOnAnimation(new ud1(we1Var3, 1));
                break;
        }
    }
}

package org.telegram.ui;
public final class td1 implements Runnable {
    public final int f42968a;
    public final we1 f42969b;

    public td1(we1 we1Var, int i9) {
        this.f42968a = i9;
        this.f42969b = we1Var;
    }

    @Override
    public final void run() {
        switch (this.f42968a) {
            case 0:
                we1 we1Var = this.f42969b;
                we1Var.w0();
                we1Var.A0();
                return;
            case 1:
                this.f42969b.w0();
                return;
            case 2:
                this.f42969b.O0(true);
                return;
            case 3:
                this.f42969b.finishPreviewFragment();
                return;
            case 4:
                we1 we1Var2 = this.f42969b;
                we1Var2.f43780w0 = null;
                we1Var2.U0(true, false);
                return;
            default:
                we1 we1Var3 = this.f42969b;
                we1Var3.J.postOnAnimation(new td1(we1Var3, 1));
                return;
        }
    }
}

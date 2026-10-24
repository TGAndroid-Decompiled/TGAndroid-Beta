package org.telegram.ui;
public final class ud1 implements Runnable {
    public final int f42394a;
    public final xe1 f42395b;

    public ud1(xe1 xe1Var, int i10) {
        this.f42394a = i10;
        this.f42395b = xe1Var;
    }

    @Override
    public final void run() {
        switch (this.f42394a) {
            case 0:
                xe1 xe1Var = this.f42395b;
                xe1Var.w0();
                xe1Var.A0();
                return;
            case 1:
                this.f42395b.w0();
                return;
            case 2:
                this.f42395b.N0(true);
                return;
            case 3:
                this.f42395b.finishPreviewFragment();
                return;
            case 4:
                xe1 xe1Var2 = this.f42395b;
                xe1Var2.A0 = null;
                xe1Var2.U0(true, false);
                return;
            default:
                xe1 xe1Var3 = this.f42395b;
                xe1Var3.N.postOnAnimation(new ud1(xe1Var3, 1));
                return;
        }
    }
}

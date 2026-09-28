package org.telegram.ui;
public final class ue1 implements Runnable {
    public final int f38453a;
    public final wf1 f38454b;

    public ue1(wf1 wf1Var, int i10) {
        this.f38453a = i10;
        this.f38454b = wf1Var;
    }

    @Override
    public final void run() {
        switch (this.f38453a) {
            case 0:
                wf1 wf1Var = this.f38454b;
                wf1Var.x0();
                wf1Var.B0();
                return;
            case 1:
                this.f38454b.x0();
                return;
            case 2:
                this.f38454b.O0(true);
                return;
            case 3:
                this.f38454b.finishPreviewFragment();
                return;
            case 4:
                wf1 wf1Var2 = this.f38454b;
                wf1Var2.A0 = null;
                wf1Var2.U0(true, false);
                return;
            default:
                wf1 wf1Var3 = this.f38454b;
                wf1Var3.N.postOnAnimation(new ue1(wf1Var3, 1));
                return;
        }
    }
}

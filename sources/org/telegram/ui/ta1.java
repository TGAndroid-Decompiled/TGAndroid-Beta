package org.telegram.ui;
public final class ta1 implements org.telegram.ui.ActionBar.q1 {
    public final int f52236a;
    public final bb1 f52237b;

    public ta1(bb1 bb1Var, int i7) {
        this.f52236a = i7;
        this.f52237b = bb1Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f52236a) {
            case 0:
                this.f52237b.finishFragment();
                return;
            case 1:
                bb1 bb1Var = this.f52237b;
                bb1Var.G0();
                bb1Var.finishFragment();
                return;
            case 2:
                bb1 bb1Var2 = this.f52237b;
                bb1Var2.S = "";
                bb1Var2.J0(false);
                return;
            case 3:
                bb1.f0(this.f52237b);
                return;
            default:
                bb1.c0(this.f52237b);
                return;
        }
    }
}

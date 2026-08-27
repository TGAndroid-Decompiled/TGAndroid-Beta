package rh;

import org.telegram.ui.ni0;

public final class e1 implements Runnable {

    public final int f47119a;

    public final x1 f47120b;

    public e1(x1 x1Var, int i10) {
        this.f47119a = i10;
        this.f47120b = x1Var;
    }

    @Override
    public final void run() {
        switch (this.f47119a) {
            case 0:
                this.f47120b.B0();
                break;
            case 1:
                x1 x1Var = this.f47120b;
                if (x1Var.G0 != 0) {
                    x1Var.W.setVisibility(8);
                }
                break;
            case 2:
                x1 x1Var2 = this.f47120b;
                if (x1Var2.G0 != 1) {
                    x1Var2.f47553d0.setVisibility(8);
                }
                break;
            case 3:
                x1 x1Var3 = this.f47120b;
                if (x1Var3.G0 != 2) {
                    x1Var3.f47570r0.setVisibility(8);
                }
                break;
            case 4:
                x1.V(this.f47120b);
                break;
            case 5:
                x1 x1Var4 = this.f47120b;
                x1Var4.s0(2147483646, 0, true);
                ni0 ni0Var = x1Var4.K0;
                if (ni0Var != null) {
                    ni0Var.h(false);
                    x1Var4.K0 = null;
                }
                break;
            default:
                x1 x1Var5 = this.f47120b;
                x1Var5.s0(0, 0, false);
                ni0 ni0Var2 = x1Var5.K0;
                if (ni0Var2 != null) {
                    ni0Var2.h(true);
                    x1Var5.K0 = null;
                }
                break;
        }
    }
}

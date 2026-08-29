package th;

import org.telegram.ui.ki0;
public final class e1 implements Runnable {
    public final int f48419a;
    public final x1 f48420b;

    public e1(x1 x1Var, int i10) {
        this.f48419a = i10;
        this.f48420b = x1Var;
    }

    @Override
    public final void run() {
        switch (this.f48419a) {
            case 0:
                this.f48420b.B0();
                return;
            case 1:
                x1 x1Var = this.f48420b;
                if (x1Var.G0 != 0) {
                    x1Var.W.setVisibility(8);
                    return;
                }
                return;
            case 2:
                x1 x1Var2 = this.f48420b;
                if (x1Var2.G0 != 1) {
                    x1Var2.f48851d0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                x1 x1Var3 = this.f48420b;
                if (x1Var3.G0 != 2) {
                    x1Var3.f48868r0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                x1.V(this.f48420b);
                return;
            case 5:
                x1 x1Var4 = this.f48420b;
                x1Var4.s0(2147483646, 0, true);
                ki0 ki0Var = x1Var4.K0;
                if (ki0Var != null) {
                    ki0Var.h(false);
                    x1Var4.K0 = null;
                    return;
                }
                return;
            default:
                x1 x1Var5 = this.f48420b;
                x1Var5.s0(0, 0, false);
                ki0 ki0Var2 = x1Var5.K0;
                if (ki0Var2 != null) {
                    ki0Var2.h(true);
                    x1Var5.K0 = null;
                    return;
                }
                return;
        }
    }
}

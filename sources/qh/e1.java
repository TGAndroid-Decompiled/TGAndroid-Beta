package qh;

import org.telegram.ui.li0;
public final class e1 implements Runnable {
    public final int f46361a;
    public final x1 f46362b;

    public e1(x1 x1Var, int i9) {
        this.f46361a = i9;
        this.f46362b = x1Var;
    }

    @Override
    public final void run() {
        switch (this.f46361a) {
            case 0:
                this.f46362b.A0();
                return;
            case 1:
                x1 x1Var = this.f46362b;
                if (x1Var.G0 != 0) {
                    x1Var.W.setVisibility(8);
                    return;
                }
                return;
            case 2:
                x1 x1Var2 = this.f46362b;
                if (x1Var2.G0 != 1) {
                    x1Var2.f46797d0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                x1 x1Var3 = this.f46362b;
                if (x1Var3.G0 != 2) {
                    x1Var3.f46814r0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                x1.U(this.f46362b);
                return;
            case 5:
                x1 x1Var4 = this.f46362b;
                x1Var4.r0(2147483646, 0, true);
                li0 li0Var = x1Var4.K0;
                if (li0Var != null) {
                    li0Var.h(false);
                    x1Var4.K0 = null;
                    return;
                }
                return;
            default:
                x1 x1Var5 = this.f46362b;
                x1Var5.r0(0, 0, false);
                li0 li0Var2 = x1Var5.K0;
                if (li0Var2 != null) {
                    li0Var2.h(true);
                    x1Var5.K0 = null;
                    return;
                }
                return;
        }
    }
}

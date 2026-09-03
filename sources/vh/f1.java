package vh;

import org.telegram.ui.ui0;
public final class f1 implements Runnable {
    public final int f45967a;
    public final y1 f45968b;

    public f1(y1 y1Var, int i10) {
        this.f45967a = i10;
        this.f45968b = y1Var;
    }

    @Override
    public final void run() {
        switch (this.f45967a) {
            case 0:
                this.f45968b.B0();
                return;
            case 1:
                y1 y1Var = this.f45968b;
                if (y1Var.H0 != 0) {
                    y1Var.X.setVisibility(8);
                    return;
                }
                return;
            case 2:
                y1 y1Var2 = this.f45968b;
                if (y1Var2.H0 != 1) {
                    y1Var2.f46381e0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                y1 y1Var3 = this.f45968b;
                if (y1Var3.H0 != 2) {
                    y1Var3.f46398s0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                y1.V(this.f45968b);
                return;
            case 5:
                y1 y1Var4 = this.f45968b;
                y1Var4.s0(2147483646, 0, true);
                ui0 ui0Var = y1Var4.L0;
                if (ui0Var != null) {
                    ui0Var.h(false);
                    y1Var4.L0 = null;
                    return;
                }
                return;
            default:
                y1 y1Var5 = this.f45968b;
                y1Var5.s0(0, 0, false);
                ui0 ui0Var2 = y1Var5.L0;
                if (ui0Var2 != null) {
                    ui0Var2.h(true);
                    y1Var5.L0 = null;
                    return;
                }
                return;
        }
    }
}

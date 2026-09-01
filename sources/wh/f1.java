package wh;

import org.telegram.ui.ti0;
public final class f1 implements Runnable {
    public final int f49742a;
    public final z1 f49743b;

    public f1(z1 z1Var, int i10) {
        this.f49742a = i10;
        this.f49743b = z1Var;
    }

    @Override
    public final void run() {
        switch (this.f49742a) {
            case 0:
                this.f49743b.B0();
                return;
            case 1:
                z1 z1Var = this.f49743b;
                if (z1Var.H0 != 0) {
                    z1Var.X.setVisibility(8);
                    return;
                }
                return;
            case 2:
                z1 z1Var2 = this.f49743b;
                if (z1Var2.H0 != 1) {
                    z1Var2.f50190e0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                z1 z1Var3 = this.f49743b;
                if (z1Var3.H0 != 2) {
                    z1Var3.f50207s0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                z1.V(this.f49743b);
                return;
            case 5:
                z1 z1Var4 = this.f49743b;
                z1Var4.s0(2147483646, 0, true);
                ti0 ti0Var = z1Var4.L0;
                if (ti0Var != null) {
                    ti0Var.h(false);
                    z1Var4.L0 = null;
                    return;
                }
                return;
            default:
                z1 z1Var5 = this.f49743b;
                z1Var5.s0(0, 0, false);
                ti0 ti0Var2 = z1Var5.L0;
                if (ti0Var2 != null) {
                    ti0Var2.h(true);
                    z1Var5.L0 = null;
                    return;
                }
                return;
        }
    }
}

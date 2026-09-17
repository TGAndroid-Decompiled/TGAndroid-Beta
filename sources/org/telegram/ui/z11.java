package org.telegram.ui;
public final class z11 implements Runnable {
    public final int f43293a;
    public final d21 f43294b;
    public final int f43295c;

    public z11(d21 d21Var, int i10, int i11) {
        this.f43293a = i11;
        this.f43294b = d21Var;
        this.f43295c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43293a) {
            case 0:
                d21 d21Var = this.f43294b;
                org.telegram.ui.Components.h81 h81Var = d21Var.f35654n;
                c21 c21Var = d21Var.f35656s;
                int i10 = this.f43295c;
                h81Var.d(i10, c21Var.i(i10));
                return;
            default:
                d21 d21Var2 = this.f43294b;
                org.telegram.ui.Components.h81 h81Var2 = d21Var2.f35654n;
                c21 c21Var2 = d21Var2.f35656s;
                int i11 = this.f43295c;
                h81Var2.d(i11, c21Var2.i(i11));
                return;
        }
    }
}

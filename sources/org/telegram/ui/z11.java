package org.telegram.ui;
public final class z11 implements Runnable {
    public final int f43292a;
    public final d21 f43293b;
    public final int f43294c;

    public z11(d21 d21Var, int i10, int i11) {
        this.f43292a = i11;
        this.f43293b = d21Var;
        this.f43294c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43292a) {
            case 0:
                d21 d21Var = this.f43293b;
                org.telegram.ui.Components.h81 h81Var = d21Var.f35653n;
                c21 c21Var = d21Var.f35655s;
                int i10 = this.f43294c;
                h81Var.d(i10, c21Var.i(i10));
                return;
            default:
                d21 d21Var2 = this.f43293b;
                org.telegram.ui.Components.h81 h81Var2 = d21Var2.f35653n;
                c21 c21Var2 = d21Var2.f35655s;
                int i11 = this.f43294c;
                h81Var2.d(i11, c21Var2.i(i11));
                return;
        }
    }
}

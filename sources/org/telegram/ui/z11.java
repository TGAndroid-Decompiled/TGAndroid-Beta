package org.telegram.ui;
public final class z11 implements Runnable {
    public final int f43266a;
    public final d21 f43267b;
    public final int f43268c;

    public z11(d21 d21Var, int i10, int i11) {
        this.f43266a = i11;
        this.f43267b = d21Var;
        this.f43268c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43266a) {
            case 0:
                d21 d21Var = this.f43267b;
                org.telegram.ui.Components.h81 h81Var = d21Var.f35627n;
                c21 c21Var = d21Var.f35629s;
                int i10 = this.f43268c;
                h81Var.d(i10, c21Var.i(i10));
                return;
            default:
                d21 d21Var2 = this.f43267b;
                org.telegram.ui.Components.h81 h81Var2 = d21Var2.f35627n;
                c21 c21Var2 = d21Var2.f35629s;
                int i11 = this.f43268c;
                h81Var2.d(i11, c21Var2.i(i11));
                return;
        }
    }
}

package org.telegram.ui;
public final class y11 implements Runnable {
    public final int f39739a;
    public final c21 f39740b;
    public final int f39741c;

    public y11(c21 c21Var, int i10, int i11) {
        this.f39739a = i11;
        this.f39740b = c21Var;
        this.f39741c = i10;
    }

    @Override
    public final void run() {
        switch (this.f39739a) {
            case 0:
                c21 c21Var = this.f39740b;
                org.telegram.ui.Components.h81 h81Var = c21Var.f32636n;
                b21 b21Var = c21Var.f32638s;
                int i10 = this.f39741c;
                h81Var.d(i10, b21Var.i(i10));
                return;
            default:
                c21 c21Var2 = this.f39740b;
                org.telegram.ui.Components.h81 h81Var2 = c21Var2.f32636n;
                b21 b21Var2 = c21Var2.f32638s;
                int i11 = this.f39741c;
                h81Var2.d(i11, b21Var2.i(i11));
                return;
        }
    }
}

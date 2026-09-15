package org.telegram.ui;
public final class x11 implements Runnable {
    public final int f39465a;
    public final b21 f39466b;
    public final int f39467c;

    public x11(b21 b21Var, int i10, int i11) {
        this.f39465a = i11;
        this.f39466b = b21Var;
        this.f39467c = i10;
    }

    @Override
    public final void run() {
        switch (this.f39465a) {
            case 0:
                b21 b21Var = this.f39466b;
                org.telegram.ui.Components.h81 h81Var = b21Var.f32030n;
                a21 a21Var = b21Var.f32032s;
                int i10 = this.f39467c;
                h81Var.d(i10, a21Var.i(i10));
                return;
            default:
                b21 b21Var2 = this.f39466b;
                org.telegram.ui.Components.h81 h81Var2 = b21Var2.f32030n;
                a21 a21Var2 = b21Var2.f32032s;
                int i11 = this.f39467c;
                h81Var2.d(i11, a21Var2.i(i11));
                return;
        }
    }
}

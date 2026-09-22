package org.telegram.ui;
public final class x11 implements Runnable {
    public final int f39343a;
    public final a21 f39344b;
    public final int f39345c;

    public x11(a21 a21Var, int i10, int i11) {
        this.f39343a = i11;
        this.f39344b = a21Var;
        this.f39345c = i10;
    }

    @Override
    public final void run() {
        switch (this.f39343a) {
            case 0:
                a21 a21Var = this.f39344b;
                org.telegram.ui.Components.y81 y81Var = a21Var.f31984n;
                z11 z11Var = a21Var.f31986s;
                int i10 = this.f39345c;
                y81Var.d(i10, z11Var.i(i10));
                return;
            default:
                a21 a21Var2 = this.f39344b;
                org.telegram.ui.Components.y81 y81Var2 = a21Var2.f31984n;
                z11 z11Var2 = a21Var2.f31986s;
                int i11 = this.f39345c;
                y81Var2.d(i11, z11Var2.i(i11));
                return;
        }
    }
}

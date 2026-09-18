package org.telegram.ui;
public final class x11 implements Runnable {
    public final int f39329a;
    public final a21 f39330b;
    public final int f39331c;

    public x11(a21 a21Var, int i10, int i11) {
        this.f39329a = i11;
        this.f39330b = a21Var;
        this.f39331c = i10;
    }

    @Override
    public final void run() {
        switch (this.f39329a) {
            case 0:
                a21 a21Var = this.f39330b;
                org.telegram.ui.Components.w81 w81Var = a21Var.f31923n;
                z11 z11Var = a21Var.f31925s;
                int i10 = this.f39331c;
                w81Var.d(i10, z11Var.i(i10));
                return;
            default:
                a21 a21Var2 = this.f39330b;
                org.telegram.ui.Components.w81 w81Var2 = a21Var2.f31923n;
                z11 z11Var2 = a21Var2.f31925s;
                int i11 = this.f39331c;
                w81Var2.d(i11, z11Var2.i(i11));
                return;
        }
    }
}

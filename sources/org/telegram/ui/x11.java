package org.telegram.ui;
public final class x11 implements Runnable {
    public final int f39319a;
    public final a21 f39320b;
    public final int f39321c;

    public x11(a21 a21Var, int i10, int i11) {
        this.f39319a = i11;
        this.f39320b = a21Var;
        this.f39321c = i10;
    }

    @Override
    public final void run() {
        switch (this.f39319a) {
            case 0:
                a21 a21Var = this.f39320b;
                org.telegram.ui.Components.w81 w81Var = a21Var.f31963n;
                z11 z11Var = a21Var.f31965s;
                int i10 = this.f39321c;
                w81Var.d(i10, z11Var.i(i10));
                return;
            default:
                a21 a21Var2 = this.f39320b;
                org.telegram.ui.Components.w81 w81Var2 = a21Var2.f31963n;
                z11 z11Var2 = a21Var2.f31965s;
                int i11 = this.f39321c;
                w81Var2.d(i11, z11Var2.i(i11));
                return;
        }
    }
}

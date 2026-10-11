package org.telegram.ui;
public final class v11 implements Runnable {
    public final int f42890a;
    public final z11 f42891b;
    public final int f42892c;

    public v11(z11 z11Var, int i10, int i11) {
        this.f42890a = i11;
        this.f42891b = z11Var;
        this.f42892c = i10;
    }

    @Override
    public final void run() {
        switch (this.f42890a) {
            case 0:
                z11 z11Var = this.f42891b;
                org.telegram.ui.Components.o91 o91Var = z11Var.f44590n;
                y11 y11Var = z11Var.f44592s;
                int i10 = this.f42892c;
                o91Var.d(i10, y11Var.i(i10));
                return;
            default:
                z11 z11Var2 = this.f42891b;
                org.telegram.ui.Components.o91 o91Var2 = z11Var2.f44590n;
                y11 y11Var2 = z11Var2.f44592s;
                int i11 = this.f42892c;
                o91Var2.d(i11, y11Var2.i(i11));
                return;
        }
    }
}

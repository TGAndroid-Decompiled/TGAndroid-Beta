package org.telegram.ui;
public final class v11 implements Runnable {
    public final int f42856a;
    public final z11 f42857b;
    public final int f42858c;

    public v11(z11 z11Var, int i10, int i11) {
        this.f42856a = i11;
        this.f42857b = z11Var;
        this.f42858c = i10;
    }

    @Override
    public final void run() {
        switch (this.f42856a) {
            case 0:
                z11 z11Var = this.f42857b;
                org.telegram.ui.Components.p91 p91Var = z11Var.f44556n;
                y11 y11Var = z11Var.f44558s;
                int i10 = this.f42858c;
                p91Var.d(i10, y11Var.i(i10));
                return;
            default:
                z11 z11Var2 = this.f42857b;
                org.telegram.ui.Components.p91 p91Var2 = z11Var2.f44556n;
                y11 y11Var2 = z11Var2.f44558s;
                int i11 = this.f42858c;
                p91Var2.d(i11, y11Var2.i(i11));
                return;
        }
    }
}

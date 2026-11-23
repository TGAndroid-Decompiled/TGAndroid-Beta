package org.telegram.ui;
public final class qr0 implements Runnable {
    public final int f51529a;
    public final zr0 f51530b;

    public qr0(zr0 zr0Var, int i7) {
        this.f51529a = i7;
        this.f51530b = zr0Var;
    }

    @Override
    public final void run() {
        switch (this.f51529a) {
            case 0:
                zr0 zr0Var = this.f51530b;
                org.telegram.messenger.g0.g3(new qr0(zr0Var, 3));
                org.telegram.ui.Cells.r1 r1Var = zr0Var.M;
                if (r1Var != null) {
                    r1Var.setVisibility(0);
                    org.telegram.ui.Cells.r1 r1Var2 = zr0Var.M;
                    r1Var2.f31451d6 = null;
                    r1Var2.invalidate();
                }
                ul ulVar = zr0Var.f54703f0;
                if (ulVar != null) {
                    org.telegram.messenger.g0.g3(ulVar);
                    zr0Var.f54703f0 = null;
                    return;
                }
                return;
            case 1:
                this.f51530b.c(false);
                return;
            case 2:
                this.f51530b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public qr0(zr0 zr0Var, boolean z10) {
        this.f51529a = 0;
        this.f51530b = zr0Var;
    }
}

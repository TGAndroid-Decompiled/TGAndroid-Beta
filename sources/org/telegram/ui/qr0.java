package org.telegram.ui;
public final class qr0 implements Runnable {
    public final int f49299a;
    public final zr0 f49300b;

    public qr0(zr0 zr0Var, int i7) {
        this.f49299a = i7;
        this.f49300b = zr0Var;
    }

    @Override
    public final void run() {
        switch (this.f49299a) {
            case 0:
                zr0 zr0Var = this.f49300b;
                org.telegram.messenger.g0.h3(new qr0(zr0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = zr0Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = zr0Var.L;
                    q1Var2.f29798c6 = null;
                    q1Var2.invalidate();
                }
                tl tlVar = zr0Var.f52658e0;
                if (tlVar != null) {
                    org.telegram.messenger.g0.h3(tlVar);
                    zr0Var.f52658e0 = null;
                    return;
                }
                return;
            case 1:
                this.f49300b.c(false);
                return;
            case 2:
                this.f49300b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public qr0(zr0 zr0Var, boolean z9) {
        this.f49299a = 0;
        this.f49300b = zr0Var;
    }
}

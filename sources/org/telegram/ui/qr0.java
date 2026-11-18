package org.telegram.ui;
public final class qr0 implements Runnable {
    public final int f51329a;
    public final as0 f51330b;

    public qr0(as0 as0Var, int i7) {
        this.f51329a = i7;
        this.f51330b = as0Var;
    }

    @Override
    public final void run() {
        switch (this.f51329a) {
            case 0:
                as0 as0Var = this.f51330b;
                org.telegram.messenger.g0.g3(new qr0(as0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = as0Var.M;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = as0Var.M;
                    q1Var2.f31320d6 = null;
                    q1Var2.invalidate();
                }
                ul ulVar = as0Var.f45657f0;
                if (ulVar != null) {
                    org.telegram.messenger.g0.g3(ulVar);
                    as0Var.f45657f0 = null;
                    return;
                }
                return;
            case 1:
                this.f51330b.c(false);
                return;
            case 2:
                this.f51330b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public qr0(as0 as0Var, boolean z10) {
        this.f51329a = 0;
        this.f51330b = as0Var;
    }
}

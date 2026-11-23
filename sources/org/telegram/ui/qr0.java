package org.telegram.ui;
public final class qr0 implements Runnable {
    public final int f51347a;
    public final as0 f51348b;

    public qr0(as0 as0Var, int i7) {
        this.f51347a = i7;
        this.f51348b = as0Var;
    }

    @Override
    public final void run() {
        switch (this.f51347a) {
            case 0:
                as0 as0Var = this.f51348b;
                org.telegram.messenger.g0.g3(new qr0(as0Var, 3));
                org.telegram.ui.Cells.r1 r1Var = as0Var.M;
                if (r1Var != null) {
                    r1Var.setVisibility(0);
                    org.telegram.ui.Cells.r1 r1Var2 = as0Var.M;
                    r1Var2.f31401d6 = null;
                    r1Var2.invalidate();
                }
                ul ulVar = as0Var.f45687f0;
                if (ulVar != null) {
                    org.telegram.messenger.g0.g3(ulVar);
                    as0Var.f45687f0 = null;
                    return;
                }
                return;
            case 1:
                this.f51348b.c(false);
                return;
            case 2:
                this.f51348b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public qr0(as0 as0Var, boolean z10) {
        this.f51347a = 0;
        this.f51348b = as0Var;
    }
}

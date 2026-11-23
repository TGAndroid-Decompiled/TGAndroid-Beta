package org.telegram.ui;
public final class rr0 implements Runnable {
    public final int f51791a;
    public final bs0 f51792b;

    public rr0(bs0 bs0Var, int i7) {
        this.f51791a = i7;
        this.f51792b = bs0Var;
    }

    @Override
    public final void run() {
        switch (this.f51791a) {
            case 0:
                bs0 bs0Var = this.f51792b;
                org.telegram.messenger.g0.g3(new rr0(bs0Var, 3));
                org.telegram.ui.Cells.r1 r1Var = bs0Var.M;
                if (r1Var != null) {
                    r1Var.setVisibility(0);
                    org.telegram.ui.Cells.r1 r1Var2 = bs0Var.M;
                    r1Var2.f31367d6 = null;
                    r1Var2.invalidate();
                }
                ul ulVar = bs0Var.f46287f0;
                if (ulVar != null) {
                    org.telegram.messenger.g0.g3(ulVar);
                    bs0Var.f46287f0 = null;
                    return;
                }
                return;
            case 1:
                this.f51792b.c(false);
                return;
            case 2:
                this.f51792b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public rr0(bs0 bs0Var, boolean z10) {
        this.f51791a = 0;
        this.f51792b = bs0Var;
    }
}

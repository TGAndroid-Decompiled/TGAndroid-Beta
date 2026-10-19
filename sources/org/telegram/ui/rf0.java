package org.telegram.ui;
public final class rf0 implements Runnable {
    public final int f41203a;
    public final bg0 f41204b;

    public rf0(bg0 bg0Var, int i10) {
        this.f41203a = i10;
        this.f41204b = bg0Var;
    }

    @Override
    public final void run() {
        switch (this.f41203a) {
            case 0:
                bg0 bg0Var = this.f41204b;
                jj0 jj0Var = bg0Var.f35640a;
                cg0 cg0Var = bg0Var.V;
                yf0 yf0Var = bg0Var.f35641b;
                if (yf0Var != null) {
                    if (cg0Var.f35969c0) {
                        jj0Var.clearFocus();
                        yf0Var.clearFocus();
                    } else if (jj0Var.length() != 0) {
                        yf0Var.requestFocus();
                        if (!bg0Var.R) {
                            yf0Var.setSelection(yf0Var.length());
                        }
                        cg0.T0(cg0Var, yf0Var);
                    } else {
                        jj0Var.requestFocus();
                        cg0.T0(cg0Var, jj0Var);
                    }
                }
                if (cg0Var.F == 0) {
                    bg0Var.s(false);
                    return;
                }
                return;
            case 1:
                bg0 bg0Var2 = this.f41204b;
                bg0Var2.postDelayed(new rf0(bg0Var2, 2), 200L);
                return;
            case 2:
                this.f41204b.h(null);
                return;
            case 3:
                this.f41204b.s(true);
                return;
            default:
                bg0 bg0Var3 = this.f41204b;
                cg0.T0(bg0Var3.V, bg0Var3.f35641b);
                return;
        }
    }
}

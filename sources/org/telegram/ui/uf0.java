package org.telegram.ui;
public final class uf0 implements Runnable {
    public final int f41976a;
    public final eg0 f41977b;

    public uf0(eg0 eg0Var, int i10) {
        this.f41976a = i10;
        this.f41977b = eg0Var;
    }

    @Override
    public final void run() {
        switch (this.f41976a) {
            case 0:
                eg0 eg0Var = this.f41977b;
                mj0 mj0Var = eg0Var.f36521a;
                fg0 fg0Var = eg0Var.V;
                bg0 bg0Var = eg0Var.f36522b;
                if (bg0Var != null) {
                    if (fg0Var.f36908c0) {
                        mj0Var.clearFocus();
                        bg0Var.clearFocus();
                    } else if (mj0Var.length() != 0) {
                        bg0Var.requestFocus();
                        if (!eg0Var.R) {
                            bg0Var.setSelection(bg0Var.length());
                        }
                        fg0.T0(fg0Var, bg0Var);
                    } else {
                        mj0Var.requestFocus();
                        fg0.T0(fg0Var, mj0Var);
                    }
                }
                if (fg0Var.F == 0) {
                    eg0Var.s(false);
                    return;
                }
                return;
            case 1:
                eg0 eg0Var2 = this.f41977b;
                eg0Var2.postDelayed(new uf0(eg0Var2, 2), 200L);
                return;
            case 2:
                this.f41977b.h(null);
                return;
            case 3:
                this.f41977b.s(true);
                return;
            default:
                eg0 eg0Var3 = this.f41977b;
                fg0.T0(eg0Var3.V, eg0Var3.f36522b);
                return;
        }
    }
}

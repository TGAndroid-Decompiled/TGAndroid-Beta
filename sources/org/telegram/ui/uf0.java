package org.telegram.ui;
public final class uf0 implements Runnable {
    public final int f43252a;
    public final eg0 f43253b;

    public uf0(eg0 eg0Var, int i10) {
        this.f43252a = i10;
        this.f43253b = eg0Var;
    }

    @Override
    public final void run() {
        switch (this.f43252a) {
            case 0:
                eg0 eg0Var = this.f43253b;
                ij0 ij0Var = eg0Var.f37810a;
                fg0 fg0Var = eg0Var.R;
                bg0 bg0Var = eg0Var.f37811b;
                if (bg0Var != null) {
                    if (fg0Var.Y) {
                        ij0Var.clearFocus();
                        bg0Var.clearFocus();
                    } else if (ij0Var.length() != 0) {
                        bg0Var.requestFocus();
                        if (!eg0Var.N) {
                            bg0Var.setSelection(bg0Var.length());
                        }
                        fg0.T0(fg0Var, bg0Var);
                    } else {
                        ij0Var.requestFocus();
                        fg0.T0(fg0Var, ij0Var);
                    }
                }
                if (fg0Var.B == 0) {
                    eg0Var.t(false);
                    return;
                }
                return;
            case 1:
                eg0 eg0Var2 = this.f43253b;
                eg0Var2.postDelayed(new uf0(eg0Var2, 2), 200L);
                return;
            case 2:
                this.f43253b.h(null);
                return;
            case 3:
                this.f43253b.t(true);
                return;
            default:
                eg0 eg0Var3 = this.f43253b;
                fg0.T0(eg0Var3.R, eg0Var3.f37811b);
                return;
        }
    }
}

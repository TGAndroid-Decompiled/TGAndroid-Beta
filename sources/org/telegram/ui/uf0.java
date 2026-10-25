package org.telegram.ui;
public final class uf0 implements Runnable {
    public final int f44120a;
    public final fg0 f44121b;

    public uf0(fg0 fg0Var, int i10) {
        this.f44120a = i10;
        this.f44121b = fg0Var;
    }

    @Override
    public final void run() {
        switch (this.f44120a) {
            case 0:
                fg0 fg0Var = this.f44121b;
                mj0 mj0Var = fg0Var.f39358a;
                gg0 gg0Var = fg0Var.f39359a0;
                cg0 cg0Var = fg0Var.f39360b;
                if (cg0Var != null) {
                    if (gg0Var.f39653c0) {
                        mj0Var.clearFocus();
                        cg0Var.clearFocus();
                    } else if (mj0Var.length() != 0) {
                        cg0Var.requestFocus();
                        if (!fg0Var.T) {
                            cg0Var.setSelection(cg0Var.length());
                        }
                        gg0.W0(gg0Var, cg0Var);
                    } else {
                        mj0Var.requestFocus();
                        gg0.W0(gg0Var, mj0Var);
                    }
                }
                if (gg0Var.F == 0) {
                    fg0Var.r(false);
                    return;
                }
                return;
            case 1:
                fg0 fg0Var2 = this.f44121b;
                fg0Var2.postDelayed(new uf0(fg0Var2, 2), 200L);
                return;
            case 2:
                this.f44121b.h(null);
                return;
            case 3:
                this.f44121b.r(true);
                return;
            default:
                fg0 fg0Var3 = this.f44121b;
                gg0.W0(fg0Var3.f39359a0, fg0Var3.f39360b);
                return;
        }
    }
}

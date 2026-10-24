package org.telegram.ui;
public final class wf0 implements Runnable {
    public final int f43341a;
    public final gg0 f43342b;

    public wf0(gg0 gg0Var, int i10) {
        this.f43341a = i10;
        this.f43342b = gg0Var;
    }

    @Override
    public final void run() {
        switch (this.f43341a) {
            case 0:
                gg0 gg0Var = this.f43342b;
                oj0 oj0Var = gg0Var.f37561a;
                hg0 hg0Var = gg0Var.f37562a0;
                dg0 dg0Var = gg0Var.f37563b;
                if (dg0Var != null) {
                    if (hg0Var.f37838c0) {
                        oj0Var.clearFocus();
                        dg0Var.clearFocus();
                    } else if (oj0Var.length() != 0) {
                        dg0Var.requestFocus();
                        if (!gg0Var.T) {
                            dg0Var.setSelection(dg0Var.length());
                        }
                        hg0.V0(hg0Var, dg0Var);
                    } else {
                        oj0Var.requestFocus();
                        hg0.V0(hg0Var, oj0Var);
                    }
                }
                if (hg0Var.F == 0) {
                    gg0Var.r(false);
                    return;
                }
                return;
            case 1:
                gg0 gg0Var2 = this.f43342b;
                gg0Var2.postDelayed(new wf0(gg0Var2, 2), 200L);
                return;
            case 2:
                this.f43342b.h(null);
                return;
            case 3:
                this.f43342b.r(true);
                return;
            default:
                gg0 gg0Var3 = this.f43342b;
                hg0.V0(gg0Var3.f37562a0, gg0Var3.f37563b);
                return;
        }
    }
}

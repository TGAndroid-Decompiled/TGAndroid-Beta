package org.telegram.ui;
public final class wf0 implements Runnable {
    public final int f44989a;
    public final hg0 f44990b;

    public wf0(hg0 hg0Var, int i10) {
        this.f44989a = i10;
        this.f44990b = hg0Var;
    }

    @Override
    public final void run() {
        switch (this.f44989a) {
            case 0:
                hg0 hg0Var = this.f44990b;
                oj0 oj0Var = hg0Var.f39881a;
                ig0 ig0Var = hg0Var.f39882a0;
                eg0 eg0Var = hg0Var.f39883b;
                if (eg0Var != null) {
                    if (ig0Var.f40145c0) {
                        oj0Var.clearFocus();
                        eg0Var.clearFocus();
                    } else if (oj0Var.length() != 0) {
                        eg0Var.requestFocus();
                        if (!hg0Var.T) {
                            eg0Var.setSelection(eg0Var.length());
                        }
                        ig0.W0(ig0Var, eg0Var);
                    } else {
                        oj0Var.requestFocus();
                        ig0.W0(ig0Var, oj0Var);
                    }
                }
                if (ig0Var.F == 0) {
                    hg0Var.r(false);
                    return;
                }
                return;
            case 1:
                hg0 hg0Var2 = this.f44990b;
                hg0Var2.postDelayed(new wf0(hg0Var2, 2), 200L);
                return;
            case 2:
                this.f44990b.h(null);
                return;
            case 3:
                this.f44990b.r(true);
                return;
            default:
                hg0 hg0Var3 = this.f44990b;
                ig0.W0(hg0Var3.f39882a0, hg0Var3.f39883b);
                return;
        }
    }
}

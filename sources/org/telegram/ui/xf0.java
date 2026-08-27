package org.telegram.ui;

public final class xf0 implements Runnable {

    public final int f44439a;

    public final hg0 f44440b;

    public xf0(hg0 hg0Var, int i10) {
        this.f44439a = i10;
        this.f44440b = hg0Var;
    }

    @Override
    public final void run() {
        switch (this.f44439a) {
            case 0:
                hg0 hg0Var = this.f44440b;
                mj0 mj0Var = hg0Var.f38804a;
                ig0 ig0Var = hg0Var.R;
                eg0 eg0Var = hg0Var.f38805b;
                if (eg0Var != null) {
                    if (ig0Var.Y) {
                        mj0Var.clearFocus();
                        eg0Var.clearFocus();
                    } else if (mj0Var.length() != 0) {
                        eg0Var.requestFocus();
                        if (!hg0Var.N) {
                            eg0Var.setSelection(eg0Var.length());
                        }
                        ig0.T0(ig0Var, eg0Var);
                    } else {
                        mj0Var.requestFocus();
                        ig0.T0(ig0Var, mj0Var);
                    }
                }
                if (ig0Var.B == 0) {
                    hg0Var.t(false);
                }
                break;
            case 1:
                hg0 hg0Var2 = this.f44440b;
                hg0Var2.postDelayed(new xf0(hg0Var2, 2), 200L);
                break;
            case 2:
                this.f44440b.h(null);
                break;
            case 3:
                this.f44440b.t(true);
                break;
            default:
                hg0 hg0Var3 = this.f44440b;
                ig0.T0(hg0Var3.R, hg0Var3.f38805b);
                break;
        }
    }
}

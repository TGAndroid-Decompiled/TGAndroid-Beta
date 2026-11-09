package org.telegram.ui;
public final class sd0 implements Runnable {
    public final int f49886a;
    public final de0 f49887b;

    public sd0(de0 de0Var, int i7) {
        this.f49886a = i7;
        this.f49887b = de0Var;
    }

    @Override
    public final void run() {
        switch (this.f49886a) {
            case 0:
                de0 de0Var = this.f49887b;
                be0 be0Var = de0Var.f44924a;
                ee0 ee0Var = de0Var.f44935g0;
                be0 be0Var2 = de0Var.f44926b;
                if (be0Var2 != null) {
                    if (ee0Var.f45373c0) {
                        be0Var.clearFocus();
                        be0Var2.clearFocus();
                    } else if (be0Var.length() != 0) {
                        be0Var2.requestFocus();
                        if (!de0Var.T) {
                            be0Var2.setSelection(be0Var2.length());
                        }
                        ee0.b1(ee0Var, be0Var2);
                    } else {
                        be0Var.requestFocus();
                        ee0.b1(ee0Var, be0Var);
                    }
                }
                if (ee0Var.F == 0) {
                    de0Var.s();
                    return;
                }
                return;
            case 1:
                de0 de0Var2 = this.f49887b;
                de0Var2.postDelayed(new sd0(de0Var2, 2), 200L);
                return;
            case 2:
                this.f49887b.h(null);
                return;
            case 3:
                this.f49887b.t(true);
                return;
            default:
                de0 de0Var3 = this.f49887b;
                ee0.b1(de0Var3.f44935g0, de0Var3.f44926b);
                return;
        }
    }
}

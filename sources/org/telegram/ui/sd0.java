package org.telegram.ui;
public final class sd0 implements Runnable {
    public final int f51985a;
    public final de0 f51986b;

    public sd0(de0 de0Var, int i7) {
        this.f51985a = i7;
        this.f51986b = de0Var;
    }

    @Override
    public final void run() {
        switch (this.f51985a) {
            case 0:
                de0 de0Var = this.f51986b;
                be0 be0Var = de0Var.f46866a;
                ee0 ee0Var = de0Var.f46878h0;
                be0 be0Var2 = de0Var.f46868b;
                if (be0Var2 != null) {
                    if (ee0Var.f47183d0) {
                        be0Var.clearFocus();
                        be0Var2.clearFocus();
                    } else if (be0Var.length() != 0) {
                        be0Var2.requestFocus();
                        if (!de0Var.U) {
                            be0Var2.setSelection(be0Var2.length());
                        }
                        ee0.b1(ee0Var, be0Var2);
                    } else {
                        be0Var.requestFocus();
                        ee0.b1(ee0Var, be0Var);
                    }
                }
                if (ee0Var.G == 0) {
                    de0Var.s();
                    return;
                }
                return;
            case 1:
                de0 de0Var2 = this.f51986b;
                de0Var2.postDelayed(new sd0(de0Var2, 2), 200L);
                return;
            case 2:
                this.f51986b.h(null);
                return;
            case 3:
                this.f51986b.t(true);
                return;
            default:
                de0 de0Var3 = this.f51986b;
                ee0.b1(de0Var3.f46878h0, de0Var3.f46868b);
                return;
        }
    }
}

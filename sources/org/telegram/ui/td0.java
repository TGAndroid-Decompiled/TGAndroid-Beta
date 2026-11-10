package org.telegram.ui;
public final class td0 implements Runnable {
    public final int f50250a;
    public final ee0 f50251b;

    public td0(ee0 ee0Var, int i7) {
        this.f50250a = i7;
        this.f50251b = ee0Var;
    }

    @Override
    public final void run() {
        switch (this.f50250a) {
            case 0:
                ee0 ee0Var = this.f50251b;
                ce0 ce0Var = ee0Var.f45244a;
                fe0 fe0Var = ee0Var.f45255g0;
                ce0 ce0Var2 = ee0Var.f45246b;
                if (ce0Var2 != null) {
                    if (fe0Var.f45697c0) {
                        ce0Var.clearFocus();
                        ce0Var2.clearFocus();
                    } else if (ce0Var.length() != 0) {
                        ce0Var2.requestFocus();
                        if (!ee0Var.T) {
                            ce0Var2.setSelection(ce0Var2.length());
                        }
                        fe0.b1(fe0Var, ce0Var2);
                    } else {
                        ce0Var.requestFocus();
                        fe0.b1(fe0Var, ce0Var);
                    }
                }
                if (fe0Var.F == 0) {
                    ee0Var.s();
                    return;
                }
                return;
            case 1:
                ee0 ee0Var2 = this.f50251b;
                ee0Var2.postDelayed(new td0(ee0Var2, 2), 200L);
                return;
            case 2:
                this.f50251b.h(null);
                return;
            case 3:
                this.f50251b.t(true);
                return;
            default:
                ee0 ee0Var3 = this.f50251b;
                fe0.b1(ee0Var3.f45255g0, ee0Var3.f45246b);
                return;
        }
    }
}

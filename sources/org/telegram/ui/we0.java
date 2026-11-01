package org.telegram.ui;
public final class we0 implements Runnable {
    public final int f42775a;
    public final ff0 f42776b;

    public we0(ff0 ff0Var, int i10) {
        this.f42775a = i10;
        this.f42776b = ff0Var;
    }

    @Override
    public final void run() {
        switch (this.f42775a) {
            case 0:
                ff0 ff0Var = this.f42776b;
                df0 df0Var = ff0Var.f37123a;
                gf0 gf0Var = ff0Var.f37124a0;
                df0 df0Var2 = ff0Var.f37125b;
                if (df0Var2 != null) {
                    if (gf0Var.f37476c0) {
                        df0Var.clearFocus();
                        df0Var2.clearFocus();
                    } else if (df0Var.length() != 0) {
                        df0Var2.requestFocus();
                        if (!ff0Var.T) {
                            df0Var2.setSelection(df0Var2.length());
                        }
                        gf0.a1(gf0Var, df0Var2);
                    } else {
                        df0Var.requestFocus();
                        gf0.a1(gf0Var, df0Var);
                    }
                }
                if (gf0Var.F == 0) {
                    ff0Var.r(false);
                    return;
                }
                return;
            case 1:
                ff0 ff0Var2 = this.f42776b;
                ff0Var2.postDelayed(new we0(ff0Var2, 2), 200L);
                return;
            case 2:
                this.f42776b.h(null);
                return;
            case 3:
                this.f42776b.r(true);
                return;
            default:
                ff0 ff0Var3 = this.f42776b;
                gf0.a1(ff0Var3.f37124a0, ff0Var3.f37125b);
                return;
        }
    }
}

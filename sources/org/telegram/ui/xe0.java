package org.telegram.ui;
public final class xe0 implements Runnable {
    public final int f43567a;
    public final gf0 f43568b;

    public xe0(gf0 gf0Var, int i10) {
        this.f43567a = i10;
        this.f43568b = gf0Var;
    }

    @Override
    public final void run() {
        switch (this.f43567a) {
            case 0:
                gf0 gf0Var = this.f43568b;
                ef0 ef0Var = gf0Var.f37533a;
                hf0 hf0Var = gf0Var.f37534a0;
                ef0 ef0Var2 = gf0Var.f37535b;
                if (ef0Var2 != null) {
                    if (hf0Var.f37923c0) {
                        ef0Var.clearFocus();
                        ef0Var2.clearFocus();
                    } else if (ef0Var.length() != 0) {
                        ef0Var2.requestFocus();
                        if (!gf0Var.T) {
                            ef0Var2.setSelection(ef0Var2.length());
                        }
                        hf0.Z0(hf0Var, ef0Var2);
                    } else {
                        ef0Var.requestFocus();
                        hf0.Z0(hf0Var, ef0Var);
                    }
                }
                if (hf0Var.F == 0) {
                    gf0Var.r(false);
                    return;
                }
                return;
            case 1:
                gf0 gf0Var2 = this.f43568b;
                gf0Var2.postDelayed(new xe0(gf0Var2, 2), 200L);
                return;
            case 2:
                this.f43568b.h(null);
                return;
            case 3:
                this.f43568b.r(true);
                return;
            default:
                gf0 gf0Var3 = this.f43568b;
                hf0.Z0(gf0Var3.f37534a0, gf0Var3.f37535b);
                return;
        }
    }
}

package org.telegram.ui;
public final class sf0 implements Runnable {
    public final int f41456a;
    public final cg0 f41457b;

    public sf0(cg0 cg0Var, int i10) {
        this.f41456a = i10;
        this.f41457b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f41456a) {
            case 0:
                cg0 cg0Var = this.f41457b;
                kj0 kj0Var = cg0Var.f35963a;
                dg0 dg0Var = cg0Var.V;
                zf0 zf0Var = cg0Var.f35964b;
                if (zf0Var != null) {
                    if (dg0Var.f36372c0) {
                        kj0Var.clearFocus();
                        zf0Var.clearFocus();
                    } else if (kj0Var.length() != 0) {
                        zf0Var.requestFocus();
                        if (!cg0Var.R) {
                            zf0Var.setSelection(zf0Var.length());
                        }
                        dg0.T0(dg0Var, zf0Var);
                    } else {
                        kj0Var.requestFocus();
                        dg0.T0(dg0Var, kj0Var);
                    }
                }
                if (dg0Var.F == 0) {
                    cg0Var.s(false);
                    return;
                }
                return;
            case 1:
                cg0 cg0Var2 = this.f41457b;
                cg0Var2.postDelayed(new sf0(cg0Var2, 2), 200L);
                return;
            case 2:
                this.f41457b.h(null);
                return;
            case 3:
                this.f41457b.s(true);
                return;
            default:
                cg0 cg0Var3 = this.f41457b;
                dg0.T0(cg0Var3.V, cg0Var3.f35964b);
                return;
        }
    }
}

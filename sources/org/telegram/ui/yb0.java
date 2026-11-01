package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yb0 implements Runnable {
    public final int f43631a;
    public final gf0 f43632b;

    public yb0(gf0 gf0Var, int i10) {
        this.f43631a = i10;
        this.f43632b = gf0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f43631a;
        gf0 gf0Var = this.f43632b;
        switch (i10) {
            case 0:
                gf0Var.f37476c0 = false;
                return;
            case 1:
                gf0Var.f37500w0 = false;
                gf0Var.G1(true, true);
                return;
            default:
                if (gf0Var.getParentActivity() != null && !gf0Var.getParentActivity().isFinishing() && gf0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                    String L0 = org.telegram.messenger.dd.L0(2131746088, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.dd.L0(2131745966, null);
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), new bc0(gf0Var, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}

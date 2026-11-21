package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ra0 implements Runnable {
    public final int f51525a;
    public final de0 f51526b;

    public ra0(de0 de0Var, int i7) {
        this.f51525a = i7;
        this.f51526b = de0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f51525a;
        de0 de0Var = this.f51526b;
        switch (i7) {
            case 0:
                de0Var.f46929d0 = false;
                return;
            case 1:
                de0Var.f46957y0 = false;
                de0Var.P1(true, true);
                return;
            default:
                if (de0Var.getParentActivity() != null && !de0Var.getParentActivity().isFinishing() && de0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                    String N0 = org.telegram.messenger.gd.N0(2131745875, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.gd.N0(2131745753, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), new ua0(de0Var, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ra0 implements Runnable {
    public final int f51536a;
    public final ee0 f51537b;

    public ra0(ee0 ee0Var, int i7) {
        this.f51536a = i7;
        this.f51537b = ee0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f51536a;
        ee0 ee0Var = this.f51537b;
        switch (i7) {
            case 0:
                ee0Var.f47183d0 = false;
                return;
            case 1:
                ee0Var.f47211y0 = false;
                ee0Var.P1(true, true);
                return;
            default:
                if (ee0Var.getParentActivity() != null && !ee0Var.getParentActivity().isFinishing() && ee0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                    String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    u1Var.S = M0;
                    u1Var.U = org.telegram.messenger.gd.M0(2131745754, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), new ua0(ee0Var, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}

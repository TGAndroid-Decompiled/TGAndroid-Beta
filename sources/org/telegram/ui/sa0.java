package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sa0 implements Runnable {
    public final int f49849a;
    public final ee0 f49850b;

    public sa0(ee0 ee0Var, int i7) {
        this.f49849a = i7;
        this.f49850b = ee0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f49849a;
        ee0 ee0Var = this.f49850b;
        switch (i7) {
            case 0:
                ee0Var.f45373c0 = false;
                return;
            case 1:
                ee0Var.f45398w0 = false;
                ee0Var.P1(true, true);
                return;
            default:
                if (ee0Var.getParentActivity() != null && !ee0Var.getParentActivity().isFinishing() && ee0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131746071, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.M0(2131745949, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new va0(ee0Var, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}

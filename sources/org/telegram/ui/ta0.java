package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ta0 implements Runnable {
    public final int f50209a;
    public final fe0 f50210b;

    public ta0(fe0 fe0Var, int i7) {
        this.f50209a = i7;
        this.f50210b = fe0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f50209a;
        fe0 fe0Var = this.f50210b;
        switch (i7) {
            case 0:
                fe0Var.f45697c0 = false;
                return;
            case 1:
                fe0Var.f45722w0 = false;
                fe0Var.P1(true, true);
                return;
            default:
                if (fe0Var.getParentActivity() != null && !fe0Var.getParentActivity().isFinishing() && fe0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fe0Var.getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131746071, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.M0(2131745949, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new wa0(fe0Var, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}

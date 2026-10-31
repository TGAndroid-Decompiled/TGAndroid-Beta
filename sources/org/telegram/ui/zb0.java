package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zb0 implements Runnable {
    public final int f44081a;
    public final hf0 f44082b;

    public zb0(hf0 hf0Var, int i10) {
        this.f44081a = i10;
        this.f44082b = hf0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f44081a;
        hf0 hf0Var = this.f44082b;
        switch (i10) {
            case 0:
                hf0Var.f37923c0 = false;
                return;
            case 1:
                hf0Var.f37947w0 = false;
                hf0Var.F1(true, true);
                return;
            default:
                if (hf0Var.getParentActivity() != null && !hf0Var.getParentActivity().isFinishing() && hf0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
                    String L0 = org.telegram.messenger.cd.L0(2131746088, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.cd.L0(2131745966, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new cc0(hf0Var, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}

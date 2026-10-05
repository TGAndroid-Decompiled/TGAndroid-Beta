package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class xh implements Utilities.Callback0Return {
    public final int f42944a;
    public final yn f42945b;

    public xh(yn ynVar, int i10) {
        this.f42944a = i10;
        this.f42945b = ynVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f42944a) {
            case 0:
                this.f42945b.getClass();
                if (org.telegram.ui.Components.w11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.w11.c()) {
                    yn ynVar = this.f42945b;
                    org.telegram.ui.Components.w11 w11Var = ynVar.f43501t0;
                    if (w11Var == null || w11Var.f32475e) {
                        if (ynVar.getParentActivity() != null && org.telegram.ui.Components.w11.c() && ynVar.f43526v0 != null && ynVar.V0 != null) {
                            org.telegram.ui.Components.w11 w11Var2 = ynVar.f43501t0;
                            if (w11Var2 != null) {
                                AndroidUtilities.removeFromParent(w11Var2);
                            }
                            org.telegram.ui.Components.w11 w11Var3 = new org.telegram.ui.Components.w11(ynVar.getParentActivity(), new org.telegram.ui.ActionBar.g6(24, ynVar, r2));
                            ynVar.f43501t0 = w11Var3;
                            org.telegram.ui.Components.w11[] w11VarArr = {w11Var3};
                            qm qmVar = ynVar.V0;
                            qmVar.addView(w11Var3, qmVar.indexOfChild(ynVar.f43526v0) + 1, w7.z5.c(-1.0f, -1));
                        }
                    }
                    return ynVar.f43501t0;
                }
                return null;
        }
    }
}

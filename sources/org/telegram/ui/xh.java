package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class xh implements Utilities.Callback0Return {
    public final int f42887a;
    public final yn f42888b;

    public xh(yn ynVar, int i10) {
        this.f42887a = i10;
        this.f42888b = ynVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f42887a) {
            case 0:
                this.f42888b.getClass();
                if (org.telegram.ui.Components.v11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.v11.c()) {
                    yn ynVar = this.f42888b;
                    org.telegram.ui.Components.v11 v11Var = ynVar.f43501t0;
                    if (v11Var == null || v11Var.f31503e) {
                        if (ynVar.getParentActivity() != null && org.telegram.ui.Components.v11.c() && ynVar.f43526v0 != null && ynVar.V0 != null) {
                            org.telegram.ui.Components.v11 v11Var2 = ynVar.f43501t0;
                            if (v11Var2 != null) {
                                AndroidUtilities.removeFromParent(v11Var2);
                            }
                            org.telegram.ui.Components.v11 v11Var3 = new org.telegram.ui.Components.v11(ynVar.getParentActivity(), new org.telegram.ui.ActionBar.g6(24, ynVar, r2));
                            ynVar.f43501t0 = v11Var3;
                            org.telegram.ui.Components.v11[] v11VarArr = {v11Var3};
                            qm qmVar = ynVar.V0;
                            qmVar.addView(v11Var3, qmVar.indexOfChild(ynVar.f43526v0) + 1, w7.z5.c(-1.0f, -1));
                        }
                    }
                    return ynVar.f43501t0;
                }
                return null;
        }
    }
}

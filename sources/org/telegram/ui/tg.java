package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class tg implements Utilities.Callback0Return {
    public final int f41770a;
    public final sn f41771b;

    public tg(sn snVar, int i10) {
        this.f41770a = i10;
        this.f41771b = snVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f41770a) {
            case 0:
                this.f41771b.getClass();
                if (org.telegram.ui.Components.t11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.t11.c()) {
                    sn snVar = this.f41771b;
                    org.telegram.ui.Components.t11 t11Var = snVar.f41427v0;
                    if (t11Var == null || t11Var.e) {
                        if (snVar.getParentActivity() != null && org.telegram.ui.Components.t11.c() && snVar.f41454x0 != null && snVar.X0 != null) {
                            org.telegram.ui.Components.t11 t11Var2 = snVar.f41427v0;
                            if (t11Var2 != null) {
                                AndroidUtilities.removeFromParent(t11Var2);
                            }
                            org.telegram.ui.Components.t11 t11Var3 = new org.telegram.ui.Components.t11(snVar.getParentActivity(), new i0(22, snVar, r2));
                            snVar.f41427v0 = t11Var3;
                            org.telegram.ui.Components.t11[] t11VarArr = {t11Var3};
                            lm lmVar = snVar.X0;
                            lmVar.addView(t11Var3, lmVar.indexOfChild(snVar.f41454x0) + 1, w7.z5.d(-1.0f, -1));
                        }
                    }
                    return snVar.f41427v0;
                }
                return null;
        }
    }
}

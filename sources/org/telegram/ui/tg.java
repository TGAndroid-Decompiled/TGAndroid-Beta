package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class tg implements Utilities.Callback0Return {
    public final int f42000a;
    public final sn f42001b;

    public tg(sn snVar, int i10) {
        this.f42000a = i10;
        this.f42001b = snVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f42000a) {
            case 0:
                this.f42001b.getClass();
                if (org.telegram.ui.Components.y11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.y11.c()) {
                    sn snVar = this.f42001b;
                    org.telegram.ui.Components.y11 y11Var = snVar.f41710v0;
                    if (y11Var == null || y11Var.e) {
                        if (snVar.getParentActivity() != null && org.telegram.ui.Components.y11.c() && snVar.f41737x0 != null && snVar.f41561j1 != null) {
                            org.telegram.ui.Components.y11 y11Var2 = snVar.f41710v0;
                            if (y11Var2 != null) {
                                AndroidUtilities.removeFromParent(y11Var2);
                            }
                            org.telegram.ui.Components.y11 y11Var3 = new org.telegram.ui.Components.y11(snVar.getParentActivity(), new h0(22, snVar, r2));
                            snVar.f41710v0 = y11Var3;
                            org.telegram.ui.Components.y11[] y11VarArr = {y11Var3};
                            km kmVar = snVar.f41561j1;
                            kmVar.addView(y11Var3, kmVar.indexOfChild(snVar.f41737x0) + 1, w7.z5.c(-1.0f, -1));
                        }
                    }
                    return snVar.f41710v0;
                }
                return null;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class tg implements Utilities.Callback0Return {
    public final int f42045a;
    public final sn f42046b;

    public tg(sn snVar, int i10) {
        this.f42045a = i10;
        this.f42046b = snVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f42045a) {
            case 0:
                this.f42046b.getClass();
                if (org.telegram.ui.Components.x11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.x11.c()) {
                    sn snVar = this.f42046b;
                    org.telegram.ui.Components.x11 x11Var = snVar.f41707v0;
                    if (x11Var == null || x11Var.e) {
                        if (snVar.getParentActivity() != null && org.telegram.ui.Components.x11.c() && snVar.f41734x0 != null && snVar.f41558j1 != null) {
                            org.telegram.ui.Components.x11 x11Var2 = snVar.f41707v0;
                            if (x11Var2 != null) {
                                AndroidUtilities.removeFromParent(x11Var2);
                            }
                            org.telegram.ui.Components.x11 x11Var3 = new org.telegram.ui.Components.x11(snVar.getParentActivity(), new h0(22, snVar, r2));
                            snVar.f41707v0 = x11Var3;
                            org.telegram.ui.Components.x11[] x11VarArr = {x11Var3};
                            km kmVar = snVar.f41558j1;
                            kmVar.addView(x11Var3, kmVar.indexOfChild(snVar.f41734x0) + 1, w7.z5.c(-1.0f, -1));
                        }
                    }
                    return snVar.f41707v0;
                }
                return null;
        }
    }
}

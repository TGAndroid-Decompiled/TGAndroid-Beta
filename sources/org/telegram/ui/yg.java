package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class yg implements Utilities.Callback0Return {
    public final int f40145a;
    public final wn f40146b;

    public yg(wn wnVar, int i10) {
        this.f40145a = i10;
        this.f40146b = wnVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f40145a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.k11.c()) {
                    wn wnVar = this.f40146b;
                    org.telegram.ui.Components.k11 k11Var = wnVar.f39670v0;
                    if (k11Var == null || k11Var.e) {
                        if (wnVar.getParentActivity() != null && org.telegram.ui.Components.k11.c() && wnVar.f39696x0 != null && wnVar.X0 != null) {
                            org.telegram.ui.Components.k11 k11Var2 = wnVar.f39670v0;
                            if (k11Var2 != null) {
                                AndroidUtilities.removeFromParent(k11Var2);
                            }
                            org.telegram.ui.Components.k11 k11Var3 = new org.telegram.ui.Components.k11(wnVar.getParentActivity(), new org.telegram.ui.ActionBar.a6(25, wnVar, r2));
                            wnVar.f39670v0 = k11Var3;
                            org.telegram.ui.Components.k11[] k11VarArr = {k11Var3};
                            pm pmVar = wnVar.X0;
                            pmVar.addView(k11Var3, pmVar.indexOfChild(wnVar.f39696x0) + 1, w7.y5.c(-1.0f, -1));
                        }
                    }
                    return wnVar.f39670v0;
                }
                return null;
            default:
                this.f40146b.getClass();
                if (org.telegram.ui.Components.k11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}

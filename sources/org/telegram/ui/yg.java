package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class yg implements Utilities.Callback0Return {
    public final int f40250a;
    public final wn f40251b;

    public yg(wn wnVar, int i10) {
        this.f40250a = i10;
        this.f40251b = wnVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f40250a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.n11.c()) {
                    wn wnVar = this.f40251b;
                    org.telegram.ui.Components.n11 n11Var = wnVar.f39762v0;
                    if (n11Var == null || n11Var.e) {
                        if (wnVar.getParentActivity() != null && org.telegram.ui.Components.n11.c() && wnVar.f39788x0 != null && wnVar.X0 != null) {
                            org.telegram.ui.Components.n11 n11Var2 = wnVar.f39762v0;
                            if (n11Var2 != null) {
                                AndroidUtilities.removeFromParent(n11Var2);
                            }
                            org.telegram.ui.Components.n11 n11Var3 = new org.telegram.ui.Components.n11(wnVar.getParentActivity(), new org.telegram.ui.ActionBar.a6(25, wnVar, r2));
                            wnVar.f39762v0 = n11Var3;
                            org.telegram.ui.Components.n11[] n11VarArr = {n11Var3};
                            pm pmVar = wnVar.X0;
                            pmVar.addView(n11Var3, pmVar.indexOfChild(wnVar.f39788x0) + 1, w7.y5.c(-1.0f, -1));
                        }
                    }
                    return wnVar.f39762v0;
                }
                return null;
            default:
                this.f40251b.getClass();
                if (org.telegram.ui.Components.n11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}

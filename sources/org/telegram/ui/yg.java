package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class yg implements Utilities.Callback0Return {
    public final int f40143a;
    public final wn f40144b;

    public yg(wn wnVar, int i10) {
        this.f40143a = i10;
        this.f40144b = wnVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f40143a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.l11.c()) {
                    wn wnVar = this.f40144b;
                    org.telegram.ui.Components.l11 l11Var = wnVar.f39668v0;
                    if (l11Var == null || l11Var.e) {
                        if (wnVar.getParentActivity() != null && org.telegram.ui.Components.l11.c() && wnVar.f39694x0 != null && wnVar.X0 != null) {
                            org.telegram.ui.Components.l11 l11Var2 = wnVar.f39668v0;
                            if (l11Var2 != null) {
                                AndroidUtilities.removeFromParent(l11Var2);
                            }
                            org.telegram.ui.Components.l11 l11Var3 = new org.telegram.ui.Components.l11(wnVar.getParentActivity(), new org.telegram.ui.ActionBar.a6(25, wnVar, r2));
                            wnVar.f39668v0 = l11Var3;
                            org.telegram.ui.Components.l11[] l11VarArr = {l11Var3};
                            pm pmVar = wnVar.X0;
                            pmVar.addView(l11Var3, pmVar.indexOfChild(wnVar.f39694x0) + 1, w7.y5.c(-1.0f, -1));
                        }
                    }
                    return wnVar.f39668v0;
                }
                return null;
            default:
                this.f40144b.getClass();
                if (org.telegram.ui.Components.l11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}

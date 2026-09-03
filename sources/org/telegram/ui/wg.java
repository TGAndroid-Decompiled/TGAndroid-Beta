package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class wg implements Utilities.Callback0Return {
    public final int f39679a;
    public final zn f39680b;

    public wg(zn znVar, int i10) {
        this.f39679a = i10;
        this.f39680b = znVar;
    }

    @Override
    public final Object run() {
        boolean z4;
        switch (this.f39679a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.a11.c()) {
                    zn znVar = this.f39680b;
                    org.telegram.ui.Components.a11 a11Var = znVar.f40738s0;
                    if (a11Var == null || a11Var.e) {
                        if (znVar.getParentActivity() != null && org.telegram.ui.Components.a11.c() && znVar.f40759u0 != null && znVar.U0 != null) {
                            org.telegram.ui.Components.a11 a11Var2 = znVar.f40738s0;
                            if (a11Var2 != null) {
                                AndroidUtilities.removeFromParent(a11Var2);
                            }
                            org.telegram.ui.Components.a11 a11Var3 = new org.telegram.ui.Components.a11(znVar.getParentActivity(), new hc(7, znVar, r2));
                            znVar.f40738s0 = a11Var3;
                            org.telegram.ui.Components.a11[] a11VarArr = {a11Var3};
                            rm rmVar = znVar.U0;
                            rmVar.addView(a11Var3, rmVar.indexOfChild(znVar.f40759u0) + 1, k7.b6.c(-1.0f, -1));
                        }
                    }
                    return znVar.f40738s0;
                }
                return null;
            default:
                this.f39680b.getClass();
                if (org.telegram.ui.Components.a11.c() && LiteMode.isEnabled(65536)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
        }
    }
}

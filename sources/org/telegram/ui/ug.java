package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class ug implements Utilities.Callback0Return {
    public final int f38934a;
    public final xn f38935b;

    public ug(xn xnVar, int i10) {
        this.f38934a = i10;
        this.f38935b = xnVar;
    }

    @Override
    public final Object run() {
        boolean z4;
        switch (this.f38934a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.a11.c()) {
                    xn xnVar = this.f38935b;
                    org.telegram.ui.Components.a11 a11Var = xnVar.f40172s0;
                    if (a11Var == null || a11Var.e) {
                        if (xnVar.getParentActivity() != null && org.telegram.ui.Components.a11.c() && xnVar.f40193u0 != null && xnVar.U0 != null) {
                            org.telegram.ui.Components.a11 a11Var2 = xnVar.f40172s0;
                            if (a11Var2 != null) {
                                AndroidUtilities.removeFromParent(a11Var2);
                            }
                            org.telegram.ui.Components.a11 a11Var3 = new org.telegram.ui.Components.a11(xnVar.getParentActivity(), new yb(8, xnVar, r2));
                            xnVar.f40172s0 = a11Var3;
                            org.telegram.ui.Components.a11[] a11VarArr = {a11Var3};
                            pm pmVar = xnVar.U0;
                            pmVar.addView(a11Var3, pmVar.indexOfChild(xnVar.f40193u0) + 1, k7.b6.c(-1.0f, -1));
                        }
                    }
                    return xnVar.f40172s0;
                }
                return null;
            default:
                this.f38935b.getClass();
                if (org.telegram.ui.Components.a11.c() && LiteMode.isEnabled(65536)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
        }
    }
}

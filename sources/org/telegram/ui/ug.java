package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class ug implements Utilities.Callback0Return {
    public final int f41924a;
    public final xn f41925b;

    public ug(xn xnVar, int i10) {
        this.f41924a = i10;
        this.f41925b = xnVar;
    }

    @Override
    public final Object run() {
        boolean z4;
        switch (this.f41924a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.b11.c()) {
                    xn xnVar = this.f41925b;
                    org.telegram.ui.Components.b11 b11Var = xnVar.f43341s0;
                    if (b11Var == null || b11Var.f25458e) {
                        if (xnVar.getParentActivity() != null && org.telegram.ui.Components.b11.c() && xnVar.f43362u0 != null && xnVar.U0 != null) {
                            org.telegram.ui.Components.b11 b11Var2 = xnVar.f43341s0;
                            if (b11Var2 != null) {
                                AndroidUtilities.removeFromParent(b11Var2);
                            }
                            org.telegram.ui.Components.b11 b11Var3 = new org.telegram.ui.Components.b11(xnVar.getParentActivity(), new fc(7, xnVar, r2));
                            xnVar.f43341s0 = b11Var3;
                            org.telegram.ui.Components.b11[] b11VarArr = {b11Var3};
                            pm pmVar = xnVar.U0;
                            pmVar.addView(b11Var3, pmVar.indexOfChild(xnVar.f43362u0) + 1, k7.c6.c(-1.0f, -1));
                        }
                    }
                    return xnVar.f43341s0;
                }
                return null;
            default:
                this.f41925b.getClass();
                if (org.telegram.ui.Components.b11.c() && LiteMode.isEnabled(65536)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
        }
    }
}

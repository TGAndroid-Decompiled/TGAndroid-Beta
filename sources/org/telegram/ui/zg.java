package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class zg implements Utilities.Callback0Return {
    public final int f40122a;
    public final xn f40123b;

    public zg(xn xnVar, int i10) {
        this.f40122a = i10;
        this.f40123b = xnVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f40122a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.w01.c()) {
                    xn xnVar = this.f40123b;
                    org.telegram.ui.Components.w01 w01Var = xnVar.f39570v0;
                    if (w01Var == null || w01Var.e) {
                        if (xnVar.getParentActivity() != null && org.telegram.ui.Components.w01.c() && xnVar.f39596x0 != null && xnVar.X0 != null) {
                            org.telegram.ui.Components.w01 w01Var2 = xnVar.f39570v0;
                            if (w01Var2 != null) {
                                AndroidUtilities.removeFromParent(w01Var2);
                            }
                            org.telegram.ui.Components.w01 w01Var3 = new org.telegram.ui.Components.w01(xnVar.getParentActivity(), new m4(20, xnVar, r2));
                            xnVar.f39570v0 = w01Var3;
                            org.telegram.ui.Components.w01[] w01VarArr = {w01Var3};
                            qm qmVar = xnVar.X0;
                            qmVar.addView(w01Var3, qmVar.indexOfChild(xnVar.f39596x0) + 1, w7.x5.c(-1.0f, -1));
                        }
                    }
                    return xnVar.f39570v0;
                }
                return null;
            default:
                this.f40123b.getClass();
                if (org.telegram.ui.Components.w01.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}

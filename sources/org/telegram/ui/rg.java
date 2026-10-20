package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class rg implements Utilities.Callback0Return {
    public final int f41213a;
    public final qn f41214b;

    public rg(qn qnVar, int i10) {
        this.f41213a = i10;
        this.f41214b = qnVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f41213a) {
            case 0:
                this.f41214b.getClass();
                if (org.telegram.ui.Components.v11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.v11.c()) {
                    qn qnVar = this.f41214b;
                    org.telegram.ui.Components.v11 v11Var = qnVar.f40874v0;
                    if (v11Var == null || v11Var.e) {
                        if (qnVar.getParentActivity() != null && org.telegram.ui.Components.v11.c() && qnVar.f40901x0 != null && qnVar.X0 != null) {
                            org.telegram.ui.Components.v11 v11Var2 = qnVar.f40874v0;
                            if (v11Var2 != null) {
                                AndroidUtilities.removeFromParent(v11Var2);
                            }
                            org.telegram.ui.Components.v11 v11Var3 = new org.telegram.ui.Components.v11(qnVar.getParentActivity(), new i0(22, qnVar, r2));
                            qnVar.f40874v0 = v11Var3;
                            org.telegram.ui.Components.v11[] v11VarArr = {v11Var3};
                            jm jmVar = qnVar.X0;
                            jmVar.addView(v11Var3, jmVar.indexOfChild(qnVar.f40901x0) + 1, w7.z5.c(-1.0f, -1));
                        }
                    }
                    return qnVar.f40874v0;
                }
                return null;
        }
    }
}

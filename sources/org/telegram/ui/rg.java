package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class rg implements Utilities.Callback0Return {
    public final int f41207a;
    public final qn f41208b;

    public rg(qn qnVar, int i10) {
        this.f41207a = i10;
        this.f41208b = qnVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f41207a) {
            case 0:
                this.f41208b.getClass();
                if (org.telegram.ui.Components.u11.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.u11.c()) {
                    qn qnVar = this.f41208b;
                    org.telegram.ui.Components.u11 u11Var = qnVar.f40868v0;
                    if (u11Var == null || u11Var.e) {
                        if (qnVar.getParentActivity() != null && org.telegram.ui.Components.u11.c() && qnVar.f40895x0 != null && qnVar.X0 != null) {
                            org.telegram.ui.Components.u11 u11Var2 = qnVar.f40868v0;
                            if (u11Var2 != null) {
                                AndroidUtilities.removeFromParent(u11Var2);
                            }
                            org.telegram.ui.Components.u11 u11Var3 = new org.telegram.ui.Components.u11(qnVar.getParentActivity(), new i0(22, qnVar, r2));
                            qnVar.f40868v0 = u11Var3;
                            org.telegram.ui.Components.u11[] u11VarArr = {u11Var3};
                            jm jmVar = qnVar.X0;
                            jmVar.addView(u11Var3, jmVar.indexOfChild(qnVar.f40895x0) + 1, w7.z5.c(-1.0f, -1));
                        }
                    }
                    return qnVar.f40868v0;
                }
                return null;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

public final class sg implements Utilities.Callback0Return {

    public final int f42632a;

    public final rn f42633b;

    public sg(rn rnVar, int i10) {
        this.f42632a = i10;
        this.f42633b = rnVar;
    }

    @Override
    public final Object run() {
        switch (this.f42632a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.f01.c()) {
                    rn rnVar = this.f42633b;
                    org.telegram.ui.Components.f01 f01Var = rnVar.f42186r0;
                    if (f01Var == null || f01Var.f28224e) {
                        if (rnVar.getParentActivity() != null && org.telegram.ui.Components.f01.c() && rnVar.f42213t0 != null && rnVar.T0 != null) {
                            org.telegram.ui.Components.f01 f01Var2 = rnVar.f42186r0;
                            if (f01Var2 != null) {
                                AndroidUtilities.removeFromParent(f01Var2);
                            }
                            org.telegram.ui.Components.f01 f01Var3 = new org.telegram.ui.Components.f01(rnVar.getParentActivity(), new rd(2, rnVar, f01VarArr));
                            rnVar.f42186r0 = f01Var3;
                            org.telegram.ui.Components.f01[] f01VarArr = {f01Var3};
                            jm jmVar = rnVar.T0;
                            jmVar.addView(f01Var3, jmVar.indexOfChild(rnVar.f42213t0) + 1, h7.z5.c(-1.0f, -1));
                        }
                    }
                    return rnVar.f42186r0;
                }
                return null;
            default:
                this.f42633b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.f01.c() && LiteMode.isEnabled(65536));
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class ug implements Utilities.Callback0Return {
    public final int f44017a;
    public final org.telegram.ui.ActionBar.r2 f44018b;

    public ug(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f44017a = i10;
        this.f44018b = r2Var;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f44017a) {
            case 0:
                wn wnVar = (wn) this.f44018b;
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.h21.c()) {
                    org.telegram.ui.Components.h21 h21Var = wnVar.f45312v0;
                    if (h21Var == null || h21Var.e) {
                        if (wnVar.getParentActivity() != null && org.telegram.ui.Components.h21.c() && wnVar.f45339x0 != null && wnVar.f45163j1 != null) {
                            org.telegram.ui.Components.h21 h21Var2 = wnVar.f45312v0;
                            if (h21Var2 != null) {
                                AndroidUtilities.removeFromParent(h21Var2);
                            }
                            org.telegram.ui.Components.h21 h21Var3 = new org.telegram.ui.Components.h21(wnVar.getParentActivity(), new ed(3, wnVar, r2));
                            wnVar.f45312v0 = h21Var3;
                            org.telegram.ui.Components.h21[] h21VarArr = {h21Var3};
                            om omVar = wnVar.f45163j1;
                            omVar.addView(h21Var3, omVar.indexOfChild(wnVar.f45339x0) + 1, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                        }
                    }
                    return wnVar.f45312v0;
                }
                return null;
            case 1:
                ((wn) this.f44018b).getClass();
                if (org.telegram.ui.Components.h21.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((ProfileActivity) this.f44018b).getSimpleMenuOverlay();
        }
    }
}

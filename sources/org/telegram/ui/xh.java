package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class xh extends org.telegram.ui.Components.bv {
    public final bn R1;

    public xh(bn bnVar, org.telegram.ui.ActionBar.g2 g2Var, Activity activity, org.telegram.ui.ActionBar.i6 i6Var, ArrayList arrayList) {
        super(g2Var, activity, i6Var, arrayList);
        this.R1 = bnVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        bn bnVar = this.R1;
        bnVar.getClass();
        bnVar.x8(false, true, 0.0f);
    }
}

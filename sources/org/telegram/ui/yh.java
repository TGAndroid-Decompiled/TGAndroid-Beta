package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class yh extends org.telegram.ui.Components.aw {
    public final zh W;

    public yh(zh zhVar, org.telegram.ui.ActionBar.r2 r2Var, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, ArrayList arrayList) {
        super(r2Var, activity, u6Var, arrayList);
        this.W = zhVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        un unVar = this.W.f46299p;
        unVar.getClass();
        unVar.n8(false, true, 0.0f);
    }
}

package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class yi extends org.telegram.ui.Components.aw {
    public final un W;

    public yi(un unVar, org.telegram.ui.ActionBar.r2 r2Var, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, ArrayList arrayList) {
        super(r2Var, activity, u6Var, arrayList);
        this.W = unVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        un unVar = this.W;
        unVar.getClass();
        unVar.n8(false, true, 0.0f);
    }
}

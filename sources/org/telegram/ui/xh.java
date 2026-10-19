package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class xh extends org.telegram.ui.Components.aw {
    public final yh W;

    public xh(yh yhVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(n2Var, activity, d6Var, arrayList);
        this.W = yhVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        qn qnVar = this.W.f43496p;
        qnVar.getClass();
        qnVar.j8(false, true, 0.0f);
    }
}

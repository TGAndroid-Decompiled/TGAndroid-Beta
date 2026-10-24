package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class xh extends org.telegram.ui.Components.yv {
    public final yh W;

    public xh(yh yhVar, org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(o2Var, activity, g6Var, arrayList);
        this.W = yhVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        sn snVar = this.W.f43861p;
        snVar.getClass();
        snVar.j8(false, true, 0.0f);
    }
}

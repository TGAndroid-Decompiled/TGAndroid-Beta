package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class xh extends org.telegram.ui.Components.jv {
    public final yh S;

    public xh(yh yhVar, org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(o2Var, activity, c6Var, arrayList);
        this.S = yhVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        tn tnVar = this.S.f44892p;
        tnVar.getClass();
        tnVar.g8(false, true, 0.0f);
    }
}

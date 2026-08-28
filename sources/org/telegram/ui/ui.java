package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class ui extends org.telegram.ui.Components.dv {
    public final qn S;

    public ui(qn qnVar, org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.b6 b6Var, ArrayList arrayList) {
        super(o2Var, activity, b6Var, arrayList);
        this.S = qnVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        qn qnVar = this.S;
        qnVar.getClass();
        qnVar.g8(false, true, 0.0f);
    }
}

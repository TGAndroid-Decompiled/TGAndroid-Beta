package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class uh extends org.telegram.ui.Components.dv {
    public final vh S;

    public uh(vh vhVar, org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.b6 b6Var, ArrayList arrayList) {
        super(o2Var, activity, b6Var, arrayList);
        this.S = vhVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        qn qnVar = this.S.f43493p;
        qnVar.getClass();
        qnVar.g8(false, true, 0.0f);
    }
}

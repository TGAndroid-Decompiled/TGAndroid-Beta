package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class xi extends org.telegram.ui.Components.jv {
    public final tn S;

    public xi(tn tnVar, org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(o2Var, activity, c6Var, arrayList);
        this.S = tnVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        tn tnVar = this.S;
        tnVar.getClass();
        tnVar.g8(false, true, 0.0f);
    }
}

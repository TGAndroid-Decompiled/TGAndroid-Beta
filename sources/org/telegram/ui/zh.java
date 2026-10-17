package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class zh extends org.telegram.ui.Components.aw {
    public final ai W;

    public zh(ai aiVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(n2Var, activity, d6Var, arrayList);
        this.W = aiVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        sn snVar = this.W.f35448p;
        snVar.getClass();
        snVar.j8(false, true, 0.0f);
    }
}

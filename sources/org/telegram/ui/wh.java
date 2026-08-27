package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

public final class wh extends org.telegram.ui.Components.cv {
    public final xh S;

    public wh(xh xhVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(n2Var, activity, c6Var, arrayList);
        this.S = xhVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        rn rnVar = this.S.f44464p;
        rnVar.getClass();
        rnVar.g8(false, true, 0.0f);
    }
}

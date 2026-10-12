package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class ui extends org.telegram.ui.Components.ew {
    public final fo W;

    public ui(fo foVar, org.telegram.ui.ActionBar.m2 m2Var, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(m2Var, activity, c6Var, arrayList);
        this.W = foVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        fo foVar = this.W;
        foVar.getClass();
        foVar.j8(false, true, 0.0f);
    }
}

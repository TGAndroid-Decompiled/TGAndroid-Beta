package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class ry extends org.telegram.ui.ActionBar.r2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.ww0 ww0Var = new org.telegram.ui.Components.ww0(context, null);
        this.fragmentView = ww0Var;
        return ww0Var;
    }
}

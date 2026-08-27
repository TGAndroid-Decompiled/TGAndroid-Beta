package org.telegram.ui;

import android.content.Context;
import android.view.View;

public abstract class ty extends org.telegram.ui.ActionBar.n2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context, null);
        this.fragmentView = zu0Var;
        return zu0Var;
    }
}

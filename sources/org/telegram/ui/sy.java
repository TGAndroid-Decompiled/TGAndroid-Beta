package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class sy extends org.telegram.ui.ActionBar.o2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.hv0 hv0Var = new org.telegram.ui.Components.hv0(context, null);
        this.fragmentView = hv0Var;
        return hv0Var;
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class ry extends org.telegram.ui.ActionBar.n2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.jw0 jw0Var = new org.telegram.ui.Components.jw0(context, null);
        this.fragmentView = jw0Var;
        return jw0Var;
    }
}

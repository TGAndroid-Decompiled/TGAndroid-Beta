package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class ry extends org.telegram.ui.ActionBar.o2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.ow0 ow0Var = new org.telegram.ui.Components.ow0(context, null);
        this.fragmentView = ow0Var;
        return ow0Var;
    }
}

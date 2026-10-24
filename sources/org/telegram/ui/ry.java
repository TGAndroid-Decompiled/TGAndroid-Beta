package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class ry extends org.telegram.ui.ActionBar.o2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.nw0 nw0Var = new org.telegram.ui.Components.nw0(context, null);
        this.fragmentView = nw0Var;
        return nw0Var;
    }
}

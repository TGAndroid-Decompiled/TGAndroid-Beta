package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class qy extends org.telegram.ui.ActionBar.o2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.xu0 xu0Var = new org.telegram.ui.Components.xu0(context, null);
        this.fragmentView = xu0Var;
        return xu0Var;
    }
}

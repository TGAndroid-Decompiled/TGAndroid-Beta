package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class sq {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f49814a;
    public final LinearLayout f49815b;
    public final ln0 f49816c;

    public sq(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.Components.ve0 ve0Var, ln0 ln0Var) {
        this.f49816c = ln0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.f49814a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232057, org.telegram.messenger.hd.M0(2131753756, null), false, null);
        c10.setOnClickListener(new rq(ve0Var, 0));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View a4Var = new di.a4(contextThemeWrapper, 10);
        a4Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        a4Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a4Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a4Var.getLayoutParams();
        if (org.telegram.messenger.hd.f22878a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        a4Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.f49815b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}

package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class rq {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f49261a;
    public final LinearLayout f49262b;
    public final gn0 f49263c;

    public rq(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.Components.xe0 xe0Var, gn0 gn0Var) {
        this.f49263c = gn0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.f49261a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232057, org.telegram.messenger.bd.M0(2131753756, null), false, null);
        c2.setOnClickListener(new qq(xe0Var, 0));
        c2.d(-328966, -328966);
        c2.setSelectorColor(268435455);
        View d2Var = new ai.d2(contextThemeWrapper, 12);
        d2Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        d2Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d2Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) d2Var.getLayoutParams();
        if (org.telegram.messenger.bd.f21784a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        d2Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.f49262b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}

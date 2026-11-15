package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class uq {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f51996a;
    public final LinearLayout f51997b;
    public final nn0 f51998c;

    public uq(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.Components.ye0 ye0Var, nn0 nn0Var) {
        this.f51998c = nn0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.f51996a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232058, org.telegram.messenger.hd.M0(2131753756, null), false, null);
        c10.setOnClickListener(new tq(ye0Var, 0));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View v1Var = new bi.v1(contextThemeWrapper, 12);
        v1Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        v1Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(v1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) v1Var.getLayoutParams();
        if (org.telegram.messenger.hd.f24101a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        v1Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.f51997b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}

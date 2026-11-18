package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vq {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f52838a;
    public final LinearLayout f52839b;
    public final qn0 f52840c;

    public vq(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.Components.if0 if0Var, qn0 qn0Var) {
        this.f52840c = qn0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.f52838a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232059, org.telegram.messenger.gd.M0(2131753754, null), false, null);
        c10.setOnClickListener(new uq(if0Var, 0));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View p2Var = new bi.p2(contextThemeWrapper, 12);
        p2Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        p2Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(p2Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) p2Var.getLayoutParams();
        if (org.telegram.messenger.gd.f24216a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        p2Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.f52839b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}

package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vq {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f52846a;
    public final LinearLayout f52847b;
    public final qn0 f52848c;

    public vq(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.Components.kf0 kf0Var, qn0 qn0Var) {
        this.f52848c = qn0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.f52846a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232059, org.telegram.messenger.hd.N0(2131753753, null), false, null);
        c10.setOnClickListener(new uq(kf0Var, 0));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View v2Var = new bi.v2(contextThemeWrapper, 12);
        v2Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        v2Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(v2Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) v2Var.getLayoutParams();
        if (org.telegram.messenger.hd.f24408a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        v2Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.f52847b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}

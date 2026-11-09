package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class uq {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f50449a;
    public final LinearLayout f50450b;
    public final nn0 f50451c;

    public uq(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.Components.we0 we0Var, nn0 nn0Var) {
        this.f50451c = nn0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.f50449a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232057, org.telegram.messenger.id.M0(2131753756, null), false, null);
        c10.setOnClickListener(new tq(we0Var, 0));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View b4Var = new di.b4(contextThemeWrapper, 10);
        b4Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        b4Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b4Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b4Var.getLayoutParams();
        if (org.telegram.messenger.id.f23157a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        b4Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.f50450b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}

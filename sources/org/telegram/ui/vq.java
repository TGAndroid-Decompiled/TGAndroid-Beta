package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vq {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f53017a;
    public final LinearLayout f53018b;
    public final qn0 f53019c;

    public vq(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.Components.jf0 jf0Var, qn0 qn0Var) {
        this.f53019c = qn0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.f53017a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232062, org.telegram.messenger.gd.N0(2131753753, null), false, null);
        c10.setOnClickListener(new uq(jf0Var, 0));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View v2Var = new bi.v2(contextThemeWrapper, 12);
        v2Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        v2Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(v2Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) v2Var.getLayoutParams();
        if (org.telegram.messenger.gd.f24314a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        v2Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.f53018b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}

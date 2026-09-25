package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class rr {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37451a;
    public final LinearLayout f37452b;
    public final ir0 f37453c;

    public rr(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.Components.fh0 fh0Var, ir0 ir0Var) {
        this.f37453c = ir0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.f37451a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        c10.setOnClickListener(new qr(fh0Var, 0));
        c10.c(-328966, -328966);
        c10.setSelectorColor(268435455);
        View w5Var = new ai.w5(contextThemeWrapper, 11);
        w5Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        w5Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(w5Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) w5Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        w5Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.f37452b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}

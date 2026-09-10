package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class yr {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f39100a;
    public final LinearLayout f39101b;
    public final qr0 f39102c;

    public yr(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.Components.eh0 eh0Var, qr0 qr0Var) {
        this.f39102c = qr0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.f39100a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        c10.setOnClickListener(new xr(eh0Var, 0));
        c10.c(-328966, -328966);
        c10.setSelectorColor(268435455);
        View l4Var = new bi.l4(contextThemeWrapper, 10);
        l4Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        l4Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l4Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) l4Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        l4Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.f39101b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}

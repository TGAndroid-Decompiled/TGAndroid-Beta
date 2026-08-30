package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class rr {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38104a;
    public final LinearLayout f38105b;
    public final uq0 f38106c;

    public rr(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.Components.ah0 ah0Var, uq0 uq0Var) {
        this.f38106c = uq0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.f38104a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        c3.setOnClickListener(new qr(ah0Var, 0));
        c3.c(-328966, -328966);
        c3.setSelectorColor(268435455);
        View dVar = new dh.d(contextThemeWrapper, 11);
        dVar.setMinimumWidth(AndroidUtilities.dp(196.0f));
        dVar.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(dVar);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) dVar.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        dVar.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.f38105b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}

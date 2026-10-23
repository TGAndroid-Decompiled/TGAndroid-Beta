package org.telegram.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class v70 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final org.telegram.ui.Components.x90 T;
    public final org.telegram.ui.ActionBar.e1 U;
    public final org.telegram.ui.ActionBar.e1 V;
    public final org.telegram.ui.ActionBar.e1 W;
    public final ArrayList f42134a0;
    public final org.telegram.ui.Components.t00 f42135b0;
    public int f42136c0;
    public final CacheByChatsController f42137d0;
    public t70 f42138e0;
    public ArrayList f42139f0;
    public final org.telegram.ui.ActionBar.n2 f42140g0;
    public final FrameLayout f42141h0;

    public v70(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f42134a0 = arrayList;
        this.f42140g0 = n2Var;
        this.f42137d0 = n2Var.getMessagesController().getCacheByChatsController();
        setFitItems(true);
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_autodelete_1d, LocaleController.formatPluralString("Days", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_autodelete_2d, LocaleController.formatPluralString("Days", 2, new Object[0]), false, null);
        this.W = c11;
        org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_autodelete_1w, LocaleController.formatPluralString("Weeks", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_autodelete_1m, LocaleController.formatPluralString("Months", 1, new Object[0]), false, null);
        this.V = c13;
        org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_cancel, LocaleController.getString(R.string.AutoDeleteMediaNever), false, null);
        org.telegram.ui.ActionBar.e1 c15 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        this.U = c15;
        int i10 = org.telegram.ui.ActionBar.h6.f21215p7;
        c15.c(org.telegram.ui.ActionBar.h6.x0(null, i10, false), org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        arrayList.add(new u70(c10, CacheByChatsController.KEEP_MEDIA_ONE_DAY));
        arrayList.add(new u70(c11, CacheByChatsController.KEEP_MEDIA_TWO_DAY));
        arrayList.add(new u70(c12, CacheByChatsController.KEEP_MEDIA_ONE_WEEK));
        arrayList.add(new u70(c13, CacheByChatsController.KEEP_MEDIA_ONE_MONTH));
        arrayList.add(new u70(c14, CacheByChatsController.KEEP_MEDIA_FOREVER));
        arrayList.add(new u70(c15, CacheByChatsController.KEEP_MEDIA_DELETE));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42141h0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H8, false));
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20956b7, null)));
        frameLayout.addView(view, w7.z5.c(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, w7.z5.n(-1, 8));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(this, context);
        this.f42135b0 = t00Var;
        a(t00Var, w7.z5.n(-1, 48));
        t00Var.setOnClickListener(new org.telegram.ui.Components.i51(22, this, n2Var));
        for (int i11 = 0; i11 < this.f42134a0.size(); i11++) {
            ((u70) this.f42134a0.get(i11)).f41827a.setOnClickListener(new ai.n1(this, ((u70) this.f42134a0.get(i11)).f41828b, 20));
        }
        org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(context, null);
        this.T = x90Var;
        x90Var.setTag(R.id.fit_width_tag, 1);
        x90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        x90Var.setTextSize(1, 13.0f);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
        x90Var.setMovementMethod(LinkMovementMethod.getInstance());
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
        x90Var.setText(LocaleController.getString(R.string.KeepMediaPopupDescription));
        a(x90Var, w7.z5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void f() {
        if (this.f42139f0 != null) {
            ((org.telegram.ui.Components.k9) this.f42135b0.d).setTranslationX((3 - Math.min(3, this.f42139f0.size())) * AndroidUtilities.dp(12.0f));
        }
    }

    public final void g(boolean z10) {
        int i10;
        this.f42136c0 = -1;
        this.f42141h0.setVisibility(0);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.U.setVisibility(i10);
        this.T.setVisibility(0);
        this.f42135b0.setVisibility(8);
    }

    public void setCallback(t70 t70Var) {
        this.f42138e0 = t70Var;
    }
}

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
public final class u70 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final org.telegram.ui.Components.l80 P;
    public final org.telegram.ui.ActionBar.g1 Q;
    public final org.telegram.ui.ActionBar.g1 R;
    public final org.telegram.ui.ActionBar.g1 S;
    public final ArrayList T;
    public final org.telegram.ui.Components.wz U;
    public int V;
    public final CacheByChatsController W;
    public s70 f43152a0;
    public ArrayList f43153b0;
    public final org.telegram.ui.ActionBar.o2 f43154c0;
    public final FrameLayout f43155d0;

    public u70(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        this.f43154c0 = o2Var;
        this.W = o2Var.getMessagesController().getCacheByChatsController();
        setFitItems(true);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_1d, LocaleController.formatPluralString("Days", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_2d, LocaleController.formatPluralString("Days", 2, new Object[0]), false, null);
        this.S = c11;
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_1w, LocaleController.formatPluralString("Weeks", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_1m, LocaleController.formatPluralString("Months", 1, new Object[0]), false, null);
        this.R = c13;
        org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_cancel, LocaleController.getString(R.string.AutoDeleteMediaNever), false, null);
        org.telegram.ui.ActionBar.g1 c15 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        this.Q = c15;
        int i9 = org.telegram.ui.ActionBar.f6.f23212p7;
        c15.c(org.telegram.ui.ActionBar.f6.w0(null, i9, false), org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        arrayList.add(new t70(c10, CacheByChatsController.KEEP_MEDIA_ONE_DAY));
        arrayList.add(new t70(c11, CacheByChatsController.KEEP_MEDIA_TWO_DAY));
        arrayList.add(new t70(c12, CacheByChatsController.KEEP_MEDIA_ONE_WEEK));
        arrayList.add(new t70(c13, CacheByChatsController.KEEP_MEDIA_ONE_MONTH));
        arrayList.add(new t70(c14, CacheByChatsController.KEEP_MEDIA_FOREVER));
        arrayList.add(new t70(c15, CacheByChatsController.KEEP_MEDIA_DELETE));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43155d0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H8, false));
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.f6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22966b7, null)));
        frameLayout.addView(view, g7.e6.c(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, g7.e6.n(-1, 8));
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(this, context);
        this.U = wzVar;
        a(wzVar, g7.e6.n(-1, 48));
        wzVar.setOnClickListener(new org.telegram.ui.Components.vh0(29, this, o2Var));
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            ((t70) this.T.get(i10)).f42883a.setOnClickListener(new gh.z0(this, ((t70) this.T.get(i10)).f42884b, 17));
        }
        org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(context, null);
        this.P = l80Var;
        l80Var.setTag(R.id.fit_width_tag, 1);
        l80Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        l80Var.setTextSize(1, 13.0f);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
        l80Var.setMovementMethod(LinkMovementMethod.getInstance());
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
        l80Var.setText(LocaleController.getString(R.string.KeepMediaPopupDescription));
        a(l80Var, g7.e6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void f() {
        if (this.f43153b0 != null) {
            ((org.telegram.ui.Components.c9) this.U.d).setTranslationX((3 - Math.min(3, this.f43153b0.size())) * AndroidUtilities.dp(12.0f));
        }
    }

    public final void g(boolean z10) {
        int i9;
        this.V = -1;
        this.f43155d0.setVisibility(0);
        if (z10) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        this.Q.setVisibility(i9);
        this.P.setVisibility(0);
        this.U.setVisibility(8);
    }

    public void setCallback(s70 s70Var) {
        this.f43152a0 = s70Var;
    }
}

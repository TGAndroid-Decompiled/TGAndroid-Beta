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

public final class y70 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final org.telegram.ui.Components.p80 P;
    public final org.telegram.ui.ActionBar.f1 Q;
    public final org.telegram.ui.ActionBar.f1 R;
    public final org.telegram.ui.ActionBar.f1 S;
    public final ArrayList T;
    public final org.telegram.ui.Components.zz U;
    public int V;
    public final CacheByChatsController W;

    public w70 f44719a0;

    public ArrayList f44720b0;

    public final org.telegram.ui.ActionBar.n2 f44721c0;

    public final FrameLayout f44722d0;

    public y70(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        this.f44721c0 = n2Var;
        this.W = n2Var.getMessagesController().getCacheByChatsController();
        setFitItems(true);
        org.telegram.ui.ActionBar.f1 f1VarC = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_autodelete_1d, LocaleController.formatPluralString("Days", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.f1 f1VarC2 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_autodelete_2d, LocaleController.formatPluralString("Days", 2, new Object[0]), false, null);
        this.S = f1VarC2;
        org.telegram.ui.ActionBar.f1 f1VarC3 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_autodelete_1w, LocaleController.formatPluralString("Weeks", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.f1 f1VarC4 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_autodelete_1m, LocaleController.formatPluralString("Months", 1, new Object[0]), false, null);
        this.R = f1VarC4;
        org.telegram.ui.ActionBar.f1 f1VarC5 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_cancel, LocaleController.getString(R.string.AutoDeleteMediaNever), false, null);
        org.telegram.ui.ActionBar.f1 f1VarC6 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        this.Q = f1VarC6;
        int i10 = org.telegram.ui.ActionBar.g6.f23269p7;
        f1VarC6.c(org.telegram.ui.ActionBar.g6.w0(null, i10, false), org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        arrayList.add(new x70(f1VarC, CacheByChatsController.KEEP_MEDIA_ONE_DAY));
        arrayList.add(new x70(f1VarC2, CacheByChatsController.KEEP_MEDIA_TWO_DAY));
        arrayList.add(new x70(f1VarC3, CacheByChatsController.KEEP_MEDIA_ONE_WEEK));
        arrayList.add(new x70(f1VarC4, CacheByChatsController.KEEP_MEDIA_ONE_MONTH));
        arrayList.add(new x70(f1VarC5, CacheByChatsController.KEEP_MEDIA_FOREVER));
        arrayList.add(new x70(f1VarC6, CacheByChatsController.KEEP_MEDIA_DELETE));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44722d0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H8, false));
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.g6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23018b7, null)));
        frameLayout.addView(view, h7.z5.c(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, h7.z5.n(-1, 8));
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(this, context);
        this.U = zzVar;
        a(zzVar, h7.z5.n(-1, 48));
        zzVar.setOnClickListener(new u70(0, this, n2Var));
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            ((x70) this.T.get(i11)).f44302a.setOnClickListener(new hh.z0(this, ((x70) this.T.get(i11)).f44303b, 17));
        }
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        this.P = p80Var;
        p80Var.setTag(R.id.fit_width_tag, 1);
        p80Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        p80Var.setTextSize(1, 13.0f);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        p80Var.setMovementMethod(LinkMovementMethod.getInstance());
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
        p80Var.setText(LocaleController.getString(R.string.KeepMediaPopupDescription));
        a(p80Var, h7.z5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void f() {
        if (this.f44720b0 != null) {
            ((org.telegram.ui.Components.b9) this.U.d).setTranslationX((3 - Math.min(3, this.f44720b0.size())) * AndroidUtilities.dp(12.0f));
        }
    }

    public final void g(boolean z10) {
        this.V = -1;
        this.f44722d0.setVisibility(0);
        this.Q.setVisibility(z10 ? 8 : 0);
        this.P.setVisibility(0);
        this.U.setVisibility(8);
    }

    public void setCallback(w70 w70Var) {
        this.f44719a0 = w70Var;
    }
}

package sh;

import android.content.Context;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
public final class c0 extends f0 {
    public final i0 h;

    public c0(i0 i0Var, Context context) {
        super(i0Var, context);
        int i10;
        f6 f6Var;
        f6 f6Var2;
        int i11;
        f6 f6Var3;
        this.h = i0Var;
        AndroidUtilities.removeFromParent(this.f44401b);
        i10 = ((g3) i0Var).currentAccount;
        r rVar = new r(i0Var, 3);
        s sVar = new s(i0Var, 2);
        f6Var = ((g3) i0Var).resourcesProvider;
        g61 g61Var = new g61(context, i10, 0, false, rVar, sVar, null, f6Var);
        this.d = g61Var;
        g61Var.o1();
        g61 g61Var2 = this.d;
        g61Var2.V2.f30148r = false;
        g61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.f44402c.addView(i0Var.D, b6.g());
        this.f44402c.addView(this.d, 0, b6.c(-1.0f, -1));
        this.f44402c.addView(i0Var.F, b6.g());
        f6Var2 = ((g3) i0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var2);
        this.f44400a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f44400a.setTitleColor(i0Var.getThemedColor(j6.G6));
        this.f44400a.B(i0Var.getThemedColor(j6.f20275z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.f44400a;
        boolean z4 = i0Var.K;
        if (z4) {
            i11 = R.drawable.ic_ab_close;
        } else {
            i11 = R.drawable.ic_ab_back;
        }
        kVar2.setBackButtonImage(i11);
        this.f44400a.C(i0Var.getThemedColor(j6.f20258y8), false);
        this.f44400a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.f44400a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f44400a.setActionBarMenuOnItemClick(new e(this, 3));
        this.f44402c.addView(this.f44400a, b6.e(-1, 56, 48));
        this.f44402c.addView(i0Var.B, b6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.f44400a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        f6Var3 = ((g3) i0Var).resourcesProvider;
        ph.d dVar = new ph.d(context2, f6Var3, true);
        i0Var.f44420r = dVar;
        dVar.e();
        i0Var.f44420r.setText(LocaleController.getString(R.string.OK));
        i0Var.f44420r.setOnClickListener(new oh.n(this, 17));
        if (z4) {
            i0Var.f44420r.setVisibility(8);
        }
        this.f44402c.addView(i0Var.f44420r, b6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return kf.m0.b(this.h.f44417c.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.h.B.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}

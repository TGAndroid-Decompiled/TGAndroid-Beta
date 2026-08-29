package qh;

import android.content.Context;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.u51;
public final class c0 extends f0 {
    public final i0 h;

    public c0(i0 i0Var, Context context) {
        super(i0Var, context);
        int i10;
        c6 c6Var;
        c6 c6Var2;
        int i11;
        c6 c6Var3;
        this.h = i0Var;
        AndroidUtilities.removeFromParent(this.f46696b);
        i10 = ((f3) i0Var).currentAccount;
        r rVar = new r(i0Var, 3);
        s sVar = new s(i0Var, 2);
        c6Var = ((f3) i0Var).resourcesProvider;
        u51 u51Var = new u51(context, i10, 0, false, rVar, sVar, null, c6Var);
        this.d = u51Var;
        u51Var.p1();
        u51 u51Var2 = this.d;
        u51Var2.U2.f29939r = false;
        u51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.f46697c.addView(i0Var.C, f6.g());
        this.f46697c.addView(this.d, 0, f6.c(-1.0f, -1));
        this.f46697c.addView(i0Var.E, f6.g());
        c6Var2 = ((f3) i0Var).resourcesProvider;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, c6Var2);
        this.f46695a = lVar;
        lVar.setOccupyStatusBar(false);
        this.f46695a.setTitleColor(i0Var.getThemedColor(g6.G6));
        this.f46695a.B(i0Var.getThemedColor(g6.f23452z8), false);
        org.telegram.ui.ActionBar.l lVar2 = this.f46695a;
        boolean z10 = i0Var.J;
        if (z10) {
            i11 = R.drawable.ic_ab_close;
        } else {
            i11 = R.drawable.ic_ab_back;
        }
        lVar2.setBackButtonImage(i11);
        this.f46695a.C(i0Var.getThemedColor(g6.y8), false);
        this.f46695a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.f46695a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f46695a.setActionBarMenuOnItemClick(new e(this, 3));
        this.f46697c.addView(this.f46695a, f6.e(-1, 56, 48));
        this.f46697c.addView(i0Var.A, f6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.a0 n10 = this.f46695a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        c6Var3 = ((f3) i0Var).resourcesProvider;
        nh.d dVar = new nh.d(context2, c6Var3, true);
        i0Var.f46718r = dVar;
        dVar.e();
        i0Var.f46718r.setText(LocaleController.getString(R.string.OK));
        i0Var.f46718r.setOnClickListener(new mh.n(this, 17));
        if (z10) {
            i0Var.f46718r.setVisibility(8);
        }
        this.f46697c.addView(i0Var.f46718r, f6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return jf.l0.b(this.h.f46714c.f49505e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.h.A.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}

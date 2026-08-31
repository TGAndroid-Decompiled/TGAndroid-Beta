package th;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.nb0;
public final class h0 extends f0 {
    public final i0 h;

    public h0(i0 i0Var, Context context) {
        super(i0Var, context);
        int i10;
        g6 g6Var;
        g6 g6Var2;
        g6 g6Var3;
        g6 g6Var4;
        this.h = i0Var;
        i10 = ((h3) i0Var).currentAccount;
        r rVar = new r(i0Var, 5);
        s sVar = new s(i0Var, 5);
        g6Var = ((h3) i0Var).resourcesProvider;
        i61 i61Var = new i61(context, i10, 0, false, rVar, sVar, null, g6Var);
        this.d = i61Var;
        i61Var.p1();
        i61 i61Var2 = this.d;
        i61Var2.V2.f32957r = false;
        i61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new nb0(this, 18));
        this.f48116c.addView(this.d, 0, c6.c(-1.0f, -1));
        g6Var2 = ((h3) i0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var2);
        this.f48114a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f48114a;
        int i11 = k6.G6;
        kVar2.setTitleColor(i0Var.getThemedColor(i11));
        this.f48114a.B(i0Var.getThemedColor(k6.f22055z8), false);
        this.f48114a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f48114a.C(i0Var.getThemedColor(k6.f22038y8), false);
        this.f48114a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f48114a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f48114a.setActionBarMenuOnItemClick(new e(this, 5));
        this.f48116c.addView(this.f48114a, c6.e(-1, 56, 48));
        LinearLayout f10 = y3.f(context, 0);
        f10.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        g6Var3 = ((h3) i0Var).resourcesProvider;
        qh.d dVar = new qh.d(context, g6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.d(0.125f, i0Var.getThemedColor(k6.f21659d6), i0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final h0 f48126b;

            {
                this.f48126b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48126b.h.J.f(false, true);
                        return;
                    default:
                        this.f48126b.h.J.f(true, true);
                        return;
                }
            }
        });
        f10.addView(dVar, c6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        g6Var4 = ((h3) i0Var).resourcesProvider;
        qh.d dVar2 = new qh.d(context, g6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final h0 f48126b;

            {
                this.f48126b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48126b.h.J.f(false, true);
                        return;
                    default:
                        this.f48126b.h.J.f(true, true);
                        return;
                }
            }
        });
        f10.addView(dVar2, c6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f48116c.addView(f10, c6.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}

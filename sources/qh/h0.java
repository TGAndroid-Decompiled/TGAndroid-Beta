package qh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.u51;
public final class h0 extends f0 {
    public final i0 h;

    public h0(i0 i0Var, Context context) {
        super(i0Var, context);
        int i10;
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        c6 c6Var4;
        this.h = i0Var;
        i10 = ((f3) i0Var).currentAccount;
        r rVar = new r(i0Var, 5);
        s sVar = new s(i0Var, 5);
        c6Var = ((f3) i0Var).resourcesProvider;
        u51 u51Var = new u51(context, i10, 0, false, rVar, sVar, null, c6Var);
        this.d = u51Var;
        u51Var.p1();
        u51 u51Var2 = this.d;
        u51Var2.U2.f29939r = false;
        u51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new h00(this, 18));
        this.f46697c.addView(this.d, 0, f6.c(-1.0f, -1));
        c6Var2 = ((f3) i0Var).resourcesProvider;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, c6Var2);
        this.f46695a = lVar;
        lVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.l lVar2 = this.f46695a;
        int i11 = g6.G6;
        lVar2.setTitleColor(i0Var.getThemedColor(i11));
        this.f46695a.B(i0Var.getThemedColor(g6.f23452z8), false);
        this.f46695a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f46695a.C(i0Var.getThemedColor(g6.y8), false);
        this.f46695a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f46695a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f46695a.setActionBarMenuOnItemClick(new e(this, 5));
        this.f46697c.addView(this.f46695a, f6.e(-1, 56, 48));
        LinearLayout g10 = x3.g(context, 0);
        g10.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        c6Var3 = ((f3) i0Var).resourcesProvider;
        nh.d dVar = new nh.d(context, c6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.d(0.125f, i0Var.getThemedColor(g6.f23062d6), i0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final h0 f46707b;

            {
                this.f46707b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46707b.h.I.f(false, true);
                        return;
                    default:
                        this.f46707b.h.I.f(true, true);
                        return;
                }
            }
        });
        g10.addView(dVar, f6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        c6Var4 = ((f3) i0Var).resourcesProvider;
        nh.d dVar2 = new nh.d(context, c6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final h0 f46707b;

            {
                this.f46707b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46707b.h.I.f(false, true);
                        return;
                    default:
                        this.f46707b.h.I.f(true, true);
                        return;
                }
            }
        });
        g10.addView(dVar2, f6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f46697c.addView(g10, f6.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}

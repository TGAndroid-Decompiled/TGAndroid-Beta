package sh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.mb0;
public final class h0 extends f0 {
    public final i0 h;

    public h0(i0 i0Var, Context context) {
        super(i0Var, context);
        int i10;
        f6 f6Var;
        f6 f6Var2;
        f6 f6Var3;
        f6 f6Var4;
        this.h = i0Var;
        i10 = ((g3) i0Var).currentAccount;
        r rVar = new r(i0Var, 5);
        s sVar = new s(i0Var, 5);
        f6Var = ((g3) i0Var).resourcesProvider;
        g61 g61Var = new g61(context, i10, 0, false, rVar, sVar, null, f6Var);
        this.d = g61Var;
        g61Var.o1();
        g61 g61Var2 = this.d;
        g61Var2.V2.f30148r = false;
        g61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new mb0(this, 18));
        this.f44402c.addView(this.d, 0, b6.c(-1.0f, -1));
        f6Var2 = ((g3) i0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var2);
        this.f44400a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f44400a;
        int i11 = j6.G6;
        kVar2.setTitleColor(i0Var.getThemedColor(i11));
        this.f44400a.B(i0Var.getThemedColor(j6.f20275z8), false);
        this.f44400a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f44400a.C(i0Var.getThemedColor(j6.f20258y8), false);
        this.f44400a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f44400a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f44400a.setActionBarMenuOnItemClick(new e(this, 5));
        this.f44402c.addView(this.f44400a, b6.e(-1, 56, 48));
        LinearLayout f10 = y3.f(context, 0);
        f10.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        f6Var3 = ((g3) i0Var).resourcesProvider;
        ph.d dVar = new ph.d(context, f6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.d(0.125f, i0Var.getThemedColor(j6.f19881d6), i0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final h0 f44410b;

            {
                this.f44410b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44410b.h.J.f(false, true);
                        return;
                    default:
                        this.f44410b.h.J.f(true, true);
                        return;
                }
            }
        });
        f10.addView(dVar, b6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        f6Var4 = ((g3) i0Var).resourcesProvider;
        ph.d dVar2 = new ph.d(context, f6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final h0 f44410b;

            {
                this.f44410b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44410b.h.J.f(false, true);
                        return;
                    default:
                        this.f44410b.h.J.f(true, true);
                        return;
                }
            }
        });
        f10.addView(dVar2, b6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f44402c.addView(f10, b6.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}

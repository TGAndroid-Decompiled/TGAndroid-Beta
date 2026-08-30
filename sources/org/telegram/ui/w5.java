package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class w5 extends FrameLayout {
    public final y5 f39330a;

    public w5(y5 y5Var, Activity activity) {
        super(activity);
        this.f39330a = y5Var;
        setWillNotDraw(false);
        dg.s1 s1Var = new dg.s1(y5Var, getContext());
        dg.s1 s1Var2 = new dg.s1(y5Var, getContext());
        dg.s1 s1Var3 = new dg.s1(y5Var, getContext());
        s1Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        s1Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        s1Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        s1Var.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f38844b;

            {
                this.f38844b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i10 = r2;
                w5 w5Var = this.f38844b;
                switch (i10) {
                    case 0:
                        y5 y5Var2 = w5Var.f39330a;
                        long j10 = y5Var2.M;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = y5Var2.P;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var2.O;
                        int i11 = eg.v0.S0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && y5Var2.getParentActivity() != null) {
                            eg.v0 v0Var = new eg.v0(19, y5Var2.getCurrentAccount(), y5Var2.getParentActivity(), y5Var2, y5Var2.getResourceProvider());
                            v0Var.G1(canApplyBoost);
                            v0Var.F1(tL_premium_boostsStatus, true);
                            v0Var.H1(j10);
                            v0Var.f5537d0 = null;
                            y5Var2.showDialog(v0Var);
                            return;
                        }
                        return;
                    case 1:
                        y5 y5Var3 = w5Var.f39330a;
                        y5Var3.w0(true);
                        long j11 = y5Var3.M;
                        f6Var = ((org.telegram.ui.ActionBar.p2) y5Var3).resourceProvider;
                        gg.x.m(y5Var3, f6Var, j11, null);
                        gg.x.e.setOnHideListener(new v5(w5Var, 0));
                        return;
                    default:
                        y5 y5Var4 = w5Var.f39330a;
                        eg.v0 v0Var2 = new eg.v0(31, y5Var4.N, w5Var.getContext(), y5Var4, y5Var4.getResourceProvider());
                        v0Var2.F1(y5Var4.O, true);
                        v0Var2.H1(y5Var4.M);
                        y5Var4.showDialog(v0Var2);
                        return;
                }
            }
        });
        s1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f38844b;

            {
                this.f38844b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i10 = r2;
                w5 w5Var = this.f38844b;
                switch (i10) {
                    case 0:
                        y5 y5Var2 = w5Var.f39330a;
                        long j10 = y5Var2.M;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = y5Var2.P;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var2.O;
                        int i11 = eg.v0.S0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && y5Var2.getParentActivity() != null) {
                            eg.v0 v0Var = new eg.v0(19, y5Var2.getCurrentAccount(), y5Var2.getParentActivity(), y5Var2, y5Var2.getResourceProvider());
                            v0Var.G1(canApplyBoost);
                            v0Var.F1(tL_premium_boostsStatus, true);
                            v0Var.H1(j10);
                            v0Var.f5537d0 = null;
                            y5Var2.showDialog(v0Var);
                            return;
                        }
                        return;
                    case 1:
                        y5 y5Var3 = w5Var.f39330a;
                        y5Var3.w0(true);
                        long j11 = y5Var3.M;
                        f6Var = ((org.telegram.ui.ActionBar.p2) y5Var3).resourceProvider;
                        gg.x.m(y5Var3, f6Var, j11, null);
                        gg.x.e.setOnHideListener(new v5(w5Var, 0));
                        return;
                    default:
                        y5 y5Var4 = w5Var.f39330a;
                        eg.v0 v0Var2 = new eg.v0(31, y5Var4.N, w5Var.getContext(), y5Var4, y5Var4.getResourceProvider());
                        v0Var2.F1(y5Var4.O, true);
                        v0Var2.H1(y5Var4.M);
                        y5Var4.showDialog(v0Var2);
                        return;
                }
            }
        });
        s1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f38844b;

            {
                this.f38844b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i10 = r2;
                w5 w5Var = this.f38844b;
                switch (i10) {
                    case 0:
                        y5 y5Var2 = w5Var.f39330a;
                        long j10 = y5Var2.M;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = y5Var2.P;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var2.O;
                        int i11 = eg.v0.S0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && y5Var2.getParentActivity() != null) {
                            eg.v0 v0Var = new eg.v0(19, y5Var2.getCurrentAccount(), y5Var2.getParentActivity(), y5Var2, y5Var2.getResourceProvider());
                            v0Var.G1(canApplyBoost);
                            v0Var.F1(tL_premium_boostsStatus, true);
                            v0Var.H1(j10);
                            v0Var.f5537d0 = null;
                            y5Var2.showDialog(v0Var);
                            return;
                        }
                        return;
                    case 1:
                        y5 y5Var3 = w5Var.f39330a;
                        y5Var3.w0(true);
                        long j11 = y5Var3.M;
                        f6Var = ((org.telegram.ui.ActionBar.p2) y5Var3).resourceProvider;
                        gg.x.m(y5Var3, f6Var, j11, null);
                        gg.x.e.setOnHideListener(new v5(w5Var, 0));
                        return;
                    default:
                        y5 y5Var4 = w5Var.f39330a;
                        eg.v0 v0Var2 = new eg.v0(31, y5Var4.N, w5Var.getContext(), y5Var4, y5Var4.getResourceProvider());
                        v0Var2.F1(y5Var4.O, true);
                        v0Var2.H1(y5Var4.M);
                        y5Var4.showDialog(v0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(s1Var, k7.b6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(y5Var.N).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(y5Var.f40389d0)) {
            linearLayout.addView(s1Var2, k7.b6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(s1Var3, k7.b6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, k7.b6.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}

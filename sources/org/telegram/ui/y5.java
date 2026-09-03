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
public final class y5 extends FrameLayout {
    public final a6 f40141a;

    public y5(a6 a6Var, Activity activity) {
        super(activity);
        this.f40141a = a6Var;
        setWillNotDraw(false);
        dg.s1 s1Var = new dg.s1(a6Var, getContext());
        dg.s1 s1Var2 = new dg.s1(a6Var, getContext());
        dg.s1 s1Var3 = new dg.s1(a6Var, getContext());
        s1Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        s1Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        s1Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        s1Var.setOnClickListener(new View.OnClickListener(this) {
            public final y5 f39276b;

            {
                this.f39276b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i10 = r2;
                y5 y5Var = this.f39276b;
                switch (i10) {
                    case 0:
                        a6 a6Var2 = y5Var.f40141a;
                        long j10 = a6Var2.M;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = a6Var2.P;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = a6Var2.O;
                        int i11 = eg.v0.S0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && a6Var2.getParentActivity() != null) {
                            eg.v0 v0Var = new eg.v0(19, a6Var2.getCurrentAccount(), a6Var2.getParentActivity(), a6Var2, a6Var2.getResourceProvider());
                            v0Var.G1(canApplyBoost);
                            v0Var.F1(tL_premium_boostsStatus, true);
                            v0Var.H1(j10);
                            v0Var.f5526d0 = null;
                            a6Var2.showDialog(v0Var);
                            return;
                        }
                        return;
                    case 1:
                        a6 a6Var3 = y5Var.f40141a;
                        a6Var3.w0(true);
                        long j11 = a6Var3.M;
                        f6Var = ((org.telegram.ui.ActionBar.p2) a6Var3).resourceProvider;
                        gg.x.m(a6Var3, f6Var, j11, null);
                        gg.x.e.setOnHideListener(new x5(y5Var, 0));
                        return;
                    default:
                        a6 a6Var4 = y5Var.f40141a;
                        eg.v0 v0Var2 = new eg.v0(31, a6Var4.N, y5Var.getContext(), a6Var4, a6Var4.getResourceProvider());
                        v0Var2.F1(a6Var4.O, true);
                        v0Var2.H1(a6Var4.M);
                        a6Var4.showDialog(v0Var2);
                        return;
                }
            }
        });
        s1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final y5 f39276b;

            {
                this.f39276b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i10 = r2;
                y5 y5Var = this.f39276b;
                switch (i10) {
                    case 0:
                        a6 a6Var2 = y5Var.f40141a;
                        long j10 = a6Var2.M;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = a6Var2.P;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = a6Var2.O;
                        int i11 = eg.v0.S0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && a6Var2.getParentActivity() != null) {
                            eg.v0 v0Var = new eg.v0(19, a6Var2.getCurrentAccount(), a6Var2.getParentActivity(), a6Var2, a6Var2.getResourceProvider());
                            v0Var.G1(canApplyBoost);
                            v0Var.F1(tL_premium_boostsStatus, true);
                            v0Var.H1(j10);
                            v0Var.f5526d0 = null;
                            a6Var2.showDialog(v0Var);
                            return;
                        }
                        return;
                    case 1:
                        a6 a6Var3 = y5Var.f40141a;
                        a6Var3.w0(true);
                        long j11 = a6Var3.M;
                        f6Var = ((org.telegram.ui.ActionBar.p2) a6Var3).resourceProvider;
                        gg.x.m(a6Var3, f6Var, j11, null);
                        gg.x.e.setOnHideListener(new x5(y5Var, 0));
                        return;
                    default:
                        a6 a6Var4 = y5Var.f40141a;
                        eg.v0 v0Var2 = new eg.v0(31, a6Var4.N, y5Var.getContext(), a6Var4, a6Var4.getResourceProvider());
                        v0Var2.F1(a6Var4.O, true);
                        v0Var2.H1(a6Var4.M);
                        a6Var4.showDialog(v0Var2);
                        return;
                }
            }
        });
        s1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final y5 f39276b;

            {
                this.f39276b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i10 = r2;
                y5 y5Var = this.f39276b;
                switch (i10) {
                    case 0:
                        a6 a6Var2 = y5Var.f40141a;
                        long j10 = a6Var2.M;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = a6Var2.P;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = a6Var2.O;
                        int i11 = eg.v0.S0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && a6Var2.getParentActivity() != null) {
                            eg.v0 v0Var = new eg.v0(19, a6Var2.getCurrentAccount(), a6Var2.getParentActivity(), a6Var2, a6Var2.getResourceProvider());
                            v0Var.G1(canApplyBoost);
                            v0Var.F1(tL_premium_boostsStatus, true);
                            v0Var.H1(j10);
                            v0Var.f5526d0 = null;
                            a6Var2.showDialog(v0Var);
                            return;
                        }
                        return;
                    case 1:
                        a6 a6Var3 = y5Var.f40141a;
                        a6Var3.w0(true);
                        long j11 = a6Var3.M;
                        f6Var = ((org.telegram.ui.ActionBar.p2) a6Var3).resourceProvider;
                        gg.x.m(a6Var3, f6Var, j11, null);
                        gg.x.e.setOnHideListener(new x5(y5Var, 0));
                        return;
                    default:
                        a6 a6Var4 = y5Var.f40141a;
                        eg.v0 v0Var2 = new eg.v0(31, a6Var4.N, y5Var.getContext(), a6Var4, a6Var4.getResourceProvider());
                        v0Var2.F1(a6Var4.O, true);
                        v0Var2.H1(a6Var4.M);
                        a6Var4.showDialog(v0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(s1Var, k7.b6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(a6Var.N).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(a6Var.f32470d0)) {
            linearLayout.addView(s1Var2, k7.b6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(s1Var3, k7.b6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, k7.b6.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}

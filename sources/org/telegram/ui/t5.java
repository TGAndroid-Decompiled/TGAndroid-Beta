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
public final class t5 extends FrameLayout {
    public final w5 f37532a;

    public t5(w5 w5Var, Activity activity) {
        super(activity);
        this.f37532a = w5Var;
        setWillNotDraw(false);
        u5 u5Var = new u5(w5Var, getContext());
        u5 u5Var2 = new u5(w5Var, getContext());
        u5 u5Var3 = new u5(w5Var, getContext());
        u5Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        u5Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        u5Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        u5Var.setOnClickListener(new View.OnClickListener(this) {
            public final t5 f36694b;

            {
                this.f36694b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i10 = r2;
                t5 t5Var = this.f36694b;
                switch (i10) {
                    case 0:
                        w5 w5Var2 = t5Var.f37532a;
                        long j3 = w5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = w5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = w5Var2.R;
                        int i11 = rg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && w5Var2.getParentActivity() != null) {
                            rg.j0 j0Var = new rg.j0(19, w5Var2.getCurrentAccount(), w5Var2.getParentActivity(), w5Var2, w5Var2.getResourceProvider());
                            j0Var.G1(canApplyBoost);
                            j0Var.F1(tL_premium_boostsStatus, true);
                            j0Var.H1(j3);
                            j0Var.f42267g0 = null;
                            w5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        w5 w5Var3 = t5Var.f37532a;
                        w5Var3.w0(true);
                        long j10 = w5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.n2) w5Var3).resourceProvider;
                        tg.o.m(w5Var3, d6Var, j10, null);
                        tg.o.e.setOnHideListener(new s5(t5Var, 0));
                        return;
                    default:
                        w5 w5Var4 = t5Var.f37532a;
                        rg.j0 j0Var2 = new rg.j0(31, w5Var4.Q, t5Var.getContext(), w5Var4, w5Var4.getResourceProvider());
                        j0Var2.F1(w5Var4.R, true);
                        j0Var2.H1(w5Var4.P);
                        w5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        u5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final t5 f36694b;

            {
                this.f36694b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i10 = r2;
                t5 t5Var = this.f36694b;
                switch (i10) {
                    case 0:
                        w5 w5Var2 = t5Var.f37532a;
                        long j3 = w5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = w5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = w5Var2.R;
                        int i11 = rg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && w5Var2.getParentActivity() != null) {
                            rg.j0 j0Var = new rg.j0(19, w5Var2.getCurrentAccount(), w5Var2.getParentActivity(), w5Var2, w5Var2.getResourceProvider());
                            j0Var.G1(canApplyBoost);
                            j0Var.F1(tL_premium_boostsStatus, true);
                            j0Var.H1(j3);
                            j0Var.f42267g0 = null;
                            w5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        w5 w5Var3 = t5Var.f37532a;
                        w5Var3.w0(true);
                        long j10 = w5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.n2) w5Var3).resourceProvider;
                        tg.o.m(w5Var3, d6Var, j10, null);
                        tg.o.e.setOnHideListener(new s5(t5Var, 0));
                        return;
                    default:
                        w5 w5Var4 = t5Var.f37532a;
                        rg.j0 j0Var2 = new rg.j0(31, w5Var4.Q, t5Var.getContext(), w5Var4, w5Var4.getResourceProvider());
                        j0Var2.F1(w5Var4.R, true);
                        j0Var2.H1(w5Var4.P);
                        w5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        u5Var3.setOnClickListener(new View.OnClickListener(this) {
            public final t5 f36694b;

            {
                this.f36694b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i10 = r2;
                t5 t5Var = this.f36694b;
                switch (i10) {
                    case 0:
                        w5 w5Var2 = t5Var.f37532a;
                        long j3 = w5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = w5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = w5Var2.R;
                        int i11 = rg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && w5Var2.getParentActivity() != null) {
                            rg.j0 j0Var = new rg.j0(19, w5Var2.getCurrentAccount(), w5Var2.getParentActivity(), w5Var2, w5Var2.getResourceProvider());
                            j0Var.G1(canApplyBoost);
                            j0Var.F1(tL_premium_boostsStatus, true);
                            j0Var.H1(j3);
                            j0Var.f42267g0 = null;
                            w5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        w5 w5Var3 = t5Var.f37532a;
                        w5Var3.w0(true);
                        long j10 = w5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.n2) w5Var3).resourceProvider;
                        tg.o.m(w5Var3, d6Var, j10, null);
                        tg.o.e.setOnHideListener(new s5(t5Var, 0));
                        return;
                    default:
                        w5 w5Var4 = t5Var.f37532a;
                        rg.j0 j0Var2 = new rg.j0(31, w5Var4.Q, t5Var.getContext(), w5Var4, w5Var4.getResourceProvider());
                        j0Var2.F1(w5Var4.R, true);
                        j0Var2.H1(w5Var4.P);
                        w5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(u5Var, w7.x5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(w5Var.Q).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(w5Var.f38538g0)) {
            linearLayout.addView(u5Var2, w7.x5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(u5Var3, w7.x5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.x5.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}

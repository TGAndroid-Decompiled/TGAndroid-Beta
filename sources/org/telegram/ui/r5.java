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
public final class r5 extends FrameLayout {
    public final u5 f41354a;

    public r5(u5 u5Var, Activity activity) {
        super(activity);
        this.f41354a = u5Var;
        setWillNotDraw(false);
        s5 s5Var = new s5(u5Var, getContext());
        s5 s5Var2 = new s5(u5Var, getContext());
        s5 s5Var3 = new s5(u5Var, getContext());
        s5Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        s5Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        s5Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        s5Var.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f40782b;

            {
                this.f40782b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i10 = r2;
                r5 r5Var = this.f40782b;
                switch (i10) {
                    case 0:
                        u5 u5Var2 = r5Var.f41354a;
                        long j3 = u5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = u5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = u5Var2.R;
                        int i11 = rg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && u5Var2.getParentActivity() != null) {
                            rg.j0 j0Var = new rg.j0(19, u5Var2.getCurrentAccount(), u5Var2.getParentActivity(), u5Var2, u5Var2.getResourceProvider());
                            j0Var.H1(canApplyBoost);
                            j0Var.G1(tL_premium_boostsStatus, true);
                            j0Var.I1(j3);
                            j0Var.f47404g0 = null;
                            u5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        u5 u5Var3 = r5Var.f41354a;
                        u5Var3.x0(true);
                        long j10 = u5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.m2) u5Var3).resourceProvider;
                        tg.m.o(u5Var3, d6Var, j10, null);
                        tg.m.f48453e.setOnHideListener(new q5(r5Var, 0));
                        return;
                    default:
                        u5 u5Var4 = r5Var.f41354a;
                        rg.j0 j0Var2 = new rg.j0(31, u5Var4.Q, r5Var.getContext(), u5Var4, u5Var4.getResourceProvider());
                        j0Var2.G1(u5Var4.R, true);
                        j0Var2.I1(u5Var4.P);
                        u5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        s5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f40782b;

            {
                this.f40782b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i10 = r2;
                r5 r5Var = this.f40782b;
                switch (i10) {
                    case 0:
                        u5 u5Var2 = r5Var.f41354a;
                        long j3 = u5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = u5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = u5Var2.R;
                        int i11 = rg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && u5Var2.getParentActivity() != null) {
                            rg.j0 j0Var = new rg.j0(19, u5Var2.getCurrentAccount(), u5Var2.getParentActivity(), u5Var2, u5Var2.getResourceProvider());
                            j0Var.H1(canApplyBoost);
                            j0Var.G1(tL_premium_boostsStatus, true);
                            j0Var.I1(j3);
                            j0Var.f47404g0 = null;
                            u5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        u5 u5Var3 = r5Var.f41354a;
                        u5Var3.x0(true);
                        long j10 = u5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.m2) u5Var3).resourceProvider;
                        tg.m.o(u5Var3, d6Var, j10, null);
                        tg.m.f48453e.setOnHideListener(new q5(r5Var, 0));
                        return;
                    default:
                        u5 u5Var4 = r5Var.f41354a;
                        rg.j0 j0Var2 = new rg.j0(31, u5Var4.Q, r5Var.getContext(), u5Var4, u5Var4.getResourceProvider());
                        j0Var2.G1(u5Var4.R, true);
                        j0Var2.I1(u5Var4.P);
                        u5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        s5Var3.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f40782b;

            {
                this.f40782b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i10 = r2;
                r5 r5Var = this.f40782b;
                switch (i10) {
                    case 0:
                        u5 u5Var2 = r5Var.f41354a;
                        long j3 = u5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = u5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = u5Var2.R;
                        int i11 = rg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && u5Var2.getParentActivity() != null) {
                            rg.j0 j0Var = new rg.j0(19, u5Var2.getCurrentAccount(), u5Var2.getParentActivity(), u5Var2, u5Var2.getResourceProvider());
                            j0Var.H1(canApplyBoost);
                            j0Var.G1(tL_premium_boostsStatus, true);
                            j0Var.I1(j3);
                            j0Var.f47404g0 = null;
                            u5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        u5 u5Var3 = r5Var.f41354a;
                        u5Var3.x0(true);
                        long j10 = u5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.m2) u5Var3).resourceProvider;
                        tg.m.o(u5Var3, d6Var, j10, null);
                        tg.m.f48453e.setOnHideListener(new q5(r5Var, 0));
                        return;
                    default:
                        u5 u5Var4 = r5Var.f41354a;
                        rg.j0 j0Var2 = new rg.j0(31, u5Var4.Q, r5Var.getContext(), u5Var4, u5Var4.getResourceProvider());
                        j0Var2.G1(u5Var4.R, true);
                        j0Var2.I1(u5Var4.P);
                        u5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(s5Var, w7.x5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(u5Var.Q).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(u5Var.f42393g0)) {
            linearLayout.addView(s5Var2, w7.x5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(s5Var3, w7.x5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.x5.a(-2.0f, 0.0f, 19.0f, 0.0f, 0.0f, -2, 1));
    }
}

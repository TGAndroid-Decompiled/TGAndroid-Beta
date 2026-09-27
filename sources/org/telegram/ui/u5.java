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
public final class u5 extends FrameLayout {
    public final x5 f38125a;

    public u5(x5 x5Var, Activity activity) {
        super(activity);
        this.f38125a = x5Var;
        setWillNotDraw(false);
        v5 v5Var = new v5(x5Var, getContext());
        v5 v5Var2 = new v5(x5Var, getContext());
        v5 v5Var3 = new v5(x5Var, getContext());
        v5Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        v5Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        v5Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        v5Var.setOnClickListener(new View.OnClickListener(this) {
            public final u5 f37305b;

            {
                this.f37305b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i10 = r2;
                u5 u5Var = this.f37305b;
                switch (i10) {
                    case 0:
                        x5 x5Var2 = u5Var.f38125a;
                        long j3 = x5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = x5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = x5Var2.R;
                        int i11 = rg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && x5Var2.getParentActivity() != null) {
                            rg.j0 j0Var = new rg.j0(19, x5Var2.getCurrentAccount(), x5Var2.getParentActivity(), x5Var2, x5Var2.getResourceProvider());
                            j0Var.G1(canApplyBoost);
                            j0Var.F1(tL_premium_boostsStatus, true);
                            j0Var.H1(j3);
                            j0Var.f42645g0 = null;
                            x5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        x5 x5Var3 = u5Var.f38125a;
                        x5Var3.w0(true);
                        long j10 = x5Var3.P;
                        e6Var = ((org.telegram.ui.ActionBar.o2) x5Var3).resourceProvider;
                        tg.m.m(x5Var3, e6Var, j10, null);
                        tg.m.e.setOnHideListener(new t5(u5Var, 0));
                        return;
                    default:
                        x5 x5Var4 = u5Var.f38125a;
                        rg.j0 j0Var2 = new rg.j0(31, x5Var4.Q, u5Var.getContext(), x5Var4, x5Var4.getResourceProvider());
                        j0Var2.F1(x5Var4.R, true);
                        j0Var2.H1(x5Var4.P);
                        x5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        v5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final u5 f37305b;

            {
                this.f37305b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i10 = r2;
                u5 u5Var = this.f37305b;
                switch (i10) {
                    case 0:
                        x5 x5Var2 = u5Var.f38125a;
                        long j3 = x5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = x5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = x5Var2.R;
                        int i11 = rg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && x5Var2.getParentActivity() != null) {
                            rg.j0 j0Var = new rg.j0(19, x5Var2.getCurrentAccount(), x5Var2.getParentActivity(), x5Var2, x5Var2.getResourceProvider());
                            j0Var.G1(canApplyBoost);
                            j0Var.F1(tL_premium_boostsStatus, true);
                            j0Var.H1(j3);
                            j0Var.f42645g0 = null;
                            x5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        x5 x5Var3 = u5Var.f38125a;
                        x5Var3.w0(true);
                        long j10 = x5Var3.P;
                        e6Var = ((org.telegram.ui.ActionBar.o2) x5Var3).resourceProvider;
                        tg.m.m(x5Var3, e6Var, j10, null);
                        tg.m.e.setOnHideListener(new t5(u5Var, 0));
                        return;
                    default:
                        x5 x5Var4 = u5Var.f38125a;
                        rg.j0 j0Var2 = new rg.j0(31, x5Var4.Q, u5Var.getContext(), x5Var4, x5Var4.getResourceProvider());
                        j0Var2.F1(x5Var4.R, true);
                        j0Var2.H1(x5Var4.P);
                        x5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        v5Var3.setOnClickListener(new View.OnClickListener(this) {
            public final u5 f37305b;

            {
                this.f37305b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i10 = r2;
                u5 u5Var = this.f37305b;
                switch (i10) {
                    case 0:
                        x5 x5Var2 = u5Var.f38125a;
                        long j3 = x5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = x5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = x5Var2.R;
                        int i11 = rg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && x5Var2.getParentActivity() != null) {
                            rg.j0 j0Var = new rg.j0(19, x5Var2.getCurrentAccount(), x5Var2.getParentActivity(), x5Var2, x5Var2.getResourceProvider());
                            j0Var.G1(canApplyBoost);
                            j0Var.F1(tL_premium_boostsStatus, true);
                            j0Var.H1(j3);
                            j0Var.f42645g0 = null;
                            x5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        x5 x5Var3 = u5Var.f38125a;
                        x5Var3.w0(true);
                        long j10 = x5Var3.P;
                        e6Var = ((org.telegram.ui.ActionBar.o2) x5Var3).resourceProvider;
                        tg.m.m(x5Var3, e6Var, j10, null);
                        tg.m.e.setOnHideListener(new t5(u5Var, 0));
                        return;
                    default:
                        x5 x5Var4 = u5Var.f38125a;
                        rg.j0 j0Var2 = new rg.j0(31, x5Var4.Q, u5Var.getContext(), x5Var4, x5Var4.getResourceProvider());
                        j0Var2.F1(x5Var4.R, true);
                        j0Var2.H1(x5Var4.P);
                        x5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(v5Var, w7.y5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(x5Var.Q).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(x5Var.f39531g0)) {
            linearLayout.addView(v5Var2, w7.y5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(v5Var3, w7.y5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.y5.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}

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
public final class v5 extends FrameLayout {
    public final y5 f42672a;

    public v5(y5 y5Var, Activity activity) {
        super(activity);
        this.f42672a = y5Var;
        setWillNotDraw(false);
        w5 w5Var = new w5(y5Var, getContext());
        w5 w5Var2 = new w5(y5Var, getContext());
        w5 w5Var3 = new w5(y5Var, getContext());
        w5Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        w5Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        w5Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        w5Var.setOnClickListener(new View.OnClickListener(this) {
            public final v5 f42081b;

            {
                this.f42081b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.c6 c6Var;
                int i10 = r2;
                v5 v5Var = this.f42081b;
                switch (i10) {
                    case 0:
                        y5 y5Var2 = v5Var.f42672a;
                        long j3 = y5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = y5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var2.R;
                        int i11 = rg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && y5Var2.getParentActivity() != null) {
                            rg.j0 j0Var = new rg.j0(19, y5Var2.getCurrentAccount(), y5Var2.getParentActivity(), y5Var2, y5Var2.getResourceProvider());
                            j0Var.H1(canApplyBoost);
                            j0Var.G1(tL_premium_boostsStatus, true);
                            j0Var.I1(j3);
                            j0Var.f47494g0 = null;
                            y5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        y5 y5Var3 = v5Var.f42672a;
                        y5Var3.x0(true);
                        long j10 = y5Var3.P;
                        c6Var = ((org.telegram.ui.ActionBar.m2) y5Var3).resourceProvider;
                        tg.m.o(y5Var3, c6Var, j10, null);
                        tg.m.f48560e.setOnHideListener(new u5(v5Var, 0));
                        return;
                    default:
                        y5 y5Var4 = v5Var.f42672a;
                        rg.j0 j0Var2 = new rg.j0(31, y5Var4.Q, v5Var.getContext(), y5Var4, y5Var4.getResourceProvider());
                        j0Var2.G1(y5Var4.R, true);
                        j0Var2.I1(y5Var4.P);
                        y5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        w5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final v5 f42081b;

            {
                this.f42081b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.c6 c6Var;
                int i10 = r2;
                v5 v5Var = this.f42081b;
                switch (i10) {
                    case 0:
                        y5 y5Var2 = v5Var.f42672a;
                        long j3 = y5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = y5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var2.R;
                        int i11 = rg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && y5Var2.getParentActivity() != null) {
                            rg.j0 j0Var = new rg.j0(19, y5Var2.getCurrentAccount(), y5Var2.getParentActivity(), y5Var2, y5Var2.getResourceProvider());
                            j0Var.H1(canApplyBoost);
                            j0Var.G1(tL_premium_boostsStatus, true);
                            j0Var.I1(j3);
                            j0Var.f47494g0 = null;
                            y5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        y5 y5Var3 = v5Var.f42672a;
                        y5Var3.x0(true);
                        long j10 = y5Var3.P;
                        c6Var = ((org.telegram.ui.ActionBar.m2) y5Var3).resourceProvider;
                        tg.m.o(y5Var3, c6Var, j10, null);
                        tg.m.f48560e.setOnHideListener(new u5(v5Var, 0));
                        return;
                    default:
                        y5 y5Var4 = v5Var.f42672a;
                        rg.j0 j0Var2 = new rg.j0(31, y5Var4.Q, v5Var.getContext(), y5Var4, y5Var4.getResourceProvider());
                        j0Var2.G1(y5Var4.R, true);
                        j0Var2.I1(y5Var4.P);
                        y5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        w5Var3.setOnClickListener(new View.OnClickListener(this) {
            public final v5 f42081b;

            {
                this.f42081b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.c6 c6Var;
                int i10 = r2;
                v5 v5Var = this.f42081b;
                switch (i10) {
                    case 0:
                        y5 y5Var2 = v5Var.f42672a;
                        long j3 = y5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = y5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var2.R;
                        int i11 = rg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && y5Var2.getParentActivity() != null) {
                            rg.j0 j0Var = new rg.j0(19, y5Var2.getCurrentAccount(), y5Var2.getParentActivity(), y5Var2, y5Var2.getResourceProvider());
                            j0Var.H1(canApplyBoost);
                            j0Var.G1(tL_premium_boostsStatus, true);
                            j0Var.I1(j3);
                            j0Var.f47494g0 = null;
                            y5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        y5 y5Var3 = v5Var.f42672a;
                        y5Var3.x0(true);
                        long j10 = y5Var3.P;
                        c6Var = ((org.telegram.ui.ActionBar.m2) y5Var3).resourceProvider;
                        tg.m.o(y5Var3, c6Var, j10, null);
                        tg.m.f48560e.setOnHideListener(new u5(v5Var, 0));
                        return;
                    default:
                        y5 y5Var4 = v5Var.f42672a;
                        rg.j0 j0Var2 = new rg.j0(31, y5Var4.Q, v5Var.getContext(), y5Var4, y5Var4.getResourceProvider());
                        j0Var2.G1(y5Var4.R, true);
                        j0Var2.I1(y5Var4.P);
                        y5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(w5Var, w7.w5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(y5Var.Q).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(y5Var.f44301g0)) {
            linearLayout.addView(w5Var2, w7.w5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(w5Var3, w7.w5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.w5.a(-2.0f, 0.0f, 19.0f, 0.0f, 0.0f, -2, 1));
    }
}

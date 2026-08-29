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
    public final v5 f42551a;

    public t5(v5 v5Var, Activity activity) {
        super(activity);
        this.f42551a = v5Var;
        setWillNotDraw(false);
        bg.u1 u1Var = new bg.u1(v5Var, getContext());
        bg.u1 u1Var2 = new bg.u1(v5Var, getContext());
        bg.u1 u1Var3 = new bg.u1(v5Var, getContext());
        u1Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        u1Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        u1Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        u1Var.setOnClickListener(new View.OnClickListener(this) {
            public final t5 f41866b;

            {
                this.f41866b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.c6 c6Var;
                int i10 = r2;
                t5 t5Var = this.f41866b;
                switch (i10) {
                    case 0:
                        v5 v5Var2 = t5Var.f42551a;
                        long j10 = v5Var2.L;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.O;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.N;
                        int i11 = cg.v0.R0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            cg.v0 v0Var = new cg.v0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            v0Var.G1(canApplyBoost);
                            v0Var.F1(tL_premium_boostsStatus, true);
                            v0Var.H1(j10);
                            v0Var.f3403c0 = null;
                            v5Var2.showDialog(v0Var);
                            return;
                        }
                        return;
                    case 1:
                        v5 v5Var3 = t5Var.f42551a;
                        v5Var3.w0(true);
                        long j11 = v5Var3.L;
                        c6Var = ((org.telegram.ui.ActionBar.o2) v5Var3).resourceProvider;
                        eg.y.m(v5Var3, c6Var, j11, null);
                        eg.y.f6190e.setOnHideListener(new s5(t5Var, 0));
                        return;
                    default:
                        v5 v5Var4 = t5Var.f42551a;
                        cg.v0 v0Var2 = new cg.v0(31, v5Var4.M, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        v0Var2.F1(v5Var4.N, true);
                        v0Var2.H1(v5Var4.L);
                        v5Var4.showDialog(v0Var2);
                        return;
                }
            }
        });
        u1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final t5 f41866b;

            {
                this.f41866b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.c6 c6Var;
                int i10 = r2;
                t5 t5Var = this.f41866b;
                switch (i10) {
                    case 0:
                        v5 v5Var2 = t5Var.f42551a;
                        long j10 = v5Var2.L;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.O;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.N;
                        int i11 = cg.v0.R0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            cg.v0 v0Var = new cg.v0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            v0Var.G1(canApplyBoost);
                            v0Var.F1(tL_premium_boostsStatus, true);
                            v0Var.H1(j10);
                            v0Var.f3403c0 = null;
                            v5Var2.showDialog(v0Var);
                            return;
                        }
                        return;
                    case 1:
                        v5 v5Var3 = t5Var.f42551a;
                        v5Var3.w0(true);
                        long j11 = v5Var3.L;
                        c6Var = ((org.telegram.ui.ActionBar.o2) v5Var3).resourceProvider;
                        eg.y.m(v5Var3, c6Var, j11, null);
                        eg.y.f6190e.setOnHideListener(new s5(t5Var, 0));
                        return;
                    default:
                        v5 v5Var4 = t5Var.f42551a;
                        cg.v0 v0Var2 = new cg.v0(31, v5Var4.M, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        v0Var2.F1(v5Var4.N, true);
                        v0Var2.H1(v5Var4.L);
                        v5Var4.showDialog(v0Var2);
                        return;
                }
            }
        });
        u1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final t5 f41866b;

            {
                this.f41866b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.c6 c6Var;
                int i10 = r2;
                t5 t5Var = this.f41866b;
                switch (i10) {
                    case 0:
                        v5 v5Var2 = t5Var.f42551a;
                        long j10 = v5Var2.L;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.O;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.N;
                        int i11 = cg.v0.R0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            cg.v0 v0Var = new cg.v0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            v0Var.G1(canApplyBoost);
                            v0Var.F1(tL_premium_boostsStatus, true);
                            v0Var.H1(j10);
                            v0Var.f3403c0 = null;
                            v5Var2.showDialog(v0Var);
                            return;
                        }
                        return;
                    case 1:
                        v5 v5Var3 = t5Var.f42551a;
                        v5Var3.w0(true);
                        long j11 = v5Var3.L;
                        c6Var = ((org.telegram.ui.ActionBar.o2) v5Var3).resourceProvider;
                        eg.y.m(v5Var3, c6Var, j11, null);
                        eg.y.f6190e.setOnHideListener(new s5(t5Var, 0));
                        return;
                    default:
                        v5 v5Var4 = t5Var.f42551a;
                        cg.v0 v0Var2 = new cg.v0(31, v5Var4.M, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        v0Var2.F1(v5Var4.N, true);
                        v0Var2.H1(v5Var4.L);
                        v5Var4.showDialog(v0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(u1Var, i7.f6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(v5Var.M).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(v5Var.f43428c0)) {
            linearLayout.addView(u1Var2, i7.f6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(u1Var3, i7.f6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, i7.f6.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}

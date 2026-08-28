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
public final class s5 extends FrameLayout {
    public final u5 f42562a;

    public s5(u5 u5Var, Activity activity) {
        super(activity);
        this.f42562a = u5Var;
        setWillNotDraw(false);
        bh.g gVar = new bh.g(u5Var, getContext());
        bh.g gVar2 = new bh.g(u5Var, getContext());
        bh.g gVar3 = new bh.g(u5Var, getContext());
        gVar.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        gVar2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        gVar3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        gVar.setOnClickListener(new View.OnClickListener(this) {
            public final s5 f41679b;

            {
                this.f41679b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.b6 b6Var;
                int i9 = r2;
                s5 s5Var = this.f41679b;
                switch (i9) {
                    case 0:
                        u5 u5Var2 = s5Var.f42562a;
                        long j10 = u5Var2.L;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = u5Var2.O;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = u5Var2.N;
                        int i10 = zf.j0.R0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && u5Var2.getParentActivity() != null) {
                            zf.j0 j0Var = new zf.j0(19, u5Var2.getCurrentAccount(), u5Var2.getParentActivity(), u5Var2, u5Var2.getResourceProvider());
                            j0Var.G1(canApplyBoost);
                            j0Var.F1(tL_premium_boostsStatus, true);
                            j0Var.H1(j10);
                            j0Var.f50534c0 = null;
                            u5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        u5 u5Var3 = s5Var.f42562a;
                        u5Var3.v0(true);
                        long j11 = u5Var3.L;
                        b6Var = ((org.telegram.ui.ActionBar.o2) u5Var3).resourceProvider;
                        bg.a0.m(u5Var3, b6Var, j11, null);
                        bg.a0.f1690e.setOnHideListener(new r5(s5Var, 0));
                        return;
                    default:
                        u5 u5Var4 = s5Var.f42562a;
                        zf.j0 j0Var2 = new zf.j0(31, u5Var4.M, s5Var.getContext(), u5Var4, u5Var4.getResourceProvider());
                        j0Var2.F1(u5Var4.N, true);
                        j0Var2.H1(u5Var4.L);
                        u5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        gVar2.setOnClickListener(new View.OnClickListener(this) {
            public final s5 f41679b;

            {
                this.f41679b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.b6 b6Var;
                int i9 = r2;
                s5 s5Var = this.f41679b;
                switch (i9) {
                    case 0:
                        u5 u5Var2 = s5Var.f42562a;
                        long j10 = u5Var2.L;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = u5Var2.O;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = u5Var2.N;
                        int i10 = zf.j0.R0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && u5Var2.getParentActivity() != null) {
                            zf.j0 j0Var = new zf.j0(19, u5Var2.getCurrentAccount(), u5Var2.getParentActivity(), u5Var2, u5Var2.getResourceProvider());
                            j0Var.G1(canApplyBoost);
                            j0Var.F1(tL_premium_boostsStatus, true);
                            j0Var.H1(j10);
                            j0Var.f50534c0 = null;
                            u5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        u5 u5Var3 = s5Var.f42562a;
                        u5Var3.v0(true);
                        long j11 = u5Var3.L;
                        b6Var = ((org.telegram.ui.ActionBar.o2) u5Var3).resourceProvider;
                        bg.a0.m(u5Var3, b6Var, j11, null);
                        bg.a0.f1690e.setOnHideListener(new r5(s5Var, 0));
                        return;
                    default:
                        u5 u5Var4 = s5Var.f42562a;
                        zf.j0 j0Var2 = new zf.j0(31, u5Var4.M, s5Var.getContext(), u5Var4, u5Var4.getResourceProvider());
                        j0Var2.F1(u5Var4.N, true);
                        j0Var2.H1(u5Var4.L);
                        u5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        gVar3.setOnClickListener(new View.OnClickListener(this) {
            public final s5 f41679b;

            {
                this.f41679b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.b6 b6Var;
                int i9 = r2;
                s5 s5Var = this.f41679b;
                switch (i9) {
                    case 0:
                        u5 u5Var2 = s5Var.f42562a;
                        long j10 = u5Var2.L;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = u5Var2.O;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = u5Var2.N;
                        int i10 = zf.j0.R0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && u5Var2.getParentActivity() != null) {
                            zf.j0 j0Var = new zf.j0(19, u5Var2.getCurrentAccount(), u5Var2.getParentActivity(), u5Var2, u5Var2.getResourceProvider());
                            j0Var.G1(canApplyBoost);
                            j0Var.F1(tL_premium_boostsStatus, true);
                            j0Var.H1(j10);
                            j0Var.f50534c0 = null;
                            u5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        u5 u5Var3 = s5Var.f42562a;
                        u5Var3.v0(true);
                        long j11 = u5Var3.L;
                        b6Var = ((org.telegram.ui.ActionBar.o2) u5Var3).resourceProvider;
                        bg.a0.m(u5Var3, b6Var, j11, null);
                        bg.a0.f1690e.setOnHideListener(new r5(s5Var, 0));
                        return;
                    default:
                        u5 u5Var4 = s5Var.f42562a;
                        zf.j0 j0Var2 = new zf.j0(31, u5Var4.M, s5Var.getContext(), u5Var4, u5Var4.getResourceProvider());
                        j0Var2.F1(u5Var4.N, true);
                        j0Var2.H1(u5Var4.L);
                        u5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(gVar, g7.e6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(u5Var.M).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(u5Var.f43130c0)) {
            linearLayout.addView(gVar2, g7.e6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(gVar3, g7.e6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, g7.e6.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}

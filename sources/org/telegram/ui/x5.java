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
public final class x5 extends FrameLayout {
    public final z5 f42979a;

    public x5(z5 z5Var, Activity activity) {
        super(activity);
        this.f42979a = z5Var;
        setWillNotDraw(false);
        ai.n5 n5Var = new ai.n5(z5Var, getContext());
        ai.n5 n5Var2 = new ai.n5(z5Var, getContext());
        ai.n5 n5Var3 = new ai.n5(z5Var, getContext());
        n5Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        n5Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        n5Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        n5Var.setOnClickListener(new View.OnClickListener(this) {
            public final x5 f42097b;

            {
                this.f42097b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i10 = r2;
                x5 x5Var = this.f42097b;
                switch (i10) {
                    case 0:
                        z5 z5Var2 = x5Var.f42979a;
                        long j10 = z5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = z5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var2.R;
                        int i11 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            k0Var.H1(canApplyBoost);
                            k0Var.G1(tL_premium_boostsStatus, true);
                            k0Var.I1(j10);
                            k0Var.f46285g0 = null;
                            z5Var2.showDialog(k0Var);
                            return;
                        }
                        return;
                    case 1:
                        z5 z5Var3 = x5Var.f42979a;
                        z5Var3.x0(true);
                        long j11 = z5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.n2) z5Var3).resourceProvider;
                        ug.m.n(z5Var3, d6Var, j11, null);
                        ug.m.e.setOnHideListener(new w5(x5Var, 0));
                        return;
                    default:
                        z5 z5Var4 = x5Var.f42979a;
                        sg.k0 k0Var2 = new sg.k0(31, z5Var4.Q, x5Var.getContext(), z5Var4, z5Var4.getResourceProvider());
                        k0Var2.G1(z5Var4.R, true);
                        k0Var2.I1(z5Var4.P);
                        z5Var4.showDialog(k0Var2);
                        return;
                }
            }
        });
        n5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final x5 f42097b;

            {
                this.f42097b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i10 = r2;
                x5 x5Var = this.f42097b;
                switch (i10) {
                    case 0:
                        z5 z5Var2 = x5Var.f42979a;
                        long j10 = z5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = z5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var2.R;
                        int i11 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            k0Var.H1(canApplyBoost);
                            k0Var.G1(tL_premium_boostsStatus, true);
                            k0Var.I1(j10);
                            k0Var.f46285g0 = null;
                            z5Var2.showDialog(k0Var);
                            return;
                        }
                        return;
                    case 1:
                        z5 z5Var3 = x5Var.f42979a;
                        z5Var3.x0(true);
                        long j11 = z5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.n2) z5Var3).resourceProvider;
                        ug.m.n(z5Var3, d6Var, j11, null);
                        ug.m.e.setOnHideListener(new w5(x5Var, 0));
                        return;
                    default:
                        z5 z5Var4 = x5Var.f42979a;
                        sg.k0 k0Var2 = new sg.k0(31, z5Var4.Q, x5Var.getContext(), z5Var4, z5Var4.getResourceProvider());
                        k0Var2.G1(z5Var4.R, true);
                        k0Var2.I1(z5Var4.P);
                        z5Var4.showDialog(k0Var2);
                        return;
                }
            }
        });
        n5Var3.setOnClickListener(new View.OnClickListener(this) {
            public final x5 f42097b;

            {
                this.f42097b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i10 = r2;
                x5 x5Var = this.f42097b;
                switch (i10) {
                    case 0:
                        z5 z5Var2 = x5Var.f42979a;
                        long j10 = z5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = z5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var2.R;
                        int i11 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            k0Var.H1(canApplyBoost);
                            k0Var.G1(tL_premium_boostsStatus, true);
                            k0Var.I1(j10);
                            k0Var.f46285g0 = null;
                            z5Var2.showDialog(k0Var);
                            return;
                        }
                        return;
                    case 1:
                        z5 z5Var3 = x5Var.f42979a;
                        z5Var3.x0(true);
                        long j11 = z5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.n2) z5Var3).resourceProvider;
                        ug.m.n(z5Var3, d6Var, j11, null);
                        ug.m.e.setOnHideListener(new w5(x5Var, 0));
                        return;
                    default:
                        z5 z5Var4 = x5Var.f42979a;
                        sg.k0 k0Var2 = new sg.k0(31, z5Var4.Q, x5Var.getContext(), z5Var4, z5Var4.getResourceProvider());
                        k0Var2.G1(z5Var4.R, true);
                        k0Var2.I1(z5Var4.P);
                        z5Var4.showDialog(k0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(n5Var, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(z5Var.Q).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(z5Var.f43558g0)) {
            linearLayout.addView(n5Var2, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(n5Var3, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.z5.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}

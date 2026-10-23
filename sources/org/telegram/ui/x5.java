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
    public final z5 f43042a;

    public x5(z5 z5Var, Activity activity) {
        super(activity);
        this.f43042a = z5Var;
        setWillNotDraw(false);
        ai.o5 o5Var = new ai.o5(z5Var, getContext());
        ai.o5 o5Var2 = new ai.o5(z5Var, getContext());
        ai.o5 o5Var3 = new ai.o5(z5Var, getContext());
        o5Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        o5Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        o5Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        o5Var.setOnClickListener(new View.OnClickListener(this) {
            public final x5 f42115b;

            {
                this.f42115b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i10 = r2;
                x5 x5Var = this.f42115b;
                switch (i10) {
                    case 0:
                        z5 z5Var2 = x5Var.f43042a;
                        long j10 = z5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = z5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var2.R;
                        int i11 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            k0Var.H1(canApplyBoost);
                            k0Var.G1(tL_premium_boostsStatus, true);
                            k0Var.I1(j10);
                            k0Var.f46296g0 = null;
                            z5Var2.showDialog(k0Var);
                            return;
                        }
                        return;
                    case 1:
                        z5 z5Var3 = x5Var.f43042a;
                        z5Var3.x0(true);
                        long j11 = z5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.n2) z5Var3).resourceProvider;
                        ug.m.n(z5Var3, d6Var, j11, null);
                        ug.m.e.setOnHideListener(new w5(x5Var, 0));
                        return;
                    default:
                        z5 z5Var4 = x5Var.f43042a;
                        sg.k0 k0Var2 = new sg.k0(31, z5Var4.Q, x5Var.getContext(), z5Var4, z5Var4.getResourceProvider());
                        k0Var2.G1(z5Var4.R, true);
                        k0Var2.I1(z5Var4.P);
                        z5Var4.showDialog(k0Var2);
                        return;
                }
            }
        });
        o5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final x5 f42115b;

            {
                this.f42115b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i10 = r2;
                x5 x5Var = this.f42115b;
                switch (i10) {
                    case 0:
                        z5 z5Var2 = x5Var.f43042a;
                        long j10 = z5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = z5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var2.R;
                        int i11 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            k0Var.H1(canApplyBoost);
                            k0Var.G1(tL_premium_boostsStatus, true);
                            k0Var.I1(j10);
                            k0Var.f46296g0 = null;
                            z5Var2.showDialog(k0Var);
                            return;
                        }
                        return;
                    case 1:
                        z5 z5Var3 = x5Var.f43042a;
                        z5Var3.x0(true);
                        long j11 = z5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.n2) z5Var3).resourceProvider;
                        ug.m.n(z5Var3, d6Var, j11, null);
                        ug.m.e.setOnHideListener(new w5(x5Var, 0));
                        return;
                    default:
                        z5 z5Var4 = x5Var.f43042a;
                        sg.k0 k0Var2 = new sg.k0(31, z5Var4.Q, x5Var.getContext(), z5Var4, z5Var4.getResourceProvider());
                        k0Var2.G1(z5Var4.R, true);
                        k0Var2.I1(z5Var4.P);
                        z5Var4.showDialog(k0Var2);
                        return;
                }
            }
        });
        o5Var3.setOnClickListener(new View.OnClickListener(this) {
            public final x5 f42115b;

            {
                this.f42115b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i10 = r2;
                x5 x5Var = this.f42115b;
                switch (i10) {
                    case 0:
                        z5 z5Var2 = x5Var.f43042a;
                        long j10 = z5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = z5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var2.R;
                        int i11 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            k0Var.H1(canApplyBoost);
                            k0Var.G1(tL_premium_boostsStatus, true);
                            k0Var.I1(j10);
                            k0Var.f46296g0 = null;
                            z5Var2.showDialog(k0Var);
                            return;
                        }
                        return;
                    case 1:
                        z5 z5Var3 = x5Var.f43042a;
                        z5Var3.x0(true);
                        long j11 = z5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.n2) z5Var3).resourceProvider;
                        ug.m.n(z5Var3, d6Var, j11, null);
                        ug.m.e.setOnHideListener(new w5(x5Var, 0));
                        return;
                    default:
                        z5 z5Var4 = x5Var.f43042a;
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
        linearLayout.addView(o5Var, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(z5Var.Q).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(z5Var.f43641g0)) {
            linearLayout.addView(o5Var2, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(o5Var3, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.z5.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}

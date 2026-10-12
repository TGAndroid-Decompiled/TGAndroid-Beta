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
    public final z5 f41153a;

    public w5(z5 z5Var, Activity activity) {
        super(activity);
        this.f41153a = z5Var;
        setWillNotDraw(false);
        x5 x5Var = new x5(z5Var, getContext());
        x5 x5Var2 = new x5(z5Var, getContext());
        x5 x5Var3 = new x5(z5Var, getContext());
        x5Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        x5Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        x5Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        x5Var.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f40539b;

            {
                this.f40539b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.c6 c6Var;
                int i10 = r2;
                w5 w5Var = this.f40539b;
                switch (i10) {
                    case 0:
                        z5 z5Var2 = w5Var.f41153a;
                        long j10 = z5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = z5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var2.R;
                        int i11 = sg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.j0 j0Var = new sg.j0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            j0Var.H1(canApplyBoost);
                            j0Var.G1(tL_premium_boostsStatus, true);
                            j0Var.I1(j10);
                            j0Var.f45209g0 = null;
                            z5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        z5 z5Var3 = w5Var.f41153a;
                        z5Var3.x0(true);
                        long j11 = z5Var3.P;
                        c6Var = ((org.telegram.ui.ActionBar.m2) z5Var3).resourceProvider;
                        ug.n.n(z5Var3, c6Var, j11, null);
                        ug.n.e.setOnHideListener(new v5(w5Var, 0));
                        return;
                    default:
                        z5 z5Var4 = w5Var.f41153a;
                        sg.j0 j0Var2 = new sg.j0(31, z5Var4.Q, w5Var.getContext(), z5Var4, z5Var4.getResourceProvider());
                        j0Var2.G1(z5Var4.R, true);
                        j0Var2.I1(z5Var4.P);
                        z5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        x5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f40539b;

            {
                this.f40539b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.c6 c6Var;
                int i10 = r2;
                w5 w5Var = this.f40539b;
                switch (i10) {
                    case 0:
                        z5 z5Var2 = w5Var.f41153a;
                        long j10 = z5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = z5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var2.R;
                        int i11 = sg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.j0 j0Var = new sg.j0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            j0Var.H1(canApplyBoost);
                            j0Var.G1(tL_premium_boostsStatus, true);
                            j0Var.I1(j10);
                            j0Var.f45209g0 = null;
                            z5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        z5 z5Var3 = w5Var.f41153a;
                        z5Var3.x0(true);
                        long j11 = z5Var3.P;
                        c6Var = ((org.telegram.ui.ActionBar.m2) z5Var3).resourceProvider;
                        ug.n.n(z5Var3, c6Var, j11, null);
                        ug.n.e.setOnHideListener(new v5(w5Var, 0));
                        return;
                    default:
                        z5 z5Var4 = w5Var.f41153a;
                        sg.j0 j0Var2 = new sg.j0(31, z5Var4.Q, w5Var.getContext(), z5Var4, z5Var4.getResourceProvider());
                        j0Var2.G1(z5Var4.R, true);
                        j0Var2.I1(z5Var4.P);
                        z5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        x5Var3.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f40539b;

            {
                this.f40539b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.c6 c6Var;
                int i10 = r2;
                w5 w5Var = this.f40539b;
                switch (i10) {
                    case 0:
                        z5 z5Var2 = w5Var.f41153a;
                        long j10 = z5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = z5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var2.R;
                        int i11 = sg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.j0 j0Var = new sg.j0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            j0Var.H1(canApplyBoost);
                            j0Var.G1(tL_premium_boostsStatus, true);
                            j0Var.I1(j10);
                            j0Var.f45209g0 = null;
                            z5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        z5 z5Var3 = w5Var.f41153a;
                        z5Var3.x0(true);
                        long j11 = z5Var3.P;
                        c6Var = ((org.telegram.ui.ActionBar.m2) z5Var3).resourceProvider;
                        ug.n.n(z5Var3, c6Var, j11, null);
                        ug.n.e.setOnHideListener(new v5(w5Var, 0));
                        return;
                    default:
                        z5 z5Var4 = w5Var.f41153a;
                        sg.j0 j0Var2 = new sg.j0(31, z5Var4.Q, w5Var.getContext(), z5Var4, z5Var4.getResourceProvider());
                        j0Var2.G1(z5Var4.R, true);
                        j0Var2.I1(z5Var4.P);
                        z5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(x5Var, w7.a6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(z5Var.Q).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(z5Var.f42485g0)) {
            linearLayout.addView(x5Var2, w7.a6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(x5Var3, w7.a6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.a6.a(-2.0f, 0.0f, 19.0f, 0.0f, 0.0f, -2, 1));
    }
}

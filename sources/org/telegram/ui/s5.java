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
    public final v5 f40301a;

    public s5(v5 v5Var, Activity activity) {
        super(activity);
        this.f40301a = v5Var;
        setWillNotDraw(false);
        t5 t5Var = new t5(v5Var, getContext());
        t5 t5Var2 = new t5(v5Var, getContext());
        t5 t5Var3 = new t5(v5Var, getContext());
        t5Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        t5Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        t5Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        t5Var.setOnClickListener(new View.OnClickListener(this) {
            public final s5 f39730b;

            {
                this.f39730b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i10 = r2;
                s5 s5Var = this.f39730b;
                switch (i10) {
                    case 0:
                        v5 v5Var2 = s5Var.f40301a;
                        long j3 = v5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.R;
                        int i11 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            k0Var.G1(canApplyBoost);
                            k0Var.F1(tL_premium_boostsStatus, true);
                            k0Var.H1(j3);
                            k0Var.f46136g0 = null;
                            v5Var2.showDialog(k0Var);
                            return;
                        }
                        return;
                    case 1:
                        v5 v5Var3 = s5Var.f40301a;
                        v5Var3.w0(true);
                        long j10 = v5Var3.P;
                        f6Var = ((org.telegram.ui.ActionBar.n2) v5Var3).resourceProvider;
                        ug.n.m(v5Var3, f6Var, j10, null);
                        ug.n.f47153e.setOnHideListener(new r5(s5Var, 0));
                        return;
                    default:
                        v5 v5Var4 = s5Var.f40301a;
                        sg.k0 k0Var2 = new sg.k0(31, v5Var4.Q, s5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        k0Var2.F1(v5Var4.R, true);
                        k0Var2.H1(v5Var4.P);
                        v5Var4.showDialog(k0Var2);
                        return;
                }
            }
        });
        t5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final s5 f39730b;

            {
                this.f39730b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i10 = r2;
                s5 s5Var = this.f39730b;
                switch (i10) {
                    case 0:
                        v5 v5Var2 = s5Var.f40301a;
                        long j3 = v5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.R;
                        int i11 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            k0Var.G1(canApplyBoost);
                            k0Var.F1(tL_premium_boostsStatus, true);
                            k0Var.H1(j3);
                            k0Var.f46136g0 = null;
                            v5Var2.showDialog(k0Var);
                            return;
                        }
                        return;
                    case 1:
                        v5 v5Var3 = s5Var.f40301a;
                        v5Var3.w0(true);
                        long j10 = v5Var3.P;
                        f6Var = ((org.telegram.ui.ActionBar.n2) v5Var3).resourceProvider;
                        ug.n.m(v5Var3, f6Var, j10, null);
                        ug.n.f47153e.setOnHideListener(new r5(s5Var, 0));
                        return;
                    default:
                        v5 v5Var4 = s5Var.f40301a;
                        sg.k0 k0Var2 = new sg.k0(31, v5Var4.Q, s5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        k0Var2.F1(v5Var4.R, true);
                        k0Var2.H1(v5Var4.P);
                        v5Var4.showDialog(k0Var2);
                        return;
                }
            }
        });
        t5Var3.setOnClickListener(new View.OnClickListener(this) {
            public final s5 f39730b;

            {
                this.f39730b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i10 = r2;
                s5 s5Var = this.f39730b;
                switch (i10) {
                    case 0:
                        v5 v5Var2 = s5Var.f40301a;
                        long j3 = v5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.R;
                        int i11 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            k0Var.G1(canApplyBoost);
                            k0Var.F1(tL_premium_boostsStatus, true);
                            k0Var.H1(j3);
                            k0Var.f46136g0 = null;
                            v5Var2.showDialog(k0Var);
                            return;
                        }
                        return;
                    case 1:
                        v5 v5Var3 = s5Var.f40301a;
                        v5Var3.w0(true);
                        long j10 = v5Var3.P;
                        f6Var = ((org.telegram.ui.ActionBar.n2) v5Var3).resourceProvider;
                        ug.n.m(v5Var3, f6Var, j10, null);
                        ug.n.f47153e.setOnHideListener(new r5(s5Var, 0));
                        return;
                    default:
                        v5 v5Var4 = s5Var.f40301a;
                        sg.k0 k0Var2 = new sg.k0(31, v5Var4.Q, s5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        k0Var2.F1(v5Var4.R, true);
                        k0Var2.H1(v5Var4.P);
                        v5Var4.showDialog(k0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(t5Var, w7.x5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(v5Var.Q).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(v5Var.f41418g0)) {
            linearLayout.addView(t5Var2, w7.x5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(t5Var3, w7.x5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.x5.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}

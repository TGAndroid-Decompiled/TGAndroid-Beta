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

    public final v5 f42783a;

    public t5(v5 v5Var, Activity activity) {
        super(activity);
        this.f42783a = v5Var;
        setWillNotDraw(false);
        ag.w wVar = new ag.w(v5Var, getContext());
        ag.w wVar2 = new ag.w(v5Var, getContext());
        ag.w wVar3 = new ag.w(v5Var, getContext());
        wVar.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        wVar2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        wVar3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        final int i10 = 0;
        wVar.setOnClickListener(new View.OnClickListener(this) {

            public final t5 f41808b;

            {
                this.f41808b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = i10;
                t5 t5Var = this.f41808b;
                switch (i11) {
                    case 0:
                        v5 v5Var2 = t5Var.f42783a;
                        long j10 = v5Var2.L;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.O;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.N;
                        int i12 = ag.i1.R0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            ag.i1 i1Var = new ag.i1(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            i1Var.G1(canApplyBoost);
                            i1Var.F1(tL_premium_boostsStatus, true);
                            i1Var.H1(j10);
                            i1Var.f431c0 = null;
                            v5Var2.showDialog(i1Var);
                            break;
                        }
                        break;
                    case 1:
                        v5 v5Var3 = t5Var.f42783a;
                        v5Var3.w0(true);
                        cg.x.m(v5Var3, ((org.telegram.ui.ActionBar.n2) v5Var3).resourceProvider, v5Var3.L, null);
                        cg.x.f2850e.setOnHideListener(new s5(t5Var, 0));
                        break;
                    default:
                        v5 v5Var4 = t5Var.f42783a;
                        ag.i1 i1Var2 = new ag.i1(31, v5Var4.M, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        i1Var2.F1(v5Var4.N, true);
                        i1Var2.H1(v5Var4.L);
                        v5Var4.showDialog(i1Var2);
                        break;
                }
            }
        });
        final int i11 = 1;
        wVar2.setOnClickListener(new View.OnClickListener(this) {

            public final t5 f41808b;

            {
                this.f41808b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = i11;
                t5 t5Var = this.f41808b;
                switch (i12) {
                    case 0:
                        v5 v5Var2 = t5Var.f42783a;
                        long j10 = v5Var2.L;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.O;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.N;
                        int i13 = ag.i1.R0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            ag.i1 i1Var = new ag.i1(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            i1Var.G1(canApplyBoost);
                            i1Var.F1(tL_premium_boostsStatus, true);
                            i1Var.H1(j10);
                            i1Var.f431c0 = null;
                            v5Var2.showDialog(i1Var);
                            break;
                        }
                        break;
                    case 1:
                        v5 v5Var3 = t5Var.f42783a;
                        v5Var3.w0(true);
                        cg.x.m(v5Var3, ((org.telegram.ui.ActionBar.n2) v5Var3).resourceProvider, v5Var3.L, null);
                        cg.x.f2850e.setOnHideListener(new s5(t5Var, 0));
                        break;
                    default:
                        v5 v5Var4 = t5Var.f42783a;
                        ag.i1 i1Var2 = new ag.i1(31, v5Var4.M, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        i1Var2.F1(v5Var4.N, true);
                        i1Var2.H1(v5Var4.L);
                        v5Var4.showDialog(i1Var2);
                        break;
                }
            }
        });
        final int i12 = 2;
        wVar3.setOnClickListener(new View.OnClickListener(this) {

            public final t5 f41808b;

            {
                this.f41808b = this;
            }

            @Override
            public final void onClick(View view) {
                int i13 = i12;
                t5 t5Var = this.f41808b;
                switch (i13) {
                    case 0:
                        v5 v5Var2 = t5Var.f42783a;
                        long j10 = v5Var2.L;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.O;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.N;
                        int i14 = ag.i1.R0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            ag.i1 i1Var = new ag.i1(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            i1Var.G1(canApplyBoost);
                            i1Var.F1(tL_premium_boostsStatus, true);
                            i1Var.H1(j10);
                            i1Var.f431c0 = null;
                            v5Var2.showDialog(i1Var);
                            break;
                        }
                        break;
                    case 1:
                        v5 v5Var3 = t5Var.f42783a;
                        v5Var3.w0(true);
                        cg.x.m(v5Var3, ((org.telegram.ui.ActionBar.n2) v5Var3).resourceProvider, v5Var3.L, null);
                        cg.x.f2850e.setOnHideListener(new s5(t5Var, 0));
                        break;
                    default:
                        v5 v5Var4 = t5Var.f42783a;
                        ag.i1 i1Var2 = new ag.i1(31, v5Var4.M, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        i1Var2.F1(v5Var4.N, true);
                        i1Var2.H1(v5Var4.L);
                        v5Var4.showDialog(i1Var2);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(wVar, h7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(v5Var.M).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(v5Var.f43357c0)) {
            linearLayout.addView(wVar2, h7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(wVar3, h7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, h7.z5.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}

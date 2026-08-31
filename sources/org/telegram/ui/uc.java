package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class uc extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ro0 f41880a;
    public final tc f41881b;
    public final org.telegram.ui.ActionBar.l5 f41882c;
    public final TextView d;
    public final TextView f41883e;
    public final LinearLayout f41884f;
    public final bd h;

    public uc(bd bdVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var2;
        float f10;
        float f11;
        int i11;
        int i12;
        this.h = bdVar;
        Context context = getContext();
        g6Var = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
        ro0 ro0Var = new ro0(context, g6Var);
        this.f41880a = ro0Var;
        ro0Var.setProgressToGradient(1.0f);
        ro0Var.B = true;
        addView(ro0Var, k7.c6.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
        long j10 = bdVar.f35420a;
        g6Var2 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
        tc tcVar = new tc(this, context2, i10, j10, g6Var2);
        this.f41881b = tcVar;
        boolean z4 = bdVar.d;
        if (z4) {
            f10 = 230.0f;
        } else {
            f10 = 190.0f;
        }
        if (z4) {
            f11 = 24.0f;
        } else {
            f11 = 0.0f;
        }
        addView(tcVar, k7.c6.d(-1, f10, 80, 0.0f, 0.0f, 0.0f, f11));
        if (bdVar instanceof n60) {
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
            this.f41882c = l5Var;
            l5Var.setGravity(19);
            int i13 = org.telegram.ui.ActionBar.k6.A8;
            l5Var.setTextColor(bdVar.getThemedColor(i13));
            l5Var.setTypeface(AndroidUtilities.bold());
            l5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            l5Var.setAlpha(0.0f);
            a();
            addView(l5Var, k7.c6.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f41884f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.l1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(tcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.f41883e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (bdVar.d && bdVar.f35444s == -1) {
                i11 = bdVar.getThemedColor(i13);
            } else {
                i11 = -1;
            }
            textView2.setTextColor(i11);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bdVar.f35424c;
            if (tL_premium_boostsStatus != null) {
                i12 = tL_premium_boostsStatus.boosts;
            } else {
                i12 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i12, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, k7.c6.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, k7.c6.e(-1, -2, 80));
        }
    }

    public final void a() {
        boolean z4;
        int i10;
        float f10;
        int i11 = 0;
        if (getResources().getConfiguration().orientation == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!AndroidUtilities.isTablet() && z4) {
            i10 = 18;
        } else {
            i10 = 20;
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.f41882c;
        l5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f10 = -2.0f;
        } else {
            if (z4) {
                i11 = 4;
            }
            f10 = i11;
        }
        l5Var.setTranslationY(AndroidUtilities.dp(f10));
    }

    @Override
    public final void e() {
        int themedColor;
        org.telegram.ui.ActionBar.l5 l5Var = this.f41882c;
        if (l5Var != null) {
            bd bdVar = this.h;
            int i10 = -1;
            if (bdVar.d && bdVar.f35444s != -1) {
                themedColor = -1;
            } else {
                themedColor = bdVar.getThemedColor(org.telegram.ui.ActionBar.k6.A8);
            }
            l5Var.setTextColor(themedColor);
            if (bdVar.d && bdVar.f35444s == -1) {
                i10 = bdVar.getThemedColor(org.telegram.ui.ActionBar.k6.A8);
            }
            this.f41883e.setTextColor(i10);
        }
    }

    public int[] getColorKeys() {
        return null;
    }
}

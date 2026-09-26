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
public final class tc extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final zo0 f38043a;
    public final sc f38044b;
    public final org.telegram.ui.ActionBar.h5 f38045c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f38046f;
    public final ad h;

    public tc(ad adVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var2;
        float f7;
        float f10;
        int i11;
        int i12;
        this.h = adVar;
        Context context = getContext();
        d6Var = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
        zo0 zo0Var = new zo0(context, d6Var);
        this.f38043a = zo0Var;
        zo0Var.setProgressToGradient(1.0f);
        zo0Var.F = true;
        addView(zo0Var, w7.y5.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
        long j3 = adVar.f32099a;
        d6Var2 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
        sc scVar = new sc(this, context2, i10, j3, d6Var2);
        this.f38044b = scVar;
        boolean z10 = adVar.d;
        if (z10) {
            f7 = 230.0f;
        } else {
            f7 = 190.0f;
        }
        if (z10) {
            f10 = 24.0f;
        } else {
            f10 = 0.0f;
        }
        addView(scVar, w7.y5.d(-1, f7, 80, 0.0f, 0.0f, 0.0f, f10));
        if (adVar instanceof n60) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.f38045c = h5Var;
            h5Var.setGravity(19);
            int i13 = org.telegram.ui.ActionBar.h6.A8;
            h5Var.setTextColor(adVar.getThemedColor(i13));
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            h5Var.setAlpha(0.0f);
            a();
            addView(h5Var, w7.y5.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f38046f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.l1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(scVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (adVar.d && adVar.f32122s == -1) {
                i11 = adVar.getThemedColor(i13);
            } else {
                i11 = -1;
            }
            textView2.setTextColor(i11);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = adVar.f32103c;
            if (tL_premium_boostsStatus != null) {
                i12 = tL_premium_boostsStatus.boosts;
            } else {
                i12 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i12, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, w7.y5.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, w7.y5.e(-1, -2, 80));
        }
    }

    public final void a() {
        boolean z10;
        int i10;
        float f7;
        int i11 = 0;
        if (getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!AndroidUtilities.isTablet() && z10) {
            i10 = 18;
        } else {
            i10 = 20;
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f38045c;
        h5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f7 = -2.0f;
        } else {
            if (z10) {
                i11 = 4;
            }
            f7 = i11;
        }
        h5Var.setTranslationY(AndroidUtilities.dp(f7));
    }

    @Override
    public final void e() {
        int themedColor;
        org.telegram.ui.ActionBar.h5 h5Var = this.f38045c;
        if (h5Var != null) {
            ad adVar = this.h;
            int i10 = -1;
            if (adVar.d && adVar.f32122s != -1) {
                themedColor = -1;
            } else {
                themedColor = adVar.getThemedColor(org.telegram.ui.ActionBar.h6.A8);
            }
            h5Var.setTextColor(themedColor);
            if (adVar.d && adVar.f32122s == -1) {
                i10 = adVar.getThemedColor(org.telegram.ui.ActionBar.h6.A8);
            }
            this.e.setTextColor(i10);
        }
    }

    public int[] getColorKeys() {
        return null;
    }
}

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
public final class vc extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final ip0 f38387a;
    public final uc f38388b;
    public final org.telegram.ui.ActionBar.k5 f38389c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f38390f;
    public final cd h;

    public vc(cd cdVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        float f7;
        float f10;
        int i11;
        int i12;
        this.h = cdVar;
        Context context = getContext();
        f6Var = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
        ip0 ip0Var = new ip0(context, f6Var);
        this.f38387a = ip0Var;
        ip0Var.setProgressToGradient(1.0f);
        ip0Var.F = true;
        addView(ip0Var, w7.x5.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.o2) cdVar).currentAccount;
        long j3 = cdVar.f32728a;
        f6Var2 = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
        uc ucVar = new uc(this, context2, i10, j3, f6Var2);
        this.f38388b = ucVar;
        boolean z10 = cdVar.d;
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
        addView(ucVar, w7.x5.d(-1, f7, 80, 0.0f, 0.0f, 0.0f, f10));
        if (cdVar instanceof u60) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
            this.f38389c = k5Var;
            k5Var.setGravity(19);
            int i13 = org.telegram.ui.ActionBar.j6.A8;
            k5Var.setTextColor(cdVar.getThemedColor(i13));
            k5Var.setTypeface(AndroidUtilities.bold());
            k5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            k5Var.setAlpha(0.0f);
            a();
            addView(k5Var, w7.x5.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f38390f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.l1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(ucVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (cdVar.d && cdVar.f32751s == -1) {
                i11 = cdVar.getThemedColor(i13);
            } else {
                i11 = -1;
            }
            textView2.setTextColor(i11);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = cdVar.f32732c;
            if (tL_premium_boostsStatus != null) {
                i12 = tL_premium_boostsStatus.boosts;
            } else {
                i12 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i12, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, w7.x5.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, w7.x5.e(-1, -2, 80));
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
        org.telegram.ui.ActionBar.k5 k5Var = this.f38389c;
        k5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f7 = -2.0f;
        } else {
            if (z10) {
                i11 = 4;
            }
            f7 = i11;
        }
        k5Var.setTranslationY(AndroidUtilities.dp(f7));
    }

    @Override
    public final void e() {
        int themedColor;
        org.telegram.ui.ActionBar.k5 k5Var = this.f38389c;
        if (k5Var != null) {
            cd cdVar = this.h;
            int i10 = -1;
            if (cdVar.d && cdVar.f32751s != -1) {
                themedColor = -1;
            } else {
                themedColor = cdVar.getThemedColor(org.telegram.ui.ActionBar.j6.A8);
            }
            k5Var.setTextColor(themedColor);
            if (cdVar.d && cdVar.f32751s == -1) {
                i10 = cdVar.getThemedColor(org.telegram.ui.ActionBar.j6.A8);
            }
            this.e.setTextColor(i10);
        }
    }

    public int[] getColorKeys() {
        return null;
    }
}

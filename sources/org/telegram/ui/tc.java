package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class tc extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final qo0 f41989a;
    public final sc f41990b;
    public final org.telegram.ui.ActionBar.n5 f41991c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f41992f;
    public final bd h;

    public tc(bd bdVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var2;
        float f7;
        float f10;
        int i11;
        int i12;
        this.h = bdVar;
        Context context = getContext();
        g6Var = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
        qo0 qo0Var = new qo0(context, g6Var);
        this.f41989a = qo0Var;
        qo0Var.setProgressToGradient(1.0f);
        qo0Var.F = true;
        addView(qo0Var, w7.z5.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
        long j10 = bdVar.f36015a;
        g6Var2 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
        sc scVar = new sc(this, context2, i10, j10, g6Var2);
        this.f41990b = scVar;
        boolean z10 = bdVar.d;
        if (z10) {
            f7 = 230.0f;
        } else {
            f7 = 190.0f;
        }
        float f11 = f7;
        if (z10) {
            f10 = 24.0f;
        } else {
            f10 = 0.0f;
        }
        addView(scVar, w7.z5.d(-1, f11, 80, 0.0f, 0.0f, 0.0f, f10));
        if (bdVar instanceof d60) {
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
            this.f41991c = n5Var;
            n5Var.setGravity(19);
            int i13 = org.telegram.ui.ActionBar.k6.A8;
            n5Var.setTextColor(bdVar.getThemedColor(i13));
            n5Var.setTypeface(AndroidUtilities.bold());
            n5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            n5Var.setAlpha(0.0f);
            a();
            addView(n5Var, w7.z5.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f41992f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.o1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(scVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (bdVar.d && bdVar.f36038s == -1) {
                i11 = bdVar.getThemedColor(i13);
            } else {
                i11 = -1;
            }
            textView2.setTextColor(i11);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bdVar.f36019c;
            if (tL_premium_boostsStatus != null) {
                i12 = tL_premium_boostsStatus.boosts;
            } else {
                i12 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i12, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, w7.z5.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, w7.z5.e(-1, -2, 80));
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
        org.telegram.ui.ActionBar.n5 n5Var = this.f41991c;
        n5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f7 = -2.0f;
        } else {
            if (z10) {
                i11 = 4;
            }
            f7 = i11;
        }
        n5Var.setTranslationY(AndroidUtilities.dp(f7));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
    }

    @Override
    public final void updateColors() {
        int themedColor;
        org.telegram.ui.ActionBar.n5 n5Var = this.f41991c;
        if (n5Var != null) {
            bd bdVar = this.h;
            int i10 = -1;
            if (bdVar.d && bdVar.f36038s != -1) {
                themedColor = -1;
            } else {
                themedColor = bdVar.getThemedColor(org.telegram.ui.ActionBar.k6.A8);
            }
            n5Var.setTextColor(themedColor);
            if (bdVar.d && bdVar.f36038s == -1) {
                i10 = bdVar.getThemedColor(org.telegram.ui.ActionBar.k6.A8);
            }
            this.e.setTextColor(i10);
        }
    }
}

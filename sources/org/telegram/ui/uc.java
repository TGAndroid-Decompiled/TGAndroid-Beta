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
public final class uc extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final hp0 f41058a;
    public final tc f41059b;
    public final org.telegram.ui.ActionBar.j5 f41060c;
    public final TextView d;
    public final TextView f41061e;
    public final LinearLayout f41062f;
    public final bd h;

    public uc(bd bdVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        float f7;
        float f10;
        int i11;
        int i12;
        this.h = bdVar;
        Context context = getContext();
        f6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
        hp0 hp0Var = new hp0(context, f6Var);
        this.f41058a = hp0Var;
        hp0Var.setProgressToGradient(1.0f);
        hp0Var.F = true;
        addView(hp0Var, w7.x5.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
        long j3 = bdVar.f34734a;
        f6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
        tc tcVar = new tc(this, context2, i10, j3, f6Var2);
        this.f41059b = tcVar;
        boolean z10 = bdVar.d;
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
        addView(tcVar, w7.x5.d(-1, f7, 80, 0.0f, 0.0f, 0.0f, f10));
        if (bdVar instanceof t60) {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
            this.f41060c = j5Var;
            j5Var.setGravity(19);
            int i13 = org.telegram.ui.ActionBar.j6.A8;
            j5Var.setTextColor(bdVar.getThemedColor(i13));
            j5Var.setTypeface(AndroidUtilities.bold());
            j5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            j5Var.setAlpha(0.0f);
            a();
            addView(j5Var, w7.x5.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f41062f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.l1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(tcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.f41061e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (bdVar.d && bdVar.f34758s == -1) {
                i11 = bdVar.getThemedColor(i13);
            } else {
                i11 = -1;
            }
            textView2.setTextColor(i11);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bdVar.f34738c;
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
        org.telegram.ui.ActionBar.j5 j5Var = this.f41060c;
        j5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f7 = -2.0f;
        } else {
            if (z10) {
                i11 = 4;
            }
            f7 = i11;
        }
        j5Var.setTranslationY(AndroidUtilities.dp(f7));
    }

    @Override
    public final void d() {
        int themedColor;
        org.telegram.ui.ActionBar.j5 j5Var = this.f41060c;
        if (j5Var != null) {
            bd bdVar = this.h;
            int i10 = -1;
            if (bdVar.d && bdVar.f34758s != -1) {
                themedColor = -1;
            } else {
                themedColor = bdVar.getThemedColor(org.telegram.ui.ActionBar.j6.A8);
            }
            j5Var.setTextColor(themedColor);
            if (bdVar.d && bdVar.f34758s == -1) {
                i10 = bdVar.getThemedColor(org.telegram.ui.ActionBar.j6.A8);
            }
            this.f41061e.setTextColor(i10);
        }
    }

    public int[] getColorKeys() {
        return null;
    }
}

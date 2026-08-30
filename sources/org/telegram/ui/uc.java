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
public final class uc extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final po0 f38902a;
    public final tc f38903b;
    public final org.telegram.ui.ActionBar.k5 f38904c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f38905f;
    public final bd h;

    public uc(bd bdVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        float f10;
        float f11;
        int i11;
        int i12;
        this.h = bdVar;
        Context context = getContext();
        f6Var = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
        po0 po0Var = new po0(context, f6Var);
        this.f38902a = po0Var;
        po0Var.setProgressToGradient(1.0f);
        po0Var.B = true;
        addView(po0Var, k7.b6.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
        long j10 = bdVar.f32910a;
        f6Var2 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
        tc tcVar = new tc(this, context2, i10, j10, f6Var2);
        this.f38903b = tcVar;
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
        addView(tcVar, k7.b6.d(-1, f10, 80, 0.0f, 0.0f, 0.0f, f11));
        if (bdVar instanceof m60) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
            this.f38904c = k5Var;
            k5Var.setGravity(19);
            int i13 = org.telegram.ui.ActionBar.j6.A8;
            k5Var.setTextColor(bdVar.getThemedColor(i13));
            k5Var.setTypeface(AndroidUtilities.bold());
            k5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            k5Var.setAlpha(0.0f);
            a();
            addView(k5Var, k7.b6.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f38905f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.l1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(tcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (bdVar.d && bdVar.f32933s == -1) {
                i11 = bdVar.getThemedColor(i13);
            } else {
                i11 = -1;
            }
            textView2.setTextColor(i11);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bdVar.f32914c;
            if (tL_premium_boostsStatus != null) {
                i12 = tL_premium_boostsStatus.boosts;
            } else {
                i12 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i12, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, k7.b6.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, k7.b6.e(-1, -2, 80));
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
        org.telegram.ui.ActionBar.k5 k5Var = this.f38904c;
        k5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f10 = -2.0f;
        } else {
            if (z4) {
                i11 = 4;
            }
            f10 = i11;
        }
        k5Var.setTranslationY(AndroidUtilities.dp(f10));
    }

    @Override
    public final void e() {
        int themedColor;
        org.telegram.ui.ActionBar.k5 k5Var = this.f38904c;
        if (k5Var != null) {
            bd bdVar = this.h;
            int i10 = -1;
            if (bdVar.d && bdVar.f32933s != -1) {
                themedColor = -1;
            } else {
                themedColor = bdVar.getThemedColor(org.telegram.ui.ActionBar.j6.A8);
            }
            k5Var.setTextColor(themedColor);
            if (bdVar.d && bdVar.f32933s == -1) {
                i10 = bdVar.getThemedColor(org.telegram.ui.ActionBar.j6.A8);
            }
            this.e.setTextColor(i10);
        }
    }

    public int[] getColorKeys() {
        return null;
    }
}

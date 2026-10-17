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
public final class vc extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final po0 f42169a;
    public final uc f42170b;
    public final org.telegram.ui.ActionBar.j5 f42171c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f42172f;
    public final dd h;

    public vc(dd ddVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var2;
        float f7;
        float f10;
        int i11;
        int i12;
        this.h = ddVar;
        Context context = getContext();
        d6Var = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
        po0 po0Var = new po0(context, d6Var);
        this.f42169a = po0Var;
        po0Var.setProgressToGradient(1.0f);
        po0Var.F = true;
        addView(po0Var, w7.z5.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
        long j10 = ddVar.f36136a;
        d6Var2 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
        uc ucVar = new uc(this, context2, i10, j10, d6Var2);
        this.f42170b = ucVar;
        boolean z10 = ddVar.d;
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
        addView(ucVar, w7.z5.a(f11, 0.0f, 0.0f, 0.0f, f10, -1, 80));
        if (ddVar instanceof b60) {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
            this.f42171c = j5Var;
            j5Var.setGravity(19);
            int i13 = org.telegram.ui.ActionBar.h6.A8;
            j5Var.setTextColor(ddVar.getThemedColor(i13));
            j5Var.setTypeface(AndroidUtilities.bold());
            j5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            j5Var.setAlpha(0.0f);
            a();
            addView(j5Var, w7.z5.a(-2.0f, 72.0f, 0.0f, 0.0f, 16.0f, -1, 80));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f42172f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.h6.h0(org.telegram.ui.ActionBar.h6.m1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(ucVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (ddVar.d && ddVar.f36159s == -1) {
                i11 = ddVar.getThemedColor(i13);
            } else {
                i11 = -1;
            }
            textView2.setTextColor(i11);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ddVar.f36140c;
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
        org.telegram.ui.ActionBar.j5 j5Var = this.f42171c;
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
        org.telegram.ui.ActionBar.j5 j5Var = this.f42171c;
        if (j5Var != null) {
            dd ddVar = this.h;
            int i10 = -1;
            if (ddVar.d && ddVar.f36159s != -1) {
                themedColor = -1;
            } else {
                themedColor = ddVar.getThemedColor(org.telegram.ui.ActionBar.h6.A8);
            }
            j5Var.setTextColor(themedColor);
            if (ddVar.d && ddVar.f36159s == -1) {
                i10 = ddVar.getThemedColor(org.telegram.ui.ActionBar.h6.A8);
            }
            this.e.setTextColor(i10);
        }
    }

    public int[] getColorKeys() {
        return null;
    }
}

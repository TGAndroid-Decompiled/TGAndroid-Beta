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
public final class yc extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final ip0 f44449a;
    public final xc f44450b;
    public final org.telegram.ui.ActionBar.h5 f44451c;
    public final TextView d;
    public final TextView f44452e;
    public final LinearLayout f44453f;
    public final fd h;

    public yc(fd fdVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var2;
        float f7;
        float f10;
        int i11;
        int i12;
        this.h = fdVar;
        Context context = getContext();
        c6Var = ((org.telegram.ui.ActionBar.m2) fdVar).resourceProvider;
        ip0 ip0Var = new ip0(context, c6Var);
        this.f44449a = ip0Var;
        ip0Var.setProgressToGradient(1.0f);
        ip0Var.F = true;
        addView(ip0Var, w7.w5.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.m2) fdVar).currentAccount;
        long j3 = fdVar.f37724a;
        c6Var2 = ((org.telegram.ui.ActionBar.m2) fdVar).resourceProvider;
        xc xcVar = new xc(this, context2, i10, j3, c6Var2);
        this.f44450b = xcVar;
        boolean z10 = fdVar.d;
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
        addView(xcVar, w7.w5.a(f11, 0.0f, 0.0f, 0.0f, f10, -1, 80));
        if (fdVar instanceof s60) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.f44451c = h5Var;
            h5Var.setGravity(19);
            int i13 = org.telegram.ui.ActionBar.h6.A8;
            h5Var.setTextColor(fdVar.getThemedColor(i13));
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            h5Var.setAlpha(0.0f);
            a();
            addView(h5Var, w7.w5.a(-2.0f, 72.0f, 0.0f, 0.0f, 16.0f, -1, 80));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f44453f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.h6.h0(org.telegram.ui.ActionBar.h6.m1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(xcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.f44452e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (fdVar.d && fdVar.f37748s == -1) {
                i11 = fdVar.getThemedColor(i13);
            } else {
                i11 = -1;
            }
            textView2.setTextColor(i11);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = fdVar.f37728c;
            if (tL_premium_boostsStatus != null) {
                i12 = tL_premium_boostsStatus.boosts;
            } else {
                i12 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i12, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, w7.w5.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, w7.w5.e(-1, -2, 80));
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
        org.telegram.ui.ActionBar.h5 h5Var = this.f44451c;
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
        org.telegram.ui.ActionBar.h5 h5Var = this.f44451c;
        if (h5Var != null) {
            fd fdVar = this.h;
            int i10 = -1;
            if (fdVar.d && fdVar.f37748s != -1) {
                themedColor = -1;
            } else {
                themedColor = fdVar.getThemedColor(org.telegram.ui.ActionBar.h6.A8);
            }
            h5Var.setTextColor(themedColor);
            if (fdVar.d && fdVar.f37748s == -1) {
                i10 = fdVar.getThemedColor(org.telegram.ui.ActionBar.h6.A8);
            }
            this.f44452e.setTextColor(i10);
        }
    }

    public int[] getColorKeys() {
        return null;
    }
}

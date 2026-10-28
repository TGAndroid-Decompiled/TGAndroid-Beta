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
public final class uc extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final zo0 f43981a;
    public final tc f43982b;
    public final org.telegram.ui.ActionBar.b6 f43983c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f43984f;
    public final bd h;

    public uc(bd bdVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.u6 u6Var;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var2;
        float f7;
        float f10;
        int i11;
        int i12;
        this.h = bdVar;
        Context context = getContext();
        u6Var = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
        zo0 zo0Var = new zo0(context, u6Var);
        this.f43981a = zo0Var;
        zo0Var.setProgressToGradient(1.0f);
        zo0Var.F = true;
        addView(zo0Var, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
        long j10 = bdVar.f37977a;
        u6Var2 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
        tc tcVar = new tc(this, context2, i10, j10, u6Var2);
        this.f43982b = tcVar;
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
        addView(tcVar, org.telegram.ui.Components.kb1.h(-1, f11, 80, 0.0f, 0.0f, 0.0f, f10));
        if (bdVar instanceof g60) {
            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(getContext());
            this.f43983c = b6Var;
            b6Var.setGravity(19);
            int i13 = org.telegram.ui.ActionBar.y6.A8;
            b6Var.setTextColor(bdVar.getThemedColor(i13));
            b6Var.setTypeface(AndroidUtilities.bold());
            b6Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            b6Var.setAlpha(0.0f);
            a();
            addView(b6Var, org.telegram.ui.Components.kb1.h(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f43984f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.y6.h0(org.telegram.ui.ActionBar.y6.o1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(tcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (bdVar.d && bdVar.f38000s == -1) {
                i11 = bdVar.getThemedColor(i13);
            } else {
                i11 = -1;
            }
            textView2.setTextColor(i11);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bdVar.f37981c;
            if (tL_premium_boostsStatus != null) {
                i12 = tL_premium_boostsStatus.boosts;
            } else {
                i12 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i12, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, org.telegram.ui.Components.kb1.o(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, org.telegram.ui.Components.kb1.i(-1, -2, 80));
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
        org.telegram.ui.ActionBar.b6 b6Var = this.f43983c;
        b6Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f7 = -2.0f;
        } else {
            if (z10) {
                i11 = 4;
            }
            f7 = i11;
        }
        b6Var.setTranslationY(AndroidUtilities.dp(f7));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
    }

    @Override
    public final void updateColors() {
        int themedColor;
        org.telegram.ui.ActionBar.b6 b6Var = this.f43983c;
        if (b6Var != null) {
            bd bdVar = this.h;
            int i10 = -1;
            if (bdVar.d && bdVar.f38000s != -1) {
                themedColor = -1;
            } else {
                themedColor = bdVar.getThemedColor(org.telegram.ui.ActionBar.y6.A8);
            }
            b6Var.setTextColor(themedColor);
            if (bdVar.d && bdVar.f38000s == -1) {
                i10 = bdVar.getThemedColor(org.telegram.ui.ActionBar.y6.A8);
            }
            this.e.setTextColor(i10);
        }
    }
}

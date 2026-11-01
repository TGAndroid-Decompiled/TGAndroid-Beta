package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;
public final class sc extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final ym0 f41337a;
    public final rc f41338b;
    public final org.telegram.ui.ActionBar.u5 f41339c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f41340f;
    public final zc h;

    public sc(zc zcVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.p6 p6Var;
        int i10;
        org.telegram.ui.ActionBar.p6 p6Var2;
        float f7;
        float f10;
        int i11;
        int i12;
        this.h = zcVar;
        Context context = getContext();
        p6Var = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
        ym0 ym0Var = new ym0(context, p6Var);
        this.f41337a = ym0Var;
        ym0Var.setProgressToGradient(1.0f);
        ym0Var.F = true;
        addView(ym0Var, w7.b6.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
        long j10 = zcVar.f43889a;
        p6Var2 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
        rc rcVar = new rc(this, context2, i10, j10, p6Var2);
        this.f41338b = rcVar;
        boolean z10 = zcVar.d;
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
        addView(rcVar, w7.b6.d(-1, f11, 80, 0.0f, 0.0f, 0.0f, f10));
        if (zcVar instanceof h50) {
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(getContext());
            this.f41339c = u5Var;
            u5Var.setGravity(19);
            int i13 = org.telegram.ui.ActionBar.t6.A8;
            u5Var.setTextColor(zcVar.getThemedColor(i13));
            u5Var.setTypeface(org.telegram.messenger.i0.o());
            u5Var.l(org.telegram.messenger.dd.L0(2131752551, null), false);
            u5Var.setAlpha(0.0f);
            a();
            addView(u5Var, w7.b6.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f41340f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.t6.i0(org.telegram.ui.ActionBar.t6.r1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(rcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (zcVar.d && zcVar.f43912s == -1) {
                i11 = zcVar.getThemedColor(i13);
            } else {
                i11 = -1;
            }
            textView2.setTextColor(i11);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = zcVar.f43893c;
            if (tL_premium_boostsStatus != null) {
                i12 = tL_premium_boostsStatus.boosts;
            } else {
                i12 = 0;
            }
            textView.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(i12, "BoostingGroupBoostCount", new Object[0])));
            textView2.setText(org.telegram.messenger.dd.L0(2131753353, null));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, w7.b6.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, w7.b6.e(-1, -2, 80));
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
        if (!org.telegram.messenger.i0.Q1() && z10) {
            i10 = 18;
        } else {
            i10 = 20;
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.f41339c;
        u5Var.setTextSize(i10);
        if (org.telegram.messenger.i0.Q1()) {
            f7 = -2.0f;
        } else {
            if (z10) {
                i11 = 4;
            }
            f7 = i11;
        }
        u5Var.setTranslationY(org.telegram.messenger.i0.L(f7));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
    }

    @Override
    public final void updateColors() {
        int themedColor;
        org.telegram.ui.ActionBar.u5 u5Var = this.f41339c;
        if (u5Var != null) {
            zc zcVar = this.h;
            int i10 = -1;
            if (zcVar.d && zcVar.f43912s != -1) {
                themedColor = -1;
            } else {
                themedColor = zcVar.getThemedColor(org.telegram.ui.ActionBar.t6.A8);
            }
            u5Var.setTextColor(themedColor);
            if (zcVar.d && zcVar.f43912s == -1) {
                i10 = zcVar.getThemedColor(org.telegram.ui.ActionBar.t6.A8);
            }
            this.e.setTextColor(i10);
        }
    }
}

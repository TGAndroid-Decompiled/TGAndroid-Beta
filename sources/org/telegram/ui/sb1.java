package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;
public final class sb1 implements org.telegram.ui.Components.ml0 {
    public final int f40431a;
    public final Object f40432b;
    public final Object f40433c;
    public final Object d;

    public sb1(Object obj, Object obj2, Object obj3, int i10) {
        this.f40431a = i10;
        this.f40432b = obj;
        this.f40433c = obj2;
        this.d = obj3;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.ActionBar.h6 A0;
        Interpolator interpolator;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11 = this.f40431a;
        Object obj = this.d;
        Object obj2 = this.f40433c;
        Object obj3 = this.f40432b;
        switch (i11) {
            case 0:
                bc1 bc1Var = (bc1) obj2;
                xb1 xb1Var = (xb1) obj;
                ThemeActivity themeActivity = ((zb1) obj3).f43742e;
                int i12 = themeActivity.f34548f;
                if (i12 == 1) {
                    A0 = org.telegram.ui.ActionBar.i6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.i6.A0();
                }
                org.telegram.ui.ActionBar.h6 h6Var = A0;
                if (i10 == bc1Var.h() - 1) {
                    interpolator = null;
                    if (i12 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new pd1(h6Var, false, 1, false, z13));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) bc1Var.f35117e.get(i10);
                    if (!TextUtils.isEmpty(f6Var.f20632o) && f6Var.f20620a != org.telegram.ui.ActionBar.i6.f21006n) {
                        org.telegram.ui.ActionBar.c6.a(false);
                    }
                    int i13 = h6Var.Y;
                    int i14 = f6Var.f20620a;
                    if (i13 != i14) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i15 = NotificationCenter.needSetDayNightTheme;
                        if (i12 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i15, h6Var, Boolean.valueOf(z12), null, Integer.valueOf(f6Var.f20620a));
                        org.telegram.ui.ActionBar.c4.q(h6Var, f6Var.f20620a);
                        org.telegram.ui.ActionBar.i6.F1(themeActivity);
                    } else {
                        if (i14 >= 100) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i12 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        themeActivity.presentFragment(new pd1(h6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i16 = left - dp;
                if (i16 < 0) {
                    xb1Var.w0(i16, 0, interpolator);
                } else {
                    int i17 = right + dp;
                    if (i17 > xb1Var.getMeasuredWidth()) {
                        xb1Var.w0(i17 - xb1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = xb1Var.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = xb1Var.getChildAt(i18);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                p11.T((p11) obj3, (Context) obj2, (String) obj, view, i10);
                return;
        }
    }
}

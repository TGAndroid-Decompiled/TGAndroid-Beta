package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;
public final class ub1 implements org.telegram.ui.Components.ml0 {
    public final int f41140a;
    public final Object f41141b;
    public final Object f41142c;
    public final Object d;

    public ub1(Object obj, Object obj2, Object obj3, int i10) {
        this.f41140a = i10;
        this.f41141b = obj;
        this.f41142c = obj2;
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
        int i11 = this.f41140a;
        Object obj = this.d;
        Object obj2 = this.f41142c;
        Object obj3 = this.f41141b;
        switch (i11) {
            case 0:
                dc1 dc1Var = (dc1) obj2;
                zb1 zb1Var = (zb1) obj;
                ThemeActivity themeActivity = ((bc1) obj3).f35059e;
                int i12 = themeActivity.f34529f;
                if (i12 == 1) {
                    A0 = org.telegram.ui.ActionBar.i6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.i6.A0();
                }
                org.telegram.ui.ActionBar.h6 h6Var = A0;
                if (i10 == dc1Var.h() - 1) {
                    interpolator = null;
                    if (i12 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new rd1(h6Var, false, 1, false, z13));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) dc1Var.f35742e.get(i10);
                    if (!TextUtils.isEmpty(f6Var.f20623o) && f6Var.f20611a != org.telegram.ui.ActionBar.i6.f20997n) {
                        org.telegram.ui.ActionBar.c6.a(false);
                    }
                    int i13 = h6Var.Y;
                    int i14 = f6Var.f20611a;
                    if (i13 != i14) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i15 = NotificationCenter.needSetDayNightTheme;
                        if (i12 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i15, h6Var, Boolean.valueOf(z12), null, Integer.valueOf(f6Var.f20611a));
                        org.telegram.ui.ActionBar.c4.q(h6Var, f6Var.f20611a);
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
                        themeActivity.presentFragment(new rd1(h6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i16 = left - dp;
                if (i16 < 0) {
                    zb1Var.w0(i16, 0, interpolator);
                } else {
                    int i17 = right + dp;
                    if (i17 > zb1Var.getMeasuredWidth()) {
                        zb1Var.w0(i17 - zb1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = zb1Var.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = zb1Var.getChildAt(i18);
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

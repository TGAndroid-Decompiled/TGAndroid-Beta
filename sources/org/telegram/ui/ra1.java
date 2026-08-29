package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;
public final class ra1 implements org.telegram.ui.Components.zk0 {
    public final int f42021a;
    public final Object f42022b;
    public final Object f42023c;
    public final Object d;

    public ra1(Object obj, Object obj2, Object obj3, int i10) {
        this.f42021a = i10;
        this.f42022b = obj;
        this.f42023c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i10, View view) {
        org.telegram.ui.ActionBar.f6 A0;
        Interpolator interpolator;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11 = this.f42021a;
        Object obj = this.d;
        Object obj2 = this.f42023c;
        Object obj3 = this.f42022b;
        switch (i11) {
            case 0:
                ab1 ab1Var = (ab1) obj2;
                wa1 wa1Var = (wa1) obj;
                ThemeActivity themeActivity = ((ya1) obj3).f44825e;
                int i12 = themeActivity.f36299f;
                if (i12 == 1) {
                    A0 = org.telegram.ui.ActionBar.g6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.g6.A0();
                }
                org.telegram.ui.ActionBar.f6 f6Var = A0;
                if (i10 == ab1Var.h() - 1) {
                    interpolator = null;
                    if (i12 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new qc1(f6Var, false, 1, false, z13));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) ab1Var.f36503e.get(i10);
                    if (!TextUtils.isEmpty(e6Var.f22914o) && e6Var.f22902a != org.telegram.ui.ActionBar.g6.f23234n) {
                        org.telegram.ui.ActionBar.b6.a(false);
                    }
                    int i13 = f6Var.U;
                    int i14 = e6Var.f22902a;
                    if (i13 != i14) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i15 = NotificationCenter.needSetDayNightTheme;
                        if (i12 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i15, f6Var, Boolean.valueOf(z12), null, Integer.valueOf(e6Var.f22902a));
                        org.telegram.ui.ActionBar.b4.q(f6Var, e6Var.f22902a);
                        org.telegram.ui.ActionBar.g6.F1(themeActivity);
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
                        themeActivity.presentFragment(new qc1(f6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i16 = left - dp;
                if (i16 < 0) {
                    wa1Var.v0(i16, 0, interpolator);
                } else {
                    int i17 = right + dp;
                    if (i17 > wa1Var.getMeasuredWidth()) {
                        wa1Var.v0(i17 - wa1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = wa1Var.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = wa1Var.getChildAt(i18);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                t01.V((t01) obj3, (Context) obj2, (String) obj, view, i10);
                return;
        }
    }
}

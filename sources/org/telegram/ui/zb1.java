package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;
public final class zb1 implements org.telegram.ui.Components.zk0 {
    public final int f40148a;
    public final Object f40149b;
    public final Object f40150c;
    public final Object d;

    public zb1(Object obj, Object obj2, Object obj3, int i10) {
        this.f40148a = i10;
        this.f40149b = obj;
        this.f40150c = obj2;
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
        int i11 = this.f40148a;
        Object obj = this.d;
        Object obj2 = this.f40150c;
        Object obj3 = this.f40149b;
        switch (i11) {
            case 0:
                ic1 ic1Var = (ic1) obj2;
                ec1 ec1Var = (ec1) obj;
                ThemeActivity themeActivity = ((gc1) obj3).e;
                int i12 = themeActivity.f31554f;
                if (i12 == 1) {
                    A0 = org.telegram.ui.ActionBar.i6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.i6.A0();
                }
                org.telegram.ui.ActionBar.h6 h6Var = A0;
                if (i10 == ic1Var.h() - 1) {
                    interpolator = null;
                    if (i12 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new wd1(h6Var, false, 1, false, z13));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) ic1Var.e.get(i10);
                    if (!TextUtils.isEmpty(g6Var.f18701o) && g6Var.f18690a != org.telegram.ui.ActionBar.i6.f19011n) {
                        org.telegram.ui.ActionBar.d6.a(false);
                    }
                    int i13 = h6Var.Y;
                    int i14 = g6Var.f18690a;
                    if (i13 != i14) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i15 = NotificationCenter.needSetDayNightTheme;
                        if (i12 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i15, h6Var, Boolean.valueOf(z12), null, Integer.valueOf(g6Var.f18690a));
                        org.telegram.ui.ActionBar.d4.q(h6Var, g6Var.f18690a);
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
                        themeActivity.presentFragment(new wd1(h6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i16 = left - dp;
                if (i16 < 0) {
                    ec1Var.v0(i16, 0, interpolator);
                } else {
                    int i17 = right + dp;
                    if (i17 > ec1Var.getMeasuredWidth()) {
                        ec1Var.v0(i17 - ec1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = ec1Var.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = ec1Var.getChildAt(i18);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                x11.V((x11) obj3, (Context) obj2, (String) obj, view, i10);
                return;
        }
    }
}

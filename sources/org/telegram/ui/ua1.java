package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ThemeActivity;
public final class ua1 implements org.telegram.ui.Components.zl0 {
    public final int f44081a;
    public final Object f44082b;
    public final Object f44083c;
    public final Object d;

    public ua1(Object obj, Object obj2, Object obj3, int i10) {
        this.f44081a = i10;
        this.f44082b = obj;
        this.f44083c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i10, View view) {
        org.telegram.ui.ActionBar.x6 C0;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f44081a) {
            case 0:
                db1 db1Var = (db1) this.f44083c;
                za1 za1Var = (za1) this.d;
                ThemeActivity themeActivity = ((bb1) this.f44082b).e;
                int i11 = themeActivity.f36268f;
                if (i11 == 1) {
                    C0 = org.telegram.ui.ActionBar.y6.J;
                } else {
                    C0 = org.telegram.ui.ActionBar.y6.C0();
                }
                org.telegram.ui.ActionBar.x6 x6Var = C0;
                if (i10 == db1Var.h() - 1) {
                    if (i11 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new tc1(x6Var, false, 1, false, z13));
                } else {
                    org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) db1Var.e.get(i10);
                    if (!TextUtils.isEmpty(w6Var.f23224o) && w6Var.f23213a != org.telegram.ui.ActionBar.y6.f23531n) {
                        org.telegram.ui.ActionBar.t6.a(false);
                    }
                    int i12 = x6Var.Y;
                    int i13 = w6Var.f23213a;
                    if (i12 != i13) {
                        if (i11 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.ActionBar.y6.H1(x6Var, z12, i13, view);
                        org.telegram.ui.ActionBar.h4.p(x6Var, w6Var.f23213a);
                        org.telegram.ui.ActionBar.y6.J1(themeActivity);
                    } else {
                        if (i13 >= 100) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i11 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        themeActivity.presentFragment(new tc1(x6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i14 = left - dp;
                if (i14 < 0) {
                    za1Var.w0(i14, 0, null);
                } else {
                    int i15 = right + dp;
                    if (i15 > za1Var.getMeasuredWidth()) {
                        za1Var.w0(i15 - za1Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = za1Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = za1Var.getChildAt(i16);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                h11.W((h11) this.f44082b, (Context) this.f44083c, (String) this.d, view, i10);
                return;
        }
    }
}

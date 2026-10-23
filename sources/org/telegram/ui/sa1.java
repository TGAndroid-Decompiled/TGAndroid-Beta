package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ThemeActivity;
public final class sa1 implements org.telegram.ui.Components.am0 {
    public final int f41342a;
    public final Object f41343b;
    public final Object f41344c;
    public final Object d;

    public sa1(Object obj, Object obj2, Object obj3, int i10) {
        this.f41342a = i10;
        this.f41343b = obj;
        this.f41344c = obj2;
        this.d = obj3;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.ActionBar.j6 C0;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f41342a) {
            case 0:
                bb1 bb1Var = (bb1) this.f41344c;
                xa1 xa1Var = (xa1) this.d;
                ThemeActivity themeActivity = ((za1) this.f41343b).e;
                int i11 = themeActivity.f34206f;
                if (i11 == 1) {
                    C0 = org.telegram.ui.ActionBar.k6.J;
                } else {
                    C0 = org.telegram.ui.ActionBar.k6.C0();
                }
                org.telegram.ui.ActionBar.j6 j6Var = C0;
                if (i10 == bb1Var.h() - 1) {
                    if (i11 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new qc1(j6Var, false, 1, false, z13));
                } else {
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) bb1Var.e.get(i10);
                    if (!TextUtils.isEmpty(i6Var.f20975o) && i6Var.f20964a != org.telegram.ui.ActionBar.k6.f21359n) {
                        org.telegram.ui.ActionBar.f6.a(false);
                    }
                    int i12 = j6Var.Y;
                    int i13 = i6Var.f20964a;
                    if (i12 != i13) {
                        if (i11 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.ActionBar.k6.H1(j6Var, z12, i13, view);
                        org.telegram.ui.ActionBar.f4.p(j6Var, i6Var.f20964a);
                        org.telegram.ui.ActionBar.k6.J1(themeActivity);
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
                        themeActivity.presentFragment(new qc1(j6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i14 = left - dp;
                if (i14 < 0) {
                    xa1Var.v0(i14, 0, null);
                } else {
                    int i15 = right + dp;
                    if (i15 > xa1Var.getMeasuredWidth()) {
                        xa1Var.v0(i15 - xa1Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = xa1Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = xa1Var.getChildAt(i16);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                d11.V((d11) this.f41343b, (Context) this.f41344c, (String) this.d, view, i10);
                return;
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ThemeActivity;
public final class wa1 implements org.telegram.ui.Components.am0 {
    public final int f44583a;
    public final Object f44584b;
    public final Object f44585c;
    public final Object d;

    public wa1(Object obj, Object obj2, Object obj3, int i10) {
        this.f44583a = i10;
        this.f44584b = obj;
        this.f44585c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i10, View view) {
        org.telegram.ui.ActionBar.x6 C0;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f44583a) {
            case 0:
                fb1 fb1Var = (fb1) this.f44585c;
                bb1 bb1Var = (bb1) this.d;
                ThemeActivity themeActivity = ((db1) this.f44584b).e;
                int i11 = themeActivity.f36295f;
                if (i11 == 1) {
                    C0 = org.telegram.ui.ActionBar.y6.J;
                } else {
                    C0 = org.telegram.ui.ActionBar.y6.C0();
                }
                org.telegram.ui.ActionBar.x6 x6Var = C0;
                if (i10 == fb1Var.h() - 1) {
                    if (i11 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new vc1(x6Var, false, 1, false, z13));
                } else {
                    org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) fb1Var.e.get(i10);
                    if (!TextUtils.isEmpty(w6Var.f23227o) && w6Var.f23216a != org.telegram.ui.ActionBar.y6.f23534n) {
                        org.telegram.ui.ActionBar.t6.a(false);
                    }
                    int i12 = x6Var.Y;
                    int i13 = w6Var.f23216a;
                    if (i12 != i13) {
                        if (i11 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.ActionBar.y6.H1(x6Var, z12, i13, view);
                        org.telegram.ui.ActionBar.h4.p(x6Var, w6Var.f23216a);
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
                        themeActivity.presentFragment(new vc1(x6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i14 = left - dp;
                if (i14 < 0) {
                    bb1Var.w0(i14, 0, null);
                } else {
                    int i15 = right + dp;
                    if (i15 > bb1Var.getMeasuredWidth()) {
                        bb1Var.w0(i15 - bb1Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = bb1Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = bb1Var.getChildAt(i16);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                j11.W((j11) this.f44584b, (Context) this.f44585c, (String) this.d, view, i10);
                return;
        }
    }
}

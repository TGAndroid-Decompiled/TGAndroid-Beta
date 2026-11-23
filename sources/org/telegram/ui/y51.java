package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;
public final class y51 implements org.telegram.ui.Components.qj0 {
    public final int f54233a;
    public final Object f54234b;
    public final Object f54235c;
    public final Object d;

    public y51(Object obj, Object obj2, Object obj3, int i7) {
        this.f54233a = i7;
        this.f54234b = obj;
        this.f54235c = obj2;
        this.d = obj3;
    }

    @Override
    public final void b(int i7, View view) {
        org.telegram.ui.ActionBar.m6 D0;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f54233a) {
            case 0:
                g61 g61Var = (g61) this.f54235c;
                d61 d61Var = (d61) this.d;
                ThemeActivity themeActivity = ((e61) this.f54234b).f47460e;
                int i10 = themeActivity.f43965f;
                if (i10 == 1) {
                    D0 = org.telegram.ui.ActionBar.n6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.n6.D0();
                }
                org.telegram.ui.ActionBar.m6 m6Var = D0;
                if (i7 == g61Var.b() - 1) {
                    if (i10 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new v71(m6Var, false, 1, false, z13));
                } else {
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) g61Var.f48119e.get(i7);
                    if (!TextUtils.isEmpty(k6Var.f29236o) && k6Var.f29224a != org.telegram.ui.ActionBar.n6.f29627n) {
                        org.telegram.ui.ActionBar.h6.a(false);
                    }
                    int i11 = m6Var.Z;
                    int i12 = k6Var.f29224a;
                    if (i11 != i12) {
                        if (i10 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.ActionBar.n6.K1(m6Var, z12, i12, view);
                        org.telegram.ui.ActionBar.s3.q(m6Var, k6Var.f29224a);
                        org.telegram.ui.ActionBar.n6.M1(themeActivity);
                    } else {
                        if (i12 >= 100) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i10 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        themeActivity.presentFragment(new v71(m6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i13 = left - L;
                if (i13 < 0) {
                    d61Var.w0(i13, 0, null);
                } else {
                    int i14 = right + L;
                    if (i14 > d61Var.getMeasuredWidth()) {
                        d61Var.w0(i14 - d61Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = d61Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = d61Var.getChildAt(i15);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                hx0.a0((hx0) this.f54234b, (Context) this.f54235c, (String) this.d, view, i7);
                return;
        }
    }
}

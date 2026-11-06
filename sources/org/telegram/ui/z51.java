package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;
public final class z51 implements org.telegram.ui.Components.bj0 {
    public final int f52488a;
    public final Object f52489b;
    public final Object f52490c;
    public final Object d;

    public z51(Object obj, Object obj2, Object obj3, int i7) {
        this.f52488a = i7;
        this.f52489b = obj;
        this.f52490c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i7, View view) {
        org.telegram.ui.ActionBar.j6 D0;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f52488a) {
            case 0:
                h61 h61Var = (h61) this.f52490c;
                e61 e61Var = (e61) this.d;
                ThemeActivity themeActivity = ((f61) this.f52489b).f45508e;
                int i10 = themeActivity.f42017f;
                if (i10 == 1) {
                    D0 = org.telegram.ui.ActionBar.k6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.k6.D0();
                }
                org.telegram.ui.ActionBar.j6 j6Var = D0;
                if (i7 == h61Var.b() - 1) {
                    if (i10 == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    themeActivity.presentFragment(new u71(j6Var, false, 1, false, z12));
                } else {
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) h61Var.f46228e.get(i7);
                    if (!TextUtils.isEmpty(h6Var.f27527o) && h6Var.f27515a != org.telegram.ui.ActionBar.k6.f28024n) {
                        org.telegram.ui.ActionBar.e6.a(false);
                    }
                    int i11 = j6Var.Y;
                    int i12 = h6Var.f27515a;
                    if (i11 != i12) {
                        if (i10 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        org.telegram.ui.ActionBar.k6.K1(j6Var, z11, i12, view);
                        org.telegram.ui.ActionBar.r3.q(j6Var, h6Var.f27515a);
                        org.telegram.ui.ActionBar.k6.M1(themeActivity);
                    } else {
                        if (i12 >= 100) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (i10 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        themeActivity.presentFragment(new u71(j6Var, false, 1, z9, z10));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i13 = left - L;
                if (i13 < 0) {
                    e61Var.w0(i13, 0, null);
                } else {
                    int i14 = right + L;
                    if (i14 > e61Var.getMeasuredWidth()) {
                        e61Var.w0(i14 - e61Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = e61Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = e61Var.getChildAt(i15);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                gx0.a0((gx0) this.f52489b, (Context) this.f52490c, (String) this.d, view, i7);
                return;
        }
    }
}

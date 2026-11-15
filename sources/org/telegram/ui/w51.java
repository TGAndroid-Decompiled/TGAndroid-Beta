package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;
public final class w51 implements org.telegram.ui.Components.gj0 {
    public final int f52437a;
    public final Object f52438b;
    public final Object f52439c;
    public final Object d;

    public w51(Object obj, Object obj2, Object obj3, int i7) {
        this.f52437a = i7;
        this.f52438b = obj;
        this.f52439c = obj2;
        this.d = obj3;
    }

    @Override
    public final void b(int i7, View view) {
        org.telegram.ui.ActionBar.i6 D0;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f52437a) {
            case 0:
                e61 e61Var = (e61) this.f52439c;
                b61 b61Var = (b61) this.d;
                ThemeActivity themeActivity = ((c61) this.f52438b).f46038e;
                int i10 = themeActivity.f43393f;
                if (i10 == 1) {
                    D0 = org.telegram.ui.ActionBar.j6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.j6.D0();
                }
                org.telegram.ui.ActionBar.i6 i6Var = D0;
                if (i7 == e61Var.b() - 1) {
                    if (i10 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new t71(i6Var, false, 1, false, z13));
                } else {
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) e61Var.f46584e.get(i7);
                    if (!TextUtils.isEmpty(g6Var.f28614o) && g6Var.f28602a != org.telegram.ui.ActionBar.j6.f29025n) {
                        org.telegram.ui.ActionBar.d6.a(false);
                    }
                    int i11 = i6Var.Z;
                    int i12 = g6Var.f28602a;
                    if (i11 != i12) {
                        if (i10 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.ActionBar.j6.K1(i6Var, z12, i12, view);
                        org.telegram.ui.ActionBar.p3.q(i6Var, g6Var.f28602a);
                        org.telegram.ui.ActionBar.j6.M1(themeActivity);
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
                        themeActivity.presentFragment(new t71(i6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i13 = left - L;
                if (i13 < 0) {
                    b61Var.w0(i13, 0, null);
                } else {
                    int i14 = right + L;
                    if (i14 > b61Var.getMeasuredWidth()) {
                        b61Var.w0(i14 - b61Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = b61Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = b61Var.getChildAt(i15);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                fx0.a0((fx0) this.f52438b, (Context) this.f52439c, (String) this.d, view, i7);
                return;
        }
    }
}

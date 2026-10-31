package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;
public final class r71 implements org.telegram.ui.Components.gk0 {
    public final int f41159a;
    public final Object f41160b;
    public final Object f41161c;
    public final Object d;

    public r71(Object obj, Object obj2, Object obj3, int i10) {
        this.f41159a = i10;
        this.f41160b = obj;
        this.f41161c = obj2;
        this.d = obj3;
    }

    @Override
    public final void f(int i10, View view) {
        org.telegram.ui.ActionBar.s6 D0;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f41159a) {
            case 0:
                z71 z71Var = (z71) this.f41161c;
                w71 w71Var = (w71) this.d;
                ThemeActivity themeActivity = ((x71) this.f41160b).e;
                int i11 = themeActivity.f34095f;
                if (i11 == 1) {
                    D0 = org.telegram.ui.ActionBar.t6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.t6.D0();
                }
                org.telegram.ui.ActionBar.s6 s6Var = D0;
                if (i10 == z71Var.b() - 1) {
                    if (i11 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    themeActivity.presentFragment(new m91(s6Var, false, 1, false, z13));
                } else {
                    org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) z71Var.e.get(i10);
                    if (!TextUtils.isEmpty(r6Var.f20741o) && r6Var.f20730a != org.telegram.ui.ActionBar.t6.f21108n) {
                        org.telegram.ui.ActionBar.o6.a(false);
                    }
                    int i12 = s6Var.Y;
                    int i13 = r6Var.f20730a;
                    if (i12 != i13) {
                        if (i11 == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.ActionBar.t6.K1(s6Var, z12, i13, view);
                        org.telegram.ui.ActionBar.y3.q(s6Var, r6Var.f20730a);
                        org.telegram.ui.ActionBar.t6.M1(themeActivity);
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
                        themeActivity.presentFragment(new m91(s6Var, false, 1, z10, z11));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.i0.L(52.0f);
                int i14 = left - L;
                if (i14 < 0) {
                    w71Var.w0(i14, 0, null);
                } else {
                    int i15 = right + L;
                    if (i15 > w71Var.getMeasuredWidth()) {
                        w71Var.w0(i15 - w71Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = w71Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = w71Var.getChildAt(i16);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                return;
            default:
                uy0.Z((uy0) this.f41160b, (Context) this.f41161c, (String) this.d, view, i10);
                return;
        }
    }
}

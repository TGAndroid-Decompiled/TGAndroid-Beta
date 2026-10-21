package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zx0 implements org.telegram.ui.ActionBar.i6 {
    public final int f43821a;
    public final org.telegram.ui.ActionBar.n2 f43822b;

    public zx0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f43821a = i10;
        this.f43822b = n2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f43821a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f43821a;
        int i12 = 0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f43822b;
        switch (i11) {
            case 0:
                ProfileActivity.n0((ProfileActivity) n2Var);
                return;
            case 1:
                z01 z01Var = (z01) n2Var;
                org.telegram.ui.Components.jm0 jm0Var = z01Var.f43586a;
                if (jm0Var != null) {
                    int childCount = jm0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = z01Var.f43586a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                s11 s11Var = (s11) n2Var;
                if (s11Var.h != null && ((valueAnimator = s11Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ba baVar = s11Var.h;
                    if (s11Var.F) {
                        i10 = org.telegram.ui.ActionBar.h6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f21395z6;
                    }
                    baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                }
                if (s11Var.f41315a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = s11Var.f41315a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21117k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21134l6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21211p7, false));
                            i13++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 3:
                z11 z11Var = (z11) n2Var;
                z11Var.f43603a.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false));
                z11Var.f43605c.l();
                return;
            case 4:
                p91 p91Var = (p91) n2Var;
                q81 q81Var = p91Var.S;
                if (q81Var != null) {
                    int childCount2 = q81Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        p91.l0(p91Var.S.getChildAt(i14));
                    }
                    int hiddenChildCount = p91Var.S.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        p91.l0(p91Var.S.V(i15));
                    }
                    int cachedChildCount = p91Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        p91.l0(p91Var.S.P(i16));
                    }
                    int attachedScrapChildCount = p91Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        p91.l0(p91Var.S.O(i12));
                        i12++;
                    }
                    p91Var.S.getRecycledViewPool().a();
                }
                jg.f fVar = p91Var.f40128a0;
                if (fVar != null) {
                    fVar.f14425a = true;
                    return;
                }
                return;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) n2Var;
                for (int i17 = 0; i17 < themeActivity.f33899b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f33899b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof no0) {
                        ((no0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f33899b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f33899b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof no0) {
                        ((no0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f33899b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f33899b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof no0) {
                        ((no0) V).a();
                    }
                }
                while (i12 < themeActivity.f33899b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f33899b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof no0) {
                        ((no0) O).a();
                    }
                    i12++;
                }
                return;
            case 6:
                kc1.X((kc1) n2Var);
                return;
            case 7:
                gd1 gd1Var = (gd1) n2Var;
                org.telegram.ui.Components.jm0 jm0Var2 = gd1Var.f37285a;
                if (jm0Var2 != null) {
                    int childCount3 = jm0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = gd1Var.f37285a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.jm0 jm0Var3 = gd1Var.f37286b;
                if (jm0Var3 != null) {
                    int childCount4 = jm0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = gd1Var.f37286b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt4).f(0);
                        }
                    }
                }
                gd1Var.f37287c.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                gd1Var.F.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21062h6, false));
                return;
            case 8:
                re1.X((re1) n2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.jm0 jm0Var4 = usersSelectActivity.d;
                if (jm0Var4 != null) {
                    int childCount5 = jm0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount5; i22++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i22);
                        if (childAt5 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt5).f(0);
                        }
                    }
                    return;
                }
                return;
        }
    }

    private final void c(float f7) {
    }

    private final void d(float f7) {
    }

    private final void e(float f7) {
    }

    private final void f(float f7) {
    }

    private final void g(float f7) {
    }

    private final void h(float f7) {
    }

    private final void i(float f7) {
    }

    private final void j(float f7) {
    }

    private final void k(float f7) {
    }

    private final void l(float f7) {
    }
}

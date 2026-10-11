package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vy0 implements org.telegram.ui.ActionBar.i6 {
    public final int f43152a;
    public final org.telegram.ui.ActionBar.m2 f43153b;

    public vy0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f43152a = i10;
        this.f43153b = m2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f43152a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f43152a;
        int i12 = 0;
        org.telegram.ui.ActionBar.m2 m2Var = this.f43153b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) m2Var);
                return;
            case 1:
                u11 u11Var = (u11) m2Var;
                org.telegram.ui.Components.sm0 sm0Var = u11Var.f42312a;
                if (sm0Var != null) {
                    int childCount = sm0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = u11Var.f42312a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.wa) {
                            ((org.telegram.ui.Cells.wa) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                m21 m21Var = (m21) m2Var;
                if (m21Var.h != null && ((valueAnimator = m21Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ca caVar = m21Var.h;
                    if (m21Var.F) {
                        i10 = org.telegram.ui.ActionBar.h6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f21189z6;
                    }
                    caVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                }
                if (m21Var.f39793a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = m21Var.f39793a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20914k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932l6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21007p7, false));
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
                d31 d31Var = (d31) m2Var;
                d31Var.getClass();
                d31Var.setNavigationBarColor(d31Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20730a7));
                return;
            case 4:
                k31 k31Var = (k31) m2Var;
                k31Var.f39180a.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20730a7, false));
                k31Var.f39182c.l();
                return;
            case 5:
                ab1 ab1Var = (ab1) m2Var;
                ba1 ba1Var = ab1Var.S;
                if (ba1Var != null) {
                    int childCount2 = ba1Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        ab1.l0(ab1Var.S.getChildAt(i14));
                    }
                    int hiddenChildCount = ab1Var.S.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        ab1.l0(ab1Var.S.V(i15));
                    }
                    int cachedChildCount = ab1Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        ab1.l0(ab1Var.S.P(i16));
                    }
                    int attachedScrapChildCount = ab1Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        ab1.l0(ab1Var.S.O(i12));
                        i12++;
                    }
                    ab1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = ab1Var.f35962a0;
                if (fVar != null) {
                    fVar.f12139g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) m2Var;
                for (int i17 = 0; i17 < themeActivity.f34559b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f34559b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof ep0) {
                        ((ep0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f34559b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f34559b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof ep0) {
                        ((ep0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f34559b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f34559b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof ep0) {
                        ((ep0) V).a();
                    }
                }
                while (i12 < themeActivity.f34559b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f34559b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof ep0) {
                        ((ep0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                wd1.X((wd1) m2Var);
                return;
            case 8:
                te1 te1Var = (te1) m2Var;
                org.telegram.ui.Components.sm0 sm0Var2 = te1Var.f42167a;
                if (sm0Var2 != null) {
                    int childCount3 = sm0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = te1Var.f42167a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.sm0 sm0Var3 = te1Var.f42168b;
                if (sm0Var3 != null) {
                    int childCount4 = sm0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = te1Var.f42168b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                te1Var.f42169c.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                te1Var.F.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20858h6, false));
                return;
            case 9:
                eg1.X((eg1) m2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) m2Var;
                org.telegram.ui.Components.sm0 sm0Var4 = usersSelectActivity.d;
                if (sm0Var4 != null) {
                    int childCount5 = sm0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount5; i22++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i22);
                        if (childAt5 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt5).f(0);
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

    private final void m(float f7) {
    }
}

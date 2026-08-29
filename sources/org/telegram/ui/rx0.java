package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rx0 implements org.telegram.ui.ActionBar.h6 {
    public final int f42223a;
    public final org.telegram.ui.ActionBar.o2 f42224b;

    public rx0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f42223a = i10;
        this.f42224b = o2Var;
    }

    @Override
    public final void a(float f9) {
        int i10 = this.f42223a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f42223a;
        int i12 = 0;
        org.telegram.ui.ActionBar.o2 o2Var = this.f42224b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) o2Var);
                return;
            case 1:
                t01 t01Var = (t01) o2Var;
                org.telegram.ui.Components.jl0 jl0Var = t01Var.f42511a;
                if (jl0Var != null) {
                    int childCount = jl0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = t01Var.f42511a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.ra) {
                            ((org.telegram.ui.Cells.ra) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                l11 l11Var = (l11) o2Var;
                if (l11Var.h != null && ((valueAnimator = l11Var.D) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.y9 y9Var = l11Var.h;
                    if (l11Var.C) {
                        i10 = org.telegram.ui.ActionBar.g6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.g6.f23450z6;
                    }
                    y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                }
                if (l11Var.f40053a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = l11Var.f40053a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23189k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23206l6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
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
                a21 a21Var = (a21) o2Var;
                a21Var.getClass();
                a21Var.setNavigationBarColor(a21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7));
                return;
            case 4:
                i21 i21Var = (i21) o2Var;
                i21Var.f39110a.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
                i21Var.f39112c.l();
                return;
            case 5:
                t91 t91Var = (t91) o2Var;
                u81 u81Var = t91Var.O;
                if (u81Var != null) {
                    int childCount2 = u81Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        t91.l0(t91Var.O.getChildAt(i14));
                    }
                    int hiddenChildCount = t91Var.O.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        t91.l0(t91Var.O.V(i15));
                    }
                    int cachedChildCount = t91Var.O.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        t91.l0(t91Var.O.P(i16));
                    }
                    int attachedScrapChildCount = t91Var.O.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        t91.l0(t91Var.O.O(i12));
                        i12++;
                    }
                    t91Var.O.getRecycledViewPool().a();
                }
                tf.f fVar = t91Var.W;
                if (fVar != null) {
                    fVar.f48233g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) o2Var;
                for (int i17 = 0; i17 < themeActivity.f36292b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f36292b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof go0) {
                        ((go0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f36292b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f36292b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof go0) {
                        ((go0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f36292b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f36292b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof go0) {
                        ((go0) V).a();
                    }
                }
                while (i12 < themeActivity.f36292b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f36292b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof go0) {
                        ((go0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                qc1.W((qc1) o2Var);
                return;
            case 8:
                md1 md1Var = (md1) o2Var;
                org.telegram.ui.Components.jl0 jl0Var2 = md1Var.f40529a;
                if (jl0Var2 != null) {
                    int childCount3 = jl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = md1Var.f40529a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.jl0 jl0Var3 = md1Var.f40530b;
                if (jl0Var3 != null) {
                    int childCount4 = jl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = md1Var.f40530b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) childAt4).f(0);
                        }
                    }
                }
                md1Var.f40531c.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                md1Var.B.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23134h6, false));
                return;
            case 9:
                ze1.X((ze1) o2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) o2Var;
                org.telegram.ui.Components.jl0 jl0Var4 = usersSelectActivity.d;
                if (jl0Var4 != null) {
                    int childCount5 = jl0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount5; i22++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i22);
                        if (childAt5 instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) childAt5).f(0);
                        }
                    }
                    return;
                }
                return;
        }
    }

    private final void c(float f9) {
    }

    private final void d(float f9) {
    }

    private final void e(float f9) {
    }

    private final void f(float f9) {
    }

    private final void g(float f9) {
    }

    private final void h(float f9) {
    }

    private final void i(float f9) {
    }

    private final void j(float f9) {
    }

    private final void k(float f9) {
    }

    private final void l(float f9) {
    }

    private final void m(float f9) {
    }
}

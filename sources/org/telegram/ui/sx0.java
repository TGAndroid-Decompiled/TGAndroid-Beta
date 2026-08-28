package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sx0 implements org.telegram.ui.ActionBar.g6 {
    public final int f42779a;
    public final org.telegram.ui.ActionBar.o2 f42780b;

    public sx0(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f42779a = i9;
        this.f42780b = o2Var;
    }

    @Override
    public final void a(float f10) {
        int i9 = this.f42779a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i9;
        int i10 = this.f42779a;
        int i11 = 0;
        org.telegram.ui.ActionBar.o2 o2Var = this.f42780b;
        switch (i10) {
            case 0:
                ProfileActivity.U((ProfileActivity) o2Var);
                return;
            case 1:
                s01 s01Var = (s01) o2Var;
                org.telegram.ui.Components.wk0 wk0Var = s01Var.f42519a;
                if (wk0Var != null) {
                    int childCount = wk0Var.getChildCount();
                    while (i11 < childCount) {
                        View childAt = s01Var.f42519a.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt).b();
                        }
                        i11++;
                    }
                    return;
                }
                return;
            case 2:
                k11 k11Var = (k11) o2Var;
                if (k11Var.h != null && ((valueAnimator = k11Var.D) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ba baVar = k11Var.h;
                    if (k11Var.C) {
                        i9 = org.telegram.ui.ActionBar.f6.f23229q6;
                    } else {
                        i9 = org.telegram.ui.ActionBar.f6.f23386z6;
                    }
                    baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                }
                if (k11Var.f39665a != null) {
                    int i12 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = k11Var.f39665a;
                        if (i12 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i12].setLineColors(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23127k6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23144l6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
                            i12++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 3:
                z11 z11Var = (z11) o2Var;
                z11Var.getClass();
                z11Var.setNavigationBarColor(z11Var.getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
                return;
            case 4:
                h21 h21Var = (h21) o2Var;
                h21Var.f38655a.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
                h21Var.f38657c.l();
                return;
            case 5:
                s91 s91Var = (s91) o2Var;
                t81 t81Var = s91Var.O;
                if (t81Var != null) {
                    int childCount2 = t81Var.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        s91.k0(s91Var.O.getChildAt(i13));
                    }
                    int hiddenChildCount = s91Var.O.getHiddenChildCount();
                    for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                        s91.k0(s91Var.O.V(i14));
                    }
                    int cachedChildCount = s91Var.O.getCachedChildCount();
                    for (int i15 = 0; i15 < cachedChildCount; i15++) {
                        s91.k0(s91Var.O.P(i15));
                    }
                    int attachedScrapChildCount = s91Var.O.getAttachedScrapChildCount();
                    while (i11 < attachedScrapChildCount) {
                        s91.k0(s91Var.O.O(i11));
                        i11++;
                    }
                    s91Var.O.getRecycledViewPool().a();
                }
                qf.f fVar = s91Var.W;
                if (fVar != null) {
                    fVar.f46174g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) o2Var;
                for (int i16 = 0; i16 < themeActivity.f36227b.getChildCount(); i16++) {
                    View childAt2 = themeActivity.f36227b.getChildAt(i16);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof ho0) {
                        ((ho0) childAt2).a();
                    }
                }
                for (int i17 = 0; i17 < themeActivity.f36227b.getCachedChildCount(); i17++) {
                    View P = themeActivity.f36227b.P(i17);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof ho0) {
                        ((ho0) P).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f36227b.getHiddenChildCount(); i18++) {
                    View V = themeActivity.f36227b.V(i18);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof ho0) {
                        ((ho0) V).a();
                    }
                }
                while (i11 < themeActivity.f36227b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f36227b.O(i11);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof ho0) {
                        ((ho0) O).a();
                    }
                    i11++;
                }
                return;
            case 7:
                oc1.V((oc1) o2Var);
                return;
            case 8:
                kd1 kd1Var = (kd1) o2Var;
                org.telegram.ui.Components.wk0 wk0Var2 = kd1Var.f39808a;
                if (wk0Var2 != null) {
                    int childCount3 = wk0Var2.getChildCount();
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt3 = kd1Var.f39808a.getChildAt(i19);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.wk0 wk0Var3 = kd1Var.f39809b;
                if (wk0Var3 != null) {
                    int childCount4 = wk0Var3.getChildCount();
                    for (int i20 = 0; i20 < childCount4; i20++) {
                        View childAt4 = kd1Var.f39809b.getChildAt(i20);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                kd1Var.f39810c.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
                kd1Var.B.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23073h6, false));
                return;
            case 9:
                we1.W((we1) o2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) o2Var;
                org.telegram.ui.Components.wk0 wk0Var4 = usersSelectActivity.d;
                if (wk0Var4 != null) {
                    int childCount5 = wk0Var4.getChildCount();
                    for (int i21 = 0; i21 < childCount5; i21++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i21);
                        if (childAt5 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt5).f(0);
                        }
                    }
                    return;
                }
                return;
        }
    }

    private final void c(float f10) {
    }

    private final void d(float f10) {
    }

    private final void e(float f10) {
    }

    private final void f(float f10) {
    }

    private final void g(float f10) {
    }

    private final void h(float f10) {
    }

    private final void i(float f10) {
    }

    private final void j(float f10) {
    }

    private final void k(float f10) {
    }

    private final void l(float f10) {
    }

    private final void m(float f10) {
    }
}

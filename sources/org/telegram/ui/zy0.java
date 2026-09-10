package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zy0 implements org.telegram.ui.ActionBar.k6 {
    public final int f39465a;
    public final org.telegram.ui.ActionBar.p2 f39466b;

    public zy0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f39465a = i10;
        this.f39466b = p2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f39465a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f39465a;
        int i12 = 0;
        org.telegram.ui.ActionBar.p2 p2Var = this.f39466b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) p2Var);
                return;
            case 1:
                c21 c21Var = (c21) p2Var;
                org.telegram.ui.Components.vl0 vl0Var = c21Var.f31498a;
                if (vl0Var != null) {
                    int childCount = vl0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = c21Var.f31498a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                u21 u21Var = (u21) p2Var;
                if (u21Var.h != null && ((valueAnimator = u21Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ga gaVar = u21Var.h;
                    if (u21Var.F) {
                        i10 = org.telegram.ui.ActionBar.j6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f18325z6;
                    }
                    gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                }
                if (u21Var.f37089a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = u21Var.f37089a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18055k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18073l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18144p7, false));
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
                k31 k31Var = (k31) p2Var;
                k31Var.getClass();
                k31Var.setNavigationBarColor(k31Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7));
                return;
            case 4:
                r31 r31Var = (r31) p2Var;
                r31Var.f36204a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
                r31Var.f36206c.l();
                return;
            case 5:
                fb1 fb1Var = (fb1) p2Var;
                ga1 ga1Var = fb1Var.S;
                if (ga1Var != null) {
                    int childCount2 = ga1Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        fb1.l0(fb1Var.S.getChildAt(i14));
                    }
                    int hiddenChildCount = fb1Var.S.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        fb1.l0(fb1Var.S.V(i15));
                    }
                    int cachedChildCount = fb1Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        fb1.l0(fb1Var.S.P(i16));
                    }
                    int attachedScrapChildCount = fb1Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        fb1.l0(fb1Var.S.O(i12));
                        i12++;
                    }
                    fb1Var.S.getRecycledViewPool().a();
                }
                hg.f fVar = fb1Var.f32741a0;
                if (fVar != null) {
                    fVar.f9331g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) p2Var;
                for (int i17 = 0; i17 < themeActivity.f30663b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f30663b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof fp0) {
                        ((fp0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f30663b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f30663b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof fp0) {
                        ((fp0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f30663b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f30663b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof fp0) {
                        ((fp0) V).a();
                    }
                }
                while (i12 < themeActivity.f30663b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f30663b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof fp0) {
                        ((fp0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                ae1.X((ae1) p2Var);
                return;
            case 8:
                xe1 xe1Var = (xe1) p2Var;
                org.telegram.ui.Components.vl0 vl0Var2 = xe1Var.f38694a;
                if (vl0Var2 != null) {
                    int childCount3 = vl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = xe1Var.f38694a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.vl0 vl0Var3 = xe1Var.f38695b;
                if (vl0Var3 != null) {
                    int childCount4 = vl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = xe1Var.f38695b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                xe1Var.f38696c.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                xe1Var.F.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17999h6, false));
                return;
            case 9:
                ig1.X((ig1) p2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) p2Var;
                org.telegram.ui.Components.vl0 vl0Var4 = usersSelectActivity.d;
                if (vl0Var4 != null) {
                    int childCount5 = vl0Var4.getChildCount();
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

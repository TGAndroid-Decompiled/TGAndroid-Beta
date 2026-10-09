package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wy0 implements org.telegram.ui.ActionBar.j6 {
    public final int f43768a;
    public final org.telegram.ui.ActionBar.n2 f43769b;

    public wy0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f43768a = i10;
        this.f43769b = n2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f43768a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f43768a;
        int i12 = 0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f43769b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) n2Var);
                return;
            case 1:
                v11 v11Var = (v11) n2Var;
                org.telegram.ui.Components.qm0 qm0Var = v11Var.f42600a;
                if (qm0Var != null) {
                    int childCount = qm0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = v11Var.f42600a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.wa) {
                            ((org.telegram.ui.Cells.wa) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                n21 n21Var = (n21) n2Var;
                if (n21Var.h != null && ((valueAnimator = n21Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ca caVar = n21Var.h;
                    if (n21Var.F) {
                        i10 = org.telegram.ui.ActionBar.i6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f21199z6;
                    }
                    caVar.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
                }
                if (n21Var.f40050a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = n21Var.f40050a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20925k6, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20943l6, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21018p7, false));
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
                e31 e31Var = (e31) n2Var;
                e31Var.getClass();
                e31Var.setNavigationBarColor(e31Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20741a7));
                return;
            case 4:
                l31 l31Var = (l31) n2Var;
                l31Var.f39412a.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
                l31Var.f39414c.l();
                return;
            case 5:
                bb1 bb1Var = (bb1) n2Var;
                ca1 ca1Var = bb1Var.S;
                if (ca1Var != null) {
                    int childCount2 = ca1Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        bb1.l0(bb1Var.S.getChildAt(i14));
                    }
                    int hiddenChildCount = bb1Var.S.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        bb1.l0(bb1Var.S.V(i15));
                    }
                    int cachedChildCount = bb1Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        bb1.l0(bb1Var.S.P(i16));
                    }
                    int attachedScrapChildCount = bb1Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        bb1.l0(bb1Var.S.O(i12));
                        i12++;
                    }
                    bb1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = bb1Var.f36203a0;
                if (fVar != null) {
                    fVar.f12140g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) n2Var;
                for (int i17 = 0; i17 < themeActivity.f34531b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f34531b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof fp0) {
                        ((fp0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f34531b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f34531b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof fp0) {
                        ((fp0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f34531b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f34531b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof fp0) {
                        ((fp0) V).a();
                    }
                }
                while (i12 < themeActivity.f34531b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f34531b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof fp0) {
                        ((fp0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                xd1.X((xd1) n2Var);
                return;
            case 8:
                ue1 ue1Var = (ue1) n2Var;
                org.telegram.ui.Components.qm0 qm0Var2 = ue1Var.f42410a;
                if (qm0Var2 != null) {
                    int childCount3 = qm0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = ue1Var.f42410a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.qm0 qm0Var3 = ue1Var.f42411b;
                if (qm0Var3 != null) {
                    int childCount4 = qm0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = ue1Var.f42411b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                ue1Var.f42412c.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                ue1Var.F.setProgressColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20869h6, false));
                return;
            case 9:
                fg1.X((fg1) n2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.qm0 qm0Var4 = usersSelectActivity.d;
                if (qm0Var4 != null) {
                    int childCount5 = qm0Var4.getChildCount();
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

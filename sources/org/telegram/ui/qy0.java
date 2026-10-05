package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qy0 implements org.telegram.ui.ActionBar.j6 {
    public final int f39920a;
    public final org.telegram.ui.ActionBar.n2 f39921b;

    public qy0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f39920a = i10;
        this.f39921b = n2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f39920a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f39920a;
        int i12 = 0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f39921b;
        switch (i11) {
            case 0:
                ProfileActivity.T((ProfileActivity) n2Var);
                return;
            case 1:
                p11 p11Var = (p11) n2Var;
                org.telegram.ui.Components.zl0 zl0Var = p11Var.f39330b;
                if (zl0Var != null) {
                    int childCount = zl0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = p11Var.f39330b.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.ya) {
                            ((org.telegram.ui.Cells.ya) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                h21 h21Var = (h21) n2Var;
                if (h21Var.h != null && ((valueAnimator = h21Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ea eaVar = h21Var.h;
                    if (h21Var.F) {
                        i10 = org.telegram.ui.ActionBar.i6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f21233z6;
                    }
                    eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
                }
                if (h21Var.f36865a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = h21Var.f36865a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20956k6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20974l6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21049p7, false));
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
                y21 y21Var = (y21) n2Var;
                y21Var.getClass();
                y21Var.setNavigationBarColor(y21Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20771a7));
                return;
            case 4:
                ((d31) n2Var).f35630b.l();
                return;
            case 5:
                ta1 ta1Var = (ta1) n2Var;
                s91 s91Var = ta1Var.S;
                if (s91Var != null) {
                    int childCount2 = s91Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        ta1.j0(ta1Var.S.getChildAt(i14));
                    }
                    int hiddenChildCount = ta1Var.S.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        ta1.j0(ta1Var.S.V(i15));
                    }
                    int cachedChildCount = ta1Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        ta1.j0(ta1Var.S.P(i16));
                    }
                    int attachedScrapChildCount = ta1Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        ta1.j0(ta1Var.S.O(i12));
                        i12++;
                    }
                    ta1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = ta1Var.Z;
                if (fVar != null) {
                    fVar.f12093g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) n2Var;
                for (int i17 = 0; i17 < themeActivity.f34541b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f34541b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof bp0) {
                        ((bp0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f34541b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f34541b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof bp0) {
                        ((bp0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f34541b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f34541b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof bp0) {
                        ((bp0) V).a();
                    }
                }
                while (i12 < themeActivity.f34541b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f34541b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof bp0) {
                        ((bp0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                pd1.W((pd1) n2Var);
                return;
            case 8:
                le1 le1Var = (le1) n2Var;
                org.telegram.ui.Components.zl0 zl0Var2 = le1Var.f38297a;
                if (zl0Var2 != null) {
                    int childCount3 = zl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = le1Var.f38297a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.zl0 zl0Var3 = le1Var.f38298b;
                if (zl0Var3 != null) {
                    int childCount4 = zl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = le1Var.f38298b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                le1Var.f38299c.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                le1Var.F.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20900h6, false));
                return;
            case 9:
                wf1.W((wf1) n2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.zl0 zl0Var4 = usersSelectActivity.d;
                if (zl0Var4 != null) {
                    int childCount5 = zl0Var4.getChildCount();
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

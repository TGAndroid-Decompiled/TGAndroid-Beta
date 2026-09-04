package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xy0 implements org.telegram.ui.ActionBar.k6 {
    public final int f42914a;
    public final org.telegram.ui.ActionBar.n2 f42915b;

    public xy0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f42914a = i10;
        this.f42915b = n2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f42914a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f42914a;
        int i12 = 0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f42915b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) n2Var);
                return;
            case 1:
                y11 y11Var = (y11) n2Var;
                org.telegram.ui.Components.ll0 ll0Var = y11Var.f42950a;
                if (ll0Var != null) {
                    int childCount = ll0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = y11Var.f42950a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.ya) {
                            ((org.telegram.ui.Cells.ya) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                q21 q21Var = (q21) n2Var;
                if (q21Var.h != null && ((valueAnimator = q21Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ea eaVar = q21Var.h;
                    if (q21Var.F) {
                        i10 = org.telegram.ui.ActionBar.j6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f21061z6;
                    }
                    eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                }
                if (q21Var.f39681a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = q21Var.f39681a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20791k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20809l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20880p7, false));
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
                g31 g31Var = (g31) n2Var;
                g31Var.getClass();
                g31Var.setNavigationBarColor(g31Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20607a7));
                return;
            case 4:
                n31 n31Var = (n31) n2Var;
                n31Var.f38820a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
                n31Var.f38822c.l();
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
                jg.f fVar = bb1Var.f34691a0;
                if (fVar != null) {
                    fVar.f13638g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) n2Var;
                for (int i17 = 0; i17 < themeActivity.f34176b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f34176b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof gp0) {
                        ((gp0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f34176b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f34176b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof gp0) {
                        ((gp0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f34176b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f34176b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof gp0) {
                        ((gp0) V).a();
                    }
                }
                while (i12 < themeActivity.f34176b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f34176b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof gp0) {
                        ((gp0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                wd1.X((wd1) n2Var);
                return;
            case 8:
                te1 te1Var = (te1) n2Var;
                org.telegram.ui.Components.ll0 ll0Var2 = te1Var.f40728a;
                if (ll0Var2 != null) {
                    int childCount3 = ll0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = te1Var.f40728a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.ll0 ll0Var3 = te1Var.f40729b;
                if (ll0Var3 != null) {
                    int childCount4 = ll0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = te1Var.f40729b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt4).f(0);
                        }
                    }
                }
                te1Var.f40730c.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                te1Var.F.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20735h6, false));
                return;
            case 9:
                eg1.X((eg1) n2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.ll0 ll0Var4 = usersSelectActivity.d;
                if (ll0Var4 != null) {
                    int childCount5 = ll0Var4.getChildCount();
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

    private final void m(float f7) {
    }
}

package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qy0 implements org.telegram.ui.ActionBar.i6 {
    public final int f36639a;
    public final org.telegram.ui.ActionBar.n2 f36640b;

    public qy0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f36639a = i10;
        this.f36640b = n2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f36639a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f36639a;
        int i12 = 0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f36640b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) n2Var);
                return;
            case 1:
                p11 p11Var = (p11) n2Var;
                org.telegram.ui.Components.ml0 ml0Var = p11Var.f35998a;
                if (ml0Var != null) {
                    int childCount = ml0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = p11Var.f35998a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                h21 h21Var = (h21) n2Var;
                if (h21Var.h != null && ((valueAnimator = h21Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.fa faVar = h21Var.h;
                    if (h21Var.F) {
                        i10 = org.telegram.ui.ActionBar.h6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f19189z6;
                    }
                    faVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
                }
                if (h21Var.f33711a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = h21Var.f33711a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18916k6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18934l6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19008p7, false));
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
                x21 x21Var = (x21) n2Var;
                x21Var.getClass();
                x21Var.setNavigationBarColor(x21Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18733a7));
                return;
            case 4:
                e31 e31Var = (e31) n2Var;
                e31Var.f32784a.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
                e31Var.f32786c.l();
                return;
            case 5:
                ra1 ra1Var = (ra1) n2Var;
                s91 s91Var = ra1Var.S;
                if (s91Var != null) {
                    int childCount2 = s91Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        ra1.l0(ra1Var.S.getChildAt(i14));
                    }
                    int hiddenChildCount = ra1Var.S.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        ra1.l0(ra1Var.S.V(i15));
                    }
                    int cachedChildCount = ra1Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        ra1.l0(ra1Var.S.P(i16));
                    }
                    int attachedScrapChildCount = ra1Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        ra1.l0(ra1Var.S.O(i12));
                        i12++;
                    }
                    ra1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = ra1Var.f36753a0;
                if (fVar != null) {
                    fVar.f11101g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) n2Var;
                for (int i17 = 0; i17 < themeActivity.f31522b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f31522b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof zo0) {
                        ((zo0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f31522b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f31522b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof zo0) {
                        ((zo0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f31522b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f31522b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof zo0) {
                        ((zo0) V).a();
                    }
                }
                while (i12 < themeActivity.f31522b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f31522b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof zo0) {
                        ((zo0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                od1.X((od1) n2Var);
                return;
            case 8:
                le1 le1Var = (le1) n2Var;
                org.telegram.ui.Components.ml0 ml0Var2 = le1Var.f34956a;
                if (ml0Var2 != null) {
                    int childCount3 = ml0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = le1Var.f34956a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.ml0 ml0Var3 = le1Var.f34957b;
                if (ml0Var3 != null) {
                    int childCount4 = ml0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = le1Var.f34957b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                le1Var.f34958c.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                le1Var.F.setProgressColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18860h6, false));
                return;
            case 9:
                wf1.X((wf1) n2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.ml0 ml0Var4 = usersSelectActivity.d;
                if (ml0Var4 != null) {
                    int childCount5 = ml0Var4.getChildCount();
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

package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yy0 implements org.telegram.ui.ActionBar.i6 {
    public final int f44575a;
    public final org.telegram.ui.ActionBar.m2 f44576b;

    public yy0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f44575a = i10;
        this.f44576b = m2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f44575a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f44575a;
        int i12 = 0;
        org.telegram.ui.ActionBar.m2 m2Var = this.f44576b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) m2Var);
                return;
            case 1:
                x11 x11Var = (x11) m2Var;
                org.telegram.ui.Components.wm0 wm0Var = x11Var.f43719a;
                if (wm0Var != null) {
                    int childCount = wm0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = x11Var.f43719a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.wa) {
                            ((org.telegram.ui.Cells.wa) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                q21 q21Var = (q21) m2Var;
                if (q21Var.h != null && ((valueAnimator = q21Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ca caVar = q21Var.h;
                    if (q21Var.F) {
                        i10 = org.telegram.ui.ActionBar.h6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f20964z6;
                    }
                    caVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                }
                if (q21Var.f41152a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = q21Var.f41152a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20688k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20706l6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20781p7, false));
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
                g31 g31Var = (g31) m2Var;
                g31Var.getClass();
                g31Var.setNavigationBarColor(g31Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20504a7));
                return;
            case 4:
                n31 n31Var = (n31) m2Var;
                n31Var.f40197a.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false));
                n31Var.f40199c.l();
                return;
            case 5:
                db1 db1Var = (db1) m2Var;
                ea1 ea1Var = db1Var.S;
                if (ea1Var != null) {
                    int childCount2 = ea1Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        db1.l0(db1Var.S.getChildAt(i14));
                    }
                    int hiddenChildCount = db1Var.S.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        db1.l0(db1Var.S.V(i15));
                    }
                    int cachedChildCount = db1Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        db1.l0(db1Var.S.P(i16));
                    }
                    int attachedScrapChildCount = db1Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        db1.l0(db1Var.S.O(i12));
                        i12++;
                    }
                    db1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = db1Var.f36725a0;
                if (fVar != null) {
                    fVar.f12138g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) m2Var;
                for (int i17 = 0; i17 < themeActivity.f34370b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f34370b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof hp0) {
                        ((hp0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f34370b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f34370b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof hp0) {
                        ((hp0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f34370b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f34370b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof hp0) {
                        ((hp0) V).a();
                    }
                }
                while (i12 < themeActivity.f34370b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f34370b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof hp0) {
                        ((hp0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                zd1.X((zd1) m2Var);
                return;
            case 8:
                we1 we1Var = (we1) m2Var;
                org.telegram.ui.Components.wm0 wm0Var2 = we1Var.f43147a;
                if (wm0Var2 != null) {
                    int childCount3 = wm0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = we1Var.f43147a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.wm0 wm0Var3 = we1Var.f43148b;
                if (wm0Var3 != null) {
                    int childCount4 = wm0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = we1Var.f43148b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                we1Var.f43149c.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                we1Var.F.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20632h6, false));
                return;
            case 9:
                hg1.X((hg1) m2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) m2Var;
                org.telegram.ui.Components.wm0 wm0Var4 = usersSelectActivity.d;
                if (wm0Var4 != null) {
                    int childCount5 = wm0Var4.getChildCount();
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

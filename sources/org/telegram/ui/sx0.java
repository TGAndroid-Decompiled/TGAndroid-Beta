package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class sx0 implements org.telegram.ui.ActionBar.h6 {

    public final int f42710a;

    public final org.telegram.ui.ActionBar.n2 f42711b;

    public sx0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f42710a = i10;
        this.f42711b = n2Var;
    }

    @Override
    public final void a(float f10) {
        int i10 = this.f42710a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10 = this.f42710a;
        int i11 = 0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f42711b;
        switch (i10) {
            case 0:
                ProfileActivity.V((ProfileActivity) n2Var);
                break;
            case 1:
                t01 t01Var = (t01) n2Var;
                org.telegram.ui.Components.zk0 zk0Var = t01Var.f42739a;
                if (zk0Var != null) {
                    int childCount = zk0Var.getChildCount();
                    while (i11 < childCount) {
                        View childAt = t01Var.f42739a.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.ra) {
                            ((org.telegram.ui.Cells.ra) childAt).b();
                        }
                        i11++;
                    }
                }
                break;
            case 2:
                j11 j11Var = (j11) n2Var;
                if (j11Var.h != null && ((valueAnimator = j11Var.D) == null || !valueAnimator.isRunning())) {
                    j11Var.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, j11Var.C ? org.telegram.ui.ActionBar.g6.q6 : org.telegram.ui.ActionBar.g6.f23441z6, false));
                }
                if (j11Var.f39223a != null) {
                    int i12 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = j11Var.f39223a;
                        if (i12 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i12].setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23181k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198l6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
                            i12++;
                        }
                    }
                }
                break;
            case 3:
                y11 y11Var = (y11) n2Var;
                y11Var.getClass();
                y11Var.setNavigationBarColor(y11Var.getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
                break;
            case 4:
                g21 g21Var = (g21) n2Var;
                g21Var.f38288a.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
                g21Var.f38290c.l();
                break;
            case 5:
                q91 q91Var = (q91) n2Var;
                r81 r81Var = q91Var.O;
                if (r81Var != null) {
                    int childCount2 = r81Var.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        q91.l0(q91Var.O.getChildAt(i13));
                    }
                    int hiddenChildCount = q91Var.O.getHiddenChildCount();
                    for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                        q91.l0(q91Var.O.V(i14));
                    }
                    int cachedChildCount = q91Var.O.getCachedChildCount();
                    for (int i15 = 0; i15 < cachedChildCount; i15++) {
                        q91.l0(q91Var.O.P(i15));
                    }
                    int attachedScrapChildCount = q91Var.O.getAttachedScrapChildCount();
                    while (i11 < attachedScrapChildCount) {
                        q91.l0(q91Var.O.O(i11));
                        i11++;
                    }
                    q91Var.O.getRecycledViewPool().a();
                }
                rf.f fVar = q91Var.W;
                if (fVar != null) {
                    fVar.f46933g = true;
                }
                break;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) n2Var;
                for (int i16 = 0; i16 < themeActivity.f36230b.getChildCount(); i16++) {
                    View childAt2 = themeActivity.f36230b.getChildAt(i16);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof io0) {
                        ((io0) childAt2).a();
                    }
                }
                for (int i17 = 0; i17 < themeActivity.f36230b.getCachedChildCount(); i17++) {
                    View viewP = themeActivity.f36230b.P(i17);
                    if (viewP instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) viewP).getAdapter().l();
                    } else if (viewP instanceof io0) {
                        ((io0) viewP).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f36230b.getHiddenChildCount(); i18++) {
                    View viewV = themeActivity.f36230b.V(i18);
                    if (viewV instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) viewV).getAdapter().l();
                    } else if (viewV instanceof io0) {
                        ((io0) viewV).a();
                    }
                }
                while (i11 < themeActivity.f36230b.getAttachedScrapChildCount()) {
                    View viewO = themeActivity.f36230b.O(i11);
                    if (viewO instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) viewO).getAdapter().l();
                    } else if (viewO instanceof io0) {
                        ((io0) viewO).a();
                    }
                    i11++;
                }
                break;
            case 7:
                nc1.W((nc1) n2Var);
                break;
            case 8:
                ld1 ld1Var = (ld1) n2Var;
                org.telegram.ui.Components.zk0 zk0Var2 = ld1Var.f40055a;
                if (zk0Var2 != null) {
                    int childCount3 = zk0Var2.getChildCount();
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt3 = ld1Var.f40055a.getChildAt(i19);
                        if (childAt3 instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.zk0 zk0Var3 = ld1Var.f40056b;
                if (zk0Var3 != null) {
                    int childCount4 = zk0Var3.getChildCount();
                    for (int i20 = 0; i20 < childCount4; i20++) {
                        View childAt4 = ld1Var.f40056b.getChildAt(i20);
                        if (childAt4 instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) childAt4).f(0);
                        }
                    }
                }
                ld1Var.f40057c.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                ld1Var.B.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23125h6, false));
                break;
            case 9:
                we1.X((we1) n2Var);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.zk0 zk0Var4 = usersSelectActivity.d;
                if (zk0Var4 != null) {
                    int childCount5 = zk0Var4.getChildCount();
                    for (int i21 = 0; i21 < childCount5; i21++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i21);
                        if (childAt5 instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) childAt5).f(0);
                        }
                    }
                }
                break;
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

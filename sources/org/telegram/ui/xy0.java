package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xy0 implements org.telegram.ui.ActionBar.j6 {
    public final int f39706a;
    public final org.telegram.ui.ActionBar.n2 f39707b;

    public xy0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f39706a = i10;
        this.f39707b = n2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f39706a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f39706a;
        int i12 = 0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f39707b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) n2Var);
                return;
            case 1:
                x11 x11Var = (x11) n2Var;
                org.telegram.ui.Components.ll0 ll0Var = x11Var.f39462a;
                if (ll0Var != null) {
                    int childCount = ll0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = x11Var.f39462a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                p21 p21Var = (p21) n2Var;
                if (p21Var.h != null && ((valueAnimator = p21Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ea eaVar = p21Var.h;
                    if (p21Var.F) {
                        i10 = org.telegram.ui.ActionBar.i6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f19234z6;
                    }
                    eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
                }
                if (p21Var.f36404a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = p21Var.f36404a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18961k6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18979l6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19053p7, false));
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
                f31 f31Var = (f31) n2Var;
                f31Var.getClass();
                f31Var.setNavigationBarColor(f31Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18778a7));
                return;
            case 4:
                m31 m31Var = (m31) n2Var;
                m31Var.f35589a.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18778a7, false));
                m31Var.f35591c.l();
                return;
            case 5:
                za1 za1Var = (za1) n2Var;
                aa1 aa1Var = za1Var.S;
                if (aa1Var != null) {
                    int childCount2 = aa1Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        za1.l0(za1Var.S.getChildAt(i14));
                    }
                    int hiddenChildCount = za1Var.S.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        za1.l0(za1Var.S.V(i15));
                    }
                    int cachedChildCount = za1Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        za1.l0(za1Var.S.P(i16));
                    }
                    int attachedScrapChildCount = za1Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        za1.l0(za1Var.S.O(i12));
                        i12++;
                    }
                    za1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = za1Var.f40109a0;
                if (fVar != null) {
                    fVar.f11113g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) n2Var;
                for (int i17 = 0; i17 < themeActivity.f31548b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f31548b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof fp0) {
                        ((fp0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f31548b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f31548b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof fp0) {
                        ((fp0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f31548b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f31548b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof fp0) {
                        ((fp0) V).a();
                    }
                }
                while (i12 < themeActivity.f31548b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f31548b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof fp0) {
                        ((fp0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                wd1.X((wd1) n2Var);
                return;
            case 8:
                te1 te1Var = (te1) n2Var;
                org.telegram.ui.Components.ll0 ll0Var2 = te1Var.f37648a;
                if (ll0Var2 != null) {
                    int childCount3 = ll0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = te1Var.f37648a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.ll0 ll0Var3 = te1Var.f37649b;
                if (ll0Var3 != null) {
                    int childCount4 = ll0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = te1Var.f37649b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                te1Var.f37650c.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                te1Var.F.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18905h6, false));
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

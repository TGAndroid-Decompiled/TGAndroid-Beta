package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wy0 implements org.telegram.ui.ActionBar.j6 {
    public final int f39413a;
    public final org.telegram.ui.ActionBar.n2 f39414b;

    public wy0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f39413a = i10;
        this.f39414b = n2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f39413a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f39413a;
        int i12 = 0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f39414b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) n2Var);
                return;
            case 1:
                w11 w11Var = (w11) n2Var;
                org.telegram.ui.Components.ll0 ll0Var = w11Var.f38741a;
                if (ll0Var != null) {
                    int childCount = ll0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = w11Var.f38741a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                o21 o21Var = (o21) n2Var;
                if (o21Var.h != null && ((valueAnimator = o21Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ea eaVar = o21Var.h;
                    if (o21Var.F) {
                        i10 = org.telegram.ui.ActionBar.i6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f19237z6;
                    }
                    eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
                }
                if (o21Var.f36088a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = o21Var.f36088a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18964k6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18982l6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19056p7, false));
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
                e31Var.setNavigationBarColor(e31Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18780a7));
                return;
            case 4:
                l31 l31Var = (l31) n2Var;
                l31Var.f35320a.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18780a7, false));
                l31Var.f35322c.l();
                return;
            case 5:
                ya1 ya1Var = (ya1) n2Var;
                z91 z91Var = ya1Var.S;
                if (z91Var != null) {
                    int childCount2 = z91Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        ya1.l0(ya1Var.S.getChildAt(i14));
                    }
                    int hiddenChildCount = ya1Var.S.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        ya1.l0(ya1Var.S.V(i15));
                    }
                    int cachedChildCount = ya1Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        ya1.l0(ya1Var.S.P(i16));
                    }
                    int attachedScrapChildCount = ya1Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        ya1.l0(ya1Var.S.O(i12));
                        i12++;
                    }
                    ya1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = ya1Var.f39796a0;
                if (fVar != null) {
                    fVar.f11111g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) n2Var;
                for (int i17 = 0; i17 < themeActivity.f31551b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f31551b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof fp0) {
                        ((fp0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f31551b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f31551b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof fp0) {
                        ((fp0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f31551b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f31551b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof fp0) {
                        ((fp0) V).a();
                    }
                }
                while (i12 < themeActivity.f31551b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f31551b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof fp0) {
                        ((fp0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                vd1.X((vd1) n2Var);
                return;
            case 8:
                se1 se1Var = (se1) n2Var;
                org.telegram.ui.Components.ll0 ll0Var2 = se1Var.f37368a;
                if (ll0Var2 != null) {
                    int childCount3 = ll0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = se1Var.f37368a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.ll0 ll0Var3 = se1Var.f37369b;
                if (ll0Var3 != null) {
                    int childCount4 = ll0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = se1Var.f37369b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt4).f(0);
                        }
                    }
                }
                se1Var.f37370c.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                se1Var.F.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18908h6, false));
                return;
            case 9:
                dg1.X((dg1) n2Var);
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

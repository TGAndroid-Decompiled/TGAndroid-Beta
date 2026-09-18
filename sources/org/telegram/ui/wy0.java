package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wy0 implements org.telegram.ui.ActionBar.k6 {
    public final int f39277a;
    public final org.telegram.ui.ActionBar.n2 f39278b;

    public wy0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f39277a = i10;
        this.f39278b = n2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f39277a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f39277a;
        int i12 = 0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f39278b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) n2Var);
                return;
            case 1:
                w11 w11Var = (w11) n2Var;
                org.telegram.ui.Components.wl0 wl0Var = w11Var.f38665a;
                if (wl0Var != null) {
                    int childCount = wl0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = w11Var.f38665a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.ya) {
                            ((org.telegram.ui.Cells.ya) childAt).b();
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
                        i10 = org.telegram.ui.ActionBar.j6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f19464z6;
                    }
                    eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                }
                if (o21Var.f36094a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = o21Var.f36094a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19190k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19208l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19283p7, false));
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
                e31Var.setNavigationBarColor(e31Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19006a7));
                return;
            case 4:
                l31 l31Var = (l31) n2Var;
                l31Var.f35233a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19006a7, false));
                l31Var.f35235c.l();
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
                        za1.l0(za1Var.S.W(i15));
                    }
                    int cachedChildCount = za1Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        za1.l0(za1Var.S.Q(i16));
                    }
                    int attachedScrapChildCount = za1Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        za1.l0(za1Var.S.P(i12));
                        i12++;
                    }
                    za1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = za1Var.f40033a0;
                if (fVar != null) {
                    fVar.f11114g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) n2Var;
                for (int i17 = 0; i17 < themeActivity.f31795b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f31795b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof hp0) {
                        ((hp0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f31795b.getCachedChildCount(); i18++) {
                    View Q = themeActivity.f31795b.Q(i18);
                    if (Q instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) Q).getAdapter().l();
                    } else if (Q instanceof hp0) {
                        ((hp0) Q).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f31795b.getHiddenChildCount(); i19++) {
                    View W = themeActivity.f31795b.W(i19);
                    if (W instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) W).getAdapter().l();
                    } else if (W instanceof hp0) {
                        ((hp0) W).a();
                    }
                }
                while (i12 < themeActivity.f31795b.getAttachedScrapChildCount()) {
                    View P = themeActivity.f31795b.P(i12);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof hp0) {
                        ((hp0) P).a();
                    }
                    i12++;
                }
                return;
            case 7:
                vd1.X((vd1) n2Var);
                return;
            case 8:
                se1 se1Var = (se1) n2Var;
                org.telegram.ui.Components.wl0 wl0Var2 = se1Var.f37265a;
                if (wl0Var2 != null) {
                    int childCount3 = wl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = se1Var.f37265a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.wl0 wl0Var3 = se1Var.f37266b;
                if (wl0Var3 != null) {
                    int childCount4 = wl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = se1Var.f37266b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                se1Var.f37267c.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                se1Var.F.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19134h6, false));
                return;
            case 9:
                dg1.X((dg1) n2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.wl0 wl0Var4 = usersSelectActivity.d;
                if (wl0Var4 != null) {
                    int childCount5 = wl0Var4.getChildCount();
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

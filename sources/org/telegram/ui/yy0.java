package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yy0 implements org.telegram.ui.ActionBar.k6 {
    public final int f40048a;
    public final org.telegram.ui.ActionBar.o2 f40049b;

    public yy0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f40048a = i10;
        this.f40049b = o2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f40048a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f40048a;
        int i12 = 0;
        org.telegram.ui.ActionBar.o2 o2Var = this.f40049b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) o2Var);
                return;
            case 1:
                y11 y11Var = (y11) o2Var;
                org.telegram.ui.Components.ml0 ml0Var = y11Var.f39767a;
                if (ml0Var != null) {
                    int childCount = ml0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = y11Var.f39767a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                q21 q21Var = (q21) o2Var;
                if (q21Var.h != null && ((valueAnimator = q21Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ea eaVar = q21Var.h;
                    if (q21Var.F) {
                        i10 = org.telegram.ui.ActionBar.j6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f19264z6;
                    }
                    eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                }
                if (q21Var.f36786a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = q21Var.f36786a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18991k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19009l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19083p7, false));
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
                g31 g31Var = (g31) o2Var;
                g31Var.getClass();
                g31Var.setNavigationBarColor(g31Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18807a7));
                return;
            case 4:
                n31 n31Var = (n31) o2Var;
                n31Var.f35933a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18807a7, false));
                n31Var.f35935c.l();
                return;
            case 5:
                ab1 ab1Var = (ab1) o2Var;
                ba1 ba1Var = ab1Var.S;
                if (ba1Var != null) {
                    int childCount2 = ba1Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        ab1.l0(ab1Var.S.getChildAt(i14));
                    }
                    int hiddenChildCount = ab1Var.S.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        ab1.l0(ab1Var.S.W(i15));
                    }
                    int cachedChildCount = ab1Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        ab1.l0(ab1Var.S.Q(i16));
                    }
                    int attachedScrapChildCount = ab1Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        ab1.l0(ab1Var.S.P(i12));
                        i12++;
                    }
                    ab1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = ab1Var.f31787a0;
                if (fVar != null) {
                    fVar.f11114g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) o2Var;
                for (int i17 = 0; i17 < themeActivity.f31568b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f31568b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof hp0) {
                        ((hp0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f31568b.getCachedChildCount(); i18++) {
                    View Q = themeActivity.f31568b.Q(i18);
                    if (Q instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) Q).getAdapter().l();
                    } else if (Q instanceof hp0) {
                        ((hp0) Q).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f31568b.getHiddenChildCount(); i19++) {
                    View W = themeActivity.f31568b.W(i19);
                    if (W instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) W).getAdapter().l();
                    } else if (W instanceof hp0) {
                        ((hp0) W).a();
                    }
                }
                while (i12 < themeActivity.f31568b.getAttachedScrapChildCount()) {
                    View P = themeActivity.f31568b.P(i12);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof hp0) {
                        ((hp0) P).a();
                    }
                    i12++;
                }
                return;
            case 7:
                xd1.X((xd1) o2Var);
                return;
            case 8:
                ue1 ue1Var = (ue1) o2Var;
                org.telegram.ui.Components.ml0 ml0Var2 = ue1Var.f38057a;
                if (ml0Var2 != null) {
                    int childCount3 = ml0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = ue1Var.f38057a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.ml0 ml0Var3 = ue1Var.f38058b;
                if (ml0Var3 != null) {
                    int childCount4 = ml0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = ue1Var.f38058b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt4).f(0);
                        }
                    }
                }
                ue1Var.f38059c.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                ue1Var.F.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18935h6, false));
                return;
            case 9:
                fg1.X((fg1) o2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) o2Var;
                org.telegram.ui.Components.ml0 ml0Var4 = usersSelectActivity.d;
                if (ml0Var4 != null) {
                    int childCount5 = ml0Var4.getChildCount();
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

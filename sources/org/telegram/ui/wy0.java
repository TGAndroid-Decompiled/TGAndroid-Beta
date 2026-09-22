package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wy0 implements org.telegram.ui.ActionBar.k6 {
    public final int f39291a;
    public final org.telegram.ui.ActionBar.n2 f39292b;

    public wy0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f39291a = i10;
        this.f39292b = n2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f39291a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f39291a;
        int i12 = 0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f39292b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) n2Var);
                return;
            case 1:
                w11 w11Var = (w11) n2Var;
                org.telegram.ui.Components.yl0 yl0Var = w11Var.f38666a;
                if (yl0Var != null) {
                    int childCount = yl0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = w11Var.f38666a.getChildAt(i12);
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
                    org.telegram.ui.Cells.fa faVar = o21Var.h;
                    if (o21Var.F) {
                        i10 = org.telegram.ui.ActionBar.j6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f19511z6;
                    }
                    faVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                }
                if (o21Var.f36189a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = o21Var.f36189a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19237k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19255l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19330p7, false));
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
                f31Var.setNavigationBarColor(f31Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19053a7));
                return;
            case 4:
                m31 m31Var = (m31) n2Var;
                m31Var.f35611a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19053a7, false));
                m31Var.f35613c.l();
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
                        bb1.l0(bb1Var.S.W(i15));
                    }
                    int cachedChildCount = bb1Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        bb1.l0(bb1Var.S.Q(i16));
                    }
                    int attachedScrapChildCount = bb1Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        bb1.l0(bb1Var.S.P(i12));
                        i12++;
                    }
                    bb1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = bb1Var.f32332a0;
                if (fVar != null) {
                    fVar.f11115g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) n2Var;
                for (int i17 = 0; i17 < themeActivity.f31856b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f31856b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof hp0) {
                        ((hp0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f31856b.getCachedChildCount(); i18++) {
                    View Q = themeActivity.f31856b.Q(i18);
                    if (Q instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) Q).getAdapter().l();
                    } else if (Q instanceof hp0) {
                        ((hp0) Q).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f31856b.getHiddenChildCount(); i19++) {
                    View W = themeActivity.f31856b.W(i19);
                    if (W instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) W).getAdapter().l();
                    } else if (W instanceof hp0) {
                        ((hp0) W).a();
                    }
                }
                while (i12 < themeActivity.f31856b.getAttachedScrapChildCount()) {
                    View P = themeActivity.f31856b.P(i12);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof hp0) {
                        ((hp0) P).a();
                    }
                    i12++;
                }
                return;
            case 7:
                xd1.X((xd1) n2Var);
                return;
            case 8:
                ue1 ue1Var = (ue1) n2Var;
                org.telegram.ui.Components.yl0 yl0Var2 = ue1Var.f38070a;
                if (yl0Var2 != null) {
                    int childCount3 = yl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = ue1Var.f38070a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.yl0 yl0Var3 = ue1Var.f38071b;
                if (yl0Var3 != null) {
                    int childCount4 = yl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = ue1Var.f38071b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt4).f(0);
                        }
                    }
                }
                ue1Var.f38072c.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                ue1Var.F.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19181h6, false));
                return;
            case 9:
                fg1.X((fg1) n2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.yl0 yl0Var4 = usersSelectActivity.d;
                if (yl0Var4 != null) {
                    int childCount5 = yl0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount5; i22++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i22);
                        if (childAt5 instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt5).f(0);
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

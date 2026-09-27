package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qy0 implements org.telegram.ui.ActionBar.j6 {
    public final int f36925a;
    public final org.telegram.ui.ActionBar.o2 f36926b;

    public qy0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f36925a = i10;
        this.f36926b = o2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f36925a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f36925a;
        int i12 = 0;
        org.telegram.ui.ActionBar.o2 o2Var = this.f36926b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) o2Var);
                return;
            case 1:
                p11 p11Var = (p11) o2Var;
                org.telegram.ui.Components.yl0 yl0Var = p11Var.f36291a;
                if (yl0Var != null) {
                    int childCount = yl0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = p11Var.f36291a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.ya) {
                            ((org.telegram.ui.Cells.ya) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                h21 h21Var = (h21) o2Var;
                if (h21Var.h != null && ((valueAnimator = h21Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ea eaVar = h21Var.h;
                    if (h21Var.F) {
                        i10 = org.telegram.ui.ActionBar.i6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f19461z6;
                    }
                    eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
                }
                if (h21Var.f34107a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = h21Var.f34107a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19185k6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19203l6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19278p7, false));
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
                y21 y21Var = (y21) o2Var;
                y21Var.getClass();
                y21Var.setNavigationBarColor(y21Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19001a7));
                return;
            case 4:
                f31 f31Var = (f31) o2Var;
                f31Var.f33401a.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false));
                f31Var.f33403c.l();
                return;
            case 5:
                ra1 ra1Var = (ra1) o2Var;
                r91 r91Var = ra1Var.S;
                if (r91Var != null) {
                    int childCount2 = r91Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        ra1.j0(ra1Var.S.getChildAt(i14));
                    }
                    int hiddenChildCount = ra1Var.S.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        ra1.j0(ra1Var.S.W(i15));
                    }
                    int cachedChildCount = ra1Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        ra1.j0(ra1Var.S.Q(i16));
                    }
                    int attachedScrapChildCount = ra1Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        ra1.j0(ra1Var.S.P(i12));
                        i12++;
                    }
                    ra1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = ra1Var.Z;
                if (fVar != null) {
                    fVar.f11104g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) o2Var;
                for (int i17 = 0; i17 < themeActivity.f31839b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f31839b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof bp0) {
                        ((bp0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f31839b.getCachedChildCount(); i18++) {
                    View Q = themeActivity.f31839b.Q(i18);
                    if (Q instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) Q).getAdapter().l();
                    } else if (Q instanceof bp0) {
                        ((bp0) Q).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f31839b.getHiddenChildCount(); i19++) {
                    View W = themeActivity.f31839b.W(i19);
                    if (W instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) W).getAdapter().l();
                    } else if (W instanceof bp0) {
                        ((bp0) W).a();
                    }
                }
                while (i12 < themeActivity.f31839b.getAttachedScrapChildCount()) {
                    View P = themeActivity.f31839b.P(i12);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof bp0) {
                        ((bp0) P).a();
                    }
                    i12++;
                }
                return;
            case 7:
                pd1.X((pd1) o2Var);
                return;
            case 8:
                le1 le1Var = (le1) o2Var;
                org.telegram.ui.Components.yl0 yl0Var2 = le1Var.f35328a;
                if (yl0Var2 != null) {
                    int childCount3 = yl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = le1Var.f35328a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.yl0 yl0Var3 = le1Var.f35329b;
                if (yl0Var3 != null) {
                    int childCount4 = yl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = le1Var.f35329b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                le1Var.f35330c.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                le1Var.F.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19129h6, false));
                return;
            case 9:
                wf1.X((wf1) o2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) o2Var;
                org.telegram.ui.Components.yl0 yl0Var4 = usersSelectActivity.d;
                if (yl0Var4 != null) {
                    int childCount5 = yl0Var4.getChildCount();
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

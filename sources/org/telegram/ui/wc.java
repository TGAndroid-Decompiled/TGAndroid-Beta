package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class wc extends org.telegram.ui.Components.qt0 {
    public final int f50771g0;
    public boolean f50772h0;
    public final org.telegram.ui.ActionBar.d2 f50773i0;

    public wc(int i3, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        super(context, null);
        this.f50771g0 = i3;
        this.f50773i0 = d2Var;
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wc.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float f12;
        org.telegram.ui.ActionBar.k kVar3;
        int i11;
        org.telegram.ui.ActionBar.k kVar4;
        float f13;
        switch (this.f50771g0) {
            case 0:
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                ad adVar = (ad) this.f50773i0;
                measureChildWithMargins(ad.f0(adVar), i3, 0, i10, 0);
                if (Q() > org.telegram.messenger.g0.L(20.0f)) {
                    this.f50772h0 = true;
                    adVar.d.j();
                    this.f50772h0 = false;
                }
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != ad.g0(adVar)) {
                        org.telegram.ui.Components.jt jtVar = adVar.d;
                        if (jtVar != null && jtVar.l(childAt)) {
                            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            } else if (org.telegram.messenger.g0.Q1()) {
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                                if (org.telegram.messenger.g0.Q1()) {
                                    f10 = 200.0f;
                                } else {
                                    f10 = 320.0f;
                                }
                                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (paddingTop - org.telegram.messenger.g0.f22602m)), 1073741824));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - org.telegram.messenger.g0.f22602m), 1073741824));
                            }
                        } else {
                            measureChildWithMargins(childAt, i3, 0, i10, 0);
                        }
                    }
                }
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i3);
                int size4 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size3, size4);
                int paddingTop2 = size4 - getPaddingTop();
                ln lnVar = (ln) this.f50773i0;
                y4Var = ((org.telegram.ui.ActionBar.d2) lnVar).simpleActionBar;
                measureChildWithMargins(y4Var, i3, 0, i10, 0);
                if (Q() > org.telegram.messenger.g0.L(20.0f)) {
                    this.f50772h0 = true;
                    lnVar.f47393w.j();
                    this.f50772h0 = false;
                }
                int childCount2 = getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 != null && childAt2.getVisibility() != 8) {
                        y4Var2 = ((org.telegram.ui.ActionBar.d2) lnVar).simpleActionBar;
                        if (childAt2 != y4Var2) {
                            org.telegram.ui.Components.jt jtVar2 = lnVar.f47393w;
                            if (jtVar2 != null && jtVar2.l(childAt2)) {
                                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, 1073741824));
                                } else if (org.telegram.messenger.g0.Q1()) {
                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                                    if (org.telegram.messenger.g0.Q1()) {
                                        f11 = 200.0f;
                                    } else {
                                        f11 = 320.0f;
                                    }
                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f11), getPaddingTop() + (paddingTop2 - org.telegram.messenger.g0.f22602m)), 1073741824));
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop2 - org.telegram.messenger.g0.f22602m), 1073741824));
                                }
                            } else {
                                measureChildWithMargins(childAt2, i3, 0, i10, 0);
                            }
                        }
                    }
                }
                return;
            case 2:
                int size5 = View.MeasureSpec.getSize(i3);
                int size6 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size5, size6);
                int paddingTop3 = size6 - getPaddingTop();
                y40 y40Var = (y40) this.f50773i0;
                kVar = ((org.telegram.ui.ActionBar.d2) y40Var).actionBar;
                measureChildWithMargins(kVar, i3, 0, i10, 0);
                if (Q() > org.telegram.messenger.g0.L(20.0f)) {
                    org.telegram.ui.Components.jt jtVar3 = y40Var.f52182c;
                    if (!jtVar3.f35191e) {
                        this.f50772h0 = true;
                        jtVar3.j();
                        this.f50772h0 = false;
                    }
                }
                int childCount3 = getChildCount();
                for (int i14 = 0; i14 < childCount3; i14++) {
                    View childAt3 = getChildAt(i14);
                    if (childAt3 != null && childAt3.getVisibility() != 8) {
                        kVar2 = ((org.telegram.ui.ActionBar.d2) y40Var).actionBar;
                        if (childAt3 != kVar2) {
                            org.telegram.ui.Components.jt jtVar4 = y40Var.f52182c;
                            if (jtVar4 != null && jtVar4.l(childAt3)) {
                                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt3.getLayoutParams().height, 1073741824));
                                } else if (org.telegram.messenger.g0.Q1()) {
                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size5, 1073741824);
                                    if (org.telegram.messenger.g0.Q1()) {
                                        f12 = 200.0f;
                                    } else {
                                        f12 = 320.0f;
                                    }
                                    childAt3.measure(makeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f12), getPaddingTop() + (paddingTop3 - org.telegram.messenger.g0.f22602m)), 1073741824));
                                } else {
                                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop3 - org.telegram.messenger.g0.f22602m), 1073741824));
                                }
                            } else {
                                measureChildWithMargins(childAt3, i3, 0, i10, 0);
                            }
                        }
                    }
                }
                return;
            default:
                int size7 = View.MeasureSpec.getSize(i3);
                int size8 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size7, size8);
                int paddingTop4 = size8 - getPaddingTop();
                fr0 fr0Var = (fr0) this.f50773i0;
                kVar3 = ((org.telegram.ui.ActionBar.d2) fr0Var).actionBar;
                measureChildWithMargins(kVar3, i3, 0, i10, 0);
                int Q = Q();
                if (Q > org.telegram.messenger.g0.L(20.0f) && !fr0Var.Q && !fr0Var.C0) {
                    this.f50772h0 = true;
                    fr0Var.q0();
                    this.f50772h0 = false;
                }
                if (Q <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    i11 = fr0Var.W;
                } else {
                    i11 = 0;
                }
                if (Q > org.telegram.messenger.g0.L(20.0f) && fr0Var.C0) {
                    i11 = org.telegram.messenger.g0.L(120.0f);
                }
                int i15 = i11;
                int childCount4 = getChildCount();
                for (int i16 = 0; i16 < childCount4; i16++) {
                    View childAt4 = getChildAt(i16);
                    if (childAt4 != null && childAt4.getVisibility() != 8) {
                        kVar4 = ((org.telegram.ui.ActionBar.d2) fr0Var).actionBar;
                        if (childAt4 != kVar4) {
                            org.telegram.ui.Components.ey eyVar = fr0Var.S;
                            if (eyVar != null && eyVar == childAt4) {
                                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt4.getLayoutParams().height, 1073741824));
                                } else if (org.telegram.messenger.g0.Q1()) {
                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size7, 1073741824);
                                    if (org.telegram.messenger.g0.Q1()) {
                                        f13 = 200.0f;
                                    } else {
                                        f13 = 320.0f;
                                    }
                                    childAt4.measure(makeMeasureSpec4, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f13), getPaddingTop() + (paddingTop4 - org.telegram.messenger.g0.f22602m)), 1073741824));
                                } else {
                                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop4 - org.telegram.messenger.g0.f22602m), 1073741824));
                                }
                            } else if (fr0Var.f45331c == childAt4) {
                                childAt4.measure(i3, View.MeasureSpec.makeMeasureSpec(paddingTop4 - i15, 1073741824));
                            } else {
                                measureChildWithMargins(childAt4, i3, 0, i10, 0);
                            }
                        }
                    }
                }
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f50771g0) {
            case 0:
                if (!this.f50772h0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f50772h0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f50772h0) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f50772h0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}

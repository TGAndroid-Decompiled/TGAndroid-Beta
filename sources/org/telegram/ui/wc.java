package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class wc extends org.telegram.ui.Components.st0 {
    public final int f52542g0;
    public boolean f52543h0;
    public final org.telegram.ui.ActionBar.e2 f52544i0;

    public wc(int i7, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        super(context, null);
        this.f52542g0 = i7;
        this.f52544i0 = e2Var;
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wc.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float f10;
        org.telegram.ui.ActionBar.w4 w4Var;
        org.telegram.ui.ActionBar.w4 w4Var2;
        float f11;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        float f12;
        org.telegram.ui.ActionBar.k kVar5;
        int i11;
        org.telegram.ui.ActionBar.k kVar6;
        float f13;
        switch (this.f52542g0) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                ad adVar = (ad) this.f52544i0;
                kVar = ((org.telegram.ui.ActionBar.e2) adVar).actionBar;
                measureChildWithMargins(kVar, i7, 0, i10, 0);
                if (Q() > org.telegram.messenger.g0.L(20.0f)) {
                    this.f52543h0 = true;
                    adVar.d.j();
                    this.f52543h0 = false;
                }
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt != null && childAt.getVisibility() != 8) {
                        kVar2 = ((org.telegram.ui.ActionBar.e2) adVar).actionBar;
                        if (childAt != kVar2) {
                            org.telegram.ui.Components.rt rtVar = adVar.d;
                            if (rtVar != null && rtVar.l(childAt)) {
                                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                } else if (org.telegram.messenger.g0.Q1()) {
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                                    if (org.telegram.messenger.g0.Q1()) {
                                        f10 = 200.0f;
                                    } else {
                                        f10 = 320.0f;
                                    }
                                    childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (paddingTop - org.telegram.messenger.g0.f23605m)), 1073741824));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - org.telegram.messenger.g0.f23605m), 1073741824));
                                }
                            } else {
                                measureChildWithMargins(childAt, i7, 0, i10, 0);
                            }
                        }
                    }
                }
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i7);
                int size4 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size3, size4);
                int paddingTop2 = size4 - getPaddingTop();
                qn qnVar = (qn) this.f52544i0;
                w4Var = ((org.telegram.ui.ActionBar.e2) qnVar).simpleActionBar;
                measureChildWithMargins(w4Var, i7, 0, i10, 0);
                if (Q() > org.telegram.messenger.g0.L(20.0f)) {
                    this.f52543h0 = true;
                    qnVar.f50689w.j();
                    this.f52543h0 = false;
                }
                int childCount2 = getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 != null && childAt2.getVisibility() != 8) {
                        w4Var2 = ((org.telegram.ui.ActionBar.e2) qnVar).simpleActionBar;
                        if (childAt2 != w4Var2) {
                            org.telegram.ui.Components.rt rtVar2 = qnVar.f50689w;
                            if (rtVar2 != null && rtVar2.l(childAt2)) {
                                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, 1073741824));
                                } else if (org.telegram.messenger.g0.Q1()) {
                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                                    if (org.telegram.messenger.g0.Q1()) {
                                        f11 = 200.0f;
                                    } else {
                                        f11 = 320.0f;
                                    }
                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f11), getPaddingTop() + (paddingTop2 - org.telegram.messenger.g0.f23605m)), 1073741824));
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop2 - org.telegram.messenger.g0.f23605m), 1073741824));
                                }
                            } else {
                                measureChildWithMargins(childAt2, i7, 0, i10, 0);
                            }
                        }
                    }
                }
                return;
            case 2:
                int size5 = View.MeasureSpec.getSize(i7);
                int size6 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size5, size6);
                int paddingTop3 = size6 - getPaddingTop();
                c50 c50Var = (c50) this.f52544i0;
                kVar3 = ((org.telegram.ui.ActionBar.e2) c50Var).actionBar;
                measureChildWithMargins(kVar3, i7, 0, i10, 0);
                if (Q() > org.telegram.messenger.g0.L(20.0f)) {
                    org.telegram.ui.Components.rt rtVar3 = c50Var.f46008c;
                    if (!rtVar3.f39056e) {
                        this.f52543h0 = true;
                        rtVar3.j();
                        this.f52543h0 = false;
                    }
                }
                int childCount3 = getChildCount();
                for (int i14 = 0; i14 < childCount3; i14++) {
                    View childAt3 = getChildAt(i14);
                    if (childAt3 != null && childAt3.getVisibility() != 8) {
                        kVar4 = ((org.telegram.ui.ActionBar.e2) c50Var).actionBar;
                        if (childAt3 != kVar4) {
                            org.telegram.ui.Components.rt rtVar4 = c50Var.f46008c;
                            if (rtVar4 != null && rtVar4.l(childAt3)) {
                                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt3.getLayoutParams().height, 1073741824));
                                } else if (org.telegram.messenger.g0.Q1()) {
                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size5, 1073741824);
                                    if (org.telegram.messenger.g0.Q1()) {
                                        f12 = 200.0f;
                                    } else {
                                        f12 = 320.0f;
                                    }
                                    childAt3.measure(makeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f12), getPaddingTop() + (paddingTop3 - org.telegram.messenger.g0.f23605m)), 1073741824));
                                } else {
                                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop3 - org.telegram.messenger.g0.f23605m), 1073741824));
                                }
                            } else {
                                measureChildWithMargins(childAt3, i7, 0, i10, 0);
                            }
                        }
                    }
                }
                return;
            default:
                int size7 = View.MeasureSpec.getSize(i7);
                int size8 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size7, size8);
                int paddingTop4 = size8 - getPaddingTop();
                nr0 nr0Var = (nr0) this.f52544i0;
                kVar5 = ((org.telegram.ui.ActionBar.e2) nr0Var).actionBar;
                measureChildWithMargins(kVar5, i7, 0, i10, 0);
                int Q = Q();
                if (Q > org.telegram.messenger.g0.L(20.0f) && !nr0Var.Q && !nr0Var.C0) {
                    this.f52543h0 = true;
                    nr0Var.q0();
                    this.f52543h0 = false;
                }
                if (Q <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    i11 = nr0Var.W;
                } else {
                    i11 = 0;
                }
                if (Q > org.telegram.messenger.g0.L(20.0f) && nr0Var.C0) {
                    i11 = org.telegram.messenger.g0.L(120.0f);
                }
                int i15 = i11;
                int childCount4 = getChildCount();
                for (int i16 = 0; i16 < childCount4; i16++) {
                    View childAt4 = getChildAt(i16);
                    if (childAt4 != null && childAt4.getVisibility() != 8) {
                        kVar6 = ((org.telegram.ui.ActionBar.e2) nr0Var).actionBar;
                        if (childAt4 != kVar6) {
                            org.telegram.ui.Components.ly lyVar = nr0Var.S;
                            if (lyVar != null && lyVar == childAt4) {
                                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt4.getLayoutParams().height, 1073741824));
                                } else if (org.telegram.messenger.g0.Q1()) {
                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size7, 1073741824);
                                    if (org.telegram.messenger.g0.Q1()) {
                                        f13 = 200.0f;
                                    } else {
                                        f13 = 320.0f;
                                    }
                                    childAt4.measure(makeMeasureSpec4, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f13), getPaddingTop() + (paddingTop4 - org.telegram.messenger.g0.f23605m)), 1073741824));
                                } else {
                                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop4 - org.telegram.messenger.g0.f23605m), 1073741824));
                                }
                            } else if (nr0Var.f49608c == childAt4) {
                                childAt4.measure(i7, View.MeasureSpec.makeMeasureSpec(paddingTop4 - i15, 1073741824));
                            } else {
                                measureChildWithMargins(childAt4, i7, 0, i10, 0);
                            }
                        }
                    }
                }
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f52542g0) {
            case 0:
                if (!this.f52543h0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f52543h0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f52543h0) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f52543h0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}

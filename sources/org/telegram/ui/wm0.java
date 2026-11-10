package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
public final class wm0 extends org.telegram.ui.Components.st0 {
    public int f51396f0;
    public boolean f51397g0;
    public int f51398h0;
    public final an0 f51399i0;

    public wm0(an0 an0Var, Context context) {
        super(context, null);
        this.f51399i0 = an0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        org.telegram.ui.Components.kt ktVar;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        an0 an0Var = this.f51399i0;
        if (Q1) {
            an0Var.f43759g0 = 4;
        } else {
            Point point = org.telegram.messenger.g0.f22567q;
            if (point.x > point.y) {
                an0Var.f43759g0 = 4;
            } else {
                an0Var.f43759g0 = 3;
            }
        }
        this.f51397g0 = true;
        int L = ((size2 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(4.0f)) / an0Var.f43759g0;
        an0Var.R = L;
        if (this.f51398h0 != L) {
            this.f51398h0 = L;
            org.telegram.messenger.g0.h3(new hf0(this, 16));
        }
        if (an0Var.Y) {
            an0Var.M.y1(1);
        } else {
            an0Var.M.y1(Math.max(1, ((an0Var.f43759g0 - 1) * org.telegram.messenger.g0.L(2.0f)) + (an0Var.R * an0Var.f43759g0)));
        }
        this.f51397g0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !org.telegram.messenger.g0.E && an0Var.f43754d0 != null && an0Var.Z.getParent() == this) {
            size4 -= an0Var.f43754d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i11 = size4;
        int i12 = makeMeasureSpec;
        if (Q > org.telegram.messenger.g0.L(20.0f) && (ktVar = an0Var.f43754d0) != null) {
            this.f51397g0 = true;
            ktVar.j();
            this.f51397g0 = false;
        }
        org.telegram.ui.Components.kt ktVar2 = an0Var.f43754d0;
        if (ktVar2 != null && ktVar2.f35436e) {
            an0Var.fragmentView.setTranslationY(0.0f);
            an0Var.K.setTranslationY(0.0f);
            an0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.kt ktVar3 = an0Var.f43754d0;
                if (ktVar3 != null && ktVar3.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (org.telegram.messenger.g0.Q1()) {
                            f10 = 200.0f;
                        } else {
                            f10 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (i11 - org.telegram.messenger.g0.f22561m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i11 - org.telegram.messenger.g0.f22561m), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i7, 0, i12, 0);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f51397g0) {
            return;
        }
        super.requestLayout();
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
public final class wm0 extends org.telegram.ui.Components.cu0 {
    public int f53704g0;
    public boolean f53705h0;
    public int f53706i0;
    public final an0 f53707j0;

    public wm0(an0 an0Var, Context context) {
        super(context, null);
        this.f53707j0 = an0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        org.telegram.ui.Components.wt wtVar;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        an0 an0Var = this.f53707j0;
        if (Q1) {
            an0Var.f45755h0 = 4;
        } else {
            Point point = org.telegram.messenger.g0.f24226q;
            if (point.x > point.y) {
                an0Var.f45755h0 = 4;
            } else {
                an0Var.f45755h0 = 3;
            }
        }
        this.f53705h0 = true;
        int L = ((size2 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(4.0f)) / an0Var.f45755h0;
        an0Var.S = L;
        if (this.f53706i0 != L) {
            this.f53706i0 = L;
            org.telegram.messenger.g0.g3(new gf0(this, 16));
        }
        if (an0Var.Z) {
            an0Var.N.y1(1);
        } else {
            an0Var.N.y1(Math.max(1, ((an0Var.f45755h0 - 1) * org.telegram.messenger.g0.L(2.0f)) + (an0Var.S * an0Var.f45755h0)));
        }
        this.f53705h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !org.telegram.messenger.g0.E && an0Var.f45751e0 != null && an0Var.f45744a0.getParent() == this) {
            size4 -= an0Var.f45751e0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i11 = size4;
        int i12 = makeMeasureSpec;
        if (Q > org.telegram.messenger.g0.L(20.0f) && (wtVar = an0Var.f45751e0) != null) {
            this.f53705h0 = true;
            wtVar.j();
            this.f53705h0 = false;
        }
        org.telegram.ui.Components.wt wtVar2 = an0Var.f45751e0;
        if (wtVar2 != null && wtVar2.f41722e) {
            an0Var.fragmentView.setTranslationY(0.0f);
            an0Var.L.setTranslationY(0.0f);
            an0Var.O.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.wt wtVar3 = an0Var.f45751e0;
                if (wtVar3 != null && wtVar3.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (org.telegram.messenger.g0.Q1()) {
                            f10 = 200.0f;
                        } else {
                            f10 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (i11 - org.telegram.messenger.g0.f24220m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i11 - org.telegram.messenger.g0.f24220m), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i7, 0, i12, 0);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f53705h0) {
            return;
        }
        super.requestLayout();
    }
}

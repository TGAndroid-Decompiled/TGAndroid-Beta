package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class wn0 extends org.telegram.ui.Components.uu0 {
    public int f43339f0;
    public boolean f43340g0;
    public final yn0 f43341h0;

    public wn0(yn0 yn0Var, Context context) {
        super(context, null);
        this.f43341h0 = yn0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int L = org.telegram.messenger.i0.L(20.0f);
        int i13 = 0;
        yn0 yn0Var = this.f43341h0;
        if (L >= 0) {
            if (!org.telegram.messenger.i0.E) {
                size2 -= yn0Var.M.getEmojiPadding();
                i11 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
        } else {
            this.f43340g0 = true;
            yn0Var.M.j();
            this.f43340g0 = false;
        }
        int i14 = i11;
        int childCount = getChildCount();
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.wt wtVar = yn0Var.M;
                if (wtVar != null && wtVar.l(childAt)) {
                    if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.i0.Q1()) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        if (org.telegram.messenger.i0.Q1()) {
                            f7 = 200.0f;
                        } else {
                            f7 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(f7), getPaddingTop() + (size2 - org.telegram.messenger.i0.f16020m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.i0.f16020m), 1073741824));
                    }
                } else {
                    i12 = i10;
                    measureChildWithMargins(childAt, i12, 0, i14, 0);
                    i13++;
                    i10 = i12;
                }
            }
            i12 = i10;
            i13++;
            i10 = i12;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f43340g0) {
            return;
        }
        super.requestLayout();
    }
}

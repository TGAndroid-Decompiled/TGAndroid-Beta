package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
public final class um0 extends org.telegram.ui.Components.st0 {
    public int f51970g0;
    public boolean f51971h0;
    public int f51972i0;
    public final ym0 f51973j0;

    public um0(ym0 ym0Var, Context context) {
        super(context, null);
        this.f51973j0 = ym0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.um0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        org.telegram.ui.Components.rt rtVar;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        ym0 ym0Var = this.f51973j0;
        if (Q1) {
            ym0Var.f53576h0 = 4;
        } else {
            Point point = org.telegram.messenger.g0.f23609q;
            if (point.x > point.y) {
                ym0Var.f53576h0 = 4;
            } else {
                ym0Var.f53576h0 = 3;
            }
        }
        this.f51971h0 = true;
        int L = ((size2 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(4.0f)) / ym0Var.f53576h0;
        ym0Var.S = L;
        if (this.f51972i0 != L) {
            this.f51972i0 = L;
            org.telegram.messenger.g0.h3(new ef0(this, 16));
        }
        if (ym0Var.Z) {
            ym0Var.N.y1(1);
        } else {
            ym0Var.N.y1(Math.max(1, ((ym0Var.f53576h0 - 1) * org.telegram.messenger.g0.L(2.0f)) + (ym0Var.S * ym0Var.f53576h0)));
        }
        this.f51971h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !org.telegram.messenger.g0.E && ym0Var.f53572e0 != null && ym0Var.f53565a0.getParent() == this) {
            size4 -= ym0Var.f53572e0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i11 = size4;
        int i12 = makeMeasureSpec;
        if (Q > org.telegram.messenger.g0.L(20.0f) && (rtVar = ym0Var.f53572e0) != null) {
            this.f51971h0 = true;
            rtVar.j();
            this.f51971h0 = false;
        }
        org.telegram.ui.Components.rt rtVar2 = ym0Var.f53572e0;
        if (rtVar2 != null && rtVar2.f39059e) {
            ym0Var.fragmentView.setTranslationY(0.0f);
            ym0Var.L.setTranslationY(0.0f);
            ym0Var.O.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.rt rtVar3 = ym0Var.f53572e0;
                if (rtVar3 != null && rtVar3.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (org.telegram.messenger.g0.Q1()) {
                            f10 = 200.0f;
                        } else {
                            f10 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (i11 - org.telegram.messenger.g0.f23603m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i11 - org.telegram.messenger.g0.f23603m), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i7, 0, i12, 0);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f51971h0) {
            return;
        }
        super.requestLayout();
    }
}

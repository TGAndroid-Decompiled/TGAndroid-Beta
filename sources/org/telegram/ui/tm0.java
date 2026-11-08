package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
public final class tm0 extends org.telegram.ui.Components.rt0 {
    public int f50087f0;
    public boolean f50088g0;
    public int f50089h0;
    public final xm0 f50090i0;

    public tm0(xm0 xm0Var, Context context) {
        super(context, null);
        this.f50090i0 = xm0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tm0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        org.telegram.ui.Components.lt ltVar;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        xm0 xm0Var = this.f50090i0;
        if (Q1) {
            xm0Var.f51914g0 = 4;
        } else {
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x > point.y) {
                xm0Var.f51914g0 = 4;
            } else {
                xm0Var.f51914g0 = 3;
            }
        }
        this.f50088g0 = true;
        int L = ((size2 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(4.0f)) / xm0Var.f51914g0;
        xm0Var.R = L;
        if (this.f50089h0 != L) {
            this.f50089h0 = L;
            org.telegram.messenger.g0.h3(new ef0(this, 16));
        }
        if (xm0Var.Y) {
            xm0Var.M.y1(1);
        } else {
            xm0Var.M.y1(Math.max(1, ((xm0Var.f51914g0 - 1) * org.telegram.messenger.g0.L(2.0f)) + (xm0Var.R * xm0Var.f51914g0)));
        }
        this.f50088g0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !org.telegram.messenger.g0.E && xm0Var.f51909d0 != null && xm0Var.Z.getParent() == this) {
            size4 -= xm0Var.f51909d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i11 = size4;
        int i12 = makeMeasureSpec;
        if (Q > org.telegram.messenger.g0.L(20.0f) && (ltVar = xm0Var.f51909d0) != null) {
            this.f50088g0 = true;
            ltVar.j();
            this.f50088g0 = false;
        }
        org.telegram.ui.Components.lt ltVar2 = xm0Var.f51909d0;
        if (ltVar2 != null && ltVar2.f35780e) {
            xm0Var.fragmentView.setTranslationY(0.0f);
            xm0Var.K.setTranslationY(0.0f);
            xm0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.lt ltVar3 = xm0Var.f51909d0;
                if (ltVar3 != null && ltVar3.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (org.telegram.messenger.g0.Q1()) {
                            f10 = 200.0f;
                        } else {
                            f10 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (i11 - org.telegram.messenger.g0.f22557m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i11 - org.telegram.messenger.g0.f22557m), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i7, 0, i12, 0);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f50088g0) {
            return;
        }
        super.requestLayout();
    }
}

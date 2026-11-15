package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
public final class vm0 extends org.telegram.ui.Components.st0 {
    public int f52248g0;
    public boolean f52249h0;
    public int f52250i0;
    public final zm0 f52251j0;

    public vm0(zm0 zm0Var, Context context) {
        super(context, null);
        this.f52251j0 = zm0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        org.telegram.ui.Components.rt rtVar;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        zm0 zm0Var = this.f52251j0;
        if (Q1) {
            zm0Var.f53967h0 = 4;
        } else {
            Point point = org.telegram.messenger.g0.f23611q;
            if (point.x > point.y) {
                zm0Var.f53967h0 = 4;
            } else {
                zm0Var.f53967h0 = 3;
            }
        }
        this.f52249h0 = true;
        int L = ((size2 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(4.0f)) / zm0Var.f53967h0;
        zm0Var.S = L;
        if (this.f52250i0 != L) {
            this.f52250i0 = L;
            org.telegram.messenger.g0.h3(new ef0(this, 16));
        }
        if (zm0Var.Z) {
            zm0Var.N.y1(1);
        } else {
            zm0Var.N.y1(Math.max(1, ((zm0Var.f53967h0 - 1) * org.telegram.messenger.g0.L(2.0f)) + (zm0Var.S * zm0Var.f53967h0)));
        }
        this.f52249h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !org.telegram.messenger.g0.E && zm0Var.f53963e0 != null && zm0Var.f53956a0.getParent() == this) {
            size4 -= zm0Var.f53963e0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i11 = size4;
        int i12 = makeMeasureSpec;
        if (Q > org.telegram.messenger.g0.L(20.0f) && (rtVar = zm0Var.f53963e0) != null) {
            this.f52249h0 = true;
            rtVar.j();
            this.f52249h0 = false;
        }
        org.telegram.ui.Components.rt rtVar2 = zm0Var.f53963e0;
        if (rtVar2 != null && rtVar2.f39056e) {
            zm0Var.fragmentView.setTranslationY(0.0f);
            zm0Var.L.setTranslationY(0.0f);
            zm0Var.O.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.rt rtVar3 = zm0Var.f53963e0;
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
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (i11 - org.telegram.messenger.g0.f23605m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i11 - org.telegram.messenger.g0.f23605m), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i7, 0, i12, 0);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f52249h0) {
            return;
        }
        super.requestLayout();
    }
}

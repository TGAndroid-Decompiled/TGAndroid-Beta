package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
public final class ym0 extends org.telegram.ui.Components.du0 {
    public int f54232g0;
    public boolean f54233h0;
    public int f54234i0;
    public final cn0 f54235j0;

    public ym0(cn0 cn0Var, Context context) {
        super(context, null);
        this.f54235j0 = cn0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ym0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        org.telegram.ui.Components.yt ytVar;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        cn0 cn0Var = this.f54235j0;
        if (Q1) {
            cn0Var.f46608h0 = 4;
        } else {
            Point point = org.telegram.messenger.g0.f24046q;
            if (point.x > point.y) {
                cn0Var.f46608h0 = 4;
            } else {
                cn0Var.f46608h0 = 3;
            }
        }
        this.f54233h0 = true;
        int L = ((size2 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(4.0f)) / cn0Var.f46608h0;
        cn0Var.S = L;
        if (this.f54234i0 != L) {
            this.f54234i0 = L;
            org.telegram.messenger.g0.g3(new hf0(this, 16));
        }
        if (cn0Var.Z) {
            cn0Var.N.y1(1);
        } else {
            cn0Var.N.y1(Math.max(1, ((cn0Var.f46608h0 - 1) * org.telegram.messenger.g0.L(2.0f)) + (cn0Var.S * cn0Var.f46608h0)));
        }
        this.f54233h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !org.telegram.messenger.g0.E && cn0Var.f46604e0 != null && cn0Var.f46597a0.getParent() == this) {
            size4 -= cn0Var.f46604e0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i11 = size4;
        int i12 = makeMeasureSpec;
        if (Q > org.telegram.messenger.g0.L(20.0f) && (ytVar = cn0Var.f46604e0) != null) {
            this.f54233h0 = true;
            ytVar.j();
            this.f54233h0 = false;
        }
        org.telegram.ui.Components.yt ytVar2 = cn0Var.f46604e0;
        if (ytVar2 != null && ytVar2.f42537e) {
            cn0Var.fragmentView.setTranslationY(0.0f);
            cn0Var.L.setTranslationY(0.0f);
            cn0Var.O.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.yt ytVar3 = cn0Var.f46604e0;
                if (ytVar3 != null && ytVar3.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (org.telegram.messenger.g0.Q1()) {
                            f10 = 200.0f;
                        } else {
                            f10 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (i11 - org.telegram.messenger.g0.f24040m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i11 - org.telegram.messenger.g0.f24040m), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i7, 0, i12, 0);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f54233h0) {
            return;
        }
        super.requestLayout();
    }
}

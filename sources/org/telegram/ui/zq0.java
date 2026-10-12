package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zq0 extends org.telegram.ui.Components.ow0 {
    public int f42699w0;
    public boolean f42700x0;
    public int f42701y0;
    public final hr0 f42702z0;

    public zq0(hr0 hr0Var, Context context) {
        super(context, null);
        this.f42702z0 = hr0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.Components.vu vuVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        hr0 hr0Var = this.f42702z0;
        if (isTablet) {
            hr0Var.f36923g0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                hr0Var.f36923g0 = 4;
            } else {
                hr0Var.f36923g0 = 3;
            }
        }
        this.f42700x0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / hr0Var.f36923g0;
        hr0Var.R = dp;
        if (this.f42701y0 != dp) {
            this.f42701y0 = dp;
            AndroidUtilities.runOnUIThread(new yk0(this, 13));
        }
        if (hr0Var.Y) {
            hr0Var.M.y1(1);
        } else {
            hr0Var.M.y1(Math.max(1, ((hr0Var.f36923g0 - 1) * AndroidUtilities.dp(2.0f)) + (hr0Var.R * hr0Var.f36923g0)));
        }
        this.f42700x0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && hr0Var.f36919d0 != null && hr0Var.Z.getParent() == this) {
            size4 -= hr0Var.f36919d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (vuVar = hr0Var.f36919d0) != null) {
            this.f42700x0 = true;
            vuVar.j();
            this.f42700x0 = false;
        }
        org.telegram.ui.Components.vu vuVar2 = hr0Var.f36919d0;
        if (vuVar2 != null && vuVar2.e) {
            hr0Var.fragmentView.setTranslationY(0.0f);
            hr0Var.K.setTranslationY(0.0f);
            hr0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.vu vuVar3 = hr0Var.f36919d0;
                if (vuVar3 != null && vuVar3.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (AndroidUtilities.isTablet()) {
                            f7 = 200.0f;
                        } else {
                            f7 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f7), getPaddingTop() + (i12 - AndroidUtilities.statusBarHeight)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i12 - AndroidUtilities.statusBarHeight), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i10, 0, i13, 0);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f42700x0) {
            return;
        }
        super.requestLayout();
    }
}

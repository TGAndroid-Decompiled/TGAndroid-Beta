package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class xq0 extends org.telegram.ui.Components.ow0 {
    public int f41613w0;
    public boolean f41614x0;
    public int f41615y0;
    public final fr0 f41616z0;

    public xq0(fr0 fr0Var, Context context) {
        super(context, null);
        this.f41616z0 = fr0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.Components.vu vuVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        fr0 fr0Var = this.f41616z0;
        if (isTablet) {
            fr0Var.f35921g0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                fr0Var.f35921g0 = 4;
            } else {
                fr0Var.f35921g0 = 3;
            }
        }
        this.f41614x0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / fr0Var.f35921g0;
        fr0Var.R = dp;
        if (this.f41615y0 != dp) {
            this.f41615y0 = dp;
            AndroidUtilities.runOnUIThread(new xk0(this, 13));
        }
        if (fr0Var.Y) {
            fr0Var.M.y1(1);
        } else {
            fr0Var.M.y1(Math.max(1, ((fr0Var.f35921g0 - 1) * AndroidUtilities.dp(2.0f)) + (fr0Var.R * fr0Var.f35921g0)));
        }
        this.f41614x0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && fr0Var.f35917d0 != null && fr0Var.Z.getParent() == this) {
            size4 -= fr0Var.f35917d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (vuVar = fr0Var.f35917d0) != null) {
            this.f41614x0 = true;
            vuVar.j();
            this.f41614x0 = false;
        }
        org.telegram.ui.Components.vu vuVar2 = fr0Var.f35917d0;
        if (vuVar2 != null && vuVar2.e) {
            fr0Var.fragmentView.setTranslationY(0.0f);
            fr0Var.K.setTranslationY(0.0f);
            fr0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.vu vuVar3 = fr0Var.f35917d0;
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
        if (this.f41614x0) {
            return;
        }
        super.requestLayout();
    }
}

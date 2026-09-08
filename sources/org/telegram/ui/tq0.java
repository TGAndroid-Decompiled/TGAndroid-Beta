package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class tq0 extends org.telegram.ui.Components.ov0 {
    public int f40841w0;
    public boolean f40842x0;
    public int f40843y0;
    public final br0 f40844z0;

    public tq0(br0 br0Var, Context context) {
        super(context, null);
        this.f40844z0 = br0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.Components.hu huVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        br0 br0Var = this.f40844z0;
        if (isTablet) {
            br0Var.f34919g0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                br0Var.f34919g0 = 4;
            } else {
                br0Var.f34919g0 = 3;
            }
        }
        this.f40842x0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / br0Var.f34919g0;
        br0Var.R = dp;
        if (this.f40843y0 != dp) {
            this.f40843y0 = dp;
            AndroidUtilities.runOnUIThread(new rl0(this, 12));
        }
        if (br0Var.Y) {
            br0Var.M.y1(1);
        } else {
            br0Var.M.y1(Math.max(1, ((br0Var.f34919g0 - 1) * AndroidUtilities.dp(2.0f)) + (br0Var.R * br0Var.f34919g0)));
        }
        this.f40842x0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && br0Var.f34914d0 != null && br0Var.Z.getParent() == this) {
            size4 -= br0Var.f34914d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (huVar = br0Var.f34914d0) != null) {
            this.f40842x0 = true;
            huVar.j();
            this.f40842x0 = false;
        }
        org.telegram.ui.Components.hu huVar2 = br0Var.f34914d0;
        if (huVar2 != null && huVar2.f26877e) {
            br0Var.fragmentView.setTranslationY(0.0f);
            br0Var.K.setTranslationY(0.0f);
            br0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.hu huVar3 = br0Var.f34914d0;
                if (huVar3 != null && huVar3.l(childAt)) {
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
        if (this.f40842x0) {
            return;
        }
        super.requestLayout();
    }
}

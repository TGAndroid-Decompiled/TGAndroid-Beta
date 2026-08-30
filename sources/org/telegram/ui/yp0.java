package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yp0 extends org.telegram.ui.Components.qv0 {
    public int f40552t0;
    public boolean f40553u0;
    public int f40554v0;
    public final fq0 f40555w0;

    public yp0(fq0 fq0Var, Context context) {
        super(context, null);
        this.f40555w0 = fq0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yp0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        org.telegram.ui.Components.du duVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        fq0 fq0Var = this.f40555w0;
        if (isTablet) {
            fq0Var.f34319d0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                fq0Var.f34319d0 = 4;
            } else {
                fq0Var.f34319d0 = 3;
            }
        }
        this.f40553u0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / fq0Var.f34319d0;
        fq0Var.O = dp;
        if (this.f40554v0 != dp) {
            this.f40554v0 = dp;
            AndroidUtilities.runOnUIThread(new el0(this, 13));
        }
        if (fq0Var.V) {
            fq0Var.J.y1(1);
        } else {
            fq0Var.J.y1(Math.max(1, ((fq0Var.f34319d0 - 1) * AndroidUtilities.dp(2.0f)) + (fq0Var.O * fq0Var.f34319d0)));
        }
        this.f40553u0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && fq0Var.f34314a0 != null && fq0Var.W.getParent() == this) {
            size4 -= fq0Var.f34314a0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (duVar = fq0Var.f34314a0) != null) {
            this.f40553u0 = true;
            duVar.j();
            this.f40553u0 = false;
        }
        org.telegram.ui.Components.du duVar2 = fq0Var.f34314a0;
        if (duVar2 != null && duVar2.e) {
            fq0Var.fragmentView.setTranslationY(0.0f);
            fq0Var.H.setTranslationY(0.0f);
            fq0Var.K.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.du duVar3 = fq0Var.f34314a0;
                if (duVar3 != null && duVar3.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (AndroidUtilities.isTablet()) {
                            f10 = 200.0f;
                        } else {
                            f10 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f10), getPaddingTop() + (i12 - AndroidUtilities.statusBarHeight)), 1073741824));
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
        if (this.f40553u0) {
            return;
        }
        super.requestLayout();
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sq0 extends org.telegram.ui.Components.pv0 {
    public int f37437w0;
    public boolean f37438x0;
    public int f37439y0;
    public final ar0 f37440z0;

    public sq0(ar0 ar0Var, Context context) {
        super(context, null);
        this.f37440z0 = ar0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.Components.ju juVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        ar0 ar0Var = this.f37440z0;
        if (isTablet) {
            ar0Var.f31903g0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                ar0Var.f31903g0 = 4;
            } else {
                ar0Var.f31903g0 = 3;
            }
        }
        this.f37438x0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / ar0Var.f31903g0;
        ar0Var.R = dp;
        if (this.f37439y0 != dp) {
            this.f37439y0 = dp;
            AndroidUtilities.runOnUIThread(new pl0(this, 12));
        }
        if (ar0Var.Y) {
            ar0Var.M.y1(1);
        } else {
            ar0Var.M.y1(Math.max(1, ((ar0Var.f31903g0 - 1) * AndroidUtilities.dp(2.0f)) + (ar0Var.R * ar0Var.f31903g0)));
        }
        this.f37438x0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && ar0Var.f31899d0 != null && ar0Var.Z.getParent() == this) {
            size4 -= ar0Var.f31899d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (juVar = ar0Var.f31899d0) != null) {
            this.f37438x0 = true;
            juVar.j();
            this.f37438x0 = false;
        }
        org.telegram.ui.Components.ju juVar2 = ar0Var.f31899d0;
        if (juVar2 != null && juVar2.e) {
            ar0Var.fragmentView.setTranslationY(0.0f);
            ar0Var.K.setTranslationY(0.0f);
            ar0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.ju juVar3 = ar0Var.f31899d0;
                if (juVar3 != null && juVar3.l(childAt)) {
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
        if (this.f37438x0) {
            return;
        }
        super.requestLayout();
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vq0 extends org.telegram.ui.Components.yw0 {
    public int f42829w0;
    public boolean f42830x0;
    public int f42831y0;
    public final dr0 f42832z0;

    public vq0(dr0 dr0Var, Context context) {
        super(context, null);
        this.f42832z0 = dr0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.Components.cv cvVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        dr0 dr0Var = this.f42832z0;
        if (isTablet) {
            dr0Var.f36880g0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                dr0Var.f36880g0 = 4;
            } else {
                dr0Var.f36880g0 = 3;
            }
        }
        this.f42830x0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / dr0Var.f36880g0;
        dr0Var.R = dp;
        if (this.f42831y0 != dp) {
            this.f42831y0 = dp;
            AndroidUtilities.runOnUIThread(new uk0(this, 13));
        }
        if (dr0Var.Y) {
            dr0Var.M.y1(1);
        } else {
            dr0Var.M.y1(Math.max(1, ((dr0Var.f36880g0 - 1) * AndroidUtilities.dp(2.0f)) + (dr0Var.R * dr0Var.f36880g0)));
        }
        this.f42830x0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && dr0Var.f36875d0 != null && dr0Var.Z.getParent() == this) {
            size4 -= dr0Var.f36875d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (cvVar = dr0Var.f36875d0) != null) {
            this.f42830x0 = true;
            cvVar.j();
            this.f42830x0 = false;
        }
        org.telegram.ui.Components.cv cvVar2 = dr0Var.f36875d0;
        if (cvVar2 != null && cvVar2.f25018e) {
            dr0Var.fragmentView.setTranslationY(0.0f);
            dr0Var.K.setTranslationY(0.0f);
            dr0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.cv cvVar3 = dr0Var.f36875d0;
                if (cvVar3 != null && cvVar3.l(childAt)) {
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
        if (this.f42830x0) {
            return;
        }
        super.requestLayout();
    }
}

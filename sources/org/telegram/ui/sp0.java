package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sp0 extends org.telegram.ui.Components.xu0 {
    public int f42743s0;
    public boolean f42744t0;
    public int f42745u0;
    public final zp0 f42746v0;

    public sp0(zp0 zp0Var, Context context) {
        super(context, null);
        this.f42746v0 = zp0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sp0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        org.telegram.ui.Components.ut utVar;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i9);
        boolean isTablet = AndroidUtilities.isTablet();
        zp0 zp0Var = this.f42746v0;
        if (isTablet) {
            zp0Var.f45211c0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                zp0Var.f45211c0 = 4;
            } else {
                zp0Var.f45211c0 = 3;
            }
        }
        this.f42744t0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / zp0Var.f45211c0;
        zp0Var.N = dp;
        if (this.f42745u0 != dp) {
            this.f42745u0 = dp;
            AndroidUtilities.runOnUIThread(new zk0(this, 13));
        }
        if (zp0Var.U) {
            zp0Var.I.y1(1);
        } else {
            zp0Var.I.y1(Math.max(1, ((zp0Var.f45211c0 - 1) * AndroidUtilities.dp(2.0f)) + (zp0Var.N * zp0Var.f45211c0)));
        }
        this.f42744t0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i9);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && zp0Var.Z != null && zp0Var.V.getParent() == this) {
            size4 -= zp0Var.Z.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i11 = size4;
        int i12 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (utVar = zp0Var.Z) != null) {
            this.f42744t0 = true;
            utVar.j();
            this.f42744t0 = false;
        }
        org.telegram.ui.Components.ut utVar2 = zp0Var.Z;
        if (utVar2 != null && utVar2.f33124e) {
            zp0Var.fragmentView.setTranslationY(0.0f);
            zp0Var.G.setTranslationY(0.0f);
            zp0Var.J.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.ut utVar3 = zp0Var.Z;
                if (utVar3 != null && utVar3.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (AndroidUtilities.isTablet()) {
                            f10 = 200.0f;
                        } else {
                            f10 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f10), getPaddingTop() + (i11 - AndroidUtilities.statusBarHeight)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i11 - AndroidUtilities.statusBarHeight), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i9, 0, i12, 0);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f42744t0) {
            return;
        }
        super.requestLayout();
    }
}

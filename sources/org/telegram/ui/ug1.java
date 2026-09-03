package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ug1 extends ScrollView {
    public final int[] f41828a;
    public final Rect f41829b;
    public boolean f41830c;
    public int d;
    public final vg1 f41831e;

    public ug1(vg1 vg1Var, Context context) {
        super(context);
        this.f41831e = vg1Var;
        this.f41828a = new int[2];
        this.f41829b = new Rect();
        this.f41830c = true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        this.f41830c = false;
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z4;
        boolean z10;
        Integer num;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        super.onScrollChanged(i10, i11, i12, i13);
        vg1 vg1Var = this.f41831e;
        TextView textView = vg1Var.f42114c;
        if (textView != null) {
            int[] iArr = this.f41828a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = vg1Var.f42114c.getMeasuredHeight() + iArr[1];
            kVar = ((org.telegram.ui.ActionBar.p2) vg1Var).actionBar;
            if (measuredHeight < kVar.getBottom()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (vg1Var.f42114c.getTag() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4 != z10) {
                TextView textView2 = vg1Var.f42114c;
                if (z4) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = vg1Var.H;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    vg1Var.H = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                vg1Var.H = animatorSet2;
                fg.i0 i0Var = vg1Var.f42127y;
                float f11 = 0.0f;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float[] fArr = {f10};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i0Var, property, fArr);
                kVar2 = ((org.telegram.ui.ActionBar.p2) vg1Var).actionBar;
                org.telegram.ui.ActionBar.l5 titleTextView = kVar2.getTitleTextView();
                if (z4) {
                    f11 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f11));
                vg1Var.H.setDuration(150L);
                vg1Var.H.addListener(new ss0(this, 24));
                vg1Var.H.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f41830c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        if (Build.VERSION.SDK_INT < 23) {
            int dp = AndroidUtilities.dp(120.0f) + rect.bottom;
            rect.bottom = dp;
            int i10 = this.d;
            if (i10 != 0) {
                rect.top -= i10;
                rect.bottom = dp - i10;
                this.d = 0;
            }
        }
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    @Override
    public final void requestLayout() {
        this.f41830c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f41829b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        rect.bottom = AndroidUtilities.dp(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            int measuredHeight = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
            this.d = measuredHeight;
            computeScrollDeltaToGetChildRectOnScreen -= measuredHeight;
        } else {
            this.d = 0;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}

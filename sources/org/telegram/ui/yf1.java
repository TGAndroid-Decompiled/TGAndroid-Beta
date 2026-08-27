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

public final class yf1 extends ScrollView {

    public final int[] f44805a;

    public final Rect f44806b;

    public boolean f44807c;
    public int d;

    public final zf1 f44808e;

    public yf1(zf1 zf1Var, Context context) {
        super(context);
        this.f44808e = zf1Var;
        this.f44805a = new int[2];
        this.f44806b = new Rect();
        this.f44807c = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f44807c = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        zf1 zf1Var = this.f44808e;
        TextView textView = zf1Var.f45165c;
        if (textView == null) {
            return;
        }
        int[] iArr = this.f44805a;
        textView.getLocationOnScreen(iArr);
        boolean z10 = zf1Var.f45165c.getMeasuredHeight() + iArr[1] < ((org.telegram.ui.ActionBar.n2) zf1Var).actionBar.getBottom();
        if (z10 != (zf1Var.f45165c.getTag() == null)) {
            zf1Var.f45165c.setTag(z10 ? null : 1);
            AnimatorSet animatorSet = zf1Var.G;
            if (animatorSet != null) {
                animatorSet.cancel();
                zf1Var.G = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            zf1Var.G = animatorSet2;
            ag.t0 t0Var = zf1Var.f45177y;
            float[] fArr = {z10 ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property, fArr), ObjectAnimator.ofFloat(((org.telegram.ui.ActionBar.n2) zf1Var).actionBar.getTitleTextView(), (Property<org.telegram.ui.ActionBar.h5, Float>) property, z10 ? 1.0f : 0.0f));
            zf1Var.G.setDuration(150L);
            zf1Var.G.addListener(new zb1(this, 3));
            zf1Var.G.start();
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f44807c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (Build.VERSION.SDK_INT < 23) {
            int iDp = AndroidUtilities.dp(120.0f) + rect.bottom;
            rect.bottom = iDp;
            int i10 = this.d;
            if (i10 != 0) {
                rect.top -= i10;
                rect.bottom = iDp - i10;
                this.d = 0;
            }
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestLayout() {
        this.f44807c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f44806b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        rect.bottom = AndroidUtilities.dp(120.0f) + rect.bottom;
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (iComputeScrollDeltaToGetChildRectOnScreen < 0) {
            int measuredHeight = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
            this.d = measuredHeight;
            iComputeScrollDeltaToGetChildRectOnScreen -= measuredHeight;
        } else {
            this.d = 0;
        }
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
    }
}

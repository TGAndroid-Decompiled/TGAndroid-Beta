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
public final class wf1 extends ScrollView {
    public final int[] f42833a;
    public final Rect f42834b;
    public boolean f42835c;
    public final xf1 d;

    public wf1(xf1 xf1Var, Context context) {
        super(context);
        this.d = xf1Var;
        this.f42833a = new int[2];
        this.f42834b = new Rect();
        this.f42835c = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f42835c = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        boolean z11;
        Integer num;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        super.onScrollChanged(i10, i11, i12, i13);
        xf1 xf1Var = this.d;
        TextView textView = xf1Var.f43100c;
        if (textView != null) {
            int[] iArr = this.f42833a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = xf1Var.f43100c.getMeasuredHeight() + iArr[1];
            kVar = ((org.telegram.ui.ActionBar.n2) xf1Var).actionBar;
            if (measuredHeight < kVar.getBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (xf1Var.f43100c.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                TextView textView2 = xf1Var.f43100c;
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = xf1Var.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    xf1Var.K = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                xf1Var.K = animatorSet2;
                ei.g6 g6Var = xf1Var.f43115y;
                float f10 = 0.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float[] fArr = {f7};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g6Var, property, fArr);
                kVar2 = ((org.telegram.ui.ActionBar.n2) xf1Var).actionBar;
                org.telegram.ui.ActionBar.j5 titleTextView = kVar2.getTitleTextView();
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f10));
                xf1Var.K.setDuration(150L);
                xf1Var.K.addListener(new vf1(this, 0));
                xf1Var.K.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f42835c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final void requestLayout() {
        this.f42835c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f42834b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        rect.bottom = AndroidUtilities.dp(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            computeScrollDeltaToGetChildRectOnScreen -= (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}

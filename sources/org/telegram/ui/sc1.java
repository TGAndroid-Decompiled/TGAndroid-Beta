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
public final class sc1 extends ScrollView {
    public final int[] f41473a;
    public final Rect f41474b;
    public boolean f41475c;
    public final tc1 d;

    public sc1(tc1 tc1Var, Context context) {
        super(context);
        this.d = tc1Var;
        this.f41473a = new int[2];
        this.f41474b = new Rect();
        this.f41475c = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f41475c = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        boolean z11;
        Integer num;
        float f7;
        org.telegram.ui.ActionBar.l lVar2;
        super.onScrollChanged(i10, i11, i12, i13);
        tc1 tc1Var = this.d;
        TextView textView = tc1Var.f41798c;
        if (textView != null) {
            int[] iArr = this.f41473a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = tc1Var.f41798c.getMeasuredHeight() + iArr[1];
            lVar = ((org.telegram.ui.ActionBar.k2) tc1Var).actionBar;
            if (measuredHeight < lVar.getBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (tc1Var.f41798c.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                TextView textView2 = tc1Var.f41798c;
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = tc1Var.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    tc1Var.K = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                tc1Var.K = animatorSet2;
                kg.f0 f0Var = tc1Var.D;
                float f10 = 0.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float[] fArr = {f7};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f0Var, property, fArr);
                lVar2 = ((org.telegram.ui.ActionBar.k2) tc1Var).actionBar;
                org.telegram.ui.ActionBar.u5 titleTextView = lVar2.getTitleTextView();
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f10));
                tc1Var.K.setDuration(150L);
                tc1Var.K.addListener(new ns0(this, 13));
                tc1Var.K.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f41475c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final void requestLayout() {
        this.f41475c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f41474b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        rect.bottom = org.telegram.messenger.i0.L(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            computeScrollDeltaToGetChildRectOnScreen -= (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}

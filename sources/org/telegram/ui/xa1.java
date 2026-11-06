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
public final class xa1 extends ScrollView {
    public final int[] f51813a;
    public final Rect f51814b;
    public boolean f51815c;
    public final ya1 d;

    public xa1(ya1 ya1Var, Context context) {
        super(context);
        this.d = ya1Var;
        this.f51813a = new int[2];
        this.f51814b = new Rect();
        this.f51815c = true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        this.f51815c = false;
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z9;
        boolean z10;
        Integer num;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        super.onScrollChanged(i7, i10, i11, i12);
        ya1 ya1Var = this.d;
        TextView textView = ya1Var.f52186c;
        if (textView != null) {
            int[] iArr = this.f51813a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = ya1Var.f52186c.getMeasuredHeight() + iArr[1];
            kVar = ((org.telegram.ui.ActionBar.f2) ya1Var).actionBar;
            if (measuredHeight < kVar.getBottom()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (ya1Var.f52186c.getTag() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 != z10) {
                TextView textView2 = ya1Var.f52186c;
                if (z9) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = ya1Var.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    ya1Var.K = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                ya1Var.K = animatorSet2;
                fi.p5 p5Var = ya1Var.D;
                float f11 = 0.0f;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float[] fArr = {f10};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p5Var, property, fArr);
                kVar2 = ((org.telegram.ui.ActionBar.f2) ya1Var).actionBar;
                org.telegram.ui.ActionBar.k5 titleTextView = kVar2.getTitleTextView();
                if (z9) {
                    f11 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f11));
                ya1Var.K.setDuration(150L);
                ya1Var.K.addListener(new r81(this, 2));
                ya1Var.K.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f51815c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final void requestLayout() {
        this.f51815c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f51814b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        rect.bottom = org.telegram.messenger.g0.L(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            computeScrollDeltaToGetChildRectOnScreen -= (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}

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
public final class ya1 extends ScrollView {
    public final int[] f52181a;
    public final Rect f52182b;
    public boolean f52183c;
    public final za1 d;

    public ya1(za1 za1Var, Context context) {
        super(context);
        this.d = za1Var;
        this.f52181a = new int[2];
        this.f52182b = new Rect();
        this.f52183c = true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        this.f52183c = false;
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
        za1 za1Var = this.d;
        TextView textView = za1Var.f52500c;
        if (textView != null) {
            int[] iArr = this.f52181a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = za1Var.f52500c.getMeasuredHeight() + iArr[1];
            kVar = ((org.telegram.ui.ActionBar.f2) za1Var).actionBar;
            if (measuredHeight < kVar.getBottom()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (za1Var.f52500c.getTag() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 != z10) {
                TextView textView2 = za1Var.f52500c;
                if (z9) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = za1Var.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    za1Var.K = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                za1Var.K = animatorSet2;
                fi.p5 p5Var = za1Var.D;
                float f11 = 0.0f;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float[] fArr = {f10};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p5Var, property, fArr);
                kVar2 = ((org.telegram.ui.ActionBar.f2) za1Var).actionBar;
                org.telegram.ui.ActionBar.k5 titleTextView = kVar2.getTitleTextView();
                if (z9) {
                    f11 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f11));
                za1Var.K.setDuration(150L);
                za1Var.K.addListener(new s81(this, 2));
                za1Var.K.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f52183c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final void requestLayout() {
        this.f52183c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f52182b;
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

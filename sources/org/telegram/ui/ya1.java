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
    public final int[] f54330a;
    public final Rect f54331b;
    public boolean f54332c;
    public final za1 d;

    public ya1(za1 za1Var, Context context) {
        super(context);
        this.d = za1Var;
        this.f54330a = new int[2];
        this.f54331b = new Rect();
        this.f54332c = true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f54332c = false;
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        boolean z11;
        Integer num;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        super.onScrollChanged(i7, i10, i11, i12);
        za1 za1Var = this.d;
        TextView textView = za1Var.f54564c;
        if (textView != null) {
            int[] iArr = this.f54330a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = za1Var.f54564c.getMeasuredHeight() + iArr[1];
            kVar = ((org.telegram.ui.ActionBar.g2) za1Var).actionBar;
            if (measuredHeight < kVar.getBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (za1Var.f54564c.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                TextView textView2 = za1Var.f54564c;
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = za1Var.L;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    za1Var.L = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                za1Var.L = animatorSet2;
                hi.w5 w5Var = za1Var.E;
                float f11 = 0.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float[] fArr = {f10};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w5Var, property, fArr);
                kVar2 = ((org.telegram.ui.ActionBar.g2) za1Var).actionBar;
                org.telegram.ui.ActionBar.n5 titleTextView = kVar2.getTitleTextView();
                if (z10) {
                    f11 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f11));
                za1Var.L.setDuration(150L);
                za1Var.L.addListener(new i71(this, 3));
                za1Var.L.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f54332c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final void requestLayout() {
        this.f54332c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f54331b;
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
